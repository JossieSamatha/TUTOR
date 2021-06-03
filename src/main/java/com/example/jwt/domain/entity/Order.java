package com.example.jwt.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
    private String pkId;
    private String m1CustId;
    private String m2CustId;
    private String dataDt;
}
