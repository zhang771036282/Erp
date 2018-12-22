package com.erp.pojo;

/**
 * 子账号
 * @author zph2
 */
public class BypassAccount {
    /**
     * 子账号ID
     */
    private Integer id;
    /**
     * 子账号用户名
     */
    private String username;
    /**
     * 子账号密码
     */
    private String password;
    /**
     * 对应经销商
     */
    private Integer dealerId;
    /**
     * 状态
     */
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}