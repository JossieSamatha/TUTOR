package com.example.jwt.infrastructure.persistence.assember.mapper;



import com.example.jwt.domain.entity.Order;
import com.example.jwt.infrastructure.persistence.po.OrderPO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderPOMapper {
    OrderPOMapper INSTANCE= Mappers.getMapper(OrderPOMapper.class);
    @Mappings({

    })
    Order fromOrderPO(OrderPO orderPO);
}
