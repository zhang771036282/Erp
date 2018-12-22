package com.erp.pojo;

/**
 * 计算系数
 * @author zph2
 */
public class CalcCoefficients {
    /**
     *计算系数ID
     */
    private Integer id;
    /**
     * 计算系数名称
     */
    private String name;
    /**
     * 计算系数表达式
     */
    private String calcFormulas;

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

    public String getCalcFormulas() {
        return calcFormulas;
    }

    public void setCalcFormulas(String calcFormulas) {
        this.calcFormulas = calcFormulas == null ? null : calcFormulas.trim();
    }
}