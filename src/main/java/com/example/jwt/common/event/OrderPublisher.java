package com.example.jwt.common.event;

import com.example.jwt.common.factory.ApplicationContextHelper;
import com.example.jwt.domain.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderPublisher {
    public void publishOrder(Order order){
        ApplicationContextHelper.getApplicationContext().publishEvent(new OrderEvent(this,order));
    }
}
