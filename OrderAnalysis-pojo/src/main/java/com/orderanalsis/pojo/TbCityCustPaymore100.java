package com.orderanalsis.pojo;

import java.io.Serializable;

public class TbCityCustPaymore100 implements Serializable{
    private Integer id;

    private Integer cityId;

    private Integer custId;

    public String getYm() {
		return ym;
	}

	public void setYm(String ym) {
		this.ym = ym;
	}

	private String ym;

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

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }


}