package com.cdu.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountIsNull() {
            addCriterion("teacher_account is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountIsNotNull() {
            addCriterion("teacher_account is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountEqualTo(String value) {
            addCriterion("teacher_account =", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotEqualTo(String value) {
            addCriterion("teacher_account <>", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountGreaterThan(String value) {
            addCriterion("teacher_account >", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_account >=", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLessThan(String value) {
            addCriterion("teacher_account <", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLessThanOrEqualTo(String value) {
            addCriterion("teacher_account <=", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLike(String value) {
            addCriterion("teacher_account like", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotLike(String value) {
            addCriterion("teacher_account not like", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountIn(List<String> values) {
            addCriterion("teacher_account in", values, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotIn(List<String> values) {
            addCriterion("teacher_account not in", values, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountBetween(String value1, String value2) {
            addCriterion("teacher_account between", value1, value2, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotBetween(String value1, String value2) {
            addCriterion("teacher_account not between", value1, value2, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherPwIsNull() {
            addCriterion("teacher_pw is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwIsNotNull() {
            addCriterion("teacher_pw is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPwEqualTo(String value) {
            addCriterion("teacher_pw =", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwNotEqualTo(String value) {
            addCriterion("teacher_pw <>", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwGreaterThan(String value) {
            addCriterion("teacher_pw >", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_pw >=", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwLessThan(String value) {
            addCriterion("teacher_pw <", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwLessThanOrEqualTo(String value) {
            addCriterion("teacher_pw <=", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwLike(String value) {
            addCriterion("teacher_pw like", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwNotLike(String value) {
            addCriterion("teacher_pw not like", value, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwIn(List<String> values) {
            addCriterion("teacher_pw in", values, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwNotIn(List<String> values) {
            addCriterion("teacher_pw not in", values, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwBetween(String value1, String value2) {
            addCriterion("teacher_pw between", value1, value2, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherPwNotBetween(String value1, String value2) {
            addCriterion("teacher_pw not between", value1, value2, "teacherPw");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNull() {
            addCriterion("teacher_gender is null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIsNotNull() {
            addCriterion("teacher_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderEqualTo(String value) {
            addCriterion("teacher_gender =", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotEqualTo(String value) {
            addCriterion("teacher_gender <>", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThan(String value) {
            addCriterion("teacher_gender >", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_gender >=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThan(String value) {
            addCriterion("teacher_gender <", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLessThanOrEqualTo(String value) {
            addCriterion("teacher_gender <=", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderLike(String value) {
            addCriterion("teacher_gender like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotLike(String value) {
            addCriterion("teacher_gender not like", value, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderIn(List<String> values) {
            addCriterion("teacher_gender in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotIn(List<String> values) {
            addCriterion("teacher_gender not in", values, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderBetween(String value1, String value2) {
            addCriterion("teacher_gender between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherGenderNotBetween(String value1, String value2) {
            addCriterion("teacher_gender not between", value1, value2, "teacherGender");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIsNull() {
            addCriterion("teacher_intro is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIsNotNull() {
            addCriterion("teacher_intro is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroEqualTo(String value) {
            addCriterion("teacher_intro =", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotEqualTo(String value) {
            addCriterion("teacher_intro <>", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroGreaterThan(String value) {
            addCriterion("teacher_intro >", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_intro >=", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLessThan(String value) {
            addCriterion("teacher_intro <", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLessThanOrEqualTo(String value) {
            addCriterion("teacher_intro <=", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroLike(String value) {
            addCriterion("teacher_intro like", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotLike(String value) {
            addCriterion("teacher_intro not like", value, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroIn(List<String> values) {
            addCriterion("teacher_intro in", values, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotIn(List<String> values) {
            addCriterion("teacher_intro not in", values, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroBetween(String value1, String value2) {
            addCriterion("teacher_intro between", value1, value2, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroNotBetween(String value1, String value2) {
            addCriterion("teacher_intro not between", value1, value2, "teacherIntro");
            return (Criteria) this;
        }

        public Criteria andTeacherIconIsNull() {
            addCriterion("teacher_icon is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIconIsNotNull() {
            addCriterion("teacher_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIconEqualTo(String value) {
            addCriterion("teacher_icon =", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconNotEqualTo(String value) {
            addCriterion("teacher_icon <>", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconGreaterThan(String value) {
            addCriterion("teacher_icon >", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_icon >=", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconLessThan(String value) {
            addCriterion("teacher_icon <", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconLessThanOrEqualTo(String value) {
            addCriterion("teacher_icon <=", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconLike(String value) {
            addCriterion("teacher_icon like", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconNotLike(String value) {
            addCriterion("teacher_icon not like", value, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconIn(List<String> values) {
            addCriterion("teacher_icon in", values, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconNotIn(List<String> values) {
            addCriterion("teacher_icon not in", values, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconBetween(String value1, String value2) {
            addCriterion("teacher_icon between", value1, value2, "teacherIcon");
            return (Criteria) this;
        }

        public Criteria andTeacherIconNotBetween(String value1, String value2) {
            addCriterion("teacher_icon not between", value1, value2, "teacherIcon");
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