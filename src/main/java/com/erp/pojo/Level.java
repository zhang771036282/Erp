package com.erp.pojo;

public class Level {
    private Integer id;

    private String name;

    private Float upperLimit;

    private Float floorLimit;

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