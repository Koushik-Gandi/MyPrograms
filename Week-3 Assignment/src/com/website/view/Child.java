package com.website.view;

import java.util.Scanner;

public class Child extends Shopping{
	
	public static void child() throws Exception {
		System.out.println("1)Fashion(Clothes,shoes and bags)\n2)Home and Kitchen\n3)Electronics");
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do{
			System.out.println("Please Enter your choice\n1. Child Fashion\n2. Child Home and Kitchen\n3. Child Electronics\n4.If done with shopping...pls view the list of items...");
			ch=sc.nextInt();
			switch(ch) {
			case 1:childFashion();
					break;
			case 2:homeAndKitchen();
					break;
			case 3:electronics();
					break;
			case 4: printitems();
					break;
			default: System.out.println("please enter correct choice");
			}
			
		}while(ch<4);
		
	}
	

     public static void childFashion() {
		System.out.println("select item \n dress\n 2.shoes");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice) {
		case 1: String cfitem1="Dress";
				int cfprice1=1599;
				int cfitemNo1=1;
				itemsList.add(cfitem1);
				itemsList.add(cfprice1);
				itemsList.add(cfitemNo1);
				break;
		case 2: String cfitem2="Shoes";
				int cfprice2=699;
				int cfitemNo2=2;
				itemsList.add(cfitem2);
				itemsList.add(cfprice2);
				itemsList.add(cfitemNo2);
				break;
		default: System.out.println("please enter correct choice");
		}	
     }
     
     public static void homeAndKitchen() {
    	 
    	 System.out.println("select item \n 1. Water bottle\n 2.Corn Flakes");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		 switch(choice) {
 		 case 1: String ckitem1="Water bottle";
 		   		 int ckprice1=299;
 		 		 int ckitemNo1=1;
 		 		 itemsList.add(ckitem1);
				 itemsList.add(ckprice1);
				 itemsList.add(ckitemNo1);
				 break;
 		 case 2: String ckitem2="Corn Flakes";
 				 int ckprice2=3500;
 				 int ckitemNo2=2;
 				 itemsList.add(ckitem2);
				 itemsList.add(ckprice2);
				 itemsList.add(ckitemNo2);
				 break;
 		 default: System.out.println("please enter correct choice");
 		}	
      }
     
     public static void electronics() {
    	 System.out.println("select item \n 1.Dancing doll\n 2.Remote car");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		 switch(choice) {
 		 case 1: String ceitem1="Dancing doll";
 		   		 int ceprice1=205;
 		 		 int ceitemNo1=1;
 		 		 itemsList.add(ceitem1);
				 itemsList.add(ceprice1);
				 itemsList.add(ceitemNo1);
				break;
 		 case 2: String ceitem2="Remote car";
 				 int ceprice2=500;
 				 int ceitemNo2=2;
 				 itemsList.add(ceitem2);
				 itemsList.add(ceprice2);
			   	 itemsList.add(ceitemNo2);
				 break;
 		 default: System.out.println("please enter correct choice");
 		}
     }

   public static void printitems() throws Exception {
	    
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


