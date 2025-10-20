package com.yorozuya.mcp_tools.service;

import com.yorozuya.mcp_tools.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product findById(int id);
    Product findByName(String name);
    int insertProduct(Product product);
    int updateProductById(Product product);
    int updateProductByName(Product product);
    int deleteProductById(int id);
    int deleteProductByName(String name);
}
