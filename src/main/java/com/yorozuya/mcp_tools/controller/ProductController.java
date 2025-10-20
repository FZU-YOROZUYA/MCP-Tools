package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.Product;
import com.yorozuya.mcp_tools.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    @Qualifier("ProductService")
    private ProductService productService;

    @GetMapping("/products")
    @ResponseBody
    public List<Product> findAll() {
        return productService.getProducts();
    }

    @GetMapping("/product/id")
    @ResponseBody
    public Product findById(@RequestParam("id") int id) {
        return productService.findById(id);
    }

    @GetMapping("/product/name")
    @ResponseBody
    public Product findByName(@RequestParam("name") String name) {
        return productService.findByName(name);
    }

    @PostMapping("/insertProduct")
    @ResponseBody
    public int insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

    @PostMapping("/updateProductById")
    @ResponseBody
    public int updateById(@RequestBody Product product) {
        return productService.updateProductById(product);
    }

    @PostMapping("/updateProductByName")
    @ResponseBody
    public int updateByName(@RequestBody Product product) {
        return productService.updateProductByName(product);
    }

    @PostMapping("/deleteProductById")
    @ResponseBody
    public int deleteById(@RequestParam("id") int id) {
        return productService.deleteProductById(id);
    }

    @PostMapping("/deleteProductByName")
    @ResponseBody
    public int deleteByName(@RequestParam("name") String name) {
        return productService.deleteProductByName(name);
    }
}
