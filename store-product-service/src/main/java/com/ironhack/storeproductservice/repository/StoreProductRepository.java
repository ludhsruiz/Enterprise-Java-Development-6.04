package com.ironhack.storeproductservice.repository;

import com.ironhack.storeproductservice.model.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreProductRepository extends JpaRepository<StoreProduct, Integer> {
}

