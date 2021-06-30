package com.example.jwt.infrastructure.persistence;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.entity.PageRows;
import com.example.jwt.domain.respository.OrderRespository;
import com.example.jwt.infrastructure.mapper.OrderMapper;
import com.example.jwt.infrastructure.persistence.assember.OrderPOAssember;
import com.example.jwt.infrastructure.persistence.po.OrderPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderResporsitoryImpl implements OrderRespository  {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderPOAssember orderPOAssember;
    @Override
    public List<Order> queryOrderList() {
        OrderPO orderPO=new OrderPO();
        QueryWrapper queryWrapper=new QueryWrapper();

        return orderPOAssember.fromOrderPO(orderMapper.selectList(queryWrapper));
    }
    @Override
    public Order selectOrder(String id) {
        return orderPOAssember.fromOrderPO(orderMapper.selectById(id));
    }
    @Override
    public PageRows<OrderPO> pageOrderList() {
        OrderPO orderPO=new OrderPO();
        QueryWrapper queryWrapper=new QueryWrapper();
        Page  page=new Page(1,10,true);
        PageRows<OrderPO> poPageRows=new PageRows<>();
        poPageRows.setList(orderMapper.selectList(queryWrapper));
        poPageRows.setPageNum(1);
        poPageRows.setTotal(20);
        poPageRows.setPageSize(20);
        return poPageRows;
    }
    @Override
    public void addOrder(Order pkId) {
        orderMapper.insert(orderPOAssember.fromOrder(pkId));
    }
}
