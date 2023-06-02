package com.example.SpringPractice.service;

import com.example.SpringPractice.exception.DepartmentNotFoundException;
import com.example.SpringPractice.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDepartment(Department department);
    public Department saveDepartment(Department department);
    public List<Department> getDepartmentsList();
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;
    public List<Department> getDepartmentByName(String departmentName) throws DepartmentNotFoundException;
    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException;
}
