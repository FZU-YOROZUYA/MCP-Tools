package com.yorozuya.mcp_tools.service.impl;

import com.yorozuya.mcp_tools.domain.Product;
import com.yorozuya.mcp_tools.repository.ProductMapper;
import com.yorozuya.mcp_tools.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    @Qualifier("ProductMapper")
    private ProductMapper productMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public List<Product> getProducts() {
        return productMapper.findAll();
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public Product findById(int id) {
        return productMapper.findById(id);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public Product findByName(String name) {
        return productMapper.findByName(name);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int updateProductById(Product product) {
        return productMapper.updateProductById(product);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int updateProductByName(Product product) {
        return productMapper.updateProductByName(product);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int deleteProductById(int id) {
        return productMapper.deleteProductById(id);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int deleteProductByName(String name) {
        return productMapper.deleteProductByName(name);
    }
}
