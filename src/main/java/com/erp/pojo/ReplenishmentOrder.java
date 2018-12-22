package com.erp.pojo;

/**
 * 补单
 * @author zph2
 */
public class ReplenishmentOrder {
    /**
     *补单ID
     */
    private Integer id;
    /**
     *原订单编号
     */
    private String orderCode;
    /**
     *补单订单编号
     */
    private String code;
    /**
     *补单类型(厂内补单,厂外补单)
     */
    private String type;
    /**
     *备注
     */
    private String remark;
    /**
     *DDID
     */
    private Integer ddid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }
}