package com.erp.pojo;

/**
 * 仓位
 * @author zph2
 */
public class Space {
    /**
     *仓位ID
     */
    private Integer id;
    /**
     *仓位编号
     */
    private String spaceCode;
    /**
     *仓位状态(0.空 1.未空)
     */
    private Integer state;
    /**
     *仓位容量（成品装一个订单，其他的根据材料定）
     */
    private Float num;
    /**
     *货物编号
     */
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpaceCode() {
        return spaceCode;
    }

    public void setSpaceCode(String spaceCode) {
        this.spaceCode = spaceCode == null ? null : spaceCode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Float getNum() {
        return num;
    }

    public void setNum(Float num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}