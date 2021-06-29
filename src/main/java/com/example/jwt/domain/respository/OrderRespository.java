package com.example.jwt.domain.respository;

import com.example.jwt.domain.entity.Order;

public interface OrderRespository {
    public Order queryOrder(String pkId);
    public void addOrder(Order pkId);
}
