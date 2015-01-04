package com.xjd.mol.dal.domain.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MomentUserDoExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MomentUserDoExample() {
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

		public Criteria andRoleIsNull() {
			addCriterion("role is null");
			return (Criteria) this;
		}

		public Criteria andRoleIsNotNull() {
			addCriterion("role is not null");
			return (Criteria) this;
		}

		public Criteria andRoleEqualTo(String value) {
			addCriterion("role =", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotEqualTo(String value) {
			addCriterion("role <>", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleGreaterThan(String value) {
			addCriterion("role >", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleGreaterThanOrEqualTo(String value) {
			addCriterion("role >=", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLessThan(String value) {
			addCriterion("role <", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLessThanOrEqualTo(String value) {
			addCriterion("role <=", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleLike(String value) {
			addCriterion("role like", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotLike(String value) {
			addCriterion("role not like", value, "role");
			return (Criteria) this;
		}

		public Criteria andRoleIn(List<String> values) {
			addCriterion("role in", values, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotIn(List<String> values) {
			addCriterion("role not in", values, "role");
			return (Criteria) this;
		}

		public Criteria andRoleBetween(String value1, String value2) {
			addCriterion("role between", value1, value2, "role");
			return (Criteria) this;
		}

		public Criteria andRoleNotBetween(String value1, String value2) {
			addCriterion("role not between", value1, value2, "role");
			return (Criteria) this;
		}

		public Criteria andCommentsIsNull() {
			addCriterion("comments is null");
			return (Criteria) this;
		}

		public Criteria andCommentsIsNotNull() {
			addCriterion("comments is not null");
			return (Criteria) this;
		}

		public Criteria andCommentsEqualTo(String value) {
			addCriterion("comments =", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotEqualTo(String value) {
			addCriterion("comments <>", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsGreaterThan(String value) {
			addCriterion("comments >", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsGreaterThanOrEqualTo(String value) {
			addCriterion("comments >=", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLessThan(String value) {
			addCriterion("comments <", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLessThanOrEqualTo(String value) {
			addCriterion("comments <=", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsLike(String value) {
			addCriterion("comments like", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotLike(String value) {
			addCriterion("comments not like", value, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsIn(List<String> values) {
			addCriterion("comments in", values, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotIn(List<String> values) {
			addCriterion("comments not in", values, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsBetween(String value1, String value2) {
			addCriterion("comments between", value1, value2, "comments");
			return (Criteria) this;
		}

		public Criteria andCommentsNotBetween(String value1, String value2) {
			addCriterion("comments not between", value1, value2, "comments");
			return (Criteria) this;
		}

		public Criteria andPicRidsIsNull() {
			addCriterion("pic_rids is null");
			return (Criteria) this;
		}

		public Criteria andPicRidsIsNotNull() {
			addCriterion("pic_rids is not null");
			return (Criteria) this;
		}

		public Criteria andPicRidsEqualTo(String value) {
			addCriterion("pic_rids =", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsNotEqualTo(String value) {
			addCriterion("pic_rids <>", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsGreaterThan(String value) {
			addCriterion("pic_rids >", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsGreaterThanOrEqualTo(String value) {
			addCriterion("pic_rids >=", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsLessThan(String value) {
			addCriterion("pic_rids <", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsLessThanOrEqualTo(String value) {
			addCriterion("pic_rids <=", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsLike(String value) {
			addCriterion("pic_rids like", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsNotLike(String value) {
			addCriterion("pic_rids not like", value, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsIn(List<String> values) {
			addCriterion("pic_rids in", values, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsNotIn(List<String> values) {
			addCriterion("pic_rids not in", values, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsBetween(String value1, String value2) {
			addCriterion("pic_rids between", value1, value2, "picRids");
			return (Criteria) this;
		}

		public Criteria andPicRidsNotBetween(String value1, String value2) {
			addCriterion("pic_rids not between", value1, value2, "picRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsIsNull() {
			addCriterion("audio_rids is null");
			return (Criteria) this;
		}

		public Criteria andAudioRidsIsNotNull() {
			addCriterion("audio_rids is not null");
			return (Criteria) this;
		}

		public Criteria andAudioRidsEqualTo(String value) {
			addCriterion("audio_rids =", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsNotEqualTo(String value) {
			addCriterion("audio_rids <>", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsGreaterThan(String value) {
			addCriterion("audio_rids >", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsGreaterThanOrEqualTo(String value) {
			addCriterion("audio_rids >=", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsLessThan(String value) {
			addCriterion("audio_rids <", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsLessThanOrEqualTo(String value) {
			addCriterion("audio_rids <=", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsLike(String value) {
			addCriterion("audio_rids like", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsNotLike(String value) {
			addCriterion("audio_rids not like", value, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsIn(List<String> values) {
			addCriterion("audio_rids in", values, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsNotIn(List<String> values) {
			addCriterion("audio_rids not in", values, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsBetween(String value1, String value2) {
			addCriterion("audio_rids between", value1, value2, "audioRids");
			return (Criteria) this;
		}

		public Criteria andAudioRidsNotBetween(String value1, String value2) {
			addCriterion("audio_rids not between", value1, value2, "audioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsIsNull() {
			addCriterion("vedio_rids is null");
			return (Criteria) this;
		}

		public Criteria andVedioRidsIsNotNull() {
			addCriterion("vedio_rids is not null");
			return (Criteria) this;
		}

		public Criteria andVedioRidsEqualTo(String value) {
			addCriterion("vedio_rids =", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsNotEqualTo(String value) {
			addCriterion("vedio_rids <>", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsGreaterThan(String value) {
			addCriterion("vedio_rids >", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsGreaterThanOrEqualTo(String value) {
			addCriterion("vedio_rids >=", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsLessThan(String value) {
			addCriterion("vedio_rids <", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsLessThanOrEqualTo(String value) {
			addCriterion("vedio_rids <=", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsLike(String value) {
			addCriterion("vedio_rids like", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsNotLike(String value) {
			addCriterion("vedio_rids not like", value, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsIn(List<String> values) {
			addCriterion("vedio_rids in", values, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsNotIn(List<String> values) {
			addCriterion("vedio_rids not in", values, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsBetween(String value1, String value2) {
			addCriterion("vedio_rids between", value1, value2, "vedioRids");
			return (Criteria) this;
		}

		public Criteria andVedioRidsNotBetween(String value1, String value2) {
			addCriterion("vedio_rids not between", value1, value2, "vedioRids");
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