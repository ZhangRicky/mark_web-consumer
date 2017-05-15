package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.provide.service.HelloProviderService;
import com.provide.service.PersonProviderService;
/**
 * Demo
 * 直接调用service-provider工程中的接口
 * @author Mark
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	HelloProviderService helloService;
	
	@Autowired
	PersonProviderService personService;
	
	@RequestMapping("/")
	public void test(){
        System.out.println(helloService.getHello());
        System.out.println(personService.getPersonInfo().toString());
	}
}
