package com.cdu.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuAccountIsNull() {
            addCriterion("stu_account is null");
            return (Criteria) this;
        }

        public Criteria andStuAccountIsNotNull() {
            addCriterion("stu_account is not null");
            return (Criteria) this;
        }

        public Criteria andStuAccountEqualTo(String value) {
            addCriterion("stu_account =", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotEqualTo(String value) {
            addCriterion("stu_account <>", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountGreaterThan(String value) {
            addCriterion("stu_account >", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountGreaterThanOrEqualTo(String value) {
            addCriterion("stu_account >=", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLessThan(String value) {
            addCriterion("stu_account <", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLessThanOrEqualTo(String value) {
            addCriterion("stu_account <=", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountLike(String value) {
            addCriterion("stu_account like", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotLike(String value) {
            addCriterion("stu_account not like", value, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountIn(List<String> values) {
            addCriterion("stu_account in", values, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotIn(List<String> values) {
            addCriterion("stu_account not in", values, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountBetween(String value1, String value2) {
            addCriterion("stu_account between", value1, value2, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuAccountNotBetween(String value1, String value2) {
            addCriterion("stu_account not between", value1, value2, "stuAccount");
            return (Criteria) this;
        }

        public Criteria andStuPwIsNull() {
            addCriterion("stu_pw is null");
            return (Criteria) this;
        }

        public Criteria andStuPwIsNotNull() {
            addCriterion("stu_pw is not null");
            return (Criteria) this;
        }

        public Criteria andStuPwEqualTo(String value) {
            addCriterion("stu_pw =", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwNotEqualTo(String value) {
            addCriterion("stu_pw <>", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwGreaterThan(String value) {
            addCriterion("stu_pw >", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pw >=", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwLessThan(String value) {
            addCriterion("stu_pw <", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwLessThanOrEqualTo(String value) {
            addCriterion("stu_pw <=", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwLike(String value) {
            addCriterion("stu_pw like", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwNotLike(String value) {
            addCriterion("stu_pw not like", value, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwIn(List<String> values) {
            addCriterion("stu_pw in", values, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwNotIn(List<String> values) {
            addCriterion("stu_pw not in", values, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwBetween(String value1, String value2) {
            addCriterion("stu_pw between", value1, value2, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuPwNotBetween(String value1, String value2) {
            addCriterion("stu_pw not between", value1, value2, "stuPw");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNull() {
            addCriterion("stu_email is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("stu_email is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("stu_email =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("stu_email <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("stu_email >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_email >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("stu_email <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("stu_email <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("stu_email like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("stu_email not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("stu_email in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("stu_email not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("stu_email between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("stu_email not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("stu_phone is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("stu_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("stu_phone =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("stu_phone <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("stu_phone >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("stu_phone >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("stu_phone <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("stu_phone <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("stu_phone like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("stu_phone not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("stu_phone in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("stu_phone not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("stu_phone between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("stu_phone not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNull() {
            addCriterion("stu_gender is null");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNotNull() {
            addCriterion("stu_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStuGenderEqualTo(String value) {
            addCriterion("stu_gender =", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotEqualTo(String value) {
            addCriterion("stu_gender <>", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThan(String value) {
            addCriterion("stu_gender >", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThanOrEqualTo(String value) {
            addCriterion("stu_gender >=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThan(String value) {
            addCriterion("stu_gender <", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThanOrEqualTo(String value) {
            addCriterion("stu_gender <=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLike(String value) {
            addCriterion("stu_gender like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotLike(String value) {
            addCriterion("stu_gender not like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderIn(List<String> values) {
            addCriterion("stu_gender in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotIn(List<String> values) {
            addCriterion("stu_gender not in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderBetween(String value1, String value2) {
            addCriterion("stu_gender between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotBetween(String value1, String value2) {
            addCriterion("stu_gender not between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuIconIsNull() {
            addCriterion("stu_icon is null");
            return (Criteria) this;
        }

        public Criteria andStuIconIsNotNull() {
            addCriterion("stu_icon is not null");
            return (Criteria) this;
        }

        public Criteria andStuIconEqualTo(String value) {
            addCriterion("stu_icon =", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconNotEqualTo(String value) {
            addCriterion("stu_icon <>", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconGreaterThan(String value) {
            addCriterion("stu_icon >", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconGreaterThanOrEqualTo(String value) {
            addCriterion("stu_icon >=", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconLessThan(String value) {
            addCriterion("stu_icon <", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconLessThanOrEqualTo(String value) {
            addCriterion("stu_icon <=", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconLike(String value) {
            addCriterion("stu_icon like", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconNotLike(String value) {
            addCriterion("stu_icon not like", value, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconIn(List<String> values) {
            addCriterion("stu_icon in", values, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconNotIn(List<String> values) {
            addCriterion("stu_icon not in", values, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconBetween(String value1, String value2) {
            addCriterion("stu_icon between", value1, value2, "stuIcon");
            return (Criteria) this;
        }

        public Criteria andStuIconNotBetween(String value1, String value2) {
            addCriterion("stu_icon not between", value1, value2, "stuIcon");
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