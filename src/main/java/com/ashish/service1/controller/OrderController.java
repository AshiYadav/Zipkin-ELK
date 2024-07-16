package com.ashish.service1.controller;

import com.ashish.service1.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderService")
public class OrderController {
    private OrderService orderService;
    Logger logger = LoggerFactory.getLogger(OrderController.class);
    OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public ResponseEntity printService1(){
        logger.info("Inside OrderController class");
        logger.info("Now going to call callCartService method");
        return ResponseEntity.ok(orderService.callCartService());
    }
}
