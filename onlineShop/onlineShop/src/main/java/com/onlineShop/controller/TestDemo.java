package com.onlineShop.controller;

import com.onlineShop.service.DemoMgr;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


@Api("测试接口")
@RestController
@RequestMapping("/api/v1/test")
public class TestDemo
{
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
