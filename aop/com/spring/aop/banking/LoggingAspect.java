package com.spring.aop.banking;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
/*	@Before("execution(public String getAccname())")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	} */
	
/*	@Before("execution(public double com.spring.aop.CAAccount.shaowBalance())")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	} */
	
/*	@Before("execution(public * get*())")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	}*/
	
/*	@Before("execution(public * get*(*))")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	}*/
	
/*	@Before("execution(public * get*(..))")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	}*/
	@Before("execution(* com.spring.aop.*.get*(*))")
	public void loggingAdvice(){
		System.out.println("*********logging befor is called**************");
	}
	
	@Before("allGetters()")
	public void secondAvice(){
		System.out.println("second aspect is invoked");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){
		System.out.println("this data should not be displayed");
	}
	
	@AfterReturning(pointcut="args(val)",returning="returningString")
	public void afterReturnString(String val,String returnString){
		System.out.println("after invoked for input->"+val+",return ->"+ returnString);
		
		
	}
	
	@AfterThrowing("execution(* throw*())")
	public void afterException(){
		System.out.println("for exception is invoked");
	}
}
