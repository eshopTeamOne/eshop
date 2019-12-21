package com.onlineShop.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSpecExample() {
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

        public Criteria andSpecIdIsNull() {
            addCriterion("spec_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecIdIsNotNull() {
            addCriterion("spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecIdEqualTo(Integer value) {
            addCriterion("spec_id =", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotEqualTo(Integer value) {
            addCriterion("spec_id <>", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThan(Integer value) {
            addCriterion("spec_id >", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec_id >=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThan(Integer value) {
            addCriterion("spec_id <", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("spec_id <=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdIn(List<Integer> values) {
            addCriterion("spec_id in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotIn(List<Integer> values) {
            addCriterion("spec_id not in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("spec_id between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spec_id not between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSpecNoIsNull() {
            addCriterion("spec_no is null");
            return (Criteria) this;
        }

        public Criteria andSpecNoIsNotNull() {
            addCriterion("spec_no is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNoEqualTo(String value) {
            addCriterion("spec_no =", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotEqualTo(String value) {
            addCriterion("spec_no <>", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoGreaterThan(String value) {
            addCriterion("spec_no >", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoGreaterThanOrEqualTo(String value) {
            addCriterion("spec_no >=", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLessThan(String value) {
            addCriterion("spec_no <", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLessThanOrEqualTo(String value) {
            addCriterion("spec_no <=", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLike(String value) {
            addCriterion("spec_no like", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotLike(String value) {
            addCriterion("spec_no not like", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoIn(List<String> values) {
            addCriterion("spec_no in", values, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotIn(List<String> values) {
            addCriterion("spec_no not in", values, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoBetween(String value1, String value2) {
            addCriterion("spec_no between", value1, value2, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotBetween(String value1, String value2) {
            addCriterion("spec_no not between", value1, value2, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecCodeIsNull() {
            addCriterion("spec_code is null");
            return (Criteria) this;
        }

        public Criteria andSpecCodeIsNotNull() {
            addCriterion("spec_code is not null");
            return (Criteria) this;
        }

        public Criteria andSpecCodeEqualTo(String value) {
            addCriterion("spec_code =", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotEqualTo(String value) {
            addCriterion("spec_code <>", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeGreaterThan(String value) {
            addCriterion("spec_code >", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeGreaterThanOrEqualTo(String value) {
            addCriterion("spec_code >=", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLessThan(String value) {
            addCriterion("spec_code <", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLessThanOrEqualTo(String value) {
            addCriterion("spec_code <=", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLike(String value) {
            addCriterion("spec_code like", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotLike(String value) {
            addCriterion("spec_code not like", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeIn(List<String> values) {
            addCriterion("spec_code in", values, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotIn(List<String> values) {
            addCriterion("spec_code not in", values, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeBetween(String value1, String value2) {
            addCriterion("spec_code between", value1, value2, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotBetween(String value1, String value2) {
            addCriterion("spec_code not between", value1, value2, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(BigDecimal value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(BigDecimal value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<BigDecimal> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNull() {
            addCriterion("member_discount is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNotNull() {
            addCriterion("member_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountEqualTo(BigDecimal value) {
            addCriterion("member_discount =", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotEqualTo(BigDecimal value) {
            addCriterion("member_discount <>", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThan(BigDecimal value) {
            addCriterion("member_discount >", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_discount >=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThan(BigDecimal value) {
            addCriterion("member_discount <", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_discount <=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIn(List<BigDecimal> values) {
            addCriterion("member_discount in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotIn(List<BigDecimal> values) {
            addCriterion("member_discount not in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_discount between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_discount not between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andValidityDaysIsNull() {
            addCriterion("validity_days is null");
            return (Criteria) this;
        }

        public Criteria andValidityDaysIsNotNull() {
            addCriterion("validity_days is not null");
            return (Criteria) this;
        }

        public Criteria andValidityDaysEqualTo(Short value) {
            addCriterion("validity_days =", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysNotEqualTo(Short value) {
            addCriterion("validity_days <>", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysGreaterThan(Short value) {
            addCriterion("validity_days >", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("validity_days >=", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysLessThan(Short value) {
            addCriterion("validity_days <", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysLessThanOrEqualTo(Short value) {
            addCriterion("validity_days <=", value, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysIn(List<Short> values) {
            addCriterion("validity_days in", values, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysNotIn(List<Short> values) {
            addCriterion("validity_days not in", values, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysBetween(Short value1, Short value2) {
            addCriterion("validity_days between", value1, value2, "validityDays");
            return (Criteria) this;
        }

        public Criteria andValidityDaysNotBetween(Short value1, Short value2) {
            addCriterion("validity_days not between", value1, value2, "validityDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysIsNull() {
            addCriterion("sales_days is null");
            return (Criteria) this;
        }

        public Criteria andSalesDaysIsNotNull() {
            addCriterion("sales_days is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDaysEqualTo(Integer value) {
            addCriterion("sales_days =", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysNotEqualTo(Integer value) {
            addCriterion("sales_days <>", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysGreaterThan(Integer value) {
            addCriterion("sales_days >", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_days >=", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysLessThan(Integer value) {
            addCriterion("sales_days <", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysLessThanOrEqualTo(Integer value) {
            addCriterion("sales_days <=", value, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysIn(List<Integer> values) {
            addCriterion("sales_days in", values, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysNotIn(List<Integer> values) {
            addCriterion("sales_days not in", values, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysBetween(Integer value1, Integer value2) {
            addCriterion("sales_days between", value1, value2, "salesDays");
            return (Criteria) this;
        }

        public Criteria andSalesDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_days not between", value1, value2, "salesDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysIsNull() {
            addCriterion("receive_days is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysIsNotNull() {
            addCriterion("receive_days is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysEqualTo(Integer value) {
            addCriterion("receive_days =", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysNotEqualTo(Integer value) {
            addCriterion("receive_days <>", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysGreaterThan(Integer value) {
            addCriterion("receive_days >", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_days >=", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysLessThan(Integer value) {
            addCriterion("receive_days <", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysLessThanOrEqualTo(Integer value) {
            addCriterion("receive_days <=", value, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysIn(List<Integer> values) {
            addCriterion("receive_days in", values, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysNotIn(List<Integer> values) {
            addCriterion("receive_days not in", values, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysBetween(Integer value1, Integer value2) {
            addCriterion("receive_days between", value1, value2, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andReceiveDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_days not between", value1, value2, "receiveDays");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(BigDecimal value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(BigDecimal value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(BigDecimal value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(BigDecimal value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<BigDecimal> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<BigDecimal> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(BigDecimal value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(BigDecimal value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(BigDecimal value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(BigDecimal value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<BigDecimal> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<BigDecimal> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdIsNull() {
            addCriterion("base_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdIsNotNull() {
            addCriterion("base_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdEqualTo(Short value) {
            addCriterion("base_unit_id =", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdNotEqualTo(Short value) {
            addCriterion("base_unit_id <>", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdGreaterThan(Short value) {
            addCriterion("base_unit_id >", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdGreaterThanOrEqualTo(Short value) {
            addCriterion("base_unit_id >=", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdLessThan(Short value) {
            addCriterion("base_unit_id <", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdLessThanOrEqualTo(Short value) {
            addCriterion("base_unit_id <=", value, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdIn(List<Short> values) {
            addCriterion("base_unit_id in", values, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdNotIn(List<Short> values) {
            addCriterion("base_unit_id not in", values, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdBetween(Short value1, Short value2) {
            addCriterion("base_unit_id between", value1, value2, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andBaseUnitIdNotBetween(Short value1, Short value2) {
            addCriterion("base_unit_id not between", value1, value2, "baseUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdIsNull() {
            addCriterion("aux_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdIsNotNull() {
            addCriterion("aux_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdEqualTo(Short value) {
            addCriterion("aux_unit_id =", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdNotEqualTo(Short value) {
            addCriterion("aux_unit_id <>", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdGreaterThan(Short value) {
            addCriterion("aux_unit_id >", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdGreaterThanOrEqualTo(Short value) {
            addCriterion("aux_unit_id >=", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdLessThan(Short value) {
            addCriterion("aux_unit_id <", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdLessThanOrEqualTo(Short value) {
            addCriterion("aux_unit_id <=", value, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdIn(List<Short> values) {
            addCriterion("aux_unit_id in", values, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdNotIn(List<Short> values) {
            addCriterion("aux_unit_id not in", values, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdBetween(Short value1, Short value2) {
            addCriterion("aux_unit_id between", value1, value2, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andAuxUnitIdNotBetween(Short value1, Short value2) {
            addCriterion("aux_unit_id not between", value1, value2, "auxUnitId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
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