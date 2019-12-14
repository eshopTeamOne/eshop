package com.onesteam.teamone.controller;

import com.onesteam.teamone.model.UserModel;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("testApi")
@Api(value="测试接口Controller")
public class SwaggerTestController {

    //设置用于swagger测试自动填充的参数
    @ApiOperation(value="测试GET", notes="测试GET" ,httpMethod="GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name", value="用户姓名", dataType = "String", required=true, paramType="query"),
            @ApiImplicitParam(name="id", value="id", dataType = "Integer", required=false, paramType="query", defaultValue="1")
    })
    @RequestMapping("name")
    public String name(String name,Integer id) {
        return "Hello " + name + ",id:" + id;
    }


    //设置用于swagger测试自动填充的参数
    @ApiOperation(value="测试POST", notes="测试POST" ,httpMethod="POST")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/newUser")
    public String newUser(@RequestBody UserModel user) {
        return "new " + user.getAccount() + "," + user.getPassword();
    }

    //设置用于swagger测试自动填充的参数
    @ApiOperation(value="测试RESTFUL", notes="测试RESTFUL" ,httpMethod="GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="name", value="用户姓名", dataType = "String", required=true, paramType="path"),
            @ApiImplicitParam(name="id", value="id", dataType = "String", required=true, paramType="path")
    })
    @RequestMapping("get/{name}/{id}")
    public String get(@PathVariable String name,@PathVariable String id) {
        return "restful: " + name + ",id:" + id;
    }

}
