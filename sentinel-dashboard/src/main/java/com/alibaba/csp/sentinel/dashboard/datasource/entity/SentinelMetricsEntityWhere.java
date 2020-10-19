package com.alibaba.csp.sentinel.dashboard.datasource.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SentinelMetricsEntityWhere {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitOffset = -1;

    protected int limitSize = 1;

     /** 表： metrics */
    public SentinelMetricsEntityWhere() {
        oredCriteria = new ArrayList<Criteria>();
    }

     /** 表： metrics */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

     /** 表： metrics */
    public String getOrderByClause() {
        return orderByClause;
    }

     /** 表： metrics */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

     /** 表： metrics */
    public boolean isDistinct() {
        return distinct;
    }

     /** 表： metrics */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

     /** 表： metrics */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

     /** 表： metrics */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

     /** 表： metrics */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

     /** 表： metrics */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

     /** 表： metrics */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

     /** 表： metrics */
    public void setLimitOffset(int limitOffset) {
        this.limitOffset = limitOffset;
    }

     /** 表： metrics */
    public void setLimitSize(int limitSize) {
        this.limitSize = limitSize;
    }

     /** 表： metrics */
    public int getLimitOffset() {
        return limitOffset;
    }

     /** 表： metrics */
    public int getLimitSize() {
        return limitSize;
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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andpassQpsIsNull() {
            addCriterion("pass_qps is null");
            return (Criteria) this;
        }

        public Criteria andpassQpsIsNotNull() {
            addCriterion("pass_qps is not null");
            return (Criteria) this;
        }

        public Criteria andpassQpsEqualTo(Integer value) {
            addCriterion("pass_qps =", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsNotEqualTo(Integer value) {
            addCriterion("pass_qps <>", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsGreaterThan(Integer value) {
            addCriterion("pass_qps >", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_qps >=", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsLessThan(Integer value) {
            addCriterion("pass_qps <", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsLessThanOrEqualTo(Integer value) {
            addCriterion("pass_qps <=", value, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsIn(List<Integer> values) {
            addCriterion("pass_qps in", values, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsNotIn(List<Integer> values) {
            addCriterion("pass_qps not in", values, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsBetween(Integer value1, Integer value2) {
            addCriterion("pass_qps between", value1, value2, "passQps");
            return (Criteria) this;
        }

        public Criteria andpassQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_qps not between", value1, value2, "passQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIsNull() {
            addCriterion("success_qps is null");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIsNotNull() {
            addCriterion("success_qps is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsEqualTo(Integer value) {
            addCriterion("success_qps =", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotEqualTo(Integer value) {
            addCriterion("success_qps <>", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsGreaterThan(Integer value) {
            addCriterion("success_qps >", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("success_qps >=", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsLessThan(Integer value) {
            addCriterion("success_qps <", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsLessThanOrEqualTo(Integer value) {
            addCriterion("success_qps <=", value, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsIn(List<Integer> values) {
            addCriterion("success_qps in", values, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotIn(List<Integer> values) {
            addCriterion("success_qps not in", values, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsBetween(Integer value1, Integer value2) {
            addCriterion("success_qps between", value1, value2, "successQps");
            return (Criteria) this;
        }

        public Criteria andSuccessQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("success_qps not between", value1, value2, "successQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIsNull() {
            addCriterion("block_qps is null");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIsNotNull() {
            addCriterion("block_qps is not null");
            return (Criteria) this;
        }

        public Criteria andBlockQpsEqualTo(Integer value) {
            addCriterion("block_qps =", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotEqualTo(Integer value) {
            addCriterion("block_qps <>", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsGreaterThan(Integer value) {
            addCriterion("block_qps >", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("block_qps >=", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsLessThan(Integer value) {
            addCriterion("block_qps <", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsLessThanOrEqualTo(Integer value) {
            addCriterion("block_qps <=", value, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsIn(List<Integer> values) {
            addCriterion("block_qps in", values, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotIn(List<Integer> values) {
            addCriterion("block_qps not in", values, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsBetween(Integer value1, Integer value2) {
            addCriterion("block_qps between", value1, value2, "blockQps");
            return (Criteria) this;
        }

        public Criteria andBlockQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("block_qps not between", value1, value2, "blockQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIsNull() {
            addCriterion("exception_qps is null");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIsNotNull() {
            addCriterion("exception_qps is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsEqualTo(Integer value) {
            addCriterion("exception_qps =", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotEqualTo(Integer value) {
            addCriterion("exception_qps <>", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsGreaterThan(Integer value) {
            addCriterion("exception_qps >", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_qps >=", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsLessThan(Integer value) {
            addCriterion("exception_qps <", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsLessThanOrEqualTo(Integer value) {
            addCriterion("exception_qps <=", value, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsIn(List<Integer> values) {
            addCriterion("exception_qps in", values, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotIn(List<Integer> values) {
            addCriterion("exception_qps not in", values, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsBetween(Integer value1, Integer value2) {
            addCriterion("exception_qps between", value1, value2, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andExceptionQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_qps not between", value1, value2, "exceptionQps");
            return (Criteria) this;
        }

        public Criteria andRtIsNull() {
            addCriterion("rt is null");
            return (Criteria) this;
        }

        public Criteria andRtIsNotNull() {
            addCriterion("rt is not null");
            return (Criteria) this;
        }

        public Criteria andRtEqualTo(Double value) {
            addCriterion("rt =", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtNotEqualTo(Double value) {
            addCriterion("rt <>", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtGreaterThan(Double value) {
            addCriterion("rt >", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtGreaterThanOrEqualTo(Double value) {
            addCriterion("rt >=", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtLessThan(Double value) {
            addCriterion("rt <", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtLessThanOrEqualTo(Double value) {
            addCriterion("rt <=", value, "rt");
            return (Criteria) this;
        }

        public Criteria andRtIn(List<Double> values) {
            addCriterion("rt in", values, "rt");
            return (Criteria) this;
        }

        public Criteria andRtNotIn(List<Double> values) {
            addCriterion("rt not in", values, "rt");
            return (Criteria) this;
        }

        public Criteria andRtBetween(Double value1, Double value2) {
            addCriterion("rt between", value1, value2, "rt");
            return (Criteria) this;
        }

        public Criteria andRtNotBetween(Double value1, Double value2) {
            addCriterion("rt not between", value1, value2, "rt");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("resource_code is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("resource_code is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(Integer value) {
            addCriterion("resource_code =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(Integer value) {
            addCriterion("resource_code <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(Integer value) {
            addCriterion("resource_code >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_code >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(Integer value) {
            addCriterion("resource_code <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("resource_code <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<Integer> values) {
            addCriterion("resource_code in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<Integer> values) {
            addCriterion("resource_code not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(Integer value1, Integer value2) {
            addCriterion("resource_code between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_code not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }
    }

    /** 自动生成的类，请勿修改，对应表：  metrics */
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