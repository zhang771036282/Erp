package com.erp.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zph2
 */
public class ProductDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDetailsExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andPackageNumberIsNull() {
            addCriterion("package_number is null");
            return (Criteria) this;
        }

        public Criteria andPackageNumberIsNotNull() {
            addCriterion("package_number is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNumberEqualTo(Integer value) {
            addCriterion("package_number =", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberNotEqualTo(Integer value) {
            addCriterion("package_number <>", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberGreaterThan(Integer value) {
            addCriterion("package_number >", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_number >=", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberLessThan(Integer value) {
            addCriterion("package_number <", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberLessThanOrEqualTo(Integer value) {
            addCriterion("package_number <=", value, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberIn(List<Integer> values) {
            addCriterion("package_number in", values, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberNotIn(List<Integer> values) {
            addCriterion("package_number not in", values, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberBetween(Integer value1, Integer value2) {
            addCriterion("package_number between", value1, value2, "packageNumber");
            return (Criteria) this;
        }

        public Criteria andPackageNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("package_number not between", value1, value2, "packageNumber");
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

        public Criteria andWidthEqualTo(Float value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Float value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Float value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Float value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Float value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Float> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Float> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Float value1, Float value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Float value1, Float value2) {
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

        public Criteria andHeightEqualTo(Float value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Float value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Float value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Float value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Float value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Float> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Float> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Float value1, Float value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Float value1, Float value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBoardIsNull() {
            addCriterion("board is null");
            return (Criteria) this;
        }

        public Criteria andBoardIsNotNull() {
            addCriterion("board is not null");
            return (Criteria) this;
        }

        public Criteria andBoardEqualTo(String value) {
            addCriterion("board =", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotEqualTo(String value) {
            addCriterion("board <>", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThan(String value) {
            addCriterion("board >", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardGreaterThanOrEqualTo(String value) {
            addCriterion("board >=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThan(String value) {
            addCriterion("board <", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLessThanOrEqualTo(String value) {
            addCriterion("board <=", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardLike(String value) {
            addCriterion("board like", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotLike(String value) {
            addCriterion("board not like", value, "board");
            return (Criteria) this;
        }

        public Criteria andBoardIn(List<String> values) {
            addCriterion("board in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotIn(List<String> values) {
            addCriterion("board not in", values, "board");
            return (Criteria) this;
        }

        public Criteria andBoardBetween(String value1, String value2) {
            addCriterion("board between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andBoardNotBetween(String value1, String value2) {
            addCriterion("board not between", value1, value2, "board");
            return (Criteria) this;
        }

        public Criteria andCraftIsNull() {
            addCriterion("craft is null");
            return (Criteria) this;
        }

        public Criteria andCraftIsNotNull() {
            addCriterion("craft is not null");
            return (Criteria) this;
        }

        public Criteria andCraftEqualTo(String value) {
            addCriterion("craft =", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotEqualTo(String value) {
            addCriterion("craft <>", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThan(String value) {
            addCriterion("craft >", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftGreaterThanOrEqualTo(String value) {
            addCriterion("craft >=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThan(String value) {
            addCriterion("craft <", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLessThanOrEqualTo(String value) {
            addCriterion("craft <=", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftLike(String value) {
            addCriterion("craft like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotLike(String value) {
            addCriterion("craft not like", value, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftIn(List<String> values) {
            addCriterion("craft in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotIn(List<String> values) {
            addCriterion("craft not in", values, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftBetween(String value1, String value2) {
            addCriterion("craft between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andCraftNotBetween(String value1, String value2) {
            addCriterion("craft not between", value1, value2, "craft");
            return (Criteria) this;
        }

        public Criteria andDoorTypeIsNull() {
            addCriterion("door_type is null");
            return (Criteria) this;
        }

        public Criteria andDoorTypeIsNotNull() {
            addCriterion("door_type is not null");
            return (Criteria) this;
        }

        public Criteria andDoorTypeEqualTo(String value) {
            addCriterion("door_type =", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNotEqualTo(String value) {
            addCriterion("door_type <>", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeGreaterThan(String value) {
            addCriterion("door_type >", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("door_type >=", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeLessThan(String value) {
            addCriterion("door_type <", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeLessThanOrEqualTo(String value) {
            addCriterion("door_type <=", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeLike(String value) {
            addCriterion("door_type like", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNotLike(String value) {
            addCriterion("door_type not like", value, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeIn(List<String> values) {
            addCriterion("door_type in", values, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNotIn(List<String> values) {
            addCriterion("door_type not in", values, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeBetween(String value1, String value2) {
            addCriterion("door_type between", value1, value2, "doorType");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNotBetween(String value1, String value2) {
            addCriterion("door_type not between", value1, value2, "doorType");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeIsNull() {
            addCriterion("edge_shape is null");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeIsNotNull() {
            addCriterion("edge_shape is not null");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeEqualTo(String value) {
            addCriterion("edge_shape =", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeNotEqualTo(String value) {
            addCriterion("edge_shape <>", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeGreaterThan(String value) {
            addCriterion("edge_shape >", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeGreaterThanOrEqualTo(String value) {
            addCriterion("edge_shape >=", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeLessThan(String value) {
            addCriterion("edge_shape <", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeLessThanOrEqualTo(String value) {
            addCriterion("edge_shape <=", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeLike(String value) {
            addCriterion("edge_shape like", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeNotLike(String value) {
            addCriterion("edge_shape not like", value, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeIn(List<String> values) {
            addCriterion("edge_shape in", values, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeNotIn(List<String> values) {
            addCriterion("edge_shape not in", values, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeBetween(String value1, String value2) {
            addCriterion("edge_shape between", value1, value2, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andEdgeShapeNotBetween(String value1, String value2) {
            addCriterion("edge_shape not between", value1, value2, "edgeShape");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsIsNull() {
            addCriterion("door_type_parts is null");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsIsNotNull() {
            addCriterion("door_type_parts is not null");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsEqualTo(String value) {
            addCriterion("door_type_parts =", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNotEqualTo(String value) {
            addCriterion("door_type_parts <>", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsGreaterThan(String value) {
            addCriterion("door_type_parts >", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsGreaterThanOrEqualTo(String value) {
            addCriterion("door_type_parts >=", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsLessThan(String value) {
            addCriterion("door_type_parts <", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsLessThanOrEqualTo(String value) {
            addCriterion("door_type_parts <=", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsLike(String value) {
            addCriterion("door_type_parts like", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNotLike(String value) {
            addCriterion("door_type_parts not like", value, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsIn(List<String> values) {
            addCriterion("door_type_parts in", values, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNotIn(List<String> values) {
            addCriterion("door_type_parts not in", values, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsBetween(String value1, String value2) {
            addCriterion("door_type_parts between", value1, value2, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNotBetween(String value1, String value2) {
            addCriterion("door_type_parts not between", value1, value2, "doorTypeParts");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumIsNull() {
            addCriterion("door_type_parts_num is null");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumIsNotNull() {
            addCriterion("door_type_parts_num is not null");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumEqualTo(Integer value) {
            addCriterion("door_type_parts_num =", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumNotEqualTo(Integer value) {
            addCriterion("door_type_parts_num <>", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumGreaterThan(Integer value) {
            addCriterion("door_type_parts_num >", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_type_parts_num >=", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumLessThan(Integer value) {
            addCriterion("door_type_parts_num <", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumLessThanOrEqualTo(Integer value) {
            addCriterion("door_type_parts_num <=", value, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumIn(List<Integer> values) {
            addCriterion("door_type_parts_num in", values, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumNotIn(List<Integer> values) {
            addCriterion("door_type_parts_num not in", values, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumBetween(Integer value1, Integer value2) {
            addCriterion("door_type_parts_num between", value1, value2, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andDoorTypePartsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("door_type_parts_num not between", value1, value2, "doorTypePartsNum");
            return (Criteria) this;
        }

        public Criteria andFaceIsNull() {
            addCriterion("face is null");
            return (Criteria) this;
        }

        public Criteria andFaceIsNotNull() {
            addCriterion("face is not null");
            return (Criteria) this;
        }

        public Criteria andFaceEqualTo(String value) {
            addCriterion("face =", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotEqualTo(String value) {
            addCriterion("face <>", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThan(String value) {
            addCriterion("face >", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThanOrEqualTo(String value) {
            addCriterion("face >=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThan(String value) {
            addCriterion("face <", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThanOrEqualTo(String value) {
            addCriterion("face <=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLike(String value) {
            addCriterion("face like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotLike(String value) {
            addCriterion("face not like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceIn(List<String> values) {
            addCriterion("face in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotIn(List<String> values) {
            addCriterion("face not in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceBetween(String value1, String value2) {
            addCriterion("face between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotBetween(String value1, String value2) {
            addCriterion("face not between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andPartsIsNull() {
            addCriterion("parts is null");
            return (Criteria) this;
        }

        public Criteria andPartsIsNotNull() {
            addCriterion("parts is not null");
            return (Criteria) this;
        }

        public Criteria andPartsEqualTo(String value) {
            addCriterion("parts =", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotEqualTo(String value) {
            addCriterion("parts <>", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThan(String value) {
            addCriterion("parts >", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsGreaterThanOrEqualTo(String value) {
            addCriterion("parts >=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThan(String value) {
            addCriterion("parts <", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLessThanOrEqualTo(String value) {
            addCriterion("parts <=", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsLike(String value) {
            addCriterion("parts like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotLike(String value) {
            addCriterion("parts not like", value, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsIn(List<String> values) {
            addCriterion("parts in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotIn(List<String> values) {
            addCriterion("parts not in", values, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsBetween(String value1, String value2) {
            addCriterion("parts between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNotBetween(String value1, String value2) {
            addCriterion("parts not between", value1, value2, "parts");
            return (Criteria) this;
        }

        public Criteria andPartsNumberIsNull() {
            addCriterion("parts_number is null");
            return (Criteria) this;
        }

        public Criteria andPartsNumberIsNotNull() {
            addCriterion("parts_number is not null");
            return (Criteria) this;
        }

        public Criteria andPartsNumberEqualTo(Integer value) {
            addCriterion("parts_number =", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberNotEqualTo(Integer value) {
            addCriterion("parts_number <>", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberGreaterThan(Integer value) {
            addCriterion("parts_number >", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("parts_number >=", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberLessThan(Integer value) {
            addCriterion("parts_number <", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("parts_number <=", value, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberIn(List<Integer> values) {
            addCriterion("parts_number in", values, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberNotIn(List<Integer> values) {
            addCriterion("parts_number not in", values, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberBetween(Integer value1, Integer value2) {
            addCriterion("parts_number between", value1, value2, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andPartsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("parts_number not between", value1, value2, "partsNumber");
            return (Criteria) this;
        }

        public Criteria andTextureIsNull() {
            addCriterion("texture is null");
            return (Criteria) this;
        }

        public Criteria andTextureIsNotNull() {
            addCriterion("texture is not null");
            return (Criteria) this;
        }

        public Criteria andTextureEqualTo(String value) {
            addCriterion("texture =", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotEqualTo(String value) {
            addCriterion("texture <>", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThan(String value) {
            addCriterion("texture >", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureGreaterThanOrEqualTo(String value) {
            addCriterion("texture >=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThan(String value) {
            addCriterion("texture <", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLessThanOrEqualTo(String value) {
            addCriterion("texture <=", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureLike(String value) {
            addCriterion("texture like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotLike(String value) {
            addCriterion("texture not like", value, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureIn(List<String> values) {
            addCriterion("texture in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotIn(List<String> values) {
            addCriterion("texture not in", values, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureBetween(String value1, String value2) {
            addCriterion("texture between", value1, value2, "texture");
            return (Criteria) this;
        }

        public Criteria andTextureNotBetween(String value1, String value2) {
            addCriterion("texture not between", value1, value2, "texture");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNull() {
            addCriterion("product_color is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNotNull() {
            addCriterion("product_color is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorEqualTo(String value) {
            addCriterion("product_color =", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotEqualTo(String value) {
            addCriterion("product_color <>", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThan(String value) {
            addCriterion("product_color >", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThanOrEqualTo(String value) {
            addCriterion("product_color >=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThan(String value) {
            addCriterion("product_color <", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThanOrEqualTo(String value) {
            addCriterion("product_color <=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLike(String value) {
            addCriterion("product_color like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotLike(String value) {
            addCriterion("product_color not like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorIn(List<String> values) {
            addCriterion("product_color in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotIn(List<String> values) {
            addCriterion("product_color not in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorBetween(String value1, String value2) {
            addCriterion("product_color between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotBetween(String value1, String value2) {
            addCriterion("product_color not between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(String value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(String value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(String value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(String value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(String value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(String value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLike(String value) {
            addCriterion("open like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotLike(String value) {
            addCriterion("open not like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<String> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<String> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(String value1, String value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(String value1, String value2) {
            addCriterion("open not between", value1, value2, "open");
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

        public Criteria andV1IsNull() {
            addCriterion("v1 is null");
            return (Criteria) this;
        }

        public Criteria andV1IsNotNull() {
            addCriterion("v1 is not null");
            return (Criteria) this;
        }

        public Criteria andV1EqualTo(Float value) {
            addCriterion("v1 =", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1NotEqualTo(Float value) {
            addCriterion("v1 <>", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1GreaterThan(Float value) {
            addCriterion("v1 >", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1GreaterThanOrEqualTo(Float value) {
            addCriterion("v1 >=", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1LessThan(Float value) {
            addCriterion("v1 <", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1LessThanOrEqualTo(Float value) {
            addCriterion("v1 <=", value, "v1");
            return (Criteria) this;
        }

        public Criteria andV1In(List<Float> values) {
            addCriterion("v1 in", values, "v1");
            return (Criteria) this;
        }

        public Criteria andV1NotIn(List<Float> values) {
            addCriterion("v1 not in", values, "v1");
            return (Criteria) this;
        }

        public Criteria andV1Between(Float value1, Float value2) {
            addCriterion("v1 between", value1, value2, "v1");
            return (Criteria) this;
        }

        public Criteria andV1NotBetween(Float value1, Float value2) {
            addCriterion("v1 not between", value1, value2, "v1");
            return (Criteria) this;
        }

        public Criteria andV2IsNull() {
            addCriterion("v2 is null");
            return (Criteria) this;
        }

        public Criteria andV2IsNotNull() {
            addCriterion("v2 is not null");
            return (Criteria) this;
        }

        public Criteria andV2EqualTo(Float value) {
            addCriterion("v2 =", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2NotEqualTo(Float value) {
            addCriterion("v2 <>", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2GreaterThan(Float value) {
            addCriterion("v2 >", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2GreaterThanOrEqualTo(Float value) {
            addCriterion("v2 >=", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2LessThan(Float value) {
            addCriterion("v2 <", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2LessThanOrEqualTo(Float value) {
            addCriterion("v2 <=", value, "v2");
            return (Criteria) this;
        }

        public Criteria andV2In(List<Float> values) {
            addCriterion("v2 in", values, "v2");
            return (Criteria) this;
        }

        public Criteria andV2NotIn(List<Float> values) {
            addCriterion("v2 not in", values, "v2");
            return (Criteria) this;
        }

        public Criteria andV2Between(Float value1, Float value2) {
            addCriterion("v2 between", value1, value2, "v2");
            return (Criteria) this;
        }

        public Criteria andV2NotBetween(Float value1, Float value2) {
            addCriterion("v2 not between", value1, value2, "v2");
            return (Criteria) this;
        }

        public Criteria andV3IsNull() {
            addCriterion("v3 is null");
            return (Criteria) this;
        }

        public Criteria andV3IsNotNull() {
            addCriterion("v3 is not null");
            return (Criteria) this;
        }

        public Criteria andV3EqualTo(Float value) {
            addCriterion("v3 =", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3NotEqualTo(Float value) {
            addCriterion("v3 <>", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3GreaterThan(Float value) {
            addCriterion("v3 >", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3GreaterThanOrEqualTo(Float value) {
            addCriterion("v3 >=", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3LessThan(Float value) {
            addCriterion("v3 <", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3LessThanOrEqualTo(Float value) {
            addCriterion("v3 <=", value, "v3");
            return (Criteria) this;
        }

        public Criteria andV3In(List<Float> values) {
            addCriterion("v3 in", values, "v3");
            return (Criteria) this;
        }

        public Criteria andV3NotIn(List<Float> values) {
            addCriterion("v3 not in", values, "v3");
            return (Criteria) this;
        }

        public Criteria andV3Between(Float value1, Float value2) {
            addCriterion("v3 between", value1, value2, "v3");
            return (Criteria) this;
        }

        public Criteria andV3NotBetween(Float value1, Float value2) {
            addCriterion("v3 not between", value1, value2, "v3");
            return (Criteria) this;
        }

        public Criteria andNextStepIsNull() {
            addCriterion("next_step is null");
            return (Criteria) this;
        }

        public Criteria andNextStepIsNotNull() {
            addCriterion("next_step is not null");
            return (Criteria) this;
        }

        public Criteria andNextStepEqualTo(String value) {
            addCriterion("next_step =", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepNotEqualTo(String value) {
            addCriterion("next_step <>", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepGreaterThan(String value) {
            addCriterion("next_step >", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepGreaterThanOrEqualTo(String value) {
            addCriterion("next_step >=", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepLessThan(String value) {
            addCriterion("next_step <", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepLessThanOrEqualTo(String value) {
            addCriterion("next_step <=", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepLike(String value) {
            addCriterion("next_step like", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepNotLike(String value) {
            addCriterion("next_step not like", value, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepIn(List<String> values) {
            addCriterion("next_step in", values, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepNotIn(List<String> values) {
            addCriterion("next_step not in", values, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepBetween(String value1, String value2) {
            addCriterion("next_step between", value1, value2, "nextStep");
            return (Criteria) this;
        }

        public Criteria andNextStepNotBetween(String value1, String value2) {
            addCriterion("next_step not between", value1, value2, "nextStep");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameIsNull() {
            addCriterion("door_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameIsNotNull() {
            addCriterion("door_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameEqualTo(String value) {
            addCriterion("door_type_name =", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameNotEqualTo(String value) {
            addCriterion("door_type_name <>", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameGreaterThan(String value) {
            addCriterion("door_type_name >", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("door_type_name >=", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameLessThan(String value) {
            addCriterion("door_type_name <", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameLessThanOrEqualTo(String value) {
            addCriterion("door_type_name <=", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameLike(String value) {
            addCriterion("door_type_name like", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameNotLike(String value) {
            addCriterion("door_type_name not like", value, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameIn(List<String> values) {
            addCriterion("door_type_name in", values, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameNotIn(List<String> values) {
            addCriterion("door_type_name not in", values, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameBetween(String value1, String value2) {
            addCriterion("door_type_name between", value1, value2, "doorTypeName");
            return (Criteria) this;
        }

        public Criteria andDoorTypeNameNotBetween(String value1, String value2) {
            addCriterion("door_type_name not between", value1, value2, "doorTypeName");
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