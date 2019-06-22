package com.orderanalsis.pojo;

import java.io.Serializable;

public class TbOrderCityD implements Serializable{
    private Integer id;

    private Integer cityId;

    private Integer cntOrdSuccD;

    private Integer cntOrdCacelD;

    private Integer cntOrdD;

    private Integer cntOrdUser;
    
    private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCntOrdSuccD() {
        return cntOrdSuccD;
    }

    public void setCntOrdSuccD(Integer cntOrdSuccD) {
        this.cntOrdSuccD = cntOrdSuccD;
    }

    public Integer getCntOrdCacelD() {
        return cntOrdCacelD;
    }

    public void setCntOrdCacelD(Integer cntOrdCacelD) {
        this.cntOrdCacelD = cntOrdCacelD;
    }

    public Integer getCntOrdD() {
        return cntOrdD;
    }

    public void setCntOrdD(Integer cntOrdD) {
        this.cntOrdD = cntOrdD;
    }

    public Integer getCntOrdUser() {
        return cntOrdUser;
    }

    public void setCntOrdUser(Integer cntOrdUser) {
        this.cntOrdUser = cntOrdUser;
    }
}