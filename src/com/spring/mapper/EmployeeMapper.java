package com.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.work.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpid(rs.getInt("empid"));
		emp.setEmpname(rs.getString("empname"));
		emp.setEmpsal(rs.getInt("empsal"));
		return emp;
	}

}
