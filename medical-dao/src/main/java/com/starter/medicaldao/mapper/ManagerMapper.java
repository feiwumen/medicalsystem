package com.starter.medicaldao.mapper;

import com.starter.medicaldao.entity.Manager;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);

    Manager selectByPhone(@Param("phone") String phone);

    Manager selectByPhoneAndPwd(@Param("phone") String phone,
                                @Param("pwd") String pwd);
}