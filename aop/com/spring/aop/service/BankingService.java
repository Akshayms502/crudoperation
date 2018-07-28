package com.spring.aop.service;

import com.spring.aop.CAAccount;
import com.spring.aop.SBAccount;

public class BankingService {
	private SBAccount sbAccount;
	private CAAccount caAccount;
	public SBAccount getSbAccount() {
		return sbAccount;
	}
	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}
	public CAAccount getCaAccount() {
		return caAccount;
	}
	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}
	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	}
	
	
	public String setAndGet(String name){
		return "hello"+name;
	}
	
	public void throwException(){
		int a=1;
		if(a==1){
			throw new RuntimeException("user threw exception");
		}
		System.out.println("user is okay with the value");
	}

}
