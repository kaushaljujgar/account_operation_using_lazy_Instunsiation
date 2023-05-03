package com.jspiders.programmesa;

public class Withdraw extends Thread {
	static  Account1 account1;
	 int accountBalance;
	 
	 
	 public Withdraw(int accountBalance) {
		super();
		this.accountBalance =accountBalance;
	}


	public static synchronized void withdraw(int withdrawAmount) {
		if (Account1.accountBalance>=withdrawAmount) {
			  System.out.println("Withdrawing "+withdrawAmount+" From The Account");
			  Account1.accountBalance-=withdrawAmount;
			  System.out.println("Availaible Balance Is: "+Account1.accountBalance);
			
		}else {
			System.out.println("Insufficient Balance");
		}
	 }
}
