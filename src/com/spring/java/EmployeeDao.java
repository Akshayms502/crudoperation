package com.spring.java;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.interfaces.IEmployeeDao;
import com.spring.mapper.EmployeeMapper;
import com.spring.work.Employee;

public class EmployeeDao implements IEmployeeDao{
	@Autowired(required=true)
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	

	@Override
	public Employee getEmployee(int empid) {
		String sql="select empname,empsal from employee where empid=?";
//		return  jdbcTemplate.queryForObject(sql,new Object[]{empid},new BeanPropertyRowMapper<Employee>(Employee.class));
		
	return jdbcTemplate.queryForObject(sql, new Object[]{empid},new EmployeeMapper());	
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql="select empid,empname,empsal from employee";
		List<Employee> employee=new ArrayList<Employee>();

		//employee=jdbcTemplate.queryForList(sql,Employee.class);
		
		//(List<Employee>) jdbcTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<Employee>(Employee.class));
		
		return  employee;
	}

	@Override
	public void insertEmployee(Employee employee) {
		String sql="insert into employee(empid,empname,empsal)values(?,?,?)";
		
		jdbcTemplate.update(sql,employee.getEmpid(),employee.getEmpname(),employee.getEmpsal());
		System.out.println("record created"+employee);
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(int empid, int empNewSalary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		
	}

}
