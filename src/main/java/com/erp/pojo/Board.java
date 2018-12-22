package com.erp.pojo;

/**
 * 基材
 * @author zph2
 */
public class Board {

    /**
     * 基材ID
     */
    private Integer id;
    /**
     * 基材编号
     */
    private String code;
    /**
     * 基材名称
     */
    private String name;
    /**
     * 基材单价
     */
    private Float price;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 计价单位（㎡/m）
     */
    private String units;
    /**
     * 供货商
     */
    private String supplier;
    /**
     * 单位
     */
    private String company;
    /**
     * 规格
     */
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