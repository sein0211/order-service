package com.example.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/info")
    public String info(@Value("${server.port}") String port) {
        return "Order 서비스의 기본 동작 Port: {" + port + "}";
    }

    @Value("${server.port}")
    private int port;

    @GetMapping("/order/{data}")
    public String payNow(@PathVariable int data) {
        return "order with " + data + " & service port : " + port;
    }
}
