package com.example.jwt.infrastructure.persistence;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.respository.OrderRespository;
import com.example.jwt.infrastructure.mapper.OrderMapper;
import com.example.jwt.infrastructure.persistence.assember.OrderPOAssember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderResporsitoryImpl implements OrderRespository  {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderPOAssember orderPOAssember;
    @Override
    public Order queryOrder(String pkId) {
        return orderPOAssember.fromOrderPO(orderMapper.selectById(pkId));
    }
    @Override
    public void addOrder(Order pkId) {
        orderMapper.insert(orderPOAssember.fromOrder(pkId));
    }
}
