package com.jspiders.programmesa;


public class Account {
		
	  static int accBalance;
	   public static Account account;
	 public Account() {      //dought
		  super();
		  
		 
	  }
	  public synchronized void deposit(int depositAmount) {
		  System.out.println("Depositing "+depositAmount+" rupees in the Account.");
		  accBalance+=depositAmount;
		  System.out.println("Availaible Balance Is:"+accBalance);
		  
	  }
	  public synchronized void withdraw(int withdrawAmount) {
		  if (accBalance>=withdrawAmount) {
			  System.out.println("Withdrawing "+withdrawAmount+" From The Account");
			  accBalance-=withdrawAmount;
			  System.out.println("Availaible Balance Is: "+accBalance);
			
		}else {
			System.out.println("Insufficient Balance");
		}
		  }
		
		 
		public synchronized static Account getAccount() {
			if(account==null) {
				  account=new Account(); //dought
			  }
			  System.out.println("account Created.");
			  return account;
		}
}

	



