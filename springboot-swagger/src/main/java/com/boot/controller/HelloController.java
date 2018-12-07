package com.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="接口示例",tags="接口示例")
@RestController
public class HelloController {
	
	@ApiOperation(value="第一个接口",notes="第一个接口")
	@GetMapping(value="/hello")
	String welcome() {
		return "hello world";
	}
	
	
	@ApiOperation(value="第二个接口",notes="第二个接口")
	@GetMapping(value="/second")
	String hi(String  name) {
		return "hello "+name;
	}
	
	
	@ApiOperation(value="第三个接口",notes="第三个接口")
	@GetMapping(value="/third")
	String hey(String  name) {
		return "hello "+name;
	}

	
	@ApiOperation(value="第四个接口",notes="第四个接口")
	@GetMapping(value="/fourth")
	String why(String  name) {
		return "hello "+name;
	}
	
	
	@ApiOperation(value="第七个接口",notes="第七个接口")
	@GetMapping(value="/seventh")
	String hiddenini(String  name) {
		return "hello "+name;
	}
	
	@ApiOperation(value="第五个接口",notes="第五个接口")
	@GetMapping(value="/fifth")
	String bona(String  name) {
		return "hello "+name;
	}
	
	@ApiOperation(value="第六个接口",notes="第六个接口")
	@GetMapping(value="/sixth")
	String tgy(String  name) {
		return "hello "+name;
	}
	
	@ApiOperation(value="第八个接口",notes="第八个接口")
	@GetMapping(value="/eighth")
	String zjw(String  name) {
		return "hello "+name;
	}
}
