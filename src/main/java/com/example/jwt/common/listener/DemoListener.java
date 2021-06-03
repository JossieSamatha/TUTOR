package com.example.jwt.common.listener;

import com.example.jwt.common.event.OrderEvent;
import com.example.jwt.common.thread.ThreadExecutorSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoListener implements ApplicationListener<OrderEvent> {
    @Autowired
    private ThreadExecutorSupport threadExecutorSupport;
    @Override
    public void onApplicationEvent(OrderEvent t) {
        threadExecutorSupport.execute("asyOrderService",t.getOrder());
    }
}
