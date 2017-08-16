package com.dipen.radius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableCircuitBreaker
public class RadiusApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadiusApplication.class, args);
	}
	
  @Bean
  public RestTemplate rest(RestTemplateBuilder builder) {
    return builder.build();
  }
}
