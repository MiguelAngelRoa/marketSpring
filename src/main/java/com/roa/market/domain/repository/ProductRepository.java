package com.roa.market.domain.repository;

import com.roa.market.domain.Product;
import com.roa.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Producto> getAll();
    Optional<List<Producto>> getByCategory(int categoryId);
    Optional<List<Producto>> getScarseProducts(int quantity);
    Optional<Producto> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
