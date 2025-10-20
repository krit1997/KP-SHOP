package com.acme.shop.application.usecase.product;

import com.acme.shop.application.dto.ProductCommands;
import com.acme.shop.application.dto.ProductQueries;

public interface CreateProductUseCase {
    ProductQueries.ProductView handle(ProductCommands.CreateProductCmd cmd);
}
