package com.example.jwt.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("act_re_procdef_ext")
public class OrderPO {
    @TableId
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
