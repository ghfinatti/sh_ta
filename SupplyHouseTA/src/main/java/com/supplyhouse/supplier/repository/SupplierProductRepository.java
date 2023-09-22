package com.supplyhouse.supplier.repository;

import com.supplyhouse.supplier.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierProductRepository extends JpaRepository<Product, Long> {
}
