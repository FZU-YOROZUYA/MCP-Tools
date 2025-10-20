package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.McpToolsApplication;
import com.yorozuya.mcp_tools.domain.Product;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest(classes = McpToolsApplication.class)
public class TestProductMapper {
    @Resource
    private ProductMapper productMapper;

    @Test
    public void testFindAll(){
        Product product = new Product();
        product.setName("苹果");
        product.setDescription("新鲜苹果");
        product.setPrice(new BigDecimal("5.00"));
        product.setStock(100);
        productMapper.insertProduct(product);

        Product product2 = new Product();
        product2.setName("香蕉");
        product2.setDescription("黄色香蕉");
        product2.setPrice(new BigDecimal("3.50"));
        product2.setStock(50);
        productMapper.insertProduct(product2);

        List<Product> products = productMapper.findAll();

        System.out.println(productMapper.findById(1));

        Product updateProduct = new Product();
        updateProduct.setId(1);
        updateProduct.setName("红苹果");
        updateProduct.setStock(80);
        productMapper.updateProductById(updateProduct);


        productMapper.deleteProductById(2);
        products = productMapper.findAll();

        productMapper.deleteProductByName("红苹果");
        products = productMapper.findAll();
    }
}
