package com.onlineShop.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Short value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Short value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Short value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Short value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Short value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Short value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Short> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Short> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Short value1, Short value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Short value1, Short value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNickIsNull() {
            addCriterion("account_nick is null");
            return (Criteria) this;
        }

        public Criteria andAccountNickIsNotNull() {
            addCriterion("account_nick is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNickEqualTo(String value) {
            addCriterion("account_nick =", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickNotEqualTo(String value) {
            addCriterion("account_nick <>", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickGreaterThan(String value) {
            addCriterion("account_nick >", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickGreaterThanOrEqualTo(String value) {
            addCriterion("account_nick >=", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickLessThan(String value) {
            addCriterion("account_nick <", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickLessThanOrEqualTo(String value) {
            addCriterion("account_nick <=", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickLike(String value) {
            addCriterion("account_nick like", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickNotLike(String value) {
            addCriterion("account_nick not like", value, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickIn(List<String> values) {
            addCriterion("account_nick in", values, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickNotIn(List<String> values) {
            addCriterion("account_nick not in", values, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickBetween(String value1, String value2) {
            addCriterion("account_nick between", value1, value2, "accountNick");
            return (Criteria) this;
        }

        public Criteria andAccountNickNotBetween(String value1, String value2) {
            addCriterion("account_nick not between", value1, value2, "accountNick");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Short value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Short value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Short value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Short value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Short value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Short value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Short> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Short> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Short value1, Short value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Short value1, Short value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Integer value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Integer value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Integer value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Integer value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Integer> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Integer> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Integer value1, Integer value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNull() {
            addCriterion("telno is null");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNotNull() {
            addCriterion("telno is not null");
            return (Criteria) this;
        }

        public Criteria andTelnoEqualTo(String value) {
            addCriterion("telno =", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotEqualTo(String value) {
            addCriterion("telno <>", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThan(String value) {
            addCriterion("telno >", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThanOrEqualTo(String value) {
            addCriterion("telno >=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThan(String value) {
            addCriterion("telno <", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThanOrEqualTo(String value) {
            addCriterion("telno <=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLike(String value) {
            addCriterion("telno like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotLike(String value) {
            addCriterion("telno not like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoIn(List<String> values) {
            addCriterion("telno in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotIn(List<String> values) {
            addCriterion("telno not in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoBetween(String value1, String value2) {
            addCriterion("telno between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotBetween(String value1, String value2) {
            addCriterion("telno not between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andProp1IsNull() {
            addCriterion("prop1 is null");
            return (Criteria) this;
        }

        public Criteria andProp1IsNotNull() {
            addCriterion("prop1 is not null");
            return (Criteria) this;
        }

        public Criteria andProp1EqualTo(String value) {
            addCriterion("prop1 =", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotEqualTo(String value) {
            addCriterion("prop1 <>", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThan(String value) {
            addCriterion("prop1 >", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1GreaterThanOrEqualTo(String value) {
            addCriterion("prop1 >=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThan(String value) {
            addCriterion("prop1 <", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1LessThanOrEqualTo(String value) {
            addCriterion("prop1 <=", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Like(String value) {
            addCriterion("prop1 like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotLike(String value) {
            addCriterion("prop1 not like", value, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1In(List<String> values) {
            addCriterion("prop1 in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotIn(List<String> values) {
            addCriterion("prop1 not in", values, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1Between(String value1, String value2) {
            addCriterion("prop1 between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp1NotBetween(String value1, String value2) {
            addCriterion("prop1 not between", value1, value2, "prop1");
            return (Criteria) this;
        }

        public Criteria andProp2IsNull() {
            addCriterion("prop2 is null");
            return (Criteria) this;
        }

        public Criteria andProp2IsNotNull() {
            addCriterion("prop2 is not null");
            return (Criteria) this;
        }

        public Criteria andProp2EqualTo(String value) {
            addCriterion("prop2 =", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotEqualTo(String value) {
            addCriterion("prop2 <>", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThan(String value) {
            addCriterion("prop2 >", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2GreaterThanOrEqualTo(String value) {
            addCriterion("prop2 >=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThan(String value) {
            addCriterion("prop2 <", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2LessThanOrEqualTo(String value) {
            addCriterion("prop2 <=", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Like(String value) {
            addCriterion("prop2 like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotLike(String value) {
            addCriterion("prop2 not like", value, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2In(List<String> values) {
            addCriterion("prop2 in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotIn(List<String> values) {
            addCriterion("prop2 not in", values, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2Between(String value1, String value2) {
            addCriterion("prop2 between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andProp2NotBetween(String value1, String value2) {
            addCriterion("prop2 not between", value1, value2, "prop2");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNull() {
            addCriterion("is_disabled is null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIsNotNull() {
            addCriterion("is_disabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisabledEqualTo(Boolean value) {
            addCriterion("is_disabled =", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotEqualTo(Boolean value) {
            addCriterion("is_disabled <>", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThan(Boolean value) {
            addCriterion("is_disabled >", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_disabled >=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThan(Boolean value) {
            addCriterion("is_disabled <", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_disabled <=", value, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledIn(List<Boolean> values) {
            addCriterion("is_disabled in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotIn(List<Boolean> values) {
            addCriterion("is_disabled not in", values, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_disabled between", value1, value2, "isDisabled");
            return (Criteria) this;
        }

        public Criteria andIsDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_disabled not between", value1, value2, "isDisabled");
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