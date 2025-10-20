package com.acme.shop.application.dto;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductQueries {
    public record ProductView(UUID id, String nameTh, String nameEn, BigDecimal price, String status,
                              String imagesJson) {
    }
}
