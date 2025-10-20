package com.acme.shop.infrastructure.persistence.jpa.mapper;

import com.acme.shop.domain.model.Product;
import com.acme.shop.infrastructure.persistence.jpa.entity.JpaProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class JpaProductMapper {
    JpaProduct toJpa(Product domain) {
        return null;
    }

    Product toDomain(JpaProduct jpa) {
        return null;
    }
}

