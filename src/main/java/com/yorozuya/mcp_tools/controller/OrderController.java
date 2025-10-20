package com.yorozuya.mcp_tools.controller;

import com.yorozuya.mcp_tools.domain.Order;
import com.yorozuya.mcp_tools.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    @Qualifier("OrderService")
    private OrderService orderService;

    @GetMapping("/orders")
    @ResponseBody
    public List<Order> findAll() {
        return orderService.getOrders();
    }

    @GetMapping("/order/id")
    @ResponseBody
    public Order findById(@RequestParam("id") int id) {
        return orderService.findById(id);
    }

    @GetMapping("/order/user")
    @ResponseBody
    public List<Order> findByUserId(@RequestParam("userId") int userId) {
        return orderService.findByUserId(userId);
    }

    @GetMapping("/order/product")
    @ResponseBody
    public List<Order> findByProductId(@RequestParam("productId") int productId) {
        return orderService.findByProductId(productId);
    }

    @PostMapping("/insertOrder")
    @ResponseBody
    public int insertOrder(@RequestBody Order order) {
        return orderService.insertOrder(order);
    }

    @PostMapping("/updateOrderById")
    @ResponseBody
    public int updateById(@RequestBody Order order) {
        return orderService.updateOrderById(order);
    }

    @PostMapping("/deleteOrderById")
    @ResponseBody
    public int deleteById(@RequestParam("id") int id) {
        return orderService.deleteOrderById(id);
    }
}
