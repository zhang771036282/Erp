package com.erp.pojo;

/**
 * 门型
 * @author zph2
 */
public class DoorType {
    /**
     * 门型ID
     */
    private Integer id;
    /**
     * 门型编号
     */
    private String code;
    /**
     * 门型名称
     */
    private String name;
    /**
     * 门型单价
     */
    private Float price;
    /**
     * 门型数量
     */
    private Integer num;
    /**
     * 最大宽度(mm)
     */
    private Float maxWidth;
    /**
     * 最小宽度(mm)
     */
    private Float minWidth;
    /**
     * 最大高度(mm)
     */
    private Float maxHeight;
    /**
     * 最小高度(mm)
     */
    private Float minHeight;
    /**
     * 计价单位
     */
    private String units;
    /**
     * 门型分类ID
     */
    private Integer classifyId;
    /**
     * 门型系列ID
     */
    private Integer seriesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Float maxWidth) {
        this.maxWidth = maxWidth;
    }

    public Float getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(Float minWidth) {
        this.minWidth = minWidth;
    }

    public Float getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Float maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Float getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(Float minHeight) {
        this.minHeight = minHeight;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }
}