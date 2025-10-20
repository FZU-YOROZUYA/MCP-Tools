package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.Order;
import com.yorozuya.mcp_tools.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    @Qualifier("OrderService")
    private OrderService orderService;

    @GetMapping("/find_all")
    public List<Order> findAll() {
        return orderService.getOrders();
    }

    @GetMapping("/find_by_id")
    public Order findById(@RequestParam("id") int id) {
        return orderService.findById(id);
    }

    @GetMapping("/find_by_user_id")
    public List<Order> findByUserId(@RequestParam("userId") int userId) {
        return orderService.findByUserId(userId);
    }

    @GetMapping("/find_by_product_id")
    public List<Order> findByProductId(@RequestParam("productId") int productId) {
        return orderService.findByProductId(productId);
    }

    @PostMapping("/insert")
    public int insertOrder(@RequestBody Order order) {
        return orderService.insertOrder(order);
    }

    @PostMapping("/update_by_id")
    public int updateById(@RequestBody Order order) {
        return orderService.updateOrderById(order);
    }

    @PostMapping("/delete_by_id")
    public int deleteById(@RequestParam("id") int id) {
        return orderService.deleteOrderById(id);
    }
}
