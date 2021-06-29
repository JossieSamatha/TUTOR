package com.example.jwt.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
    private String id;
    private String categoryId;
    private String title;
    private String key;
    private String actDefKey;
    private String actDefId;
    private String actDeploymentId;
    private String discription;
    private String status;
    private String version;
    private String bpmnXml;
    private String svgXml;
    private String source;
    private Date crtTs;
    private Date updataTs;
    private String crtUser;
    private String updateUser;
    private String primaryKey;

}
