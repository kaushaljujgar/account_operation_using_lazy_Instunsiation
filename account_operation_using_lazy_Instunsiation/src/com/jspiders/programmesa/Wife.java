package com.jspiders.programmesa;
import com.jspiders.programmesa.*;
public class Wife extends Thread {
	Account account; //dought

	public Wife(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		account.deposit(3000);
		account.withdraw(8000);
		
	}

}
