package com.starter.medicaldao.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Manager {
    private String id;

    private String phone;

    private String pwd;

    private String identity;

    private String name;

    private Integer birth;

    private Integer sex;

    private String image;
    private String province;
    private String city;
    private String country;
    private String town;
    private String community;
    private String address;

    private Date createTime;

    private Date modifyTime;

}