package com.anusha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anusha.dao.EmployeeDao;
import com.anusha.dao.EmployeeDaoImpl;
import com.anusha.dto.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDao dao = new EmployeeDaoImpl();

	

	public void insertEmployee(Employee emp) {
		 dao.insertEmployee(emp);
	}

	public Employee updateEmployee(Employee emp) {
		 return dao.updateEmployee(emp);
	}

	public void deleteEmployee(int id) {
		
		 dao.deleteEmployee(id);
	}

	public Employee getEmployees(int empId) {

		return dao.getEmployees(empId);
	}

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public List<Employee> getEmployeesByDept(int deptId) {
		return (List<Employee>) dao.getEmployeesByDept(deptId);
	}


	
	
	
}
