package com.eoms.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LOGINNAME =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LOGINNAME <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LOGINNAME >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINNAME >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LOGINNAME <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LOGINNAME <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LOGINNAME like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LOGINNAME not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LOGINNAME in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LOGINNAME not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LOGINNAME between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LOGINNAME not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPswIsNull() {
            addCriterion("PSW is null");
            return (Criteria) this;
        }

        public Criteria andPswIsNotNull() {
            addCriterion("PSW is not null");
            return (Criteria) this;
        }

        public Criteria andPswEqualTo(String value) {
            addCriterion("PSW =", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswNotEqualTo(String value) {
            addCriterion("PSW <>", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswGreaterThan(String value) {
            addCriterion("PSW >", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswGreaterThanOrEqualTo(String value) {
            addCriterion("PSW >=", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswLessThan(String value) {
            addCriterion("PSW <", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswLessThanOrEqualTo(String value) {
            addCriterion("PSW <=", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswLike(String value) {
            addCriterion("PSW like", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswNotLike(String value) {
            addCriterion("PSW not like", value, "psw");
            return (Criteria) this;
        }

        public Criteria andPswIn(List<String> values) {
            addCriterion("PSW in", values, "psw");
            return (Criteria) this;
        }

        public Criteria andPswNotIn(List<String> values) {
            addCriterion("PSW not in", values, "psw");
            return (Criteria) this;
        }

        public Criteria andPswBetween(String value1, String value2) {
            addCriterion("PSW between", value1, value2, "psw");
            return (Criteria) this;
        }

        public Criteria andPswNotBetween(String value1, String value2) {
            addCriterion("PSW not between", value1, value2, "psw");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNull() {
            addCriterion("IDENTITY_NUM is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIsNotNull() {
            addCriterion("IDENTITY_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumEqualTo(String value) {
            addCriterion("IDENTITY_NUM =", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotEqualTo(String value) {
            addCriterion("IDENTITY_NUM <>", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThan(String value) {
            addCriterion("IDENTITY_NUM >", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_NUM >=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThan(String value) {
            addCriterion("IDENTITY_NUM <", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_NUM <=", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumLike(String value) {
            addCriterion("IDENTITY_NUM like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotLike(String value) {
            addCriterion("IDENTITY_NUM not like", value, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumIn(List<String> values) {
            addCriterion("IDENTITY_NUM in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotIn(List<String> values) {
            addCriterion("IDENTITY_NUM not in", values, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumBetween(String value1, String value2) {
            addCriterion("IDENTITY_NUM between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andIdentityNumNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_NUM not between", value1, value2, "identityNum");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("ENTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("ENTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(String value) {
            addCriterion("ENTER_DATE =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(String value) {
            addCriterion("ENTER_DATE <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(String value) {
            addCriterion("ENTER_DATE >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(String value) {
            addCriterion("ENTER_DATE >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(String value) {
            addCriterion("ENTER_DATE <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(String value) {
            addCriterion("ENTER_DATE <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLike(String value) {
            addCriterion("ENTER_DATE like", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotLike(String value) {
            addCriterion("ENTER_DATE not like", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<String> values) {
            addCriterion("ENTER_DATE in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<String> values) {
            addCriterion("ENTER_DATE not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(String value1, String value2) {
            addCriterion("ENTER_DATE between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(String value1, String value2) {
            addCriterion("ENTER_DATE not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusIsNull() {
            addCriterion("EMPLOYE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusIsNotNull() {
            addCriterion("EMPLOYE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusEqualTo(String value) {
            addCriterion("EMPLOYE_STATUS =", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusNotEqualTo(String value) {
            addCriterion("EMPLOYE_STATUS <>", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusGreaterThan(String value) {
            addCriterion("EMPLOYE_STATUS >", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYE_STATUS >=", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusLessThan(String value) {
            addCriterion("EMPLOYE_STATUS <", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYE_STATUS <=", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusLike(String value) {
            addCriterion("EMPLOYE_STATUS like", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusNotLike(String value) {
            addCriterion("EMPLOYE_STATUS not like", value, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusIn(List<String> values) {
            addCriterion("EMPLOYE_STATUS in", values, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusNotIn(List<String> values) {
            addCriterion("EMPLOYE_STATUS not in", values, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusBetween(String value1, String value2) {
            addCriterion("EMPLOYE_STATUS between", value1, value2, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andEmployeStatusNotBetween(String value1, String value2) {
            addCriterion("EMPLOYE_STATUS not between", value1, value2, "employeStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNull() {
            addCriterion("LEAVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNotNull() {
            addCriterion("LEAVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateEqualTo(String value) {
            addCriterion("LEAVE_DATE =", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotEqualTo(String value) {
            addCriterion("LEAVE_DATE <>", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThan(String value) {
            addCriterion("LEAVE_DATE >", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_DATE >=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThan(String value) {
            addCriterion("LEAVE_DATE <", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_DATE <=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLike(String value) {
            addCriterion("LEAVE_DATE like", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotLike(String value) {
            addCriterion("LEAVE_DATE not like", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIn(List<String> values) {
            addCriterion("LEAVE_DATE in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotIn(List<String> values) {
            addCriterion("LEAVE_DATE not in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateBetween(String value1, String value2) {
            addCriterion("LEAVE_DATE between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotBetween(String value1, String value2) {
            addCriterion("LEAVE_DATE not between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoIsNull() {
            addCriterion("USER_HR_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserHrNoIsNotNull() {
            addCriterion("USER_HR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserHrNoEqualTo(String value) {
            addCriterion("USER_HR_NO =", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoNotEqualTo(String value) {
            addCriterion("USER_HR_NO <>", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoGreaterThan(String value) {
            addCriterion("USER_HR_NO >", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_HR_NO >=", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoLessThan(String value) {
            addCriterion("USER_HR_NO <", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoLessThanOrEqualTo(String value) {
            addCriterion("USER_HR_NO <=", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoLike(String value) {
            addCriterion("USER_HR_NO like", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoNotLike(String value) {
            addCriterion("USER_HR_NO not like", value, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoIn(List<String> values) {
            addCriterion("USER_HR_NO in", values, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoNotIn(List<String> values) {
            addCriterion("USER_HR_NO not in", values, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoBetween(String value1, String value2) {
            addCriterion("USER_HR_NO between", value1, value2, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserHrNoNotBetween(String value1, String value2) {
            addCriterion("USER_HR_NO not between", value1, value2, "userHrNo");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNull() {
            addCriterion("USER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNotNull() {
            addCriterion("USER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderEqualTo(String value) {
            addCriterion("USER_ORDER =", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotEqualTo(String value) {
            addCriterion("USER_ORDER <>", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThan(String value) {
            addCriterion("USER_ORDER >", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ORDER >=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThan(String value) {
            addCriterion("USER_ORDER <", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThanOrEqualTo(String value) {
            addCriterion("USER_ORDER <=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLike(String value) {
            addCriterion("USER_ORDER like", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotLike(String value) {
            addCriterion("USER_ORDER not like", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderIn(List<String> values) {
            addCriterion("USER_ORDER in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotIn(List<String> values) {
            addCriterion("USER_ORDER not in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderBetween(String value1, String value2) {
            addCriterion("USER_ORDER between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotBetween(String value1, String value2) {
            addCriterion("USER_ORDER not between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("LOCKED =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("LOCKED <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("LOCKED >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKED >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("LOCKED <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("LOCKED <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("LOCKED like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("LOCKED not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("LOCKED in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("LOCKED not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("LOCKED between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("LOCKED not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("DELETED like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("DELETED not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNull() {
            addCriterion("PWD_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIsNotNull() {
            addCriterion("PWD_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateEqualTo(String value) {
            addCriterion("PWD_UPDATE_DATE =", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotEqualTo(String value) {
            addCriterion("PWD_UPDATE_DATE <>", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThan(String value) {
            addCriterion("PWD_UPDATE_DATE >", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("PWD_UPDATE_DATE >=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThan(String value) {
            addCriterion("PWD_UPDATE_DATE <", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("PWD_UPDATE_DATE <=", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateLike(String value) {
            addCriterion("PWD_UPDATE_DATE like", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotLike(String value) {
            addCriterion("PWD_UPDATE_DATE not like", value, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateIn(List<String> values) {
            addCriterion("PWD_UPDATE_DATE in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotIn(List<String> values) {
            addCriterion("PWD_UPDATE_DATE not in", values, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateBetween(String value1, String value2) {
            addCriterion("PWD_UPDATE_DATE between", value1, value2, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPwdUpdateDateNotBetween(String value1, String value2) {
            addCriterion("PWD_UPDATE_DATE not between", value1, value2, "pwdUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("LAST_LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("LAST_LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(String value) {
            addCriterion("LAST_LOGIN_DATE =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_DATE <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(String value) {
            addCriterion("LAST_LOGIN_DATE >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_DATE >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(String value) {
            addCriterion("LAST_LOGIN_DATE <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_DATE <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLike(String value) {
            addCriterion("LAST_LOGIN_DATE like", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotLike(String value) {
            addCriterion("LAST_LOGIN_DATE not like", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<String> values) {
            addCriterion("LAST_LOGIN_DATE in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_DATE not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_DATE between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_DATE not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andCentreIdIsNull() {
            addCriterion("CENTRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCentreIdIsNotNull() {
            addCriterion("CENTRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCentreIdEqualTo(String value) {
            addCriterion("CENTRE_ID =", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdNotEqualTo(String value) {
            addCriterion("CENTRE_ID <>", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdGreaterThan(String value) {
            addCriterion("CENTRE_ID >", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdGreaterThanOrEqualTo(String value) {
            addCriterion("CENTRE_ID >=", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdLessThan(String value) {
            addCriterion("CENTRE_ID <", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdLessThanOrEqualTo(String value) {
            addCriterion("CENTRE_ID <=", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdLike(String value) {
            addCriterion("CENTRE_ID like", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdNotLike(String value) {
            addCriterion("CENTRE_ID not like", value, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdIn(List<String> values) {
            addCriterion("CENTRE_ID in", values, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdNotIn(List<String> values) {
            addCriterion("CENTRE_ID not in", values, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdBetween(String value1, String value2) {
            addCriterion("CENTRE_ID between", value1, value2, "centreId");
            return (Criteria) this;
        }

        public Criteria andCentreIdNotBetween(String value1, String value2) {
            addCriterion("CENTRE_ID not between", value1, value2, "centreId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("POST_ID like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("POST_ID not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
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