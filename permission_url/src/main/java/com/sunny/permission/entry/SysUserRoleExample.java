package com.sunny.permission.entry;

import java.util.ArrayList;
import java.util.List;

public class SysUserRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public SysUserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSys_user_idIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSys_user_idEqualTo(String value) {
            addCriterion("sys_user_id =", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idNotEqualTo(String value) {
            addCriterion("sys_user_id <>", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idGreaterThan(String value) {
            addCriterion("sys_user_id >", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_id >=", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idLessThan(String value) {
            addCriterion("sys_user_id <", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idLessThanOrEqualTo(String value) {
            addCriterion("sys_user_id <=", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idLike(String value) {
            addCriterion("sys_user_id like", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idNotLike(String value) {
            addCriterion("sys_user_id not like", value, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idIn(List<String> values) {
            addCriterion("sys_user_id in", values, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idNotIn(List<String> values) {
            addCriterion("sys_user_id not in", values, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idBetween(String value1, String value2) {
            addCriterion("sys_user_id between", value1, value2, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_user_idNotBetween(String value1, String value2) {
            addCriterion("sys_user_id not between", value1, value2, "sys_user_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idIsNull() {
            addCriterion("sys_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSys_role_idIsNotNull() {
            addCriterion("sys_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSys_role_idEqualTo(String value) {
            addCriterion("sys_role_id =", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idNotEqualTo(String value) {
            addCriterion("sys_role_id <>", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idGreaterThan(String value) {
            addCriterion("sys_role_id >", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idGreaterThanOrEqualTo(String value) {
            addCriterion("sys_role_id >=", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idLessThan(String value) {
            addCriterion("sys_role_id <", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idLessThanOrEqualTo(String value) {
            addCriterion("sys_role_id <=", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idLike(String value) {
            addCriterion("sys_role_id like", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idNotLike(String value) {
            addCriterion("sys_role_id not like", value, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idIn(List<String> values) {
            addCriterion("sys_role_id in", values, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idNotIn(List<String> values) {
            addCriterion("sys_role_id not in", values, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idBetween(String value1, String value2) {
            addCriterion("sys_role_id between", value1, value2, "sys_role_id");
            return (Criteria) this;
        }

        public Criteria andSys_role_idNotBetween(String value1, String value2) {
            addCriterion("sys_role_id not between", value1, value2, "sys_role_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user_role
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 07 14:11:01 GMT+08:00 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user_role
     *
     * @mbg.generated Fri Dec 07 14:11:01 GMT+08:00 2018
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