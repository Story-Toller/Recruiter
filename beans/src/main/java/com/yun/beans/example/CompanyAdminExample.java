package com.yun.beans.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyAdminExample {

    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;


    public CompanyAdminExample() {
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

        public Criteria andCompanyAdminIdIsNull() {
            addCriterion("company_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdIsNotNull() {
            addCriterion("company_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdEqualTo(Integer value) {
            addCriterion("company_admin_id =", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdNotEqualTo(Integer value) {
            addCriterion("company_admin_id <>", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdGreaterThan(Integer value) {
            addCriterion("company_admin_id >", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_admin_id >=", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdLessThan(Integer value) {
            addCriterion("company_admin_id <", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_admin_id <=", value, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdIn(List<Integer> values) {
            addCriterion("company_admin_id in", values, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdNotIn(List<Integer> values) {
            addCriterion("company_admin_id not in", values, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("company_admin_id between", value1, value2, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_admin_id not between", value1, value2, "companyAdminId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameIsNull() {
            addCriterion("company_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameIsNotNull() {
            addCriterion("company_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameEqualTo(String value) {
            addCriterion("company_admin_name =", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameNotEqualTo(String value) {
            addCriterion("company_admin_name <>", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameGreaterThan(String value) {
            addCriterion("company_admin_name >", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_admin_name >=", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameLessThan(String value) {
            addCriterion("company_admin_name <", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameLessThanOrEqualTo(String value) {
            addCriterion("company_admin_name <=", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameLike(String value) {
            addCriterion("company_admin_name like", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameNotLike(String value) {
            addCriterion("company_admin_name not like", value, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameIn(List<String> values) {
            addCriterion("company_admin_name in", values, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameNotIn(List<String> values) {
            addCriterion("company_admin_name not in", values, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameBetween(String value1, String value2) {
            addCriterion("company_admin_name between", value1, value2, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminNameNotBetween(String value1, String value2) {
            addCriterion("company_admin_name not between", value1, value2, "companyAdminName");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoIsNull() {
            addCriterion("company_admin_telno is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoIsNotNull() {
            addCriterion("company_admin_telno is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoEqualTo(Long value) {
            addCriterion("company_admin_telno =", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoNotEqualTo(Long value) {
            addCriterion("company_admin_telno <>", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoGreaterThan(Long value) {
            addCriterion("company_admin_telno >", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoGreaterThanOrEqualTo(Long value) {
            addCriterion("company_admin_telno >=", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoLessThan(Long value) {
            addCriterion("company_admin_telno <", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoLessThanOrEqualTo(Long value) {
            addCriterion("company_admin_telno <=", value, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoIn(List<Long> values) {
            addCriterion("company_admin_telno in", values, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoNotIn(List<Long> values) {
            addCriterion("company_admin_telno not in", values, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoBetween(Long value1, Long value2) {
            addCriterion("company_admin_telno between", value1, value2, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminTelnoNotBetween(Long value1, Long value2) {
            addCriterion("company_admin_telno not between", value1, value2, "companyAdminTelno");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailIsNull() {
            addCriterion("company_admin_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailIsNotNull() {
            addCriterion("company_admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailEqualTo(String value) {
            addCriterion("company_admin_email =", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailNotEqualTo(String value) {
            addCriterion("company_admin_email <>", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailGreaterThan(String value) {
            addCriterion("company_admin_email >", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_admin_email >=", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailLessThan(String value) {
            addCriterion("company_admin_email <", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("company_admin_email <=", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailLike(String value) {
            addCriterion("company_admin_email like", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailNotLike(String value) {
            addCriterion("company_admin_email not like", value, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailIn(List<String> values) {
            addCriterion("company_admin_email in", values, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailNotIn(List<String> values) {
            addCriterion("company_admin_email not in", values, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailBetween(String value1, String value2) {
            addCriterion("company_admin_email between", value1, value2, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminEmailNotBetween(String value1, String value2) {
            addCriterion("company_admin_email not between", value1, value2, "companyAdminEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordIsNull() {
            addCriterion("company_admin_password is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordIsNotNull() {
            addCriterion("company_admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordEqualTo(String value) {
            addCriterion("company_admin_password =", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordNotEqualTo(String value) {
            addCriterion("company_admin_password <>", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordGreaterThan(String value) {
            addCriterion("company_admin_password >", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("company_admin_password >=", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordLessThan(String value) {
            addCriterion("company_admin_password <", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("company_admin_password <=", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordLike(String value) {
            addCriterion("company_admin_password like", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordNotLike(String value) {
            addCriterion("company_admin_password not like", value, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordIn(List<String> values) {
            addCriterion("company_admin_password in", values, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordNotIn(List<String> values) {
            addCriterion("company_admin_password not in", values, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordBetween(String value1, String value2) {
            addCriterion("company_admin_password between", value1, value2, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("company_admin_password not between", value1, value2, "companyAdminPassword");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeIsNull() {
            addCriterion("company_admin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeIsNotNull() {
            addCriterion("company_admin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeEqualTo(Date value) {
            addCriterion("company_admin_create_time =", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeNotEqualTo(Date value) {
            addCriterion("company_admin_create_time <>", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeGreaterThan(Date value) {
            addCriterion("company_admin_create_time >", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_admin_create_time >=", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeLessThan(Date value) {
            addCriterion("company_admin_create_time <", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_admin_create_time <=", value, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeIn(List<Date> values) {
            addCriterion("company_admin_create_time in", values, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeNotIn(List<Date> values) {
            addCriterion("company_admin_create_time not in", values, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeBetween(Date value1, Date value2) {
            addCriterion("company_admin_create_time between", value1, value2, "companyAdminCreateTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAdminCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_admin_create_time not between", value1, value2, "companyAdminCreateTime");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company_admin
     *
     * @mbggenerated do_not_delete_during_merge Wed Feb 26 09:56:38 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company_admin
     *
     * @mbggenerated Wed Feb 26 09:56:38 CST 2020
     */
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