package com.example.jwt.domain.service;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.respository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRespository orderRespository;
    public Order queryOrder(String pkId){
        return orderRespository.queryOrder(pkId);
    }
}
