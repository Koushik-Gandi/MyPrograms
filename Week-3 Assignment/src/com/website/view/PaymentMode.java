package com.website.view;

import java.util.Iterator;
import java.util.Scanner;

import com.website.model.CustRegistration;

public class PaymentMode extends ECommerceSite{
	public static void payment() throws Exception {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the payment mode you prefer\n 1.Card\n 2.Online");
		int choice=in.nextInt();
		
		if(choice==1) {
			System.out.println("you choosed Card mode to pay amount");
		}
		else if(choice==2) {
			System.out.println("you choosed Online mode to pay amount");
		}
		
		else System.out.println("please choose either card or online mode");
		
		System.out.println("Press 'Y' to pay \nPress 'N' to not to pay" );
		String payChoice=in.next();
		
		if(payChoice.equalsIgnoreCase("Y")) {
			System.out.println("Payment is successful.........\n Thank you for utilising our services\n Please visit again");
		}
		else if(payChoice.equalsIgnoreCase("N")) {
			System.out.println("Payment is not successfuls");
		}
		 printDetails();
	}
	
	public static void printDetails() throws Exception {
		//Iterator itr =arrayList1.iterator();
		for(CustRegistration data : deserialiseArray1()) {
			System.out.println("Name:"+data.getCustomerName()+"\nAddress:"+data.getAddress()+"\nPhone number:"+data.getPhoneNo()+"\nEmail:"+data.getEmail());
		}
	}
}
