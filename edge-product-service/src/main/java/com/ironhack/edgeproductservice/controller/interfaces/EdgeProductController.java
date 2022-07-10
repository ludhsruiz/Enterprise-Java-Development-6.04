package com.ironhack.edgeproductservice.controller.interfaces;

import com.ironhack.edgeproductservice.model.StoreProduct;

import java.util.Currency;

public interface EdgeProductController {

    StoreProduct productInOtherCurrency(Integer productId, Currency currency);
}
