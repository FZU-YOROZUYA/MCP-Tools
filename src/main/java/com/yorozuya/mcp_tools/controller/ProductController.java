package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.Product;
import com.yorozuya.mcp_tools.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    @Qualifier("ProductService")
    private ProductService productService;

    @GetMapping("/find_all")
    public List<Product> findAll() {
        return productService.getProducts();
    }

    @GetMapping("/find_by_id")
    public Product findById(@RequestParam("id") int id) {
        return productService.findById(id);
    }

    @GetMapping("/find_by_name")
    public Product findByName(@RequestParam("name") String name) {
        return productService.findByName(name);
    }

    @PostMapping("/insert")
    public int insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @PostMapping("/update_by_id")
    public int updateById(@RequestBody Product product) {
        return productService.updateProductById(product);
    }

    @PostMapping("/update_by_name")
    public int updateByName(@RequestBody Product product) {
        return productService.updateProductByName(product);
    }

    @PostMapping("/delete_by_id")
    public int deleteById(@RequestParam("id") int id) {
        return productService.deleteProductById(id);
    }

    @PostMapping("/delete_by_name")
    public int deleteByName(@RequestParam("name") String name) {
        return productService.deleteProductByName(name);
    }
}
