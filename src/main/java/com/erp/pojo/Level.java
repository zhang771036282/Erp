package com.erp.pojo;

/**
 * 等级
 * @author zph2
 */
public class Level {
    /**
     * 等级ID
     */
    private Integer id;
    /**
     * 等级名称
     */
    private String name;
    /**
     * 等级上限（元）
     */
    private Float upperLimit;
    /**
     * 等级下限(元)
     */
    private Float floorLimit;
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

    public Float getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Float upperLimit) {
        this.upperLimit = upperLimit;
    }

    public Float getFloorLimit() {
        return floorLimit;
    }

    public void setFloorLimit(Float floorLimit) {
        this.floorLimit = floorLimit;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}