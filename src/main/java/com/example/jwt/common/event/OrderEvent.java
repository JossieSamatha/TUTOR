package com.example.jwt.common.event;

import com.example.jwt.domain.entity.Order;
import org.springframework.context.ApplicationEvent;

public class OrderEvent extends ApplicationEvent {
    private Order order;
    public OrderEvent(Object source) {
        super(source);
    }
    public OrderEvent(Object source,Order order) {
        super(source);
        this.order=order;
    }
    public Order getOrder(){
        return this.order;
    }
}
