package com.cg.mri.driver;

import java.util.Scanner;

import com.cg.mri.beans.Account;
import com.cg.mri.service.AccountService;
import com.cg.mri.service.AccountServiceImpl;
public class MainUI {
	
	static void select() {
		String mobile;
		double rechargeAmount;
		Account a=new Account();
		AccountService accountService=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option :\n1)Account Balance Enquiry\n2)Recharge Account\n3)Exit");
		int choice=sc.nextInt();
		 
		switch(choice) {
		case 1: System.out.println("Enter Mobile no :");
				mobile=sc.next();
				a=accountService.getAccountDetails(mobile);
				get(a);
				break;
		case 2: System.out.println("Enter Mobile no :");
				mobile=sc.next();
				System.out.println("Enter Recharge amount :");
				rechargeAmount=sc.nextDouble();
				accountService.rechargeAccount(mobile, rechargeAmount);
				break;
		case 3: System.exit(0);
		}
	}
	
	private static void get(Account a) {
		if(a!=null) {
			System.out.println("Balance is :"+a.getAccount_amount());
		}
		else {
			System.out.println("Account Doesnot Exist.");
		}
		
	}

	public static void main(String[] args) {
		
		select();
	}

}
