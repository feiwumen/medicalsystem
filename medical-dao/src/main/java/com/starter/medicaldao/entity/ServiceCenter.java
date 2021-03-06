package com.starter.medicaldao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ServiceCenter {
    private String id;

    private Integer helpType;

    private String userId;

    private String type;

    private Integer state;

    private String requirement;

    private String price;

    private Date serviceTime;

    private String managerId;

    private Integer serviceStar;

    private Date finishTime;

    private String recordUrl;

    private Integer evaluateStar;

    private String evaluateContent;

    private Date evaluateTime;

    private Date createTime;

    private Date modifyTime;

}