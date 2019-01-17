package com.erp.pojo;

public class CalcCoefficients {
    private Integer id;

    private String name;

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