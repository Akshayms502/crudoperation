package com.spring.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAfter {
	
	@After("execution(* get*())")
	public void afterGetter(){
		System.out.println("$$$$$after advice invoked$$$$$$$$");
	}
	
	@AfterReturning("execution(* com.spring.aop.SBAccount.getAcc())")
	public void afterSuccessfulGetter(){
		System.out.println("$$$$$after successful return$$$$$$$$");
	}
	
	

}
