package com.spring.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAround {
	@Around("execution(public * get*(*))")
	public Object sampleMyAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object retVal=null;
		
		try{

			System.out.println("before job goes here");
			retVal=proceedingJoinPoint.proceed();
			System.out.println("after job goes here");
		}catch (Throwable e){
			e.printStackTrace();
		}return retVal;
	}

}
