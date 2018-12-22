package com.erp.pojo;

/**
 * 膜皮
 * @author zph2
 */
public class Membrane {
    /**
     * 膜皮ID
     */
    private Integer id;
    /**
     * 膜皮编号
     */
    private String code;
    /**
     * 膜皮名称
     */
    private String name;
    /**
     * 膜皮单价
     */
    private Float price;
    /**
     * 膜皮数量
     */
    private Integer num;
    /**
     * 膜皮类型
     */
    private String type;
    /**
     * 膜皮颜色
     */
    private String color;
    /**
     * 计价方式
     */
    private String units;
    /**
     * 供应商
     */
    private String supplier;

    private String company;

    private String spec;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }
}