package com.dipen.radius.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dipen.radius.domain.Relative;
import com.dipen.radius.filter.CodeOwner;
import com.dipen.radius.service.RelativeService;

@RestController
public class RelativeController {
	
	@Autowired
	private RelativeService relativeService;
	
	private static final Logger logger = LoggerFactory.getLogger(RelativeController.class);
	
	@CodeOwner(name="dipen", action="controller")
	@RequestMapping("/welcome")
	public String sayHello()
	{
		logger.info("sayHello() method is consumed");
		return "Hello Dipen form Relative";
	}
	
	@RequestMapping(value = "/my-relatives", method = RequestMethod.GET)
	public @ResponseBody String getUsers() throws Exception
	{
		return relativeService.getMyRelatives();	
	}
	
	@RequestMapping(value = "/exception", method = RequestMethod.GET )
	public String getExceptionTest() throws Exception
	{
		throw new Exception("This is dipn's custom exception");
	}
	
	
}
