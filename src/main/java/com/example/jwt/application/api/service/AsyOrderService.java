package com.example.jwt.application.api.service;

import com.example.jwt.common.thread.AsyThreadExcute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class AsyOrderService implements AsyThreadExcute {
    @Override
    public void execute(Object para) {
        long s=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10; k++) {
                    k++;
                }
            }
        }
        long e=System.currentTimeMillis();
        System.out.println("listener"+(e-s));
    }
}
