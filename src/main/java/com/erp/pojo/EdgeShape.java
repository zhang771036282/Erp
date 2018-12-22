package com.erp.pojo;

/**
 * 边型
 * @author zph2
 */
public class EdgeShape {
    /**
     * 边型ID
     */
    private Integer id;
    /**
     * 边型编号
     */
    private String code;
    /**
     * 边型名称
     */
    private String name;
    /**
     * 边型单价
     */
    private Float price;
    /**
     * 边型数量
     */
    private Integer num;
    /**
     * 计价方式
     */
    private String units;

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

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }
}