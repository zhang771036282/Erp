package com.erp.pojo;

/**
 * 工位
 * @author zph2
 */
public class Station {
    /**
     *工位ID
     */
    private Integer id;
    /**
     *工位名称
     */
    private String name;
    /**
     *优先级
     */
    private Integer priority;

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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}