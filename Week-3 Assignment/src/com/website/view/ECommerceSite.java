package com.website.view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.website.model.CustRegistration;

public class ECommerceSite {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<CustRegistration> arrayList1=new ArrayList<CustRegistration>();
	
	static void registration() throws Exception {
		
		CustRegistration customer=new CustRegistration();
		System.out.println("Enter name :");
		customer.setCustomerName(sc.next());
		System.out.println("Enter address :");
		customer.setAddress(sc.next());
		System.out.println("Enter email :");
		customer.setEmail(sc.next());
		System.out.println("Enter phoneNo :");
		customer.setPhoneNo(sc.nextLong());
		System.out.println("Enter username :");
		customer.setUserName(sc.next());
		System.out.println("Set password :");
		customer.setPassword(sc.next());
		arrayList1.add(customer);
		serialiseArray1();
		System.out.println("Registration is successful, please proceed with login");
		login();
	}
	
	public static void serialiseArray1() throws Exception {
		FileOutputStream file=new FileOutputStream("K:\\new1\\RegisteredCustomers.txt");
		ObjectOutputStream object=new ObjectOutputStream(file);		
		object.writeObject(arrayList1);
		object.close();
	}
	
	public static ArrayList<CustRegistration>  deserialiseArray1() throws Exception {
	
		FileInputStream file=new FileInputStream("K:\\new1\\RegisteredCustomers.txt");
		ObjectInputStream object1=new ObjectInputStream(file);
		@SuppressWarnings("unchecked")
		ArrayList<CustRegistration> array=(ArrayList<CustRegistration>)object1.readObject();
		object1.close();
		return array;
		
	}
	
	private static void login() throws Exception {
		System.out.println("Username :");
		String uname=sc.next();
		System.out.println("Password :");
		String password=sc.next();
		for(CustRegistration reg : deserialiseArray1()) {
			if(reg.getUserName().equals(uname)) {
				if(reg.getPassword().equals(password)) {
					System.out.println("Credentials are verified, please proceed with shopping");
					Shopping.select();
				}
				else { 
					System.out.println("Sorry.....credentials are not valid...please try again");
					login();
				}
			}
			
		}
	}

	
		static void selectOption() throws Exception {
		System.out.println("Enter choice 1 for registration and 2 for login :\n1)Registration\n2)Login");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: registration();
				break;
		case 2: login();
				break;
		
		}
	}
	
	public static void main(String[] args) throws Exception {
		selectOption();
	}
}
