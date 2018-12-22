package com.erp.pojo;

import java.util.Date;

/**
 * 生产
 * @author zph2
 */
public class Production {
    /**
     *生产ID
     */
    private Integer id;
    /**
     *DDID
     */
    private Integer ddid;
    /**
     *订单编号
     */
    private String orderCode;
    /**
     *数量
     */
    private Integer num;
    /**
     *完成时间
     */
    private Date finishTime;
    /**
     *剩余时间
     */
    private Integer remainingTime;
    /**
     *总板件数
     */
    private Integer sum;
    /**
     *订单颜色
     */
    private String orderColor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(Integer remainingTime) {
        this.remainingTime = remainingTime;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public String getOrderColor() {
        return orderColor;
    }

    public void setOrderColor(String orderColor) {
        this.orderColor = orderColor == null ? null : orderColor.trim();
    }
}