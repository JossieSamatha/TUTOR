package com.example.jwt.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("demo")
public class OrderPO {
    @TableId
    private String pkId;
    private String m1CustId;
    private String m2CustId;
    private String dataDt;
}
