package com.acme.shop.infrastructure.persistence.jpa.repo;

import com.acme.shop.infrastructure.persistence.jpa.entity.JpaProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataProductRepo extends JpaRepository<JpaProduct, UUID> {
    boolean existsByNameThOrNameEn(String nameTh, String nameEn);
}
