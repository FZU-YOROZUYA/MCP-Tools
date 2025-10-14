create DATABASE  db_ecommerce;

use db_ecommerce;

create table if not exists tb_users (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户ID',
    `username` VARCHAR(50) NOT NULL UNIQUE COMMENT '用户名',
    `password` VARCHAR(255) NOT NULL COMMENT '密码',
    `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间'
)ENGINE=InnoDB COMMENT='用户表';

CREATE TABLE IF NOT EXISTS tb_products (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '商品ID',
    `name` VARCHAR(100) NOT NULL COMMENT '商品名称',
    `description` TEXT COMMENT '商品描述',
    `price` DECIMAL(10,2) NOT NULL COMMENT '价格',
    `stock` INT DEFAULT 0 COMMENT '库存数量',
    `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
) ENGINE=InnoDB COMMENT='商品表';

CREATE TABLE IF NOT EXISTS tb_orders (
      `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT '订单ID',
      `user_id` INT NOT NULL COMMENT '购买用户ID',
      `product_id` INT NOT NULL COMMENT '商品ID',
      `quantity` INT NOT NULL CHECK (quantity > 0) COMMENT '购买数量',
      `total_price` DECIMAL(10,2) NOT NULL COMMENT '订单总价',
      `created_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '下单时间'
) ENGINE=InnoDB COMMENT='购买记录表';


