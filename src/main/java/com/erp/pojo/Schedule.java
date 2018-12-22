package com.erp.pojo;

import java.util.Date;

/**
 * 排产
 * @author zph2
 */
public class Schedule {
    /**
     *排产ID
     */
    private Integer id;
    /**
     *排产批次
     */
    private String batch;
    /**
     *排产时间
     */
    private Date time;
    /**
     *排产人
     */
    private String producer;
    /**
     *ddid
     */
    private Integer ddid;
    /**
     *排产状态
     */
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public Integer getDdid() {
        return ddid;
    }

    public void setDdid(Integer ddid) {
        this.ddid = ddid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}