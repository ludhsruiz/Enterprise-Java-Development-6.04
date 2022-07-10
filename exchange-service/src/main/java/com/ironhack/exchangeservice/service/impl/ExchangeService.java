package com.ironhack.exchangeservice.service.impl;

import com.ironhack.exchangeservice.model.Price;
import com.ironhack.exchangeservice.controller.dto.PriceDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.Currency;

@Service
public class ExchangeService implements com.ironhack.exchangeservice.service.interfaces.ExchangeService {

    public Price convert(PriceDto priceDto, String currency) {
        Price convertedPrice=new Price();

        try {
            convertedPrice.setPriceCurrency(Currency.getInstance(currency));
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "This currency not exist");
        }
        switch (currency){
            case "EUR":
                convertedPrice.setPriceAmount(priceDto.getPriceAmount().multiply(new BigDecimal("0.83")));
                break;
            case "INR":
                convertedPrice.setPriceAmount(priceDto.getPriceAmount().multiply(new BigDecimal("72.88")));
                break;
            case "GBP":
                convertedPrice.setPriceAmount(priceDto.getPriceAmount().multiply(new BigDecimal("0.72")));
                break;
            case "CHF":
                convertedPrice.setPriceAmount(priceDto.getPriceAmount().multiply(new BigDecimal("0.89")));
                break;
            default:
                throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "Is not implemented yet");
        }
        return convertedPrice;
    }
}
