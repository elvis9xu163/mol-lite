package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Long value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Long value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Long value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Long value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Long value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Long value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Long> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Long> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Long value1, Long value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Long value1, Long value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNull() {
            addCriterion("res_type is null");
            return (Criteria) this;
        }

        public Criteria andResTypeIsNotNull() {
            addCriterion("res_type is not null");
            return (Criteria) this;
        }

        public Criteria andResTypeEqualTo(String value) {
            addCriterion("res_type =", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotEqualTo(String value) {
            addCriterion("res_type <>", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThan(String value) {
            addCriterion("res_type >", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeGreaterThanOrEqualTo(String value) {
            addCriterion("res_type >=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThan(String value) {
            addCriterion("res_type <", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLessThanOrEqualTo(String value) {
            addCriterion("res_type <=", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeLike(String value) {
            addCriterion("res_type like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotLike(String value) {
            addCriterion("res_type not like", value, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeIn(List<String> values) {
            addCriterion("res_type in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotIn(List<String> values) {
            addCriterion("res_type not in", values, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeBetween(String value1, String value2) {
            addCriterion("res_type between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResTypeNotBetween(String value1, String value2) {
            addCriterion("res_type not between", value1, value2, "resType");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNull() {
            addCriterion("res_format is null");
            return (Criteria) this;
        }

        public Criteria andResFormatIsNotNull() {
            addCriterion("res_format is not null");
            return (Criteria) this;
        }

        public Criteria andResFormatEqualTo(String value) {
            addCriterion("res_format =", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotEqualTo(String value) {
            addCriterion("res_format <>", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThan(String value) {
            addCriterion("res_format >", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatGreaterThanOrEqualTo(String value) {
            addCriterion("res_format >=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThan(String value) {
            addCriterion("res_format <", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLessThanOrEqualTo(String value) {
            addCriterion("res_format <=", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatLike(String value) {
            addCriterion("res_format like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotLike(String value) {
            addCriterion("res_format not like", value, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatIn(List<String> values) {
            addCriterion("res_format in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotIn(List<String> values) {
            addCriterion("res_format not in", values, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatBetween(String value1, String value2) {
            addCriterion("res_format between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResFormatNotBetween(String value1, String value2) {
            addCriterion("res_format not between", value1, value2, "resFormat");
            return (Criteria) this;
        }

        public Criteria andResSizeIsNull() {
            addCriterion("res_size is null");
            return (Criteria) this;
        }

        public Criteria andResSizeIsNotNull() {
            addCriterion("res_size is not null");
            return (Criteria) this;
        }

        public Criteria andResSizeEqualTo(Long value) {
            addCriterion("res_size =", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotEqualTo(Long value) {
            addCriterion("res_size <>", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeGreaterThan(Long value) {
            addCriterion("res_size >", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("res_size >=", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeLessThan(Long value) {
            addCriterion("res_size <", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeLessThanOrEqualTo(Long value) {
            addCriterion("res_size <=", value, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeIn(List<Long> values) {
            addCriterion("res_size in", values, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotIn(List<Long> values) {
            addCriterion("res_size not in", values, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeBetween(Long value1, Long value2) {
            addCriterion("res_size between", value1, value2, "resSize");
            return (Criteria) this;
        }

        public Criteria andResSizeNotBetween(Long value1, Long value2) {
            addCriterion("res_size not between", value1, value2, "resSize");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNull() {
            addCriterion("res_md5 is null");
            return (Criteria) this;
        }

        public Criteria andResMd5IsNotNull() {
            addCriterion("res_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andResMd5EqualTo(String value) {
            addCriterion("res_md5 =", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotEqualTo(String value) {
            addCriterion("res_md5 <>", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThan(String value) {
            addCriterion("res_md5 >", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5GreaterThanOrEqualTo(String value) {
            addCriterion("res_md5 >=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThan(String value) {
            addCriterion("res_md5 <", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5LessThanOrEqualTo(String value) {
            addCriterion("res_md5 <=", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Like(String value) {
            addCriterion("res_md5 like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotLike(String value) {
            addCriterion("res_md5 not like", value, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5In(List<String> values) {
            addCriterion("res_md5 in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotIn(List<String> values) {
            addCriterion("res_md5 not in", values, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5Between(String value1, String value2) {
            addCriterion("res_md5 between", value1, value2, "resMd5");
            return (Criteria) this;
        }

        public Criteria andResMd5NotBetween(String value1, String value2) {
            addCriterion("res_md5 not between", value1, value2, "resMd5");
            return (Criteria) this;
        }

        public Criteria andPathTypeIsNull() {
            addCriterion("path_type is null");
            return (Criteria) this;
        }

        public Criteria andPathTypeIsNotNull() {
            addCriterion("path_type is not null");
            return (Criteria) this;
        }

        public Criteria andPathTypeEqualTo(String value) {
            addCriterion("path_type =", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeNotEqualTo(String value) {
            addCriterion("path_type <>", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeGreaterThan(String value) {
            addCriterion("path_type >", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeGreaterThanOrEqualTo(String value) {
            addCriterion("path_type >=", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeLessThan(String value) {
            addCriterion("path_type <", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeLessThanOrEqualTo(String value) {
            addCriterion("path_type <=", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeLike(String value) {
            addCriterion("path_type like", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeNotLike(String value) {
            addCriterion("path_type not like", value, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeIn(List<String> values) {
            addCriterion("path_type in", values, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeNotIn(List<String> values) {
            addCriterion("path_type not in", values, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeBetween(String value1, String value2) {
            addCriterion("path_type between", value1, value2, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathTypeNotBetween(String value1, String value2) {
            addCriterion("path_type not between", value1, value2, "pathType");
            return (Criteria) this;
        }

        public Criteria andPathContentIsNull() {
            addCriterion("path_content is null");
            return (Criteria) this;
        }

        public Criteria andPathContentIsNotNull() {
            addCriterion("path_content is not null");
            return (Criteria) this;
        }

        public Criteria andPathContentEqualTo(String value) {
            addCriterion("path_content =", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentNotEqualTo(String value) {
            addCriterion("path_content <>", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentGreaterThan(String value) {
            addCriterion("path_content >", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentGreaterThanOrEqualTo(String value) {
            addCriterion("path_content >=", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentLessThan(String value) {
            addCriterion("path_content <", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentLessThanOrEqualTo(String value) {
            addCriterion("path_content <=", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentLike(String value) {
            addCriterion("path_content like", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentNotLike(String value) {
            addCriterion("path_content not like", value, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentIn(List<String> values) {
            addCriterion("path_content in", values, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentNotIn(List<String> values) {
            addCriterion("path_content not in", values, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentBetween(String value1, String value2) {
            addCriterion("path_content between", value1, value2, "pathContent");
            return (Criteria) this;
        }

        public Criteria andPathContentNotBetween(String value1, String value2) {
            addCriterion("path_content not between", value1, value2, "pathContent");
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