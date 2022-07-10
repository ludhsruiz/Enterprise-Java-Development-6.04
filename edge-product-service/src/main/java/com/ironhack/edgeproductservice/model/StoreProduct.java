package com.ironhack.edgeproductservice.model;

import java.math.BigDecimal;
import java.util.Currency;

public class StoreProduct {

    private Integer id;
    private String productName;
    private BigDecimal price;
    private Currency currency;

    public StoreProduct() {
    }

    public StoreProduct(String productName, BigDecimal price, Currency currency) {
        this.productName = productName;
        this.price = price;
        this.currency = currency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
