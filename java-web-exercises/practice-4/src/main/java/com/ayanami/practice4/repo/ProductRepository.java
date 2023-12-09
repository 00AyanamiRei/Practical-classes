package com.ayanami.practice4.repo;

import com.ayanami.practice4.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAll(Specification<Product> spec, Pageable pageable);

    List<Product> findAllByCategoryId(Long categoryId);
}
