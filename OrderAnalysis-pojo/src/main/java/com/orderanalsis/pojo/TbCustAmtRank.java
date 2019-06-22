package com.orderanalsis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbCustAmtRank implements Serializable{
    private Integer id;

    private Integer custId;

    private String mobile;

    private BigDecimal payableAmount;

    private BigDecimal realAmount;

    private Integer rank;

    private BigDecimal beatPeopleRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public BigDecimal getBeatPeopleRate() {
        return beatPeopleRate;
    }

    public void setBeatPeopleRate(BigDecimal beatPeopleRate) {
        this.beatPeopleRate = beatPeopleRate;
    }
}