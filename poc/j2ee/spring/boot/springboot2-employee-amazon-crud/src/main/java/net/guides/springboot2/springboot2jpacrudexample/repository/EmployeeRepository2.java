package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

public class EmployeeRepository2 {

	List<Employee> employeeList = new ArrayList<>();
	{
		employeeList.add(new Employee(1L,"Richa","Sharma","richa@gmail.com"));
		employeeList.add(new Employee(2L,"Satyajit","Mohapatra","sattu@gmail.com"));
		employeeList.add(new Employee(3L,"Piyush","Verma","er.pinku@gmail.com"));
	}

	public List<Employee> findAll() {
		return employeeList;
	}

	public Employee findById(Long id) {
		for (Employee employee : employeeList) {
			if (id.toString().equals("" + employee.getId())) {
				return employee;
			}
		}
		return null;
	}

	public Employee save(Employee employee) {
		employeeList.add(employee);
		return employee;
	}

	public void delete(Employee employee) {
		Iterator<Employee> iterator = employeeList.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())
			//Employee currentEmployee=(Employee)iterator.next();
		if (employee.getId().toString().equals("" + iterator.next().getId())) {
			iterator.remove();
			return;
		}
	}

}
