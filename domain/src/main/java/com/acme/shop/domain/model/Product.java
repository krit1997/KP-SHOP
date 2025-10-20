package com.acme.shop.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Product {
    private UUID id;
    private String nameTh;
    private String nameEn;
    private BigDecimal price;
    private ProductStatus status; // ACTIVE, INACTIVE
    private String imagesJson; // simple for MVP
}
