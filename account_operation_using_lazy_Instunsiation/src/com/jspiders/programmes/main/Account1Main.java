package com.jspiders.programmes.main;
import java.util.Scanner;

import com.jspiders.programmesa.Account;
import com.jspiders.programmesa.Account1;
import com.jspiders.programmesa.CheckBalance;
import com.jspiders.programmesa.Deposit;
import com.jspiders.programmesa.Withdraw;



public class Account1Main {
	static Scanner scanner=new Scanner(System.in);
	 public static boolean Bool=true;
	public static void main(String[] args) {
			
				  //for changing the option we must have o use while loop.
				  while(Bool){ 
					   System.out.println("Choose The Options From The Following Choices");
					    System.out.println("1.Deposit The Amount");
						System.out.println("2.Withdraw The Amount"); 
						System.out.println("3.Check The Balance");
						System.out.println("4.Exit");
							int choose=scanner.nextInt();
					  switch(choose)
					  {
					  case 1:{
						System.out.println("Enter The Amount");
					    int choose1=scanner.nextInt();
					    Deposit deposit=new Deposit(choose1);
						deposit.deposit(choose1);
						
						break;
					  }
					  
					  case 2:{
						  System.out.println("Enter The Amount");
						    int choose2=scanner.nextInt();
						    Withdraw withdraw=new Withdraw(choose2);
							withdraw.withdraw(choose2);
						break;
					  }
					  
					  case 3:{
						System.out.println("Thank You For Enquiring Balance");
						System.out.println("Your Balance Is "+Account1.accountBalance);
						break;
					  }
					  
					  case 4:{
						System.out.println("You Are Exited Succesfully");
						Bool=false;
						break;
					  }
					   
					 
					  }
				  }
	}
 }
