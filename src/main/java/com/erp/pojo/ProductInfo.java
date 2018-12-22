package com.erp.pojo;

/**
 * 产品表
 * @author zph2
 */
public class ProductInfo {
    /**
     *产品ID
     */
    private Integer id;
    /**
     *DDID
     */
    private Integer ddid;
    /**
     *订单编号
     */
    private String orderCode;
    /**
     *宽
     */
    private Float width;
    /**
     *高
     */
    private Float height;
    /**
     *基材
     */
    private String board;
    /**
     *工艺
     */
    private String craft;
    /**
     *门型
     */
    private String doorType;
    /**
     *边型
     */
    private String edgeShape;
    /**
     *门型配件
     */
    private String doorTypeParts;
    /**
     *门型配件数量
     */
    private Integer doorTypePartsNum;
    /**
     *单双面
     */
    private String face;
    /**
     *配件
     */
    private String parts;
    /**
     *配件数量
     */
    private Integer partsNumber;
    /**
     *纹理
     */
    private String texture;
    /**
     *数量
     */
    private Integer num;
    /**
     *颜色
     */
    private String productColor;
    /**
     *开向
     */
    private String open;
    /**
     *产品备注
     */
    private String remark;
    /**
     *面积
     */
    private Float area;
    /**
     *单价
     */
    private Float price;
    /**
     *产品小计
     */
    private Float productSubtotal;
    /**
     *v1
     */
    private Float v1;
    /**
     *v2
     */
    private Float v2;
    /**
     *v3
     */
    private Float v3;
    /**
     *门板名称
     */
    private String doorTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board == null ? null : board.trim();
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft == null ? null : craft.trim();
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType == null ? null : doorType.trim();
    }

    public String getEdgeShape() {
        return edgeShape;
    }

    public void setEdgeShape(String edgeShape) {
        this.edgeShape = edgeShape == null ? null : edgeShape.trim();
    }

    public String getDoorTypeParts() {
        return doorTypeParts;
    }

    public void setDoorTypeParts(String doorTypeParts) {
        this.doorTypeParts = doorTypeParts == null ? null : doorTypeParts.trim();
    }

    public Integer getDoorTypePartsNum() {
        return doorTypePartsNum;
    }

    public void setDoorTypePartsNum(Integer doorTypePartsNum) {
        this.doorTypePartsNum = doorTypePartsNum;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts == null ? null : parts.trim();
    }

    public Integer getPartsNumber() {
        return partsNumber;
    }

    public void setPartsNumber(Integer partsNumber) {
        this.partsNumber = partsNumber;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture == null ? null : texture.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor == null ? null : productColor.trim();
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open == null ? null : open.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getProductSubtotal() {
        return productSubtotal;
    }

    public void setProductSubtotal(Float productSubtotal) {
        this.productSubtotal = productSubtotal;
    }

    public Float getV1() {
        return v1;
    }

    public void setV1(Float v1) {
        this.v1 = v1;
    }

    public Float getV2() {
        return v2;
    }

    public void setV2(Float v2) {
        this.v2 = v2;
    }

    public Float getV3() {
        return v3;
    }

    public void setV3(Float v3) {
        this.v3 = v3;
    }

    public String getDoorTypeName() {
        return doorTypeName;
    }

    public void setDoorTypeName(String doorTypeName) {
        this.doorTypeName = doorTypeName == null ? null : doorTypeName.trim();
    }
}