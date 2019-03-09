package com.cg.hotel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.cg.hotel.utility.Database;

public class HotelDaoImpl implements HotelDao{
	int room,i;
	Scanner sc=new Scanner(System.in);
	Database database=new Database();
	Validation validate=new Validation();
	public void bookRoom() throws Exception {
		PreparedStatement pst=database.connection().prepareStatement("insert into CustomerDetails(CustName,EMail,CustAddress,MobileNo,RoomType,RoomNo) values"+"(?,?,?,?,?,?)");
		System.out.println("Enter Your Details.\n");
		System.out.println("Enter Name :");
		pst.setString(1, sc.next());
		System.out.println("Enter Email :");
		String email=sc.next();
		if(validate.emailValidate(email))
		pst.setString(2,email);
		else System.out.println("Invalid Email");
		System.out.println("Enter Address :");
		pst.setString(3, sc.next());
		System.out.println("Enter Mobile :");
		long number=sc.nextLong();
		if(validate.mobileValidate(number))
		pst.setLong(4,number);
		else System.out.println("Invalid Phone Number");
		System.out.println("Enter Room Type :");
		String roomType=sc.next();
		pst.setString(5, roomType);
		System.out.println("Enter RoomNo :");
		room=sc.nextInt();
		pst.setInt(6, room);
		if(validate.roomNoValidate(room, roomType)) {
			i=pst.executeUpdate();
		}
		else System.out.println("Invalid Details.");
		
		if(i==1) {
			PreparedStatement pst1=database.connection().prepareStatement("Select CustID from CustomerDetails where RoomNo="+"?");
			pst1.setInt(1, room);
			PreparedStatement pst2=database.connection().prepareStatement("update RoomsDetail set Status='Booked' where RoomNo="+"?");
			pst2.setInt(1, room);
			pst2.executeUpdate();
			ResultSet rs1=pst1.executeQuery();
			rs1.next();
			System.out.println("Your Room has been successfully booked. Your CustomerID is :"+rs1.getInt(1));
			
		}
	}

	public void checkStatus() throws  Exception {
		System.out.println("Enter RoomNo :");
		int roomNo=sc.nextInt();
		PreparedStatement pst=database.connection().prepareStatement("select * from RoomsDetail where RoomNo="+"?");
		pst.setInt(1, roomNo);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			if(rs.getInt(1)==roomNo)
			System.out.println(rs.getString(3));
		}
	}	

}
