package com.ironhack.edgeproductservice.client;

import com.ironhack.edgeproductservice.model.StoreProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient("store-products-service")
public interface StoreProductClient {

    @GetMapping("/store-product/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StoreProduct getProduct(@PathVariable("id") Integer id);
}
