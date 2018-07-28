package com.spring.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.spring.work.Employee;

public interface IEmployeeDao {
	public Employee getEmployee(int empid);
	public List<Employee> getAllEmps();
	public void insertEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public void updateEmployee(int empid,int empNewSalary);
	public void setDataSource(DataSource dataSource);

}
