package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogsTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogsTableExample() {
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

        public Criteria andBlogsIdIsNull() {
            addCriterion("blogs_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIsNotNull() {
            addCriterion("blogs_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdEqualTo(Integer value) {
            addCriterion("blogs_id =", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotEqualTo(Integer value) {
            addCriterion("blogs_id <>", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThan(Integer value) {
            addCriterion("blogs_id >", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_id >=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThan(Integer value) {
            addCriterion("blogs_id <", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_id <=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIn(List<Integer> values) {
            addCriterion("blogs_id in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotIn(List<Integer> values) {
            addCriterion("blogs_id not in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id not between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIsNull() {
            addCriterion("blogs_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIsNotNull() {
            addCriterion("blogs_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleEqualTo(String value) {
            addCriterion("blogs_title =", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotEqualTo(String value) {
            addCriterion("blogs_title <>", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleGreaterThan(String value) {
            addCriterion("blogs_title >", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_title >=", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLessThan(String value) {
            addCriterion("blogs_title <", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLessThanOrEqualTo(String value) {
            addCriterion("blogs_title <=", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLike(String value) {
            addCriterion("blogs_title like", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotLike(String value) {
            addCriterion("blogs_title not like", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIn(List<String> values) {
            addCriterion("blogs_title in", values, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotIn(List<String> values) {
            addCriterion("blogs_title not in", values, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleBetween(String value1, String value2) {
            addCriterion("blogs_title between", value1, value2, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotBetween(String value1, String value2) {
            addCriterion("blogs_title not between", value1, value2, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeIsNull() {
            addCriterion("blogs_endtime is null");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeIsNotNull() {
            addCriterion("blogs_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeEqualTo(Date value) {
            addCriterion("blogs_endtime =", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeNotEqualTo(Date value) {
            addCriterion("blogs_endtime <>", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeGreaterThan(Date value) {
            addCriterion("blogs_endtime >", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blogs_endtime >=", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeLessThan(Date value) {
            addCriterion("blogs_endtime <", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("blogs_endtime <=", value, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeIn(List<Date> values) {
            addCriterion("blogs_endtime in", values, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeNotIn(List<Date> values) {
            addCriterion("blogs_endtime not in", values, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeBetween(Date value1, Date value2) {
            addCriterion("blogs_endtime between", value1, value2, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("blogs_endtime not between", value1, value2, "blogsEndtime");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridIsNull() {
            addCriterion("blogs_userid is null");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridIsNotNull() {
            addCriterion("blogs_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridEqualTo(Integer value) {
            addCriterion("blogs_userid =", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridNotEqualTo(Integer value) {
            addCriterion("blogs_userid <>", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridGreaterThan(Integer value) {
            addCriterion("blogs_userid >", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_userid >=", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridLessThan(Integer value) {
            addCriterion("blogs_userid <", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_userid <=", value, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridIn(List<Integer> values) {
            addCriterion("blogs_userid in", values, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridNotIn(List<Integer> values) {
            addCriterion("blogs_userid not in", values, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridBetween(Integer value1, Integer value2) {
            addCriterion("blogs_userid between", value1, value2, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_userid not between", value1, value2, "blogsUserid");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeIsNull() {
            addCriterion("blogs_creattime is null");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeIsNotNull() {
            addCriterion("blogs_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeEqualTo(Date value) {
            addCriterion("blogs_creattime =", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeNotEqualTo(Date value) {
            addCriterion("blogs_creattime <>", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeGreaterThan(Date value) {
            addCriterion("blogs_creattime >", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blogs_creattime >=", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeLessThan(Date value) {
            addCriterion("blogs_creattime <", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("blogs_creattime <=", value, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeIn(List<Date> values) {
            addCriterion("blogs_creattime in", values, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeNotIn(List<Date> values) {
            addCriterion("blogs_creattime not in", values, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeBetween(Date value1, Date value2) {
            addCriterion("blogs_creattime between", value1, value2, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("blogs_creattime not between", value1, value2, "blogsCreattime");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIsNull() {
            addCriterion("blogs_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIsNotNull() {
            addCriterion("blogs_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeEqualTo(String value) {
            addCriterion("blogs_type =", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotEqualTo(String value) {
            addCriterion("blogs_type <>", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeGreaterThan(String value) {
            addCriterion("blogs_type >", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_type >=", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLessThan(String value) {
            addCriterion("blogs_type <", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLessThanOrEqualTo(String value) {
            addCriterion("blogs_type <=", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLike(String value) {
            addCriterion("blogs_type like", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotLike(String value) {
            addCriterion("blogs_type not like", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIn(List<String> values) {
            addCriterion("blogs_type in", values, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotIn(List<String> values) {
            addCriterion("blogs_type not in", values, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeBetween(String value1, String value2) {
            addCriterion("blogs_type between", value1, value2, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotBetween(String value1, String value2) {
            addCriterion("blogs_type not between", value1, value2, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeIsNull() {
            addCriterion("blogs_like is null");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeIsNotNull() {
            addCriterion("blogs_like is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeEqualTo(Integer value) {
            addCriterion("blogs_like =", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeNotEqualTo(Integer value) {
            addCriterion("blogs_like <>", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeGreaterThan(Integer value) {
            addCriterion("blogs_like >", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_like >=", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeLessThan(Integer value) {
            addCriterion("blogs_like <", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_like <=", value, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeIn(List<Integer> values) {
            addCriterion("blogs_like in", values, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeNotIn(List<Integer> values) {
            addCriterion("blogs_like not in", values, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeBetween(Integer value1, Integer value2) {
            addCriterion("blogs_like between", value1, value2, "blogsLike");
            return (Criteria) this;
        }

        public Criteria andBlogsLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_like not between", value1, value2, "blogsLike");
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