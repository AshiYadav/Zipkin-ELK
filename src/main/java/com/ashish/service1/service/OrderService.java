package com.ashish.service1.service;

import com.ashish.service1.client.OrderClient;
import com.ashish.service1.controller.OrderController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderClient orderClient;
    Logger logger = LoggerFactory.getLogger(OrderService.class);

    public String callCartService(){
        logger.info("Inside OrderService class");
        orderClient.callCartService();
        return "Success";
    }
}
