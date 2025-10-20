package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("OrderMapper")
public interface OrderMapper {
    List<Order> findAll();
    Order findById(@Param("oid") int id);
    List<Order> findByUserId(@Param("userId") int userId);
    List<Order> findByProductId(@Param("productId") int productId);
    int insertOrder(Order order);
    int updateOrderById(Order order);
    int deleteOrderById(@Param("oid") int id);
}
