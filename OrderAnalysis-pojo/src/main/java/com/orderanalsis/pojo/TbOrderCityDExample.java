package com.orderanalsis.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbOrderCityDExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderCityDExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDIsNull() {
            addCriterion("cnt_ord_succ_d is null");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDIsNotNull() {
            addCriterion("cnt_ord_succ_d is not null");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDEqualTo(Integer value) {
            addCriterion("cnt_ord_succ_d =", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDNotEqualTo(Integer value) {
            addCriterion("cnt_ord_succ_d <>", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDGreaterThan(Integer value) {
            addCriterion("cnt_ord_succ_d >", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_succ_d >=", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDLessThan(Integer value) {
            addCriterion("cnt_ord_succ_d <", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_succ_d <=", value, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDIn(List<Integer> values) {
            addCriterion("cnt_ord_succ_d in", values, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDNotIn(List<Integer> values) {
            addCriterion("cnt_ord_succ_d not in", values, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_succ_d between", value1, value2, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdSuccDNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_succ_d not between", value1, value2, "cntOrdSuccD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDIsNull() {
            addCriterion("cnt_ord_cacel_d is null");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDIsNotNull() {
            addCriterion("cnt_ord_cacel_d is not null");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDEqualTo(Integer value) {
            addCriterion("cnt_ord_cacel_d =", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDNotEqualTo(Integer value) {
            addCriterion("cnt_ord_cacel_d <>", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDGreaterThan(Integer value) {
            addCriterion("cnt_ord_cacel_d >", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_cacel_d >=", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDLessThan(Integer value) {
            addCriterion("cnt_ord_cacel_d <", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_cacel_d <=", value, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDIn(List<Integer> values) {
            addCriterion("cnt_ord_cacel_d in", values, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDNotIn(List<Integer> values) {
            addCriterion("cnt_ord_cacel_d not in", values, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_cacel_d between", value1, value2, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdCacelDNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_cacel_d not between", value1, value2, "cntOrdCacelD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDIsNull() {
            addCriterion("cnt_ord_d is null");
            return (Criteria) this;
        }

        public Criteria andCntOrdDIsNotNull() {
            addCriterion("cnt_ord_d is not null");
            return (Criteria) this;
        }

        public Criteria andCntOrdDEqualTo(Integer value) {
            addCriterion("cnt_ord_d =", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDNotEqualTo(Integer value) {
            addCriterion("cnt_ord_d <>", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDGreaterThan(Integer value) {
            addCriterion("cnt_ord_d >", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_d >=", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDLessThan(Integer value) {
            addCriterion("cnt_ord_d <", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_d <=", value, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDIn(List<Integer> values) {
            addCriterion("cnt_ord_d in", values, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDNotIn(List<Integer> values) {
            addCriterion("cnt_ord_d not in", values, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_d between", value1, value2, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdDNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_d not between", value1, value2, "cntOrdD");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserIsNull() {
            addCriterion("cnt_ord_user is null");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserIsNotNull() {
            addCriterion("cnt_ord_user is not null");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserEqualTo(Integer value) {
            addCriterion("cnt_ord_user =", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserNotEqualTo(Integer value) {
            addCriterion("cnt_ord_user <>", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserGreaterThan(Integer value) {
            addCriterion("cnt_ord_user >", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_user >=", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserLessThan(Integer value) {
            addCriterion("cnt_ord_user <", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserLessThanOrEqualTo(Integer value) {
            addCriterion("cnt_ord_user <=", value, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserIn(List<Integer> values) {
            addCriterion("cnt_ord_user in", values, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserNotIn(List<Integer> values) {
            addCriterion("cnt_ord_user not in", values, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_user between", value1, value2, "cntOrdUser");
            return (Criteria) this;
        }

        public Criteria andCntOrdUserNotBetween(Integer value1, Integer value2) {
            addCriterion("cnt_ord_user not between", value1, value2, "cntOrdUser");
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