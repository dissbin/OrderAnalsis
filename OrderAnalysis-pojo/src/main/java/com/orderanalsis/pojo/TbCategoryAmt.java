package com.orderanalsis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbCategoryAmt implements Serializable{
    private Integer id;

    private String categoryName;

    private BigDecimal goodsSellAmt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public BigDecimal getGoodsSellAmt() {
        return goodsSellAmt;
    }

    public void setGoodsSellAmt(BigDecimal goodsSellAmt) {
        this.goodsSellAmt = goodsSellAmt;
    }
}