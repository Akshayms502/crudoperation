package com.spring.aop;

public class CAAccount {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public double shaowBalance(){
		this.test();
		return account.getBalance();
	}
	
	void test(){
		System.out.println("test is called");
	}
	public void getParameter(int x){
		System.out.println("x is called"+x);
	}

}
