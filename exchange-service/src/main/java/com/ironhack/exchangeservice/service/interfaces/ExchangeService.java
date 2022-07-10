package com.ironhack.exchangeservice.service.interfaces;

import com.ironhack.exchangeservice.model.Price;
import com.ironhack.exchangeservice.controller.dto.PriceDto;

public interface ExchangeService {

    Price convert(PriceDto priceDto, String currency);
}
