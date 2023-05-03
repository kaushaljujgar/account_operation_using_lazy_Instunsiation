package com.jspiders.programmesa;

public class Deposit extends Thread {
	static  Account1 account1;
	 int accountBalance;
	 
	public Deposit(int accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}



	public static synchronized void deposit(int depositAmount) {
		  System.out.println("Depositing "+depositAmount+" rupees in the Account.");
		  Account1.accountBalance+=depositAmount;
		  System.out.println("Availaible Balance Is:"+Account1.accountBalance);
		  
	  }

}
