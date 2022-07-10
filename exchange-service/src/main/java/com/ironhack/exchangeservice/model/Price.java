package com.ironhack.exchangeservice.model;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {

    private BigDecimal priceAmount;
    private Currency priceCurrency;

    public Price() {
    }

    public Price(BigDecimal priceAmount, Currency priceCurrency) {
        setPriceAmount(priceAmount);
        setPriceCurrency(priceCurrency);
    }

    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(BigDecimal priceAmount) {
        this.priceAmount = priceAmount;
    }

    public Currency getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(Currency priceCurrency) {
        this.priceCurrency = priceCurrency;
    }
}
