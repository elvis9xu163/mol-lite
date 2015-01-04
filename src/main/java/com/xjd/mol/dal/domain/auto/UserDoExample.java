package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserDoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserDoExample() {
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

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andPwdIsNull() {
			addCriterion("pwd is null");
			return (Criteria) this;
		}

		public Criteria andPwdIsNotNull() {
			addCriterion("pwd is not null");
			return (Criteria) this;
		}

		public Criteria andPwdEqualTo(String value) {
			addCriterion("pwd =", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdNotEqualTo(String value) {
			addCriterion("pwd <>", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdGreaterThan(String value) {
			addCriterion("pwd >", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdGreaterThanOrEqualTo(String value) {
			addCriterion("pwd >=", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdLessThan(String value) {
			addCriterion("pwd <", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdLessThanOrEqualTo(String value) {
			addCriterion("pwd <=", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdLike(String value) {
			addCriterion("pwd like", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdNotLike(String value) {
			addCriterion("pwd not like", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdIn(List<String> values) {
			addCriterion("pwd in", values, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdNotIn(List<String> values) {
			addCriterion("pwd not in", values, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdBetween(String value1, String value2) {
			addCriterion("pwd between", value1, value2, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdNotBetween(String value1, String value2) {
			addCriterion("pwd not between", value1, value2, "pwd");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNull() {
			addCriterion("nick_name is null");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNotNull() {
			addCriterion("nick_name is not null");
			return (Criteria) this;
		}

		public Criteria andNickNameEqualTo(String value) {
			addCriterion("nick_name =", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotEqualTo(String value) {
			addCriterion("nick_name <>", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThan(String value) {
			addCriterion("nick_name >", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThanOrEqualTo(String value) {
			addCriterion("nick_name >=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThan(String value) {
			addCriterion("nick_name <", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThanOrEqualTo(String value) {
			addCriterion("nick_name <=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLike(String value) {
			addCriterion("nick_name like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotLike(String value) {
			addCriterion("nick_name not like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameIn(List<String> values) {
			addCriterion("nick_name in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotIn(List<String> values) {
			addCriterion("nick_name not in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameBetween(String value1, String value2) {
			addCriterion("nick_name between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotBetween(String value1, String value2) {
			addCriterion("nick_name not between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andIconRidIsNull() {
			addCriterion("icon_rid is null");
			return (Criteria) this;
		}

		public Criteria andIconRidIsNotNull() {
			addCriterion("icon_rid is not null");
			return (Criteria) this;
		}

		public Criteria andIconRidEqualTo(Long value) {
			addCriterion("icon_rid =", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidNotEqualTo(Long value) {
			addCriterion("icon_rid <>", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidGreaterThan(Long value) {
			addCriterion("icon_rid >", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidGreaterThanOrEqualTo(Long value) {
			addCriterion("icon_rid >=", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidLessThan(Long value) {
			addCriterion("icon_rid <", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidLessThanOrEqualTo(Long value) {
			addCriterion("icon_rid <=", value, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidIn(List<Long> values) {
			addCriterion("icon_rid in", values, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidNotIn(List<Long> values) {
			addCriterion("icon_rid not in", values, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidBetween(Long value1, Long value2) {
			addCriterion("icon_rid between", value1, value2, "iconRid");
			return (Criteria) this;
		}

		public Criteria andIconRidNotBetween(Long value1, Long value2) {
			addCriterion("icon_rid not between", value1, value2, "iconRid");
			return (Criteria) this;
		}

		public Criteria andGradeIsNull() {
			addCriterion("grade is null");
			return (Criteria) this;
		}

		public Criteria andGradeIsNotNull() {
			addCriterion("grade is not null");
			return (Criteria) this;
		}

		public Criteria andGradeEqualTo(Integer value) {
			addCriterion("grade =", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotEqualTo(Integer value) {
			addCriterion("grade <>", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThan(Integer value) {
			addCriterion("grade >", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("grade >=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThan(Integer value) {
			addCriterion("grade <", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThanOrEqualTo(Integer value) {
			addCriterion("grade <=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeIn(List<Integer> values) {
			addCriterion("grade in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotIn(List<Integer> values) {
			addCriterion("grade not in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeBetween(Integer value1, Integer value2) {
			addCriterion("grade between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotBetween(Integer value1, Integer value2) {
			addCriterion("grade not between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNull() {
			addCriterion("birth_day is null");
			return (Criteria) this;
		}

		public Criteria andBirthDayIsNotNull() {
			addCriterion("birth_day is not null");
			return (Criteria) this;
		}

		public Criteria andBirthDayEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day =", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day <>", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThan(Date value) {
			addCriterionForJDBCDate("birth_day >", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day >=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThan(Date value) {
			addCriterionForJDBCDate("birth_day <", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("birth_day <=", value, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayIn(List<Date> values) {
			addCriterionForJDBCDate("birth_day in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotIn(List<Date> values) {
			addCriterionForJDBCDate("birth_day not in", values, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birth_day between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthDayNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("birth_day not between", value1, value2, "birthDay");
			return (Criteria) this;
		}

		public Criteria andBirthTimeIsNull() {
			addCriterion("birth_time is null");
			return (Criteria) this;
		}

		public Criteria andBirthTimeIsNotNull() {
			addCriterion("birth_time is not null");
			return (Criteria) this;
		}

		public Criteria andBirthTimeEqualTo(Date value) {
			addCriterionForJDBCTime("birth_time =", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeNotEqualTo(Date value) {
			addCriterionForJDBCTime("birth_time <>", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeGreaterThan(Date value) {
			addCriterionForJDBCTime("birth_time >", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("birth_time >=", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeLessThan(Date value) {
			addCriterionForJDBCTime("birth_time <", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCTime("birth_time <=", value, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeIn(List<Date> values) {
			addCriterionForJDBCTime("birth_time in", values, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeNotIn(List<Date> values) {
			addCriterionForJDBCTime("birth_time not in", values, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("birth_time between", value1, value2, "birthTime");
			return (Criteria) this;
		}

		public Criteria andBirthTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCTime("birth_time not between", value1, value2, "birthTime");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andHometownIsNull() {
			addCriterion("hometown is null");
			return (Criteria) this;
		}

		public Criteria andHometownIsNotNull() {
			addCriterion("hometown is not null");
			return (Criteria) this;
		}

		public Criteria andHometownEqualTo(String value) {
			addCriterion("hometown =", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownNotEqualTo(String value) {
			addCriterion("hometown <>", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownGreaterThan(String value) {
			addCriterion("hometown >", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownGreaterThanOrEqualTo(String value) {
			addCriterion("hometown >=", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownLessThan(String value) {
			addCriterion("hometown <", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownLessThanOrEqualTo(String value) {
			addCriterion("hometown <=", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownLike(String value) {
			addCriterion("hometown like", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownNotLike(String value) {
			addCriterion("hometown not like", value, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownIn(List<String> values) {
			addCriterion("hometown in", values, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownNotIn(List<String> values) {
			addCriterion("hometown not in", values, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownBetween(String value1, String value2) {
			addCriterion("hometown between", value1, value2, "hometown");
			return (Criteria) this;
		}

		public Criteria andHometownNotBetween(String value1, String value2) {
			addCriterion("hometown not between", value1, value2, "hometown");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceIsNull() {
			addCriterion("been_to_place is null");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceIsNotNull() {
			addCriterion("been_to_place is not null");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceEqualTo(String value) {
			addCriterion("been_to_place =", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceNotEqualTo(String value) {
			addCriterion("been_to_place <>", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceGreaterThan(String value) {
			addCriterion("been_to_place >", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceGreaterThanOrEqualTo(String value) {
			addCriterion("been_to_place >=", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceLessThan(String value) {
			addCriterion("been_to_place <", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceLessThanOrEqualTo(String value) {
			addCriterion("been_to_place <=", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceLike(String value) {
			addCriterion("been_to_place like", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceNotLike(String value) {
			addCriterion("been_to_place not like", value, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceIn(List<String> values) {
			addCriterion("been_to_place in", values, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceNotIn(List<String> values) {
			addCriterion("been_to_place not in", values, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceBetween(String value1, String value2) {
			addCriterion("been_to_place between", value1, value2, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andBeenToPlaceNotBetween(String value1, String value2) {
			addCriterion("been_to_place not between", value1, value2, "beenToPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceIsNull() {
			addCriterion("current_place is null");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceIsNotNull() {
			addCriterion("current_place is not null");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceEqualTo(String value) {
			addCriterion("current_place =", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceNotEqualTo(String value) {
			addCriterion("current_place <>", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceGreaterThan(String value) {
			addCriterion("current_place >", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceGreaterThanOrEqualTo(String value) {
			addCriterion("current_place >=", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceLessThan(String value) {
			addCriterion("current_place <", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceLessThanOrEqualTo(String value) {
			addCriterion("current_place <=", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceLike(String value) {
			addCriterion("current_place like", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceNotLike(String value) {
			addCriterion("current_place not like", value, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceIn(List<String> values) {
			addCriterion("current_place in", values, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceNotIn(List<String> values) {
			addCriterion("current_place not in", values, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceBetween(String value1, String value2) {
			addCriterion("current_place between", value1, value2, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCurrentPlaceNotBetween(String value1, String value2) {
			addCriterion("current_place not between", value1, value2, "currentPlace");
			return (Criteria) this;
		}

		public Criteria andCareerIsNull() {
			addCriterion("career is null");
			return (Criteria) this;
		}

		public Criteria andCareerIsNotNull() {
			addCriterion("career is not null");
			return (Criteria) this;
		}

		public Criteria andCareerEqualTo(String value) {
			addCriterion("career =", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerNotEqualTo(String value) {
			addCriterion("career <>", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerGreaterThan(String value) {
			addCriterion("career >", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerGreaterThanOrEqualTo(String value) {
			addCriterion("career >=", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerLessThan(String value) {
			addCriterion("career <", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerLessThanOrEqualTo(String value) {
			addCriterion("career <=", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerLike(String value) {
			addCriterion("career like", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerNotLike(String value) {
			addCriterion("career not like", value, "career");
			return (Criteria) this;
		}

		public Criteria andCareerIn(List<String> values) {
			addCriterion("career in", values, "career");
			return (Criteria) this;
		}

		public Criteria andCareerNotIn(List<String> values) {
			addCriterion("career not in", values, "career");
			return (Criteria) this;
		}

		public Criteria andCareerBetween(String value1, String value2) {
			addCriterion("career between", value1, value2, "career");
			return (Criteria) this;
		}

		public Criteria andCareerNotBetween(String value1, String value2) {
			addCriterion("career not between", value1, value2, "career");
			return (Criteria) this;
		}

		public Criteria andHobbyIsNull() {
			addCriterion("hobby is null");
			return (Criteria) this;
		}

		public Criteria andHobbyIsNotNull() {
			addCriterion("hobby is not null");
			return (Criteria) this;
		}

		public Criteria andHobbyEqualTo(String value) {
			addCriterion("hobby =", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyNotEqualTo(String value) {
			addCriterion("hobby <>", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyGreaterThan(String value) {
			addCriterion("hobby >", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyGreaterThanOrEqualTo(String value) {
			addCriterion("hobby >=", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyLessThan(String value) {
			addCriterion("hobby <", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyLessThanOrEqualTo(String value) {
			addCriterion("hobby <=", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyLike(String value) {
			addCriterion("hobby like", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyNotLike(String value) {
			addCriterion("hobby not like", value, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyIn(List<String> values) {
			addCriterion("hobby in", values, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyNotIn(List<String> values) {
			addCriterion("hobby not in", values, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyBetween(String value1, String value2) {
			addCriterion("hobby between", value1, value2, "hobby");
			return (Criteria) this;
		}

		public Criteria andHobbyNotBetween(String value1, String value2) {
			addCriterion("hobby not between", value1, value2, "hobby");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeIsNull() {
			addCriterion("last_login_datetime is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeIsNotNull() {
			addCriterion("last_login_datetime is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeEqualTo(Date value) {
			addCriterion("last_login_datetime =", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeNotEqualTo(Date value) {
			addCriterion("last_login_datetime <>", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeGreaterThan(Date value) {
			addCriterion("last_login_datetime >", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_login_datetime >=", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeLessThan(Date value) {
			addCriterion("last_login_datetime <", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("last_login_datetime <=", value, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeIn(List<Date> values) {
			addCriterion("last_login_datetime in", values, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeNotIn(List<Date> values) {
			addCriterion("last_login_datetime not in", values, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeBetween(Date value1, Date value2) {
			addCriterion("last_login_datetime between", value1, value2, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("last_login_datetime not between", value1, value2, "lastLoginDatetime");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrIsNull() {
			addCriterion("last_login_addr is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrIsNotNull() {
			addCriterion("last_login_addr is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrEqualTo(String value) {
			addCriterion("last_login_addr =", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrNotEqualTo(String value) {
			addCriterion("last_login_addr <>", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrGreaterThan(String value) {
			addCriterion("last_login_addr >", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrGreaterThanOrEqualTo(String value) {
			addCriterion("last_login_addr >=", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrLessThan(String value) {
			addCriterion("last_login_addr <", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrLessThanOrEqualTo(String value) {
			addCriterion("last_login_addr <=", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrLike(String value) {
			addCriterion("last_login_addr like", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrNotLike(String value) {
			addCriterion("last_login_addr not like", value, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrIn(List<String> values) {
			addCriterion("last_login_addr in", values, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrNotIn(List<String> values) {
			addCriterion("last_login_addr not in", values, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrBetween(String value1, String value2) {
			addCriterion("last_login_addr between", value1, value2, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginAddrNotBetween(String value1, String value2) {
			addCriterion("last_login_addr not between", value1, value2, "lastLoginAddr");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngIsNull() {
			addCriterion("last_login_lng is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngIsNotNull() {
			addCriterion("last_login_lng is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngEqualTo(Double value) {
			addCriterion("last_login_lng =", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngNotEqualTo(Double value) {
			addCriterion("last_login_lng <>", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngGreaterThan(Double value) {
			addCriterion("last_login_lng >", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngGreaterThanOrEqualTo(Double value) {
			addCriterion("last_login_lng >=", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngLessThan(Double value) {
			addCriterion("last_login_lng <", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngLessThanOrEqualTo(Double value) {
			addCriterion("last_login_lng <=", value, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngIn(List<Double> values) {
			addCriterion("last_login_lng in", values, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngNotIn(List<Double> values) {
			addCriterion("last_login_lng not in", values, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngBetween(Double value1, Double value2) {
			addCriterion("last_login_lng between", value1, value2, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLngNotBetween(Double value1, Double value2) {
			addCriterion("last_login_lng not between", value1, value2, "lastLoginLng");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatIsNull() {
			addCriterion("last_login_lat is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatIsNotNull() {
			addCriterion("last_login_lat is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatEqualTo(Double value) {
			addCriterion("last_login_lat =", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatNotEqualTo(Double value) {
			addCriterion("last_login_lat <>", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatGreaterThan(Double value) {
			addCriterion("last_login_lat >", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatGreaterThanOrEqualTo(Double value) {
			addCriterion("last_login_lat >=", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatLessThan(Double value) {
			addCriterion("last_login_lat <", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatLessThanOrEqualTo(Double value) {
			addCriterion("last_login_lat <=", value, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatIn(List<Double> values) {
			addCriterion("last_login_lat in", values, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatNotIn(List<Double> values) {
			addCriterion("last_login_lat not in", values, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatBetween(Double value1, Double value2) {
			addCriterion("last_login_lat between", value1, value2, "lastLoginLat");
			return (Criteria) this;
		}

		public Criteria andLastLoginLatNotBetween(Double value1, Double value2) {
			addCriterion("last_login_lat not between", value1, value2, "lastLoginLat");
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