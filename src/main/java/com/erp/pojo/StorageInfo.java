package com.erp.pojo;

import java.util.Date;

/**
 * 出入库明细
 * @author zph2
 */
public class StorageInfo {
    /**
     *出入库ID
     */
    private Integer id;
    /**
     *出入库名称
     */
    private String name;
    /**
     *出入库数量
     */
    private Integer num;
    /**
     *出入库人
     */
    private String operator;
    /**
     *出入库时间
     */
    private Date time;
    /**
     *出入库编号
     */
    private String code;
    /**
     *货物编号
     */
    private String cargoCode;
    /**
     *出入库类型 （1 原材料 2 半成品 3 成品）
     */
    private String type;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCargoCode() {
        return cargoCode;
    }

    public void setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode == null ? null : cargoCode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}