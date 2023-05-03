package com.jspiders.programmesa;

public class Account1 {
	static  Account1 account1;
	 public static int accountBalance;
	public Account1(int accBalance) {
		accountBalance=accBalance;
		
	}
	public synchronized static  Account1 getAccount1() {
		if(account1==null) {
			  account1=new Account1(10000); //dought
		  }
		  System.out.println("account Created.");
		  return account1;
	}
	
	
	
}

