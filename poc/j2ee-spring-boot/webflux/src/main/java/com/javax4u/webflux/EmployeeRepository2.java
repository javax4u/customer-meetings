package com.javax4u.webflux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class EmployeeRepository2 {

	List<Employee> employeeList = new ArrayList<>();
	{
		employeeList.add(new Employee(1L, "Richa", "Sharma", "richa@gmail.com"));
		employeeList.add(new Employee(2L, "Satyajit", "Mohapatra", "sattu@gmail.com"));
		employeeList.add(new Employee(3L, "Piyush", "Verma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(4L, "Apoorv", "Verma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(5L, "Sankalp", "Verma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(6L, "Prabhat", "Verma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(7L, "Virat", "Verma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(8L, "Anushkha", "Sharma", "er.pinku@gmail.com"));
		employeeList.add(new Employee(9L, "Narednra", "Modi", "er.pinku@gmail.com"));
		employeeList.add(new Employee(10L, "Indrajit", "Modi", "indrajit@gmail.com"));
	}

	public Flux<Employee> findAllWithStreamApi() {
		
		return Flux.range(0, 10)
				.delayElements(Duration.ofSeconds(1))
				.doOnNext(i -> System.out.println("processing count : "+i))
				.map(i -> employeeList.get(i));
	}

	public List<Employee> findAll() {
		for (Employee emp : employeeList) {
			try {
				Thread.sleep(1000);
				System.out.println(" fetching completed for employee " + emp.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employeeList;
	}

}
