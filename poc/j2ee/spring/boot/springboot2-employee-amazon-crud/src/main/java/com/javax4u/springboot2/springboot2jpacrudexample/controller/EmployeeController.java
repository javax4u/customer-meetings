package com.javax4u.springboot2.springboot2jpacrudexample.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.javax4u.springboot2.springboot2jpacrudexample.exception.ResourceNotFoundException;
import com.javax4u.springboot2.springboot2jpacrudexample.model.Address;
import com.javax4u.springboot2.springboot2jpacrudexample.model.Employee;
import com.javax4u.springboot2.springboot2jpacrudexample.repository.AmazonConstants;
import com.javax4u.springboot2.springboot2jpacrudexample.repository.EmployeeRepository2;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository2 employeeRepository ;
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	EmployeeRepository2 getEmployeeRepository2() {
		return new EmployeeRepository2();
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
	   return builder.build();
	}
	@GetMapping(AmazonConstants.ROOT)
	public String[] rootNode() {
		
		String[] returnMe = {AmazonConstants.EMPLOYEES,AmazonConstants.EMPLOYEES_BY_ID,AmazonConstants.EMPLOYEES_ADDRESS};
		return returnMe;
	}

	@GetMapping(AmazonConstants.EMPLOYEES)
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@GetMapping(AmazonConstants.EMPLOYEES_BY_ID)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId);
		if (employee == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}
		return ResponseEntity.ok().body(employee);
	}
	@GetMapping(AmazonConstants.EMPLOYEES_ADDRESS)
	public ResponseEntity<Address> getEmployeeAddress(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		String addressUrl=AmazonConstants.ADDRESS_ID;///api/v1/employees/{id}/address
		addressUrl="http://localhost:9090/"+addressUrl.replace("{id}", employeeId.toString());
		System.out.println("****  addressUrl:"+addressUrl);
		Address address = restTemplate.getForObject(addressUrl,Address.class);
		if (address == null) {
			throw new ResourceNotFoundException("Address not found for this id :: " + employeeId);
		}
		return ResponseEntity.ok().body(address);
	}

	@PostMapping(AmazonConstants.EMPLOYEES)
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

	@PutMapping(AmazonConstants.EMPLOYEES_BY_ID)
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId);
		if (employee == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		}

		employee.setEmailId(employeeDetails.getEmailId());
		employee.setLastName(employeeDetails.getLastName());
		employee.setFirstName(employeeDetails.getFirstName());
		final Employee updatedEmployee = employeeRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping(AmazonConstants.EMPLOYEES_BY_ID)
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
			throws ResourceNotFoundException {
		Map<String, Boolean> response = new HashMap<>();
		Employee employee = employeeRepository.findById(employeeId);

		if (employee == null) {
			throw new ResourceNotFoundException("Employee not found for this id :: " + employeeId);
		} else {

			employeeRepository.delete(employee);

			response.put("deleted", Boolean.TRUE);
		}
		return response;
	}
}
