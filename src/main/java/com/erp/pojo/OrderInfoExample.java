package com.erp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zph2
 */
public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andDdidIsNull() {
            addCriterion("ddid is null");
            return (Criteria) this;
        }

        public Criteria andDdidIsNotNull() {
            addCriterion("ddid is not null");
            return (Criteria) this;
        }

        public Criteria andDdidEqualTo(Integer value) {
            addCriterion("ddid =", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotEqualTo(Integer value) {
            addCriterion("ddid <>", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThan(Integer value) {
            addCriterion("ddid >", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddid >=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThan(Integer value) {
            addCriterion("ddid <", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThanOrEqualTo(Integer value) {
            addCriterion("ddid <=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidIn(List<Integer> values) {
            addCriterion("ddid in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotIn(List<Integer> values) {
            addCriterion("ddid not in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidBetween(Integer value1, Integer value2) {
            addCriterion("ddid between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotBetween(Integer value1, Integer value2) {
            addCriterion("ddid not between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andLogisticsIsNull() {
            addCriterion("logistics is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIsNotNull() {
            addCriterion("logistics is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsEqualTo(String value) {
            addCriterion("logistics =", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotEqualTo(String value) {
            addCriterion("logistics <>", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsGreaterThan(String value) {
            addCriterion("logistics >", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsGreaterThanOrEqualTo(String value) {
            addCriterion("logistics >=", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLessThan(String value) {
            addCriterion("logistics <", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLessThanOrEqualTo(String value) {
            addCriterion("logistics <=", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLike(String value) {
            addCriterion("logistics like", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotLike(String value) {
            addCriterion("logistics not like", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsIn(List<String> values) {
            addCriterion("logistics in", values, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotIn(List<String> values) {
            addCriterion("logistics not in", values, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsBetween(String value1, String value2) {
            addCriterion("logistics between", value1, value2, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotBetween(String value1, String value2) {
            addCriterion("logistics not between", value1, value2, "logistics");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIsNull() {
            addCriterion("packing_type is null");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIsNotNull() {
            addCriterion("packing_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackingTypeEqualTo(String value) {
            addCriterion("packing_type =", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotEqualTo(String value) {
            addCriterion("packing_type <>", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeGreaterThan(String value) {
            addCriterion("packing_type >", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("packing_type >=", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLessThan(String value) {
            addCriterion("packing_type <", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLessThanOrEqualTo(String value) {
            addCriterion("packing_type <=", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeLike(String value) {
            addCriterion("packing_type like", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotLike(String value) {
            addCriterion("packing_type not like", value, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeIn(List<String> values) {
            addCriterion("packing_type in", values, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotIn(List<String> values) {
            addCriterion("packing_type not in", values, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeBetween(String value1, String value2) {
            addCriterion("packing_type between", value1, value2, "packingType");
            return (Criteria) this;
        }

        public Criteria andPackingTypeNotBetween(String value1, String value2) {
            addCriterion("packing_type not between", value1, value2, "packingType");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNull() {
            addCriterion("order_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIsNotNull() {
            addCriterion("order_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressEqualTo(String value) {
            addCriterion("order_address =", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotEqualTo(String value) {
            addCriterion("order_address <>", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThan(String value) {
            addCriterion("order_address >", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_address >=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThan(String value) {
            addCriterion("order_address <", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLessThanOrEqualTo(String value) {
            addCriterion("order_address <=", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressLike(String value) {
            addCriterion("order_address like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotLike(String value) {
            addCriterion("order_address not like", value, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIn(List<String> values) {
            addCriterion("order_address in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotIn(List<String> values) {
            addCriterion("order_address not in", values, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressBetween(String value1, String value2) {
            addCriterion("order_address between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andOrderAddressNotBetween(String value1, String value2) {
            addCriterion("order_address not between", value1, value2, "orderAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerIsNull() {
            addCriterion("terminal_cutomer is null");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerIsNotNull() {
            addCriterion("terminal_cutomer is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerEqualTo(String value) {
            addCriterion("terminal_cutomer =", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerNotEqualTo(String value) {
            addCriterion("terminal_cutomer <>", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerGreaterThan(String value) {
            addCriterion("terminal_cutomer >", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_cutomer >=", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerLessThan(String value) {
            addCriterion("terminal_cutomer <", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerLessThanOrEqualTo(String value) {
            addCriterion("terminal_cutomer <=", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerLike(String value) {
            addCriterion("terminal_cutomer like", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerNotLike(String value) {
            addCriterion("terminal_cutomer not like", value, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerIn(List<String> values) {
            addCriterion("terminal_cutomer in", values, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerNotIn(List<String> values) {
            addCriterion("terminal_cutomer not in", values, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerBetween(String value1, String value2) {
            addCriterion("terminal_cutomer between", value1, value2, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalCutomerNotBetween(String value1, String value2) {
            addCriterion("terminal_cutomer not between", value1, value2, "terminalCutomer");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressIsNull() {
            addCriterion("terminal_address is null");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressIsNotNull() {
            addCriterion("terminal_address is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressEqualTo(String value) {
            addCriterion("terminal_address =", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressNotEqualTo(String value) {
            addCriterion("terminal_address <>", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressGreaterThan(String value) {
            addCriterion("terminal_address >", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_address >=", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressLessThan(String value) {
            addCriterion("terminal_address <", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressLessThanOrEqualTo(String value) {
            addCriterion("terminal_address <=", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressLike(String value) {
            addCriterion("terminal_address like", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressNotLike(String value) {
            addCriterion("terminal_address not like", value, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressIn(List<String> values) {
            addCriterion("terminal_address in", values, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressNotIn(List<String> values) {
            addCriterion("terminal_address not in", values, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressBetween(String value1, String value2) {
            addCriterion("terminal_address between", value1, value2, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andTerminalAddressNotBetween(String value1, String value2) {
            addCriterion("terminal_address not between", value1, value2, "terminalAddress");
            return (Criteria) this;
        }

        public Criteria andOrderContactIsNull() {
            addCriterion("order_contact is null");
            return (Criteria) this;
        }

        public Criteria andOrderContactIsNotNull() {
            addCriterion("order_contact is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContactEqualTo(String value) {
            addCriterion("order_contact =", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactNotEqualTo(String value) {
            addCriterion("order_contact <>", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactGreaterThan(String value) {
            addCriterion("order_contact >", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactGreaterThanOrEqualTo(String value) {
            addCriterion("order_contact >=", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactLessThan(String value) {
            addCriterion("order_contact <", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactLessThanOrEqualTo(String value) {
            addCriterion("order_contact <=", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactLike(String value) {
            addCriterion("order_contact like", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactNotLike(String value) {
            addCriterion("order_contact not like", value, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactIn(List<String> values) {
            addCriterion("order_contact in", values, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactNotIn(List<String> values) {
            addCriterion("order_contact not in", values, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactBetween(String value1, String value2) {
            addCriterion("order_contact between", value1, value2, "orderContact");
            return (Criteria) this;
        }

        public Criteria andOrderContactNotBetween(String value1, String value2) {
            addCriterion("order_contact not between", value1, value2, "orderContact");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTakerIsNull() {
            addCriterion("order_taker is null");
            return (Criteria) this;
        }

        public Criteria andOrderTakerIsNotNull() {
            addCriterion("order_taker is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTakerEqualTo(String value) {
            addCriterion("order_taker =", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerNotEqualTo(String value) {
            addCriterion("order_taker <>", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerGreaterThan(String value) {
            addCriterion("order_taker >", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerGreaterThanOrEqualTo(String value) {
            addCriterion("order_taker >=", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerLessThan(String value) {
            addCriterion("order_taker <", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerLessThanOrEqualTo(String value) {
            addCriterion("order_taker <=", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerLike(String value) {
            addCriterion("order_taker like", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerNotLike(String value) {
            addCriterion("order_taker not like", value, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerIn(List<String> values) {
            addCriterion("order_taker in", values, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerNotIn(List<String> values) {
            addCriterion("order_taker not in", values, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerBetween(String value1, String value2) {
            addCriterion("order_taker between", value1, value2, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andOrderTakerNotBetween(String value1, String value2) {
            addCriterion("order_taker not between", value1, value2, "orderTaker");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNull() {
            addCriterion("salesman is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIsNotNull() {
            addCriterion("salesman is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanEqualTo(String value) {
            addCriterion("salesman =", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotEqualTo(String value) {
            addCriterion("salesman <>", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThan(String value) {
            addCriterion("salesman >", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanGreaterThanOrEqualTo(String value) {
            addCriterion("salesman >=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThan(String value) {
            addCriterion("salesman <", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLessThanOrEqualTo(String value) {
            addCriterion("salesman <=", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanLike(String value) {
            addCriterion("salesman like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotLike(String value) {
            addCriterion("salesman not like", value, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanIn(List<String> values) {
            addCriterion("salesman in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotIn(List<String> values) {
            addCriterion("salesman not in", values, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanBetween(String value1, String value2) {
            addCriterion("salesman between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andSalesmanNotBetween(String value1, String value2) {
            addCriterion("salesman not between", value1, value2, "salesman");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andContractPayIsNull() {
            addCriterion("contract_pay is null");
            return (Criteria) this;
        }

        public Criteria andContractPayIsNotNull() {
            addCriterion("contract_pay is not null");
            return (Criteria) this;
        }

        public Criteria andContractPayEqualTo(Float value) {
            addCriterion("contract_pay =", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayNotEqualTo(Float value) {
            addCriterion("contract_pay <>", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayGreaterThan(Float value) {
            addCriterion("contract_pay >", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayGreaterThanOrEqualTo(Float value) {
            addCriterion("contract_pay >=", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayLessThan(Float value) {
            addCriterion("contract_pay <", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayLessThanOrEqualTo(Float value) {
            addCriterion("contract_pay <=", value, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayIn(List<Float> values) {
            addCriterion("contract_pay in", values, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayNotIn(List<Float> values) {
            addCriterion("contract_pay not in", values, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayBetween(Float value1, Float value2) {
            addCriterion("contract_pay between", value1, value2, "contractPay");
            return (Criteria) this;
        }

        public Criteria andContractPayNotBetween(Float value1, Float value2) {
            addCriterion("contract_pay not between", value1, value2, "contractPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNull() {
            addCriterion("actual_pay is null");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNotNull() {
            addCriterion("actual_pay is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayEqualTo(Float value) {
            addCriterion("actual_pay =", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotEqualTo(Float value) {
            addCriterion("actual_pay <>", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThan(Float value) {
            addCriterion("actual_pay >", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_pay >=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThan(Float value) {
            addCriterion("actual_pay <", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThanOrEqualTo(Float value) {
            addCriterion("actual_pay <=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIn(List<Float> values) {
            addCriterion("actual_pay in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotIn(List<Float> values) {
            addCriterion("actual_pay not in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayBetween(Float value1, Float value2) {
            addCriterion("actual_pay between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotBetween(Float value1, Float value2) {
            addCriterion("actual_pay not between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIsNull() {
            addCriterion("total_area is null");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIsNotNull() {
            addCriterion("total_area is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAreaEqualTo(Float value) {
            addCriterion("total_area =", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotEqualTo(Float value) {
            addCriterion("total_area <>", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaGreaterThan(Float value) {
            addCriterion("total_area >", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("total_area >=", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaLessThan(Float value) {
            addCriterion("total_area <", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaLessThanOrEqualTo(Float value) {
            addCriterion("total_area <=", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIn(List<Float> values) {
            addCriterion("total_area in", values, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotIn(List<Float> values) {
            addCriterion("total_area not in", values, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaBetween(Float value1, Float value2) {
            addCriterion("total_area between", value1, value2, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotBetween(Float value1, Float value2) {
            addCriterion("total_area not between", value1, value2, "totalArea");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIsNull() {
            addCriterion("order_notes is null");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIsNotNull() {
            addCriterion("order_notes is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNotesEqualTo(String value) {
            addCriterion("order_notes =", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotEqualTo(String value) {
            addCriterion("order_notes <>", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesGreaterThan(String value) {
            addCriterion("order_notes >", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesGreaterThanOrEqualTo(String value) {
            addCriterion("order_notes >=", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLessThan(String value) {
            addCriterion("order_notes <", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLessThanOrEqualTo(String value) {
            addCriterion("order_notes <=", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLike(String value) {
            addCriterion("order_notes like", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotLike(String value) {
            addCriterion("order_notes not like", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIn(List<String> values) {
            addCriterion("order_notes in", values, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotIn(List<String> values) {
            addCriterion("order_notes not in", values, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesBetween(String value1, String value2) {
            addCriterion("order_notes between", value1, value2, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotBetween(String value1, String value2) {
            addCriterion("order_notes not between", value1, value2, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalIsNull() {
            addCriterion("product_subtotal is null");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalIsNotNull() {
            addCriterion("product_subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalEqualTo(Float value) {
            addCriterion("product_subtotal =", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalNotEqualTo(Float value) {
            addCriterion("product_subtotal <>", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalGreaterThan(Float value) {
            addCriterion("product_subtotal >", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalGreaterThanOrEqualTo(Float value) {
            addCriterion("product_subtotal >=", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalLessThan(Float value) {
            addCriterion("product_subtotal <", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalLessThanOrEqualTo(Float value) {
            addCriterion("product_subtotal <=", value, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalIn(List<Float> values) {
            addCriterion("product_subtotal in", values, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalNotIn(List<Float> values) {
            addCriterion("product_subtotal not in", values, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalBetween(Float value1, Float value2) {
            addCriterion("product_subtotal between", value1, value2, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductSubtotalNotBetween(Float value1, Float value2) {
            addCriterion("product_subtotal not between", value1, value2, "productSubtotal");
            return (Criteria) this;
        }

        public Criteria andProductionLocationIsNull() {
            addCriterion("production_location is null");
            return (Criteria) this;
        }

        public Criteria andProductionLocationIsNotNull() {
            addCriterion("production_location is not null");
            return (Criteria) this;
        }

        public Criteria andProductionLocationEqualTo(String value) {
            addCriterion("production_location =", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationNotEqualTo(String value) {
            addCriterion("production_location <>", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationGreaterThan(String value) {
            addCriterion("production_location >", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationGreaterThanOrEqualTo(String value) {
            addCriterion("production_location >=", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationLessThan(String value) {
            addCriterion("production_location <", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationLessThanOrEqualTo(String value) {
            addCriterion("production_location <=", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationLike(String value) {
            addCriterion("production_location like", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationNotLike(String value) {
            addCriterion("production_location not like", value, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationIn(List<String> values) {
            addCriterion("production_location in", values, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationNotIn(List<String> values) {
            addCriterion("production_location not in", values, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationBetween(String value1, String value2) {
            addCriterion("production_location between", value1, value2, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andProductionLocationNotBetween(String value1, String value2) {
            addCriterion("production_location not between", value1, value2, "productionLocation");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("operate_time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNull() {
            addCriterion("operate_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperateIpIsNotNull() {
            addCriterion("operate_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIpEqualTo(String value) {
            addCriterion("operate_ip =", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotEqualTo(String value) {
            addCriterion("operate_ip <>", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThan(String value) {
            addCriterion("operate_ip >", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpGreaterThanOrEqualTo(String value) {
            addCriterion("operate_ip >=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThan(String value) {
            addCriterion("operate_ip <", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLessThanOrEqualTo(String value) {
            addCriterion("operate_ip <=", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpLike(String value) {
            addCriterion("operate_ip like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotLike(String value) {
            addCriterion("operate_ip not like", value, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpIn(List<String> values) {
            addCriterion("operate_ip in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotIn(List<String> values) {
            addCriterion("operate_ip not in", values, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpBetween(String value1, String value2) {
            addCriterion("operate_ip between", value1, value2, "operateIp");
            return (Criteria) this;
        }

        public Criteria andOperateIpNotBetween(String value1, String value2) {
            addCriterion("operate_ip not between", value1, value2, "operateIp");
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