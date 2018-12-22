package com.erp.pojo;

/**
 * 工序
 * @author zph2
 */
public class Process {
    /**
     *工序ID
     */
    private Integer id;
    /**
     *工序名称
     */
    private String name;
    /**
     *工艺ID
     */
    private Integer craftId;

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

    public Integer getCraftId() {
        return craftId;
    }

    public void setCraftId(Integer craftId) {
        this.craftId = craftId;
    }
}