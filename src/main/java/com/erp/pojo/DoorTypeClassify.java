package com.erp.pojo;

/**
 * 门型分类
 * @author zph2
 */
public class DoorTypeClassify {
    /**
     * 门型分类ID
     */
    private Integer id;
    /**
     * 门型分类名称
     */
    private String name;
    /**
     * 分类加价(元)
     */
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