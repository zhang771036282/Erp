package com.erp.pojo;

/**
 * 配件
 * @author zph2
 */
public class Parts {
    /**
     *配件ID
     */
    private Integer id;
    /**
     *配件名称
     */
    private String name;
    /**
     *配件分类
     */
    private String type;
    /**
     *配件规格
     */
    private String spec;
    /**
     *配件数量
     */
    private Integer num;
    /**
     *配件编号
     */
    private String code;
    /**
     *配件单价
     */
    private Float price;
    /**
     *计价方式
     */
    private String valuationMethod;
    /**
     *供货商
     */
    private String supplier;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod == null ? null : valuationMethod.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }
}