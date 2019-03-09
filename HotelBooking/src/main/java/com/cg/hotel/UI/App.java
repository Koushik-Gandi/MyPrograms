package com.cg.hotel.UI;

import java.util.Scanner;

import com.cg.hotel.service.*;

public class App 
{
	 static void select() throws Exception {
		 Scanner sc=new Scanner(System.in);
		 HotelService hotelService=new HotelServiceImpl();
		 System.out.println("1)Book Room\n2)View Booking Status\n3)Exit");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:hotelService.bookRoom();
		 		break;
		 case 2:hotelService.checkStatus();
		 		break;
		 case 3:exit();
		 }
	 }
	
	 static void exit() {
		System.exit(0);
	}

	public static void main( String[] args ) throws Exception
    {
        select();
    }
}
