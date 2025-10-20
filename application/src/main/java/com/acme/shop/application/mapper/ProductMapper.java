package com.acme.shop.application.mapper;

import com.acme.shop.application.dto.ProductCommands;
import com.acme.shop.application.dto.ProductQueries;
import com.acme.shop.domain.model.Product;
import org.mapstruct.Mapper;

@Mapper()
public interface ProductMapper {
    Product toDomain(ProductCommands.CreateProductCmd cmd);
    ProductQueries.ProductView toView(Product domain);
}
