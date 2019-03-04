package com.website.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
	public static List itemsList=new ArrayList();
	static Scanner sc=new Scanner(System.in);
	public static void select() throws Exception {
		System.out.println("1)Male\n2)Female\n3)Child");
		int ch=sc.nextInt();
		
				switch(ch) {
				case 1:Male.male();
					   break;
				case 2:Female.female();
						break;
				case 3:Child.child();
						break;
				case 4: System.exit(0);
				default :System.out.println("enter correct choice");
				}
			
			
		}	
}
