package com.onlineShop.controller;

import com.onlineShop.service.DemoMgr;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("测试接口")
@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
    @Autowired
    private DemoMgr demoMgr;

    @ApiOperation(value = "测试接口",notes = "测试接口")
    @RequestMapping(value = "/queryShop", method = RequestMethod.GET)
    @ResponseBody
    public Integer queryShop()
    {
        return demoMgr.get();
    }
}
