package com.erp.pojo;

import java.util.Date;

/**
 * 项目
 * @author zph2
 */
public class OrderInfo {
    /**
     * 项目ID
     */
    private Integer ddid;
    /**
     * 订单编号
     */
    private String code;
    /**
     * 订单分类（包覆  吸塑  移门）
     */
    private String type;
    /**
     * 订单性质（正常单，工程单，补单，返单 ）
     */
    private String nature;
    /**
     * 订货单位
     */
    private String unit;
    /**
     * 物流
     */
    private String logistics;
    /**
     * 包装类型
     */
    private String packingType;
    /**
     * 订单品牌
     */
    private String brand;
    /**
     * 订货单位地址（收货地址）
     */
    private String orderAddress;
    /**
     * 终端客户
     */
    private String terminalCutomer;
    /**
     * 终端地址
     */
    private String terminalAddress;
    /**
     *订货单位联系人
     */
    private String orderContact;
    /**
     * 联系人电话
     */
    private String contactTel;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 接单人
     */
    private String orderTaker;
    /**
     * 业务员
     */
    private String salesman;
    /**
     * 订单状态（1.未付款 未审核 2.已付款 已审核 待排产3.已排产4.已完成 5.待出库 6.已出库 ）
     */
    private Integer state;
    /**
     * 订单金额
     */
    private Float price;
    /**
     * 应付金额
     */
    private Float contractPay;
    /**
     * 实付金额(出库判断（实付金额=已付金额  已结清）)
     */
    private Float actualPay;
    /**
     * 订单总面积
     */
    private Float totalArea;
    /**
     * 付款方式（1.全款 2.首款 3.月结 4.已结清）
     */
    private String payment;
    /**
     * 订单备注
     */
    private String orderNotes;
    /**
     *产品小计
     */
    private Float productSubtotal;
    /**
     *订单所在生产工位
     */
    private String productionLocation;
    /**
     *操作人
     */
    private String operator;
    /**
     *操作IP
     */
    private Date operateTime;

    private String operateIp;

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics == null ? null : logistics.trim();
    }

    public String getPackingType() {
        return packingType;
    }

    public void setPackingType(String packingType) {
        this.packingType = packingType == null ? null : packingType.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public String getTerminalCutomer() {
        return terminalCutomer;
    }

    public void setTerminalCutomer(String terminalCutomer) {
        this.terminalCutomer = terminalCutomer == null ? null : terminalCutomer.trim();
    }

    public String getTerminalAddress() {
        return terminalAddress;
    }

    public void setTerminalAddress(String terminalAddress) {
        this.terminalAddress = terminalAddress == null ? null : terminalAddress.trim();
    }

    public String getOrderContact() {
        return orderContact;
    }

    public void setOrderContact(String orderContact) {
        this.orderContact = orderContact == null ? null : orderContact.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTaker() {
        return orderTaker;
    }

    public void setOrderTaker(String orderTaker) {
        this.orderTaker = orderTaker == null ? null : orderTaker.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getContractPay() {
        return contractPay;
    }

    public void setContractPay(Float contractPay) {
        this.contractPay = contractPay;
    }

    public Float getActualPay() {
        return actualPay;
    }

    public void setActualPay(Float actualPay) {
        this.actualPay = actualPay;
    }

    public Float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Float totalArea) {
        this.totalArea = totalArea;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes == null ? null : orderNotes.trim();
    }

    public Float getProductSubtotal() {
        return productSubtotal;
    }

    public void setProductSubtotal(Float productSubtotal) {
        this.productSubtotal = productSubtotal;
    }

    public String getProductionLocation() {
        return productionLocation;
    }

    public void setProductionLocation(String productionLocation) {
        this.productionLocation = productionLocation == null ? null : productionLocation.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}