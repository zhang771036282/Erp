package com.erp.pojo;

/**
 * 系列
 * @author zph2
 */
public class DoorTypeSeries {
    /**
     * 系列ID
     */
    private Integer id;
    /**
     * 系列名称
     */
    private String name;
    /**
     * 折扣
     */
    private Float discount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}