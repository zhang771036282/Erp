package com.erp.pojo;

/**
 * 经销商
 * @author zph2
 */
public class Dealer {
    /**
     * 经销商ID
     */
    private Integer id;
    /**
     * 经销商名称
     */
    private String name;
    /**
     * 经销商地址
     */
    private String address;
    /**
     * 经销商额度
     */
    private Float amount;
    /**
     * 等级ID
     */
    private Integer levelId;
    /**
     * 经销商电话
     */
    private String phone;
    /**
     * 业务员
     */
    private String saleman;
    /**
     * 经销商状态
     */
    private String state;
    /**
     * 常用物流
     */
    private String logistics;
    /**
     * 消费金额
     */
    private Float monetary;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman == null ? null : saleman.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics == null ? null : logistics.trim();
    }

    public Float getMonetary() {
        return monetary;
    }

    public void setMonetary(Float monetary) {
        this.monetary = monetary;
    }
}