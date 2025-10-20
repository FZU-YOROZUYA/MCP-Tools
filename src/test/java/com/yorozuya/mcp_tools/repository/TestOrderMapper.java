package com.yorozuya.mcp_tools.repository;

import com.yorozuya.mcp_tools.McpToolsApplication;
import com.yorozuya.mcp_tools.domain.Order;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest(classes = McpToolsApplication.class)
public class TestOrderMapper {
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testFindAll(){
        Order order = new Order();
        order.setId(1);
        order.setUserId(1);
        order.setProductId(1);
        order.setQuantity(2);
        order.setTotalPrice(new BigDecimal("10.00"));
        orderMapper.insertOrder(order);

        Order order2 = new Order();
        order2.setId(2);
        order2.setUserId(2);
        order2.setProductId(2);
        order2.setQuantity(1);
        order2.setTotalPrice(new BigDecimal("3.50"));
        orderMapper.insertOrder(order2);

        List<Order> orders = orderMapper.findAll();
        System.out.println("==========================================================");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        System.out.println("==========================================================");
        System.out.println(orderMapper.findById(1));

        List<Order> userOrders = orderMapper.findByUserId(1);
        System.out.println("==========================================================");
        for (Order o : userOrders){
            System.out.println(o.toString());
        }

        List<Order> productOrders = orderMapper.findByProductId(2);
        System.out.println("==========================================================");
        for (Order o : productOrders){
            System.out.println(o.toString());
        }

        Order updateOrder = new Order();
        updateOrder.setId(1);
        updateOrder.setQuantity(3);
        updateOrder.setTotalPrice(new BigDecimal("15.00"));
        orderMapper.updateOrderById(updateOrder);

        System.out.println("==========================================================");
        System.out.println(orderMapper.findById(1).toString());

        orderMapper.deleteOrderById(2);
        orders = orderMapper.findAll();
        System.out.println("==========================================================");
        for (Order o : orders){
            System.out.println(o.toString());
        }

        orderMapper.deleteOrderById(1);
        orders = orderMapper.findAll();
        System.out.println("==========================================================");
        for (Order o : orders){
            System.out.println(o.toString());
        }
        System.out.println("==========================================================");
    }
}
