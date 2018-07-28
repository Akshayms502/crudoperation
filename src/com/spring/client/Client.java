package com.spring.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.interfaces.IEmployeeDao;
import com.spring.work.Employee;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("message-resource.xml");
		IEmployeeDao employeeDao=(IEmployeeDao) context.getBean("jdbcTemplate");
	/*	Employee emp=new Employee(101,"akshay",70000);
		Employee emp1=new Employee(102,"sachin",80000);
		Employee emp2=new Employee(103,"sridhar",90000);
		
		employeeDao.insertEmployee(emp);
		employeeDao.insertEmployee(emp1);
		employeeDao.insertEmployee(emp2);
		
		System.out.println("done");*/
	/*	System.out.println("--------------------------");
		Employee emp4=employeeDao.getEmployee(101);
		System.out.println(emp4.getEmpsal()+""+emp4.getEmpname()); */
		
		List<Employee> emp4= employeeDao.getAllEmps();
		System.out.println(emp4.size());
//		Iterator<Employee> itr= emp4.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		for(Employee e:emp4){
			System.out.println("empid::"+e.getEmpid()+"empName::"+e.getEmpname()+"empsal:::"+e.getEmpsal());
		}

	}

}
