package com.website.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Male extends Shopping {
	
	public static void male() throws Exception {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
		System.out.println("Please Enter your choice\n1. Male Fashion\n2. Male Home and Kitchen\n3. Male Electronics\n4.If done with shopping...pls view the list of items...");
		ch=sc.nextInt();
		switch(ch) {
			case 1:maleFashion();
					break;
			case 2:homeAndKitchen();
					break;
			case 3:electronics();
					break;
			case 4:printitems();
					break;
			default: System.out.println("please enter correct choice");
			}
		}while(ch<4);
		
	}
	

     public static void maleFashion() {
		System.out.println("select item \n 1.Shirt\n 2.Trousers");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		
		if(choice==1) {
			String mfitem1="Shirt";
			int mfprice1=2999;
			int mfitemNo1=1;
			itemsList.add(mfitem1);
			itemsList.add(mfprice1);
			itemsList.add(mfitemNo1);
			
			System.out.println("your order is shirt");
		}
		else if(choice==2) {
			String mfitem2="Trousers";
			int mfprice2=1999;
			int mfitemNo2=2;
			itemsList.add(mfitem2);
			itemsList.add(mfprice2);
			itemsList.add(mfitemNo2);
		}
     }
     
     public static void homeAndKitchen() {
    	 
    	 System.out.println("select item \n 1.Beard Oil\n 2.Mustach oil");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		if(choice==1) {
 			String mkitem1="OilForBeard";
 		    int mkprice1=2000;
 		    int mkitemNo1=1;
 		    itemsList.add(mkitem1);
 		    itemsList.add(mkprice1);
 		    itemsList.add(mkitemNo1);
 		}
 		else if(choice==2) { 
 			String mkitem2="OilForMustach";
 			int mkprice2=1500;
 			int mkitemNo2=2;
 			itemsList.add(mkitem2);
 			itemsList.add(mkprice2);
 			itemsList.add(mkitemNo2);
				 
 		}	
      }
     
     public static void electronics() {
    	 System.out.println("select item \n 1.Trimmer\n 2. Smart Watch");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		 switch(choice) {
 		 case 1: String meitem1="Trimmer";
 		   		 int meprice1=2050;
 		 		 int meitemNo1=1;
 		 		 itemsList.add(meitem1);
				 itemsList.add(meprice1);
				 itemsList.add(meitemNo1);
				 break;
 		 case 2: String meitem2="Smart Watch";
 				 int meprice2=1500;
 				 int meitemNo2=2;
 				 itemsList.add(meitem2);
				 itemsList.add(meprice2);
				 itemsList.add(meitemNo2);
				 break;
 		 default: System.out.println("please enter correct choice");
 		}
     }
     
     static public void printitems() throws Exception {
    	 int sum=0;
  	   for(int i=0;i<itemsList.size();i++){
  		    System.out.println(itemsList.get(i));  
  		}
  	   System.out.println("////////////////////////////");
  	 for(int i=1;i<itemsList.size();i+=3){
		    sum=sum+(Integer)itemsList.get(i);
		}
  	 System.out.println("the total cost is :"+sum);
  	 custDetails();
     }
     
     
     public static void custDetails() throws Exception {
    	 PaymentMode.payment();
    	 finalItemsList();
     }
     
     public static void finalItemsList() {
    	 for(int i=0;i<itemsList.size();i++){
   		    System.out.println(itemsList.get(i));  
   		}
     }
}
