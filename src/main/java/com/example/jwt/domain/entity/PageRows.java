package com.example.jwt.domain.entity;

import lombok.Data;

import java.util.List;
@Data
public class PageRows<T> {
    private List<T> list;
    private long total;
    private int pageNum;
    private int pageSize;
}
