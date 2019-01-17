package com.erp.pojo;

public class DoorTypeClassify {
    private Integer id;

    private String name;

    private Float classifyPrice;

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

    public Float getClassifyPrice() {
        return classifyPrice;
    }

    public void setClassifyPrice(Float classifyPrice) {
        this.classifyPrice = classifyPrice;
    }
}