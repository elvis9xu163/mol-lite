package com.xjd.mol.utl;

import com.xjd.mol.utl.context.AppContext;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.codehaus.jackson.map.ser.BeanPropertyFilter;
import org.codehaus.jackson.map.ser.BeanPropertyWriter;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class JsonUtil {

	protected static final String FILTER_PWD = "FilterPwd";
	protected static ThreadLocalDateFormat dateFormat = new ThreadLocalDateFormat();
	protected static ObjectMapper objectMapper = new ObjectMapper();
	protected static ObjectMapper objectMapperIncludeIgnoredProperties = new ObjectMapper();

	static {
		SimpleFilterProvider filterProvider = new SimpleFilterProvider();
		filterProvider.addFilter(FILTER_PWD, new FilterPwdBeanPropertyFilter());
		objectMapper.setDateFormat(dateFormat);
		objectMapper.setAnnotationIntrospector(new FilterPwdJacksonAnnotationIntrospector());
		objectMapper.setFilters(filterProvider);
		objectMapperIncludeIgnoredProperties.setDateFormat(dateFormat);
		objectMapperIncludeIgnoredProperties.setAnnotationIntrospector(new NoIgnoreJacksonAnnotationIntrospector());
		objectMapperIncludeIgnoredProperties.setFilters(filterProvider);
	}

	public static Map forSerialize(Map map) {
		if (!AppContext.isEnvProduct()) {
			return map;
		}
		Map to = new HashMap();
		for (Map.Entry entry : (Set<Map.Entry>) map.entrySet()) {
			Object key = entry.getKey();
			if (key instanceof String && MolUtil.isPwdField((String) key)) {
				to.put(key, MolUtil.getPwdMask());
			} else {
				to.put(key, entry.getValue());
			}
		}
		return to;
	}

	public static String toString(Object obj) {
		return toString(obj, null);
	}

	public static String toString(Object obj, String datePattern) {
		if (obj instanceof Map) {
			obj = forSerialize((Map) obj);
		}
		dateFormat.set(datePattern);
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String toStringIncludeIgnoredProperties(Object obj) {
		return toStringIncludeIgnoredProperties(obj, null);
	}

	public static String toStringIncludeIgnoredProperties(Object obj, String datePattern) {
		if (obj instanceof Map) {
			obj = forSerialize((Map) obj);
		}
		dateFormat.set(datePattern);
		try {
			return objectMapperIncludeIgnoredProperties.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static class ThreadLocalDateFormat extends SimpleDateFormat {
		private static final long serialVersionUID = -659481710224224430L;
		protected String defaultPattern = DateUtil.PATTERN_YEAR2SECOND;
		protected ThreadLocal<String> patternThreadLocal = new ThreadLocal<String>();

		public void reset() {
			patternThreadLocal.set(null);
		}

		public void set(String pattern) {
			patternThreadLocal.set(pattern);
		}

		public String get() {
			String p = patternThreadLocal.get();
			if (p == null) {
				return defaultPattern;
			} else {
				return p;
			}
		}

		@Override
		public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
			return DateUtil.getFormat(get()).format(date, toAppendTo, fieldPosition);
		}

		@Override
		public Date parse(String source) throws ParseException {
			return DateUtil.getFormat(get()).parse(source);
		}

	}

	public static class FilterPwdJacksonAnnotationIntrospector extends JacksonAnnotationIntrospector {

		@Override
		public Object findFilterId(AnnotatedClass ac) {
			Object rt = super.findFilterId(ac);
			if (rt == null) {
				return FILTER_PWD;
			}
			return rt;
		}

	}

	public static class NoIgnoreJacksonAnnotationIntrospector extends FilterPwdJacksonAnnotationIntrospector {
		@Override
		protected boolean _isIgnorable(Annotated a) {
			return false;
		}

		@Override
		public String[] findPropertiesToIgnore(AnnotatedClass ac) {
			return null;
		}

		@Override
		public Boolean findIgnoreUnknownProperties(AnnotatedClass ac) {
			return null;
		}
	}

	public static class FilterPwdBeanPropertyFilter implements BeanPropertyFilter {

		protected ThreadLocal<FilterPwdBeanPropertyWriter> writerThreadLocal = new InheritableThreadLocal<FilterPwdBeanPropertyWriter>();

		public FilterPwdBeanPropertyWriter getWriter(BeanPropertyWriter sourceWriter) {
			FilterPwdBeanPropertyWriter writer = writerThreadLocal.get();
			if (writer == null) {
				writer = new FilterPwdBeanPropertyWriter(sourceWriter);
				writerThreadLocal.set(writer);
			}
			return writer;
		}

		@Override
		public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov, BeanPropertyWriter writer) throws Exception {
			String name = writer.getName();

			if (MolUtil.isPwdField(name)) {
				FilterPwdBeanPropertyWriter filterPwdBeanPropertyWriter = getWriter(writer);
				filterPwdBeanPropertyWriter.serializeAsField(bean, jgen, prov);
			} else {
				writer.serializeAsField(bean, jgen, prov);
			}
		}
	}

	public static class FilterPwdBeanPropertyWriter extends BeanPropertyWriter {

		public FilterPwdBeanPropertyWriter(BeanPropertyWriter base) {
			super(base);
		}

		@Override
		public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception {
			Object value = MolUtil.getPwdMask(); // 密码
			// Null handling is bit different, check that first
			if (value == null) {
				if (!_suppressNulls) {
					jgen.writeFieldName(_name);
					prov.defaultSerializeNull(jgen);
				}
				return;
			}
			// For non-nulls, first: simple check for direct cycles
			if (value == bean) {
				_reportSelfReference(bean);
			}
			if (_suppressableValue != null && _suppressableValue.equals(value)) {
				return;
			}

			JsonSerializer<Object> ser = _serializer;
			if (ser == null) {
				Class<?> cls = value.getClass();
				PropertySerializerMap map = _dynamicSerializers;
				ser = map.serializerFor(cls);
				if (ser == null) {
					ser = _findAndAddDynamic(map, cls, prov);
				}
			}
			jgen.writeFieldName(_name);
			if (_typeSerializer == null) {
				ser.serialize(value, jgen, prov);
			} else {
				ser.serializeWithType(value, jgen, prov, _typeSerializer);
			}
		}

	}

}
