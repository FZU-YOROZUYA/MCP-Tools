package com.yorozuya.mcp_tools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yorozuya.mcp_tools.repository")
public class McpToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpToolsApplication.class, args);
    }

}
