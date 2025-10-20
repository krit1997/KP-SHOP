package com.acme.shop.domain.port.out;

import com.acme.shop.domain.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
    Product save(Product p);

    Optional<Product> findById(UUID id);

    List<Product> findAll(int page, int size);

    boolean existsByNameThOrNameEn(String nameTh, String nameEn);
}
