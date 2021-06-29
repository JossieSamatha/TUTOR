package com.example.jwt.infrastructure.persistence.assember;

import com.example.jwt.domain.entity.Order;
import com.example.jwt.infrastructure.persistence.assember.mapper.OrderPOMapper;
import com.example.jwt.infrastructure.persistence.po.OrderPO;
import org.springframework.stereotype.Component;

@Component
public class OrderPOAssember {
    public Order fromOrderPO(OrderPO orderPO){
        return OrderPOMapper.INSTANCE.fromOrderPO(orderPO);
    }
    public OrderPO fromOrder(Order order){
        return OrderPOMapper.INSTANCE.fromOrder(order);
    }
}
