package com.ferreira.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreira.auth.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
