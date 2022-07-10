package com.ironhack.storeproductservice.controller.impl;

import com.ironhack.storeproductservice.model.StoreProduct;
import com.ironhack.storeproductservice.repository.StoreProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class StoreProductControllerImpl {

    @Autowired
    private StoreProductRepository storeProductRepository;

    @GetMapping("/store-product/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StoreProduct getProduct(@PathVariable("id") Integer id){
        Optional<StoreProduct> product = storeProductRepository.findById(id);
        if (product.isPresent()){
            return product.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There is no product with this id");
        }
    }
}
