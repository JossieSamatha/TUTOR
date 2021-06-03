package com.example.jwt.application.api;

import com.example.jwt.application.api.service.OrderAppService;
import com.example.jwt.domain.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class SellApi {
   @Autowired
   private OrderAppService orderAppService;

    /**
     *
     * @param pkId
     * @return
     */
    @GetMapping
    public Order queryOrder(@RequestParam String pkId){
        return orderAppService.queryOrder(pkId);
    }

}
