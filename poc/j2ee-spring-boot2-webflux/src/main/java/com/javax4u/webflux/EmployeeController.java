package com.javax4u.webflux;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@CrossOrigin

public class EmployeeController {

	@Autowired
	private EmployeeRepository2 employeeRepository;

	@Bean
	EmployeeRepository2 getEmployeeRepository2() {
		return new EmployeeRepository2();
	}

	@GetMapping("/")
	public String[] rootNode() {
		
		String[] returnMe = {"/employee","/employee/stream"};
		return returnMe;
	}
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping(value="/employee/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Employee> findAllWithStreamApi() {
		return employeeRepository.findAllWithStreamApi();
	}

}
