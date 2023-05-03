package com.jspiders.programmes.main;
import com.jspiders.programmesa.*;
public class AccountMain {
	public static void main(String[] args) {
		//Account account=new Account(10000);
		Account account = Account.getAccount();
		Husband husband=new Husband(account);
		Wife wife=new Wife( account);
		husband.start();
		wife.start();
		Account.getAccount(); //dought 
		

		
		
	}

	
}
