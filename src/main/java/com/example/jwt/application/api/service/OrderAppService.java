package com.example.jwt.application.api.service;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAppService {
    @Autowired
    private OrderService orderService;
    public Order queryOrder(String pkId){
        return orderService.queryOrder(pkId);
    }
}
