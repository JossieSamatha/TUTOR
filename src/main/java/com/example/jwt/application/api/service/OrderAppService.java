package com.example.jwt.application.api.service;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderAppService {
    @Autowired
    private OrderService orderService;
    public List<Order> queryOrderList(){
        return orderService.queryOrderList();
    }
    public void addOrder(Order pkId){
         orderService.addOrder(pkId);
    }
}
