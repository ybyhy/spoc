package com.cdu.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionIsNull() {
            addCriterion("course_direction is null");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionIsNotNull() {
            addCriterion("course_direction is not null");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionEqualTo(String value) {
            addCriterion("course_direction =", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionNotEqualTo(String value) {
            addCriterion("course_direction <>", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionGreaterThan(String value) {
            addCriterion("course_direction >", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("course_direction >=", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionLessThan(String value) {
            addCriterion("course_direction <", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionLessThanOrEqualTo(String value) {
            addCriterion("course_direction <=", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionLike(String value) {
            addCriterion("course_direction like", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionNotLike(String value) {
            addCriterion("course_direction not like", value, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionIn(List<String> values) {
            addCriterion("course_direction in", values, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionNotIn(List<String> values) {
            addCriterion("course_direction not in", values, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionBetween(String value1, String value2) {
            addCriterion("course_direction between", value1, value2, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseDirectionNotBetween(String value1, String value2) {
            addCriterion("course_direction not between", value1, value2, "courseDirection");
            return (Criteria) this;
        }

        public Criteria andCourseLevelIsNull() {
            addCriterion("course_level is null");
            return (Criteria) this;
        }

        public Criteria andCourseLevelIsNotNull() {
            addCriterion("course_level is not null");
            return (Criteria) this;
        }

        public Criteria andCourseLevelEqualTo(String value) {
            addCriterion("course_level =", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelNotEqualTo(String value) {
            addCriterion("course_level <>", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelGreaterThan(String value) {
            addCriterion("course_level >", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("course_level >=", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelLessThan(String value) {
            addCriterion("course_level <", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelLessThanOrEqualTo(String value) {
            addCriterion("course_level <=", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelLike(String value) {
            addCriterion("course_level like", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelNotLike(String value) {
            addCriterion("course_level not like", value, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelIn(List<String> values) {
            addCriterion("course_level in", values, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelNotIn(List<String> values) {
            addCriterion("course_level not in", values, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelBetween(String value1, String value2) {
            addCriterion("course_level between", value1, value2, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseLevelNotBetween(String value1, String value2) {
            addCriterion("course_level not between", value1, value2, "courseLevel");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsIsNull() {
            addCriterion("course_keywords is null");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsIsNotNull() {
            addCriterion("course_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsEqualTo(String value) {
            addCriterion("course_keywords =", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsNotEqualTo(String value) {
            addCriterion("course_keywords <>", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsGreaterThan(String value) {
            addCriterion("course_keywords >", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("course_keywords >=", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsLessThan(String value) {
            addCriterion("course_keywords <", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsLessThanOrEqualTo(String value) {
            addCriterion("course_keywords <=", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsLike(String value) {
            addCriterion("course_keywords like", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsNotLike(String value) {
            addCriterion("course_keywords not like", value, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsIn(List<String> values) {
            addCriterion("course_keywords in", values, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsNotIn(List<String> values) {
            addCriterion("course_keywords not in", values, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsBetween(String value1, String value2) {
            addCriterion("course_keywords between", value1, value2, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseKeywordsNotBetween(String value1, String value2) {
            addCriterion("course_keywords not between", value1, value2, "courseKeywords");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNull() {
            addCriterion("course_intro is null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIsNotNull() {
            addCriterion("course_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIntroEqualTo(String value) {
            addCriterion("course_intro =", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotEqualTo(String value) {
            addCriterion("course_intro <>", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThan(String value) {
            addCriterion("course_intro >", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroGreaterThanOrEqualTo(String value) {
            addCriterion("course_intro >=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThan(String value) {
            addCriterion("course_intro <", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLessThanOrEqualTo(String value) {
            addCriterion("course_intro <=", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroLike(String value) {
            addCriterion("course_intro like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotLike(String value) {
            addCriterion("course_intro not like", value, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroIn(List<String> values) {
            addCriterion("course_intro in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotIn(List<String> values) {
            addCriterion("course_intro not in", values, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroBetween(String value1, String value2) {
            addCriterion("course_intro between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIntroNotBetween(String value1, String value2) {
            addCriterion("course_intro not between", value1, value2, "courseIntro");
            return (Criteria) this;
        }

        public Criteria andCourseIconIsNull() {
            addCriterion("course_icon is null");
            return (Criteria) this;
        }

        public Criteria andCourseIconIsNotNull() {
            addCriterion("course_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIconEqualTo(String value) {
            addCriterion("course_icon =", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconNotEqualTo(String value) {
            addCriterion("course_icon <>", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconGreaterThan(String value) {
            addCriterion("course_icon >", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconGreaterThanOrEqualTo(String value) {
            addCriterion("course_icon >=", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconLessThan(String value) {
            addCriterion("course_icon <", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconLessThanOrEqualTo(String value) {
            addCriterion("course_icon <=", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconLike(String value) {
            addCriterion("course_icon like", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconNotLike(String value) {
            addCriterion("course_icon not like", value, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconIn(List<String> values) {
            addCriterion("course_icon in", values, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconNotIn(List<String> values) {
            addCriterion("course_icon not in", values, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconBetween(String value1, String value2) {
            addCriterion("course_icon between", value1, value2, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseIconNotBetween(String value1, String value2) {
            addCriterion("course_icon not between", value1, value2, "courseIcon");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountIsNull() {
            addCriterion("course_click_count is null");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountIsNotNull() {
            addCriterion("course_click_count is not null");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountEqualTo(Integer value) {
            addCriterion("course_click_count =", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountNotEqualTo(Integer value) {
            addCriterion("course_click_count <>", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountGreaterThan(Integer value) {
            addCriterion("course_click_count >", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_click_count >=", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountLessThan(Integer value) {
            addCriterion("course_click_count <", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountLessThanOrEqualTo(Integer value) {
            addCriterion("course_click_count <=", value, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountIn(List<Integer> values) {
            addCriterion("course_click_count in", values, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountNotIn(List<Integer> values) {
            addCriterion("course_click_count not in", values, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountBetween(Integer value1, Integer value2) {
            addCriterion("course_click_count between", value1, value2, "courseClickCount");
            return (Criteria) this;
        }

        public Criteria andCourseClickCountNotBetween(Integer value1, Integer value2) {
            addCriterion("course_click_count not between", value1, value2, "courseClickCount");
            return (Criteria) this;
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