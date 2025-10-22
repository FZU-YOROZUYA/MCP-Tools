package com.yorozuya.mcp_tools.tools;


import com.yorozuya.mcp_tools.controller.OrderController;
import com.yorozuya.mcp_tools.controller.ProductController;
import com.yorozuya.mcp_tools.controller.UserController;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolRegisters{

    @Bean
    public ToolCallbackProvider mcpTools(OrderController orderController, UserController userController, ProductController productController){
        return MethodToolCallbackProvider.builder()
                .toolObjects(orderController, userController, productController).build();
    }

}