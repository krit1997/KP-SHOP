//package com.acme.shop.infrastructure.persistence.jpa.adapter;
//
//import com.acme.shop.domain.model.Product;
//import com.acme.shop.domain.port.out.ProductRepository;
//import com.acme.shop.infrastructure.persistence.jpa.entity.JpaProduct;
//import com.acme.shop.infrastructure.persistence.jpa.mapper.JpaProductMapper;
//import com.acme.shop.infrastructure.persistence.jpa.repo.SpringDataProductRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Component
//@RequiredArgsConstructor
//@Transactional(readOnly = true)
//public class ProductRepositoryJpaAdapter implements ProductRepository {
//    private final SpringDataProductRepo repo;
//    private final JpaProductMapper mapper;
//
//    @Override
//    @Transactional
//    public Product save(Product p) {
//        if (p.getId() == null) p.setId(UUID.randomUUID());
//        JpaProduct saved = repo.save(mapper.toJpa(p));
//        return mapper.toDomain(saved);
//    }
//
//    @Override
//    public Optional<Product> findById(UUID id) {
//        return repo.findById(id).map(mapper::toDomain);
//    }
//
//    @Override
//    public List<Product> findAll(int page, int size) {
//        return repo.findAll(PageRequest.of(page, size))
//                .map(mapper::toDomain)
//                .getContent();
//    }
//
//    @Override
//    public boolean existsByNameThOrNameEn(String th, String en) {
//        return repo.existsByNameThOrNameEn(th, en);
//    }
//
//}
