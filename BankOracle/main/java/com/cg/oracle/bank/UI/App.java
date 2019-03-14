package com.cg.oracle.bank.UI;

import java.util.Scanner;

import com.cg.oracle.bank.beans.*;
import com.cg.oracle.bank.service.*;

public class App {
	static double balance = 0;
	static Scanner sc = new Scanner(System.in);
	static Customer customers = new Customer();
	static Transaction transaction = new Transaction();
	static CustomerDetailsService registerCustomer = new CustomerDetailsServiceImpl();

	public static void main(String[] args) throws Exception {
		select();
	}

	public static void select() throws Exception {
		System.out.println("1)Registration\n2)Login\n3)Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			getInfo();
			break;
		case 2:
			toLogin();
			break;
		case 3:
			System.exit(0);
		}
	}

	public static void toLogin() {

	}

	public static void getInfo() throws Exception {
		System.out.println("Enter details to register :");
		System.out.println("Enter Firstname :");
		customers.setFirstName(sc.next());
		System.out.println("Enter Lastname :");
		customers.setLastName(sc.next());
		System.out.println("Enter Email :");
		customers.setEmail(sc.next());
		System.out.println("Set Password :");
		customers.setPassword(sc.next());
		System.out.println("Enter PANcard No :");
		customers.setPancardNo(sc.next());
		System.out.println("Enter Aadhar No :");
		customers.setAadharNo(sc.next());
		System.out.println("Enter Address :");
		customers.setAddress(sc.next());
		System.out.println("Enter Mobile No :");
		customers.setMobile(sc.next());
		customers.setBalance(balance);
		System.out.println("Your Account Number is :" + registerCustomer.registration(customers));
		System.out.println("Do you want to continue ?\nPress 1 to continue press any key to exit.");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			select();
			break;
		default:
			System.exit(0);
		}
	}
}
