package com.example.jwt.infrastructure;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.jwt.infrastructure.persistence.po.OrderPO;
import org.springframework.stereotype.Component;

@Component
public interface OrderMapper extends BaseMapper<OrderPO> {

}
