package com.starter.medicaldao.mapper;

import com.starter.medicaldao.entity.HealthDocument;
import org.apache.ibatis.annotations.Param;

public interface HealthDocumentMapper {
    int insert(HealthDocument record);

    int insertSelective(HealthDocument record);

    HealthDocument selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HealthDocument record);

    int updateByPrimaryKey(HealthDocument record);

    HealthDocument selectByUserIdAndPath(@Param("userId") String userId, @Param("path") String path);

    int updateByUserIdAndPathSelective(HealthDocument record);
}