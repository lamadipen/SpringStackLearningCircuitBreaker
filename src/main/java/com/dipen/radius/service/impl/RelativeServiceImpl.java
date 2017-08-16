package com.dipen.radius.service.impl;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dipen.radius.domain.Relative;
import com.dipen.radius.repository.RelativeRepository;
import com.dipen.radius.service.RelativeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RelativeServiceImpl implements RelativeService{
	
	@Autowired
	private RelativeRepository relativeRepository;
	private final RestTemplate restTemplate;
	
	public RelativeServiceImpl(RestTemplate restTemplate) {
		// TODO Auto-generated constructor stub
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Relative> getRelatives() throws Exception {
		// TODO Auto-generated method stub
		return (List<Relative>) relativeRepository.findAll();
		//return null;
	}
	@Override
	public Relative createRelative(Relative user) throws Exception {
		// TODO Auto-generated method stub
		return relativeRepository.save(user);
	}
	
	@HystrixCommand(fallbackMethod="fallBackGetRelatives")
	public String getMyRelatives()
	{
		URI uri = URI.create("http://localhost:8181/users");
		return this.restTemplate.getForObject(uri,String.class);
	}
	
	public String fallBackGetRelatives()
	{
		return "This is Fall back method";
	}

}
