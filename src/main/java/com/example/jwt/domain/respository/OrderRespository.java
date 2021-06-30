package com.example.jwt.domain.respository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.entity.PageRows;
import com.example.jwt.infrastructure.persistence.po.OrderPO;

import java.util.List;

public interface OrderRespository {
    public Order selectOrder(String pkId);
    public List<Order> queryOrderList();
    public PageRows<OrderPO> pageOrderList();
    public void addOrder(Order pkId);
}
