package com.yorozuya.mcp_tools.service.impl;

import com.yorozuya.mcp_tools.domain.Order;
import com.yorozuya.mcp_tools.repository.OrderMapper;
import com.yorozuya.mcp_tools.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    @Qualifier("OrderMapper")
    private OrderMapper orderMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public List<Order> getOrders() {
        return orderMapper.findAll();
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public Order findById(int id) {
        return orderMapper.findById(id);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public List<Order> findByUserId(int userId) {
        return orderMapper.findByUserId(userId);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public List<Order> findByProductId(int productId) {
        return orderMapper.findByProductId(productId);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int updateOrderById(Order order) {
        return orderMapper.updateOrderById(order);
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public int deleteOrderById(int id) {
        return orderMapper.deleteOrderById(id);
    }
}
