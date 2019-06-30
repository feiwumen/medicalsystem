package com.starter.medicalapi.controller;

import com.starter.medicalcommon.vo.request.DeviceRequest;
import com.starter.medicalcommon.vo.response.BaseResponse;
import com.starter.medicalservice.service.DeviceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 此类的描述是：
 *
 * @author Starter
 * @date 2019-05-19 17:03
 **/
@RestController
@RequestMapping("/device")
public class DeviceController {

    @Resource
    private DeviceService deviceService;

    @PostMapping("/insert")
    public BaseResponse insert(@RequestBody DeviceRequest request) {
        return deviceService.insertSelective(request);
    }

    @GetMapping("/list")
    public BaseResponse queryByUserId(String userId) {
        return deviceService.queryByUserId(userId);
    }

    @PostMapping("/update")
    public BaseResponse updateByDeviceId(@RequestBody DeviceRequest request) {
        return deviceService.update(request);
    }
}