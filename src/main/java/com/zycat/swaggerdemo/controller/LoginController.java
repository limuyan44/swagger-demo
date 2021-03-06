package com.zycat.swaggerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @Description 登录
 * @Author duanmulixiang
 * @create 2018-06-25 20:30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class LoginController {
    @ApiOperation(value = "登录接口",notes = "这是使用用户名和密码登录的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称",required = true,paramType ="query",dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "密码",required = true,paramType = "query",dataType ="String")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam String name,@RequestParam String pwd){
        return "hello" + name + ":" + pwd;
    }
}
