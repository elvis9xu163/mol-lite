package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CalendarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CalendarExample() {
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

        public Criteria andSolarDateIsNull() {
            addCriterion("solar_date is null");
            return (Criteria) this;
        }

        public Criteria andSolarDateIsNotNull() {
            addCriterion("solar_date is not null");
            return (Criteria) this;
        }

        public Criteria andSolarDateEqualTo(Date value) {
            addCriterionForJDBCDate("solar_date =", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("solar_date <>", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateGreaterThan(Date value) {
            addCriterionForJDBCDate("solar_date >", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solar_date >=", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateLessThan(Date value) {
            addCriterionForJDBCDate("solar_date <", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("solar_date <=", value, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateIn(List<Date> values) {
            addCriterionForJDBCDate("solar_date in", values, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("solar_date not in", values, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solar_date between", value1, value2, "solarDate");
            return (Criteria) this;
        }

        public Criteria andSolarDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("solar_date not between", value1, value2, "solarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateIsNull() {
            addCriterion("lunar_date is null");
            return (Criteria) this;
        }

        public Criteria andLunarDateIsNotNull() {
            addCriterion("lunar_date is not null");
            return (Criteria) this;
        }

        public Criteria andLunarDateEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_date =", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_date <>", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lunar_date >", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_date >=", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateLessThan(Date value) {
            addCriterionForJDBCDate("lunar_date <", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lunar_date <=", value, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateIn(List<Date> values) {
            addCriterionForJDBCDate("lunar_date in", values, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lunar_date not in", values, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunar_date between", value1, value2, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andLunarDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lunar_date not between", value1, value2, "lunarDate");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNull() {
            addCriterion("week_day is null");
            return (Criteria) this;
        }

        public Criteria andWeekDayIsNotNull() {
            addCriterion("week_day is not null");
            return (Criteria) this;
        }

        public Criteria andWeekDayEqualTo(Byte value) {
            addCriterion("week_day =", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotEqualTo(Byte value) {
            addCriterion("week_day <>", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThan(Byte value) {
            addCriterion("week_day >", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("week_day >=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThan(Byte value) {
            addCriterion("week_day <", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayLessThanOrEqualTo(Byte value) {
            addCriterion("week_day <=", value, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayIn(List<Byte> values) {
            addCriterion("week_day in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotIn(List<Byte> values) {
            addCriterion("week_day not in", values, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayBetween(Byte value1, Byte value2) {
            addCriterion("week_day between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andWeekDayNotBetween(Byte value1, Byte value2) {
            addCriterion("week_day not between", value1, value2, "weekDay");
            return (Criteria) this;
        }

        public Criteria andFestivalIsNull() {
            addCriterion("festival is null");
            return (Criteria) this;
        }

        public Criteria andFestivalIsNotNull() {
            addCriterion("festival is not null");
            return (Criteria) this;
        }

        public Criteria andFestivalEqualTo(String value) {
            addCriterion("festival =", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotEqualTo(String value) {
            addCriterion("festival <>", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalGreaterThan(String value) {
            addCriterion("festival >", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalGreaterThanOrEqualTo(String value) {
            addCriterion("festival >=", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalLessThan(String value) {
            addCriterion("festival <", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalLessThanOrEqualTo(String value) {
            addCriterion("festival <=", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalLike(String value) {
            addCriterion("festival like", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotLike(String value) {
            addCriterion("festival not like", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalIn(List<String> values) {
            addCriterion("festival in", values, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotIn(List<String> values) {
            addCriterion("festival not in", values, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalBetween(String value1, String value2) {
            addCriterion("festival between", value1, value2, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotBetween(String value1, String value2) {
            addCriterion("festival not between", value1, value2, "festival");
            return (Criteria) this;
        }

        public Criteria andNeedWorkIsNull() {
            addCriterion("need_work is null");
            return (Criteria) this;
        }

        public Criteria andNeedWorkIsNotNull() {
            addCriterion("need_work is not null");
            return (Criteria) this;
        }

        public Criteria andNeedWorkEqualTo(Byte value) {
            addCriterion("need_work =", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkNotEqualTo(Byte value) {
            addCriterion("need_work <>", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkGreaterThan(Byte value) {
            addCriterion("need_work >", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkGreaterThanOrEqualTo(Byte value) {
            addCriterion("need_work >=", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkLessThan(Byte value) {
            addCriterion("need_work <", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkLessThanOrEqualTo(Byte value) {
            addCriterion("need_work <=", value, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkIn(List<Byte> values) {
            addCriterion("need_work in", values, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkNotIn(List<Byte> values) {
            addCriterion("need_work not in", values, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkBetween(Byte value1, Byte value2) {
            addCriterion("need_work between", value1, value2, "needWork");
            return (Criteria) this;
        }

        public Criteria andNeedWorkNotBetween(Byte value1, Byte value2) {
            addCriterion("need_work not between", value1, value2, "needWork");
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