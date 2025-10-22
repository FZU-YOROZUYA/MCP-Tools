package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.Order;
import com.yorozuya.mcp_tools.service.OrderService;
import org.springframework.ai.tool.annotation.Tool;
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
    @Tool(name = "order_find_all", description = "查询所有订单信息")
    public List<Order> findAll() {
        return orderService.getOrders();
    }

    @GetMapping("/find_by_id")
    @Tool(name = "order_find_by_id", description = "根据订单 id 查询订单信息")
    public Order findById(@RequestParam("id") int id) {
        return orderService.findById(id);
    }

    @GetMapping("/find_by_user_id")
    @Tool(name = "order_find_by_user_id", description = "根据用户 id 查询订单信息")
    public List<Order> findByUserId(@RequestParam("userId") int userId) {
        return orderService.findByUserId(userId);
    }

    @GetMapping("/find_by_product_id")
    @Tool(name = "order_find_by_product_id", description = "根据商品 id 查询订单信息")
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
