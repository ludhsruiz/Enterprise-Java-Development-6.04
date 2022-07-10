package com.ironhack.exchangeservice.controller.interfaces;

import com.ironhack.exchangeservice.model.Price;
import com.ironhack.exchangeservice.controller.dto.PriceDto;

public interface ExchangeController {

    public Price convert(PriceDto priceDto, String currencyToConvert);
}
