package com.erp.pojo;

import java.util.Date;

/**
 * 财务审核
 * @author zph2
 */
public class Verify {
    /**
     * id
     */
    private Integer id;
    /**
     *审核人
     */
    private String verifier;
    /**
     *审核时间
     */
    private Date time;
    /**
     *审核状态(1 财务审核 2 出库审核)
     */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}