package com.anusha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anusha.dao.DepartmentDao;
import com.anusha.dao.DepartmentDaoImpl;
import com.anusha.dto.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentDao dao = new DepartmentDaoImpl();

	

	public void insertDepartment(Department dept) {
		 dao.insertDepartment(dept);
	}

	public List<Department> getAllDepartments() {
		
		return dao.getAllDepartments();
	}

	public String updateDepartment(Department dept) {
		return dao.updateDepartment(dept);
	}

	public void deleteDepartment(int deptId) {
		 dao.deleteDepartment(deptId);
	}

	public Department getDeptById(int deptId) {
		
		return dao.getDeptById(deptId);
	}
	
}
