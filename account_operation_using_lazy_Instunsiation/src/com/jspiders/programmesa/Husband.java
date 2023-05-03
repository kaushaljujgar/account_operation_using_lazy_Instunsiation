package com.jspiders.programmesa;
import com.jspiders.programmesa.*;

public class  Husband extends Thread {
	
	Account account; //dought
	public Husband(Account account) {
		super();
		this.account = account;
	}
	@Override
	public  void run() {
		account.deposit(5000);
		account.withdraw(7000);
		
	}
	
	

}
