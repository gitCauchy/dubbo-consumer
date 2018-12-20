package com.cauchy.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cauchy.dubbo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Reference
	private HelloService helloService;
	
	@RequestMapping("/test")
	public String hello() {
		
		System.out.println("hello");
		return helloService.sayHello("Cauchy");
		
	}
}
