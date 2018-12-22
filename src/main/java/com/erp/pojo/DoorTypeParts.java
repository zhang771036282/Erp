package com.erp.pojo;

/**
 * 门型配件
 * @author zph2
 */
public class DoorTypeParts {
    /**
     * 门型配件ID
     */
    private Integer id;
    /**
     * 门型
     */
    private String type;
    /**
     * 配件
     */
    private String parts;
    /**
     * 配件数量
     */
    private Integer partsNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts == null ? null : parts.trim();
    }

    public Integer getPartsNum() {
        return partsNum;
    }

    public void setPartsNum(Integer partsNum) {
        this.partsNum = partsNum;
    }
}