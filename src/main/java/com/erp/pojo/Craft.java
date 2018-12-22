package com.erp.pojo;

/**
 * 工艺
 * @author zph2
 */
public class Craft {
    /**
     * 工艺ID
     */
    private Integer id;
    /**
     * 工艺名称
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