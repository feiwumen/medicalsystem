package com.starter.medicaldao.mapper;

import com.starter.medicaldao.entity.Consult;
import com.starter.medicaldao.entity.Prescription;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrescriptionMapper {
    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);

    List<Prescription> selectByUserId(@Param("userId") String userId);

    List<Prescription> selectByDoctorId(@Param("doctorId") String doctorId);

    List<Prescription> selectAll(@Param("offset") Integer offset,
                            @Param("pageSize") Integer pageSize);

    int selectCount();

}