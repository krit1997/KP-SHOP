package com.acme.shop.infrastructure.persistence.jpa.entity;

import com.acme.shop.domain.model.ProductStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "product")
public class JpaProduct {
    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;
    private String nameTh;
    private String nameEn;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private ProductStatus status;
    @Column(columnDefinition = "text")
    private String imagesJson;
// created_at, updated_at (via auditing) – optional
}
