package com.yorozuya.mcp_tools.service;

import com.yorozuya.mcp_tools.domain.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    Order findById(int id);
    List<Order> findByUserId(int userId);
    List<Order> findByProductId(int productId);
    int insertOrder(Order order);
    int updateOrderById(Order order);
    int deleteOrderById(int id);
}
