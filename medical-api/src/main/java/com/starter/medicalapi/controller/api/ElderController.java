package com.starter.medicalapi.controller.api;

import com.starter.medicalcommon.vo.request.UserLoginRequest;
import com.starter.medicalcommon.vo.request.UserRegisterRequest;
import com.starter.medicalcommon.vo.request.UserUpdatePwdRequest;
import com.starter.medicalcommon.vo.response.BaseResponse;
import com.starter.medicaldao.entity.Elder;
import com.starter.medicalservice.service.ElderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 此类的描述是：
 *
 * @author Starter
 * @date 2019-05-19 17:03
 **/
@CrossOrigin
@RestController
@RequestMapping("/elder")
@Api(tags = "老人")
public class ElderController {

    @Resource
    private ElderService elderService;

    @PostMapping("/register")
    @ApiOperation("注册用户")
    public BaseResponse register(@RequestBody UserRegisterRequest request) {
        return elderService.register(request);
    }

    @PostMapping("/login")
    @ApiOperation("登陆")
    public BaseResponse login(@RequestBody UserLoginRequest request) {
        return elderService.login(request);
    }

    @GetMapping("/queryByPhone")
    @ApiOperation("根据手机号获取用户信息")
    public BaseResponse queryByPhone(String phone) {
        return elderService.queryByPhone(phone);
    }

    @GetMapping("/query")
    @ApiOperation("根据用户ID获取用户信息")
    public BaseResponse query(String userId) {
        return elderService.query(userId);
    }

    @PostMapping("/update")
    @ApiOperation("更新")
    public BaseResponse update(@RequestBody Elder elder) {
        return elderService.update(elder);
    }

    @PostMapping("/updatePwd")
    @ApiOperation("更新密码")
    public BaseResponse update(@RequestBody UserUpdatePwdRequest request) {
        return elderService.updatePwd(request);
    }

}