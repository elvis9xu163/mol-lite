package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceDoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ResourceDoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andRidIsNull() {
			addCriterion("rid is null");
			return (Criteria) this;
		}

		public Criteria andRidIsNotNull() {
			addCriterion("rid is not null");
			return (Criteria) this;
		}

		public Criteria andRidEqualTo(Long value) {
			addCriterion("rid =", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotEqualTo(Long value) {
			addCriterion("rid <>", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThan(Long value) {
			addCriterion("rid >", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThanOrEqualTo(Long value) {
			addCriterion("rid >=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThan(Long value) {
			addCriterion("rid <", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThanOrEqualTo(Long value) {
			addCriterion("rid <=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidIn(List<Long> values) {
			addCriterion("rid in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotIn(List<Long> values) {
			addCriterion("rid not in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidBetween(Long value1, Long value2) {
			addCriterion("rid between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotBetween(Long value1, Long value2) {
			addCriterion("rid not between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andMd5IsNull() {
			addCriterion("md5 is null");
			return (Criteria) this;
		}

		public Criteria andMd5IsNotNull() {
			addCriterion("md5 is not null");
			return (Criteria) this;
		}

		public Criteria andMd5EqualTo(String value) {
			addCriterion("md5 =", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotEqualTo(String value) {
			addCriterion("md5 <>", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5GreaterThan(String value) {
			addCriterion("md5 >", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5GreaterThanOrEqualTo(String value) {
			addCriterion("md5 >=", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5LessThan(String value) {
			addCriterion("md5 <", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5LessThanOrEqualTo(String value) {
			addCriterion("md5 <=", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5Like(String value) {
			addCriterion("md5 like", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotLike(String value) {
			addCriterion("md5 not like", value, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5In(List<String> values) {
			addCriterion("md5 in", values, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotIn(List<String> values) {
			addCriterion("md5 not in", values, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5Between(String value1, String value2) {
			addCriterion("md5 between", value1, value2, "md5");
			return (Criteria) this;
		}

		public Criteria andMd5NotBetween(String value1, String value2) {
			addCriterion("md5 not between", value1, value2, "md5");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Date value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Date value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Date value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Date value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Date value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Date> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Date> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Date value1, Date value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Date value1, Date value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeIsNull() {
			addCriterion("upd_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdTimeIsNotNull() {
			addCriterion("upd_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdTimeEqualTo(Date value) {
			addCriterion("upd_time =", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeNotEqualTo(Date value) {
			addCriterion("upd_time <>", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeGreaterThan(Date value) {
			addCriterion("upd_time >", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("upd_time >=", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeLessThan(Date value) {
			addCriterion("upd_time <", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
			addCriterion("upd_time <=", value, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeIn(List<Date> values) {
			addCriterion("upd_time in", values, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeNotIn(List<Date> values) {
			addCriterion("upd_time not in", values, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeBetween(Date value1, Date value2) {
			addCriterion("upd_time between", value1, value2, "updTime");
			return (Criteria) this;
		}

		public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
			addCriterion("upd_time not between", value1, value2, "updTime");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}