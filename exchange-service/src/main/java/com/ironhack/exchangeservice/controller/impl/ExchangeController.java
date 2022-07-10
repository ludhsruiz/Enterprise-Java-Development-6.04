package com.ironhack.exchangeservice.controller.impl;

import com.ironhack.exchangeservice.model.Price;
import com.ironhack.exchangeservice.controller.dto.PriceDto;
import com.ironhack.exchangeservice.service.interfaces.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExchangeController implements com.ironhack.exchangeservice.controller.interfaces.ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @PostMapping("/exchange/{currencyToConvert}")
    public Price convert(@RequestBody PriceDto priceDto, @PathVariable String currencyToConvert){
        return exchangeService.convert(priceDto, currencyToConvert);
    }
}
