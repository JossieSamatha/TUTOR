package com.example.jwt.domain.service;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.respository.OrderRespository;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRespository orderRespository;
    public Order queryOrder(String pkId){
        return orderRespository.queryOrder(pkId);
    }
    public void addOrder(Order order){
//        order.setId(UUID.randomUUID().toString());
//        order.setKey(UUID.randomUUID().toString());
        order.setCrtTs(new Date());
        orderRespository.addOrder(order);
    }
}
