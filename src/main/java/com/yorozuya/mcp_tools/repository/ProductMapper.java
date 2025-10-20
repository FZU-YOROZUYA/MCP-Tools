package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("ProductMapper")
public interface ProductMapper {
    List<Product> findAll();
    Product findById(@Param("pid") int id);
    Product findByName(@Param("name") String name);
    int insertProduct(Product product);
    int updateProductById(Product product);
    int updateProductByName(Product product);
    int deleteProductById(@Param("pid") int id);
    int deleteProductByName(@Param("name") String name);
}
