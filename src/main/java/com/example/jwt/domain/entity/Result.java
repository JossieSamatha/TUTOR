package com.example.jwt.domain.entity;

import lombok.Data;

@Data
public final class Result<T> {
    private T data;


}
