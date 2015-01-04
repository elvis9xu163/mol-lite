package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MomentDoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MomentDoExample() {
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

		protected void addCriterionForJDBCTime(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Time(value.getTime()), property);
		}

		protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				timeList.add(new java.sql.Time(iter.next().getTime()));
			}
			addCriterion(condition, timeList, property);
		}

		protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
		}

		public Criteria andMntIdIsNull() {
			addCriterion("mnt_id is null");
			return (Criteria) this;
		}

		public Criteria andMntIdIsNotNull() {
			addCriterion("mnt_id is not null");
			return (Criteria) this;
		}

		public Criteria andMntIdEqualTo(Long value) {
			addCriterion("mnt_id =", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdNotEqualTo(Long value) {
			addCriterion("mnt_id <>", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdGreaterThan(Long value) {
			addCriterion("mnt_id >", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdGreaterThanOrEqualTo(Long value) {
			addCriterion("mnt_id >=", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdLessThan(Long value) {
			addCriterion("mnt_id <", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdLessThanOrEqualTo(Long value) {
			addCriterion("mnt_id <=", value, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdIn(List<Long> values) {
			addCriterion("mnt_id in", values, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdNotIn(List<Long> values) {
			addCriterion("mnt_id not in", values, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdBetween(Long value1, Long value2) {
			addCriterion("mnt_id between", value1, value2, "mntId");
			return (Criteria) this;
		}

		public Criteria andMntIdNotBetween(Long value1, Long value2) {
			addCriterion("mnt_id not between", value1, value2, "mntId");
			return (Criteria) this;
		}

		public Criteria andStartDayIsNull() {
			addCriterion("start_day is null");
			return (Criteria) this;
		}

		public Criteria andStartDayIsNotNull() {
			addCriterion("start_day is not null");
			return (Criteria) this;
		}

		public Criteria andStartDayEqualTo(Date value) {
			addCriterionForJDBCDate("start_day =", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("start_day <>", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayGreaterThan(Date value) {
			addCriterionForJDBCDate("start_day >", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_day >=", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayLessThan(Date value) {
			addCriterionForJDBCDate("start_day <", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start_day <=", value, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayIn(List<Date> values) {
			addCriterionForJDBCDate("start_day in", values, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("start_day not in", values, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_day between", value1, value2, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start_day not between", value1, value2, "startDay");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(Date value) {
			addCriterionForJDBCTime("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(Date value) {
			addCriterionForJDBCTime("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(Date value) {
			addCriterionForJDBCTime("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(Date value) {
			addCriterionForJDBCTime("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<Date> values) {
			addCriterionForJDBCTime("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<Date> values) {
			addCriterionForJDBCTime("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andEndDayIsNull() {
			addCriterion("end_day is null");
			return (Criteria) this;
		}

		public Criteria andEndDayIsNotNull() {
			addCriterion("end_day is not null");
			return (Criteria) this;
		}

		public Criteria andEndDayEqualTo(Date value) {
			addCriterionForJDBCDate("end_day =", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("end_day <>", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayGreaterThan(Date value) {
			addCriterionForJDBCDate("end_day >", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_day >=", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayLessThan(Date value) {
			addCriterionForJDBCDate("end_day <", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end_day <=", value, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayIn(List<Date> values) {
			addCriterionForJDBCDate("end_day in", values, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("end_day not in", values, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_day between", value1, value2, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end_day not between", value1, value2, "endDay");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(Date value) {
			addCriterionForJDBCTime("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(Date value) {
			addCriterionForJDBCTime("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(Date value) {
			addCriterionForJDBCTime("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(Date value) {
			addCriterionForJDBCTime("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<Date> values) {
			addCriterionForJDBCTime("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<Date> values) {
			addCriterionForJDBCTime("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andLocAddrIsNull() {
			addCriterion("loc_addr is null");
			return (Criteria) this;
		}

		public Criteria andLocAddrIsNotNull() {
			addCriterion("loc_addr is not null");
			return (Criteria) this;
		}

		public Criteria andLocAddrEqualTo(String value) {
			addCriterion("loc_addr =", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrNotEqualTo(String value) {
			addCriterion("loc_addr <>", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrGreaterThan(String value) {
			addCriterion("loc_addr >", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrGreaterThanOrEqualTo(String value) {
			addCriterion("loc_addr >=", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrLessThan(String value) {
			addCriterion("loc_addr <", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrLessThanOrEqualTo(String value) {
			addCriterion("loc_addr <=", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrLike(String value) {
			addCriterion("loc_addr like", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrNotLike(String value) {
			addCriterion("loc_addr not like", value, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrIn(List<String> values) {
			addCriterion("loc_addr in", values, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrNotIn(List<String> values) {
			addCriterion("loc_addr not in", values, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrBetween(String value1, String value2) {
			addCriterion("loc_addr between", value1, value2, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocAddrNotBetween(String value1, String value2) {
			addCriterion("loc_addr not between", value1, value2, "locAddr");
			return (Criteria) this;
		}

		public Criteria andLocLngIsNull() {
			addCriterion("loc_lng is null");
			return (Criteria) this;
		}

		public Criteria andLocLngIsNotNull() {
			addCriterion("loc_lng is not null");
			return (Criteria) this;
		}

		public Criteria andLocLngEqualTo(Double value) {
			addCriterion("loc_lng =", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngNotEqualTo(Double value) {
			addCriterion("loc_lng <>", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngGreaterThan(Double value) {
			addCriterion("loc_lng >", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngGreaterThanOrEqualTo(Double value) {
			addCriterion("loc_lng >=", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngLessThan(Double value) {
			addCriterion("loc_lng <", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngLessThanOrEqualTo(Double value) {
			addCriterion("loc_lng <=", value, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngIn(List<Double> values) {
			addCriterion("loc_lng in", values, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngNotIn(List<Double> values) {
			addCriterion("loc_lng not in", values, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngBetween(Double value1, Double value2) {
			addCriterion("loc_lng between", value1, value2, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLngNotBetween(Double value1, Double value2) {
			addCriterion("loc_lng not between", value1, value2, "locLng");
			return (Criteria) this;
		}

		public Criteria andLocLatIsNull() {
			addCriterion("loc_lat is null");
			return (Criteria) this;
		}

		public Criteria andLocLatIsNotNull() {
			addCriterion("loc_lat is not null");
			return (Criteria) this;
		}

		public Criteria andLocLatEqualTo(Double value) {
			addCriterion("loc_lat =", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatNotEqualTo(Double value) {
			addCriterion("loc_lat <>", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatGreaterThan(Double value) {
			addCriterion("loc_lat >", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatGreaterThanOrEqualTo(Double value) {
			addCriterion("loc_lat >=", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatLessThan(Double value) {
			addCriterion("loc_lat <", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatLessThanOrEqualTo(Double value) {
			addCriterion("loc_lat <=", value, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatIn(List<Double> values) {
			addCriterion("loc_lat in", values, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatNotIn(List<Double> values) {
			addCriterion("loc_lat not in", values, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatBetween(Double value1, Double value2) {
			addCriterion("loc_lat between", value1, value2, "locLat");
			return (Criteria) this;
		}

		public Criteria andLocLatNotBetween(Double value1, Double value2) {
			addCriterion("loc_lat not between", value1, value2, "locLat");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNull() {
			addCriterion("subject is null");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNotNull() {
			addCriterion("subject is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectEqualTo(String value) {
			addCriterion("subject =", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotEqualTo(String value) {
			addCriterion("subject <>", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThan(String value) {
			addCriterion("subject >", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThanOrEqualTo(String value) {
			addCriterion("subject >=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThan(String value) {
			addCriterion("subject <", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThanOrEqualTo(String value) {
			addCriterion("subject <=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLike(String value) {
			addCriterion("subject like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotLike(String value) {
			addCriterion("subject not like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectIn(List<String> values) {
			addCriterion("subject in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotIn(List<String> values) {
			addCriterion("subject not in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectBetween(String value1, String value2) {
			addCriterion("subject between", value1, value2, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotBetween(String value1, String value2) {
			addCriterion("subject not between", value1, value2, "subject");
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

		public Criteria andDescTextIsNull() {
			addCriterion("desc_text is null");
			return (Criteria) this;
		}

		public Criteria andDescTextIsNotNull() {
			addCriterion("desc_text is not null");
			return (Criteria) this;
		}

		public Criteria andDescTextEqualTo(String value) {
			addCriterion("desc_text =", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextNotEqualTo(String value) {
			addCriterion("desc_text <>", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextGreaterThan(String value) {
			addCriterion("desc_text >", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextGreaterThanOrEqualTo(String value) {
			addCriterion("desc_text >=", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextLessThan(String value) {
			addCriterion("desc_text <", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextLessThanOrEqualTo(String value) {
			addCriterion("desc_text <=", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextLike(String value) {
			addCriterion("desc_text like", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextNotLike(String value) {
			addCriterion("desc_text not like", value, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextIn(List<String> values) {
			addCriterion("desc_text in", values, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextNotIn(List<String> values) {
			addCriterion("desc_text not in", values, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextBetween(String value1, String value2) {
			addCriterion("desc_text between", value1, value2, "descText");
			return (Criteria) this;
		}

		public Criteria andDescTextNotBetween(String value1, String value2) {
			addCriterion("desc_text not between", value1, value2, "descText");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsIsNull() {
			addCriterion("desc_pic_rids is null");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsIsNotNull() {
			addCriterion("desc_pic_rids is not null");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsEqualTo(String value) {
			addCriterion("desc_pic_rids =", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsNotEqualTo(String value) {
			addCriterion("desc_pic_rids <>", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsGreaterThan(String value) {
			addCriterion("desc_pic_rids >", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsGreaterThanOrEqualTo(String value) {
			addCriterion("desc_pic_rids >=", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsLessThan(String value) {
			addCriterion("desc_pic_rids <", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsLessThanOrEqualTo(String value) {
			addCriterion("desc_pic_rids <=", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsLike(String value) {
			addCriterion("desc_pic_rids like", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsNotLike(String value) {
			addCriterion("desc_pic_rids not like", value, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsIn(List<String> values) {
			addCriterion("desc_pic_rids in", values, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsNotIn(List<String> values) {
			addCriterion("desc_pic_rids not in", values, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsBetween(String value1, String value2) {
			addCriterion("desc_pic_rids between", value1, value2, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescPicRidsNotBetween(String value1, String value2) {
			addCriterion("desc_pic_rids not between", value1, value2, "descPicRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsIsNull() {
			addCriterion("desc_audio_rids is null");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsIsNotNull() {
			addCriterion("desc_audio_rids is not null");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsEqualTo(String value) {
			addCriterion("desc_audio_rids =", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsNotEqualTo(String value) {
			addCriterion("desc_audio_rids <>", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsGreaterThan(String value) {
			addCriterion("desc_audio_rids >", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsGreaterThanOrEqualTo(String value) {
			addCriterion("desc_audio_rids >=", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsLessThan(String value) {
			addCriterion("desc_audio_rids <", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsLessThanOrEqualTo(String value) {
			addCriterion("desc_audio_rids <=", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsLike(String value) {
			addCriterion("desc_audio_rids like", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsNotLike(String value) {
			addCriterion("desc_audio_rids not like", value, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsIn(List<String> values) {
			addCriterion("desc_audio_rids in", values, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsNotIn(List<String> values) {
			addCriterion("desc_audio_rids not in", values, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsBetween(String value1, String value2) {
			addCriterion("desc_audio_rids between", value1, value2, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescAudioRidsNotBetween(String value1, String value2) {
			addCriterion("desc_audio_rids not between", value1, value2, "descAudioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsIsNull() {
			addCriterion("desc_vedio_rids is null");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsIsNotNull() {
			addCriterion("desc_vedio_rids is not null");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsEqualTo(String value) {
			addCriterion("desc_vedio_rids =", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsNotEqualTo(String value) {
			addCriterion("desc_vedio_rids <>", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsGreaterThan(String value) {
			addCriterion("desc_vedio_rids >", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsGreaterThanOrEqualTo(String value) {
			addCriterion("desc_vedio_rids >=", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsLessThan(String value) {
			addCriterion("desc_vedio_rids <", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsLessThanOrEqualTo(String value) {
			addCriterion("desc_vedio_rids <=", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsLike(String value) {
			addCriterion("desc_vedio_rids like", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsNotLike(String value) {
			addCriterion("desc_vedio_rids not like", value, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsIn(List<String> values) {
			addCriterion("desc_vedio_rids in", values, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsNotIn(List<String> values) {
			addCriterion("desc_vedio_rids not in", values, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsBetween(String value1, String value2) {
			addCriterion("desc_vedio_rids between", value1, value2, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andDescVedioRidsNotBetween(String value1, String value2) {
			addCriterion("desc_vedio_rids not between", value1, value2, "descVedioRids");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
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