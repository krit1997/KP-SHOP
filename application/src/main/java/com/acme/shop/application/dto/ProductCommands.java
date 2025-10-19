package com.acme.shop.application.dto;

import java.math.BigDecimal;

public class ProductCommands {
    public record CreateProductCmd(String nameTh, String nameEn, BigDecimal price, String imagesJson) {
    }


}
