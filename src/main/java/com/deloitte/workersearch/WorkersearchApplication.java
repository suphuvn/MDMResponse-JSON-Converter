package com.deloitte.workersearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
//@EnableAutoConfiguration 
//@ComponentScan(basePackages = "com.deloitte")
public class WorkersearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkersearchApplication.class, args);
	}

	 @Bean
	 public ObjectMapper buildObjectMapper() {
	       return new ObjectMapper().setSerializationInclusion(Include.NON_NULL);
	 }
}
