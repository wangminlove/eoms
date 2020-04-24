package com.eoms.entity;

import java.util.ArrayList;
import java.util.List;

public class SysModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysModuleExample() {
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

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIsNull() {
            addCriterion("MODULE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIsNotNull() {
            addCriterion("MODULE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andModuleLevelEqualTo(String value) {
            addCriterion("MODULE_LEVEL =", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotEqualTo(String value) {
            addCriterion("MODULE_LEVEL <>", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelGreaterThan(String value) {
            addCriterion("MODULE_LEVEL >", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_LEVEL >=", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLessThan(String value) {
            addCriterion("MODULE_LEVEL <", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLessThanOrEqualTo(String value) {
            addCriterion("MODULE_LEVEL <=", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelLike(String value) {
            addCriterion("MODULE_LEVEL like", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotLike(String value) {
            addCriterion("MODULE_LEVEL not like", value, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelIn(List<String> values) {
            addCriterion("MODULE_LEVEL in", values, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotIn(List<String> values) {
            addCriterion("MODULE_LEVEL not in", values, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelBetween(String value1, String value2) {
            addCriterion("MODULE_LEVEL between", value1, value2, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleLevelNotBetween(String value1, String value2) {
            addCriterion("MODULE_LEVEL not between", value1, value2, "moduleLevel");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIsNull() {
            addCriterion("MODULE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIsNotNull() {
            addCriterion("MODULE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andModuleOrderEqualTo(String value) {
            addCriterion("MODULE_ORDER =", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotEqualTo(String value) {
            addCriterion("MODULE_ORDER <>", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThan(String value) {
            addCriterion("MODULE_ORDER >", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ORDER >=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThan(String value) {
            addCriterion("MODULE_ORDER <", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ORDER <=", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderLike(String value) {
            addCriterion("MODULE_ORDER like", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotLike(String value) {
            addCriterion("MODULE_ORDER not like", value, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderIn(List<String> values) {
            addCriterion("MODULE_ORDER in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotIn(List<String> values) {
            addCriterion("MODULE_ORDER not in", values, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderBetween(String value1, String value2) {
            addCriterion("MODULE_ORDER between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andModuleOrderNotBetween(String value1, String value2) {
            addCriterion("MODULE_ORDER not between", value1, value2, "moduleOrder");
            return (Criteria) this;
        }

        public Criteria andMetaIconIsNull() {
            addCriterion("META_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMetaIconIsNotNull() {
            addCriterion("META_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIconEqualTo(String value) {
            addCriterion("META_ICON =", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotEqualTo(String value) {
            addCriterion("META_ICON <>", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconGreaterThan(String value) {
            addCriterion("META_ICON >", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconGreaterThanOrEqualTo(String value) {
            addCriterion("META_ICON >=", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLessThan(String value) {
            addCriterion("META_ICON <", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLessThanOrEqualTo(String value) {
            addCriterion("META_ICON <=", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLike(String value) {
            addCriterion("META_ICON like", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotLike(String value) {
            addCriterion("META_ICON not like", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconIn(List<String> values) {
            addCriterion("META_ICON in", values, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotIn(List<String> values) {
            addCriterion("META_ICON not in", values, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconBetween(String value1, String value2) {
            addCriterion("META_ICON between", value1, value2, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotBetween(String value1, String value2) {
            addCriterion("META_ICON not between", value1, value2, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNull() {
            addCriterion("META_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNotNull() {
            addCriterion("META_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleEqualTo(String value) {
            addCriterion("META_TITLE =", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotEqualTo(String value) {
            addCriterion("META_TITLE <>", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThan(String value) {
            addCriterion("META_TITLE >", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("META_TITLE >=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThan(String value) {
            addCriterion("META_TITLE <", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThanOrEqualTo(String value) {
            addCriterion("META_TITLE <=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLike(String value) {
            addCriterion("META_TITLE like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotLike(String value) {
            addCriterion("META_TITLE not like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIn(List<String> values) {
            addCriterion("META_TITLE in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotIn(List<String> values) {
            addCriterion("META_TITLE not in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleBetween(String value1, String value2) {
            addCriterion("META_TITLE between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotBetween(String value1, String value2) {
            addCriterion("META_TITLE not between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNull() {
            addCriterion("REDIRECT is null");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNotNull() {
            addCriterion("REDIRECT is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectEqualTo(String value) {
            addCriterion("REDIRECT =", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotEqualTo(String value) {
            addCriterion("REDIRECT <>", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThan(String value) {
            addCriterion("REDIRECT >", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThanOrEqualTo(String value) {
            addCriterion("REDIRECT >=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThan(String value) {
            addCriterion("REDIRECT <", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThanOrEqualTo(String value) {
            addCriterion("REDIRECT <=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLike(String value) {
            addCriterion("REDIRECT like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotLike(String value) {
            addCriterion("REDIRECT not like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectIn(List<String> values) {
            addCriterion("REDIRECT in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotIn(List<String> values) {
            addCriterion("REDIRECT not in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectBetween(String value1, String value2) {
            addCriterion("REDIRECT between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotBetween(String value1, String value2) {
            addCriterion("REDIRECT not between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andMetaShowIsNull() {
            addCriterion("META_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andMetaShowIsNotNull() {
            addCriterion("META_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andMetaShowEqualTo(String value) {
            addCriterion("META_SHOW =", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotEqualTo(String value) {
            addCriterion("META_SHOW <>", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowGreaterThan(String value) {
            addCriterion("META_SHOW >", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowGreaterThanOrEqualTo(String value) {
            addCriterion("META_SHOW >=", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLessThan(String value) {
            addCriterion("META_SHOW <", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLessThanOrEqualTo(String value) {
            addCriterion("META_SHOW <=", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLike(String value) {
            addCriterion("META_SHOW like", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotLike(String value) {
            addCriterion("META_SHOW not like", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowIn(List<String> values) {
            addCriterion("META_SHOW in", values, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotIn(List<String> values) {
            addCriterion("META_SHOW not in", values, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowBetween(String value1, String value2) {
            addCriterion("META_SHOW between", value1, value2, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotBetween(String value1, String value2) {
            addCriterion("META_SHOW not between", value1, value2, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderIsNull() {
            addCriterion("META_HIDEHEADER is null");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderIsNotNull() {
            addCriterion("META_HIDEHEADER is not null");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderEqualTo(String value) {
            addCriterion("META_HIDEHEADER =", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderNotEqualTo(String value) {
            addCriterion("META_HIDEHEADER <>", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderGreaterThan(String value) {
            addCriterion("META_HIDEHEADER >", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderGreaterThanOrEqualTo(String value) {
            addCriterion("META_HIDEHEADER >=", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderLessThan(String value) {
            addCriterion("META_HIDEHEADER <", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderLessThanOrEqualTo(String value) {
            addCriterion("META_HIDEHEADER <=", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderLike(String value) {
            addCriterion("META_HIDEHEADER like", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderNotLike(String value) {
            addCriterion("META_HIDEHEADER not like", value, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderIn(List<String> values) {
            addCriterion("META_HIDEHEADER in", values, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderNotIn(List<String> values) {
            addCriterion("META_HIDEHEADER not in", values, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderBetween(String value1, String value2) {
            addCriterion("META_HIDEHEADER between", value1, value2, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHideheaderNotBetween(String value1, String value2) {
            addCriterion("META_HIDEHEADER not between", value1, value2, "metaHideheader");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenIsNull() {
            addCriterion("META_HIDECHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenIsNotNull() {
            addCriterion("META_HIDECHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenEqualTo(String value) {
            addCriterion("META_HIDECHILDREN =", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenNotEqualTo(String value) {
            addCriterion("META_HIDECHILDREN <>", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenGreaterThan(String value) {
            addCriterion("META_HIDECHILDREN >", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenGreaterThanOrEqualTo(String value) {
            addCriterion("META_HIDECHILDREN >=", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenLessThan(String value) {
            addCriterion("META_HIDECHILDREN <", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenLessThanOrEqualTo(String value) {
            addCriterion("META_HIDECHILDREN <=", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenLike(String value) {
            addCriterion("META_HIDECHILDREN like", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenNotLike(String value) {
            addCriterion("META_HIDECHILDREN not like", value, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenIn(List<String> values) {
            addCriterion("META_HIDECHILDREN in", values, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenNotIn(List<String> values) {
            addCriterion("META_HIDECHILDREN not in", values, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenBetween(String value1, String value2) {
            addCriterion("META_HIDECHILDREN between", value1, value2, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHidechildrenNotBetween(String value1, String value2) {
            addCriterion("META_HIDECHILDREN not between", value1, value2, "metaHidechildren");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentIsNull() {
            addCriterion("META_HIDDENHEADERCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentIsNotNull() {
            addCriterion("META_HIDDENHEADERCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentEqualTo(String value) {
            addCriterion("META_HIDDENHEADERCONTENT =", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentNotEqualTo(String value) {
            addCriterion("META_HIDDENHEADERCONTENT <>", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentGreaterThan(String value) {
            addCriterion("META_HIDDENHEADERCONTENT >", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentGreaterThanOrEqualTo(String value) {
            addCriterion("META_HIDDENHEADERCONTENT >=", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentLessThan(String value) {
            addCriterion("META_HIDDENHEADERCONTENT <", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentLessThanOrEqualTo(String value) {
            addCriterion("META_HIDDENHEADERCONTENT <=", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentLike(String value) {
            addCriterion("META_HIDDENHEADERCONTENT like", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentNotLike(String value) {
            addCriterion("META_HIDDENHEADERCONTENT not like", value, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentIn(List<String> values) {
            addCriterion("META_HIDDENHEADERCONTENT in", values, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentNotIn(List<String> values) {
            addCriterion("META_HIDDENHEADERCONTENT not in", values, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentBetween(String value1, String value2) {
            addCriterion("META_HIDDENHEADERCONTENT between", value1, value2, "metaHiddenheadercontent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenheadercontentNotBetween(String value1, String value2) {
            addCriterion("META_HIDDENHEADERCONTENT not between", value1, value2, "metaHiddenheadercontent");
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