package com.bank.view;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.*;
public class CustomerView{

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Customer> arraylist=new ArrayList<Customer>();
	
	 static void setInfo() throws Exception {
		
		Customer customer =new Customer();
		int n=takeNumber();
		for(int i=0;i<n;i++) {
			System.out.println("Name :");
			customer.setName(sc.next());
			System.out.println("Address :");
			customer.setAddress(sc.next());
			System.out.println("PhoneNo :");
			customer.setPhoneNo(sc.nextLong());
			System.out.println("Aadhar :");
			customer.setAadharNo(sc.nextLong());
			arraylist.add(customer);
		}
		serialiseArray();
		checkCustomer();
	}
	 
	static int takeNumber() {
		 System.out.println("Enter no.of customers: ");
		 return sc.nextInt();
	 }
	 
	 static void serialiseArray() {
		 try {
			FileOutputStream file=new FileOutputStream("K:\\new1\\customers.txt");
			ObjectOutputStream object=new ObjectOutputStream(file);
			object.writeObject(arraylist);
			object.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 static ArrayList<Customer> deserialiseArray() throws Exception {
		 FileInputStream	file = new FileInputStream("K:\\new1\\customers.txt");
		 ObjectInputStream object1=new ObjectInputStream(file);
		 ArrayList<Customer> arraylist2=(ArrayList<Customer>)object1.readObject();
		return arraylist2;
	 }

	 private static void checkCustomer() throws Exception{
		 System.out.println("Enter aadhar to search :");
		 long aadharNo=sc.nextLong();
		 for(Customer get: deserialiseArray()) {
			if(get.getAadharNo()==aadharNo) {
				System.out.println("Customer Exists");
				System.out.println("Details of customer are :");
				System.out.println(get.getName());
				System.out.println(get.getAddress());
				System.out.println(get.getPhoneNo());
				System.out.println(get.getAadharNo());
				break;
			}
			else {
				System.out.println(" Customer doesn't exist please register");
				setInfo();
				System.out.println("Registration is Successful");
				break;
			}
		 }
	 }

	
	public static void main(String[] args) throws Exception {
		
		setInfo();
		serialiseArray();
		deserialiseArray();
		
	}

	
}
