package com.starter.medicaldao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class New {
    private String id;

    private String title;

    private String content;

    private Integer type;

    private Date notifyTime;

    private Date createTime;

    private Date modifyTime;

}