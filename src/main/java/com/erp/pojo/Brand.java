package com.erp.pojo;

/**
 * 品牌
 * @author zph2
 */
public class Brand {
    /**
     * 品牌ID
     */
    private Integer id;
    /**
     * 品牌名称
     */
    private String name;

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
}