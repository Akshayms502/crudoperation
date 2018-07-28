package com.spring.aop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aop.xml");
		
		BankingService bankingService=(BankingService) context.getBean("banking");
		System.out.println(bankingService.getSbAccount().getAcc().getAccname());
		System.out.println(bankingService.getCaAccount().shaowBalance());
		bankingService.getCaAccount().getParameter(100);
		
		String retVal=bankingService.setAndGet("akshay");
		System.out.println("return val in main"+retVal);
		
		bankingService.throwException();
	}

}
