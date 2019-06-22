package com.orderanalsis.pojo;

import java.io.Serializable;

public class TbDateCityGoodsCount implements Serializable{
    private Integer id;

    private String cdate;

    private Integer cityId;

    private Integer goodsId;

    private Integer cntBuyCustD;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCntBuyCustD() {
        return cntBuyCustD;
    }

    public void setCntBuyCustD(Integer cntBuyCustD) {
        this.cntBuyCustD = cntBuyCustD;
    }
}