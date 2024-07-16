package com.ashish.service1.client;

import com.ashish.service1.controller.OrderController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OrderClient {


//    private RestTemplate restTemplate = new RestTemplate();
    @Autowired
    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(OrderClient.class);

    public void callCartService(){
        logger.info("Inside OrderClient class");
        logger.info("Going to cart service");
        //restTemplate.getForEntity("http://localhost:8081/service/cart", null);
        ResponseEntity<String> response
                = restTemplate.getForEntity("http://localhost:8081/cartService/cart", String.class);
//        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);

    }
}
