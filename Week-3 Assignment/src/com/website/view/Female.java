package com.website.view;

import java.util.Scanner;

public class Female extends Shopping{
	public static void female() throws Exception {
		System.out.println("1)Fashion(Clothes,shoes and bags)\n2)Home and Kitchen\n3)Electronics");
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do{
			System.out.println("Please Enter your choice\n1. Female Fashion\n2. female Home and Kitchen\n3. Female Electronics\n4.If done with shopping...pls view the list of items...");
			ch=sc.nextInt();
			switch(ch) {
			case 1:femaleFashion();
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
	

     public static void femaleFashion() {
		System.out.println("select item \n 1.Saree\n 2.MakeUp Kit");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice) {
		case 1: String ffitem1="Saree";
				int ffprice1=1999;
				int ffitemNo1=1;
				itemsList.add(ffitem1);
				itemsList.add(ffprice1);
				itemsList.add(ffitemNo1);
				break;
		case 2: String ffitem2="MakeUp Kit";
				int ffprice2=1699;
				int ffitemNo2=2;
				itemsList.add(ffitem2);
				itemsList.add(ffprice2);
				itemsList.add(ffitemNo2);
				break;
		default: System.out.println("please enter correct choice");
		}	
     }
     
     public static void homeAndKitchen() {
    	 
    	 System.out.println("select item \n 1. Dining set\n 2.Induction Stove");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		 switch(choice) {
 		 case 1: String fhitem1="Dining Set";
 		   		 int fhprice1=5999;
 		 		 int fhitemNo1=1;
 		 		 itemsList.add(fhitem1);
				 itemsList.add(fhprice1);
				 itemsList.add(fhitemNo1);
				 break;
 		 case 2: String fhitem2="Induction Stove";
 				 int fhprice2=3500;
 				 int fhitemNo2=2;
 				 itemsList.add(fhitem2);
				 itemsList.add(fhprice2);
				 itemsList.add(fhitemNo2);
				 break;
 		 default: System.out.println("please enter correct choice");
 		}	
      }
     
     public static void electronics() {
    	 System.out.println("select item \n 1.Hair Drier\n 2.Mixer");
 		 Scanner in=new Scanner(System.in);
 		 int choice=in.nextInt();
 		 switch(choice) {
 		 case 1: String feitem1="Hair Drier";
 		   		 int feprice1=2050;
 		 		 int feitemNo1=1;
 		 		 itemsList.add(feitem1);
				 itemsList.add(feprice1);
				 itemsList.add(feitemNo1);
				 break;
 		 case 2: String feitem2="Mixer";
 				 int feprice2=2500;
 				 int feitemNo2=2;
 				 itemsList.add(feitem2);
				 itemsList.add(feprice2);
				 itemsList.add(feitemNo2);
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
