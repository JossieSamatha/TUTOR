package com.example.jwt.application.api;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.jwt.application.api.service.OrderAppService;
import com.example.jwt.domain.entity.Order;
import com.example.jwt.domain.entity.Result;
import com.example.jwt.domain.respository.OrderRespository;
import com.example.jwt.infrastructure.persistence.po.OrderPO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class SellApi {
   @Autowired
   private OrderAppService orderAppService;
    @Autowired
    private OrderRespository orderRespository;

//    @GetMapping
//    public Order queryOrder(@RequestParam String pkId){
//        return orderAppService.queryOrder(pkId);
//    }
    @GetMapping("/list")
    public Result queryOrderList(){
        Result result=new Result();
        result.setData(orderAppService.queryOrderList());
        return result;
    }
    @PostMapping("/one")
    public Result selectOrder(@RequestParam String id){
        Result result=new Result();
        result.setData(orderRespository.selectOrder(id));
        return result;
    }
    @GetMapping
    public Result pageOrderList(){
        Result result=new Result();
        result.setData(orderRespository.pageOrderList());
        return result;
    }
    @PostMapping("/v1/remind/msg/query")
    public void addOrder(@RequestBody Order order){
         orderAppService.addOrder(order);
    }

}
