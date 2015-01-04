package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HisTodayDoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public HisTodayDoExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andEvtIdIsNull() {
			addCriterion("evt_id is null");
			return (Criteria) this;
		}

		public Criteria andEvtIdIsNotNull() {
			addCriterion("evt_id is not null");
			return (Criteria) this;
		}

		public Criteria andEvtIdEqualTo(Long value) {
			addCriterion("evt_id =", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdNotEqualTo(Long value) {
			addCriterion("evt_id <>", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdGreaterThan(Long value) {
			addCriterion("evt_id >", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdGreaterThanOrEqualTo(Long value) {
			addCriterion("evt_id >=", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdLessThan(Long value) {
			addCriterion("evt_id <", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdLessThanOrEqualTo(Long value) {
			addCriterion("evt_id <=", value, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdIn(List<Long> values) {
			addCriterion("evt_id in", values, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdNotIn(List<Long> values) {
			addCriterion("evt_id not in", values, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdBetween(Long value1, Long value2) {
			addCriterion("evt_id between", value1, value2, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtIdNotBetween(Long value1, Long value2) {
			addCriterion("evt_id not between", value1, value2, "evtId");
			return (Criteria) this;
		}

		public Criteria andEvtDateIsNull() {
			addCriterion("evt_date is null");
			return (Criteria) this;
		}

		public Criteria andEvtDateIsNotNull() {
			addCriterion("evt_date is not null");
			return (Criteria) this;
		}

		public Criteria andEvtDateEqualTo(Date value) {
			addCriterionForJDBCDate("evt_date =", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("evt_date <>", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateGreaterThan(Date value) {
			addCriterionForJDBCDate("evt_date >", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("evt_date >=", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateLessThan(Date value) {
			addCriterionForJDBCDate("evt_date <", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("evt_date <=", value, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateIn(List<Date> values) {
			addCriterionForJDBCDate("evt_date in", values, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("evt_date not in", values, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("evt_date between", value1, value2, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("evt_date not between", value1, value2, "evtDate");
			return (Criteria) this;
		}

		public Criteria andEvtKeyIsNull() {
			addCriterion("evt_key is null");
			return (Criteria) this;
		}

		public Criteria andEvtKeyIsNotNull() {
			addCriterion("evt_key is not null");
			return (Criteria) this;
		}

		public Criteria andEvtKeyEqualTo(String value) {
			addCriterion("evt_key =", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyNotEqualTo(String value) {
			addCriterion("evt_key <>", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyGreaterThan(String value) {
			addCriterion("evt_key >", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyGreaterThanOrEqualTo(String value) {
			addCriterion("evt_key >=", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyLessThan(String value) {
			addCriterion("evt_key <", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyLessThanOrEqualTo(String value) {
			addCriterion("evt_key <=", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyLike(String value) {
			addCriterion("evt_key like", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyNotLike(String value) {
			addCriterion("evt_key not like", value, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyIn(List<String> values) {
			addCriterion("evt_key in", values, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyNotIn(List<String> values) {
			addCriterion("evt_key not in", values, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyBetween(String value1, String value2) {
			addCriterion("evt_key between", value1, value2, "evtKey");
			return (Criteria) this;
		}

		public Criteria andEvtKeyNotBetween(String value1, String value2) {
			addCriterion("evt_key not between", value1, value2, "evtKey");
			return (Criteria) this;
		}

		public Criteria andTagIsNull() {
			addCriterion("tag is null");
			return (Criteria) this;
		}

		public Criteria andTagIsNotNull() {
			addCriterion("tag is not null");
			return (Criteria) this;
		}

		public Criteria andTagEqualTo(String value) {
			addCriterion("tag =", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotEqualTo(String value) {
			addCriterion("tag <>", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagGreaterThan(String value) {
			addCriterion("tag >", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagGreaterThanOrEqualTo(String value) {
			addCriterion("tag >=", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLessThan(String value) {
			addCriterion("tag <", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLessThanOrEqualTo(String value) {
			addCriterion("tag <=", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagLike(String value) {
			addCriterion("tag like", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotLike(String value) {
			addCriterion("tag not like", value, "tag");
			return (Criteria) this;
		}

		public Criteria andTagIn(List<String> values) {
			addCriterion("tag in", values, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotIn(List<String> values) {
			addCriterion("tag not in", values, "tag");
			return (Criteria) this;
		}

		public Criteria andTagBetween(String value1, String value2) {
			addCriterion("tag between", value1, value2, "tag");
			return (Criteria) this;
		}

		public Criteria andTagNotBetween(String value1, String value2) {
			addCriterion("tag not between", value1, value2, "tag");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNull() {
			addCriterion("summary is null");
			return (Criteria) this;
		}

		public Criteria andSummaryIsNotNull() {
			addCriterion("summary is not null");
			return (Criteria) this;
		}

		public Criteria andSummaryEqualTo(String value) {
			addCriterion("summary =", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotEqualTo(String value) {
			addCriterion("summary <>", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThan(String value) {
			addCriterion("summary >", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryGreaterThanOrEqualTo(String value) {
			addCriterion("summary >=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThan(String value) {
			addCriterion("summary <", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLessThanOrEqualTo(String value) {
			addCriterion("summary <=", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryLike(String value) {
			addCriterion("summary like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotLike(String value) {
			addCriterion("summary not like", value, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryIn(List<String> values) {
			addCriterion("summary in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotIn(List<String> values) {
			addCriterion("summary not in", values, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryBetween(String value1, String value2) {
			addCriterion("summary between", value1, value2, "summary");
			return (Criteria) this;
		}

		public Criteria andSummaryNotBetween(String value1, String value2) {
			addCriterion("summary not between", value1, value2, "summary");
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