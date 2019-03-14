package com.cg.oracle.bank.dao;

import java.sql.*;
import com.cg.oracle.bank.beans.*;
import com.cg.oracle.bank.utility.*;

public class CustomerDetailsDaoImpl implements CustomerDetailsDao {
	
	Customer customer = new Customer();
	static Database con = new Database();

	public long registration(Customer customer) throws Exception {
		PreparedStatement pst1 = con.connect().prepareStatement(
				"insert into customer_details(account_no,first_name,last_name,email_id,password,pancard_no,aadhar_no,address,mobile_no,balance) values(?,?,?,?,?,?,?,?,?,?)");
		pst1.setLong(1, customer.getAccountNo());
		pst1.setString(2, customer.getFirstName());
		pst1.setString(3, customer.getLastName());
		pst1.setString(4, customer.getEmail());
		pst1.setString(5, customer.getPassword());
		pst1.setString(6, customer.getPancardNo());
		pst1.setString(7, customer.getAadharNo());
		pst1.setString(8, customer.getAddress());
		pst1.setString(9, customer.getMobile());
		pst1.setDouble(10, customer.getBalance());
		int i = pst1.executeUpdate();
		if (i == 1) {
			PreparedStatement pst2 = con.connect().prepareStatement("select account_no from customer_details");
			ResultSet rs = pst2.executeQuery();
			return rs.getLong(1);
		}
		return 0;
	}

	public boolean login(int accountNo, String password) {
		return false;
	}

}
