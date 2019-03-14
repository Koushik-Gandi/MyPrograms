package com.cg.oracle.bank.dao;

import java.sql.*;
import com.cg.oracle.bank.beans.*;
import com.cg.oracle.bank.exceptions.*;
import com.cg.oracle.bank.utility.*;

public class CustomerDetailsDaoImpl implements CustomerDetailsDao {

	Customer customer = new Customer();
	static Database con = new Database();

	public long registration(Customer customer) throws Exception {
		PreparedStatement pst1 = con.connect()
				.prepareStatement("insert into customer_details values(account_no.nextval,?,?,?,?,?,?,?,?,?)");
		// pst1.setLong(1, customer.getAccountNo());
		pst1.setString(1, customer.getFirstName());
		pst1.setString(2, customer.getLastName());
		pst1.setString(3, customer.getEmail());
		pst1.setString(4, customer.getPassword());
		pst1.setString(5, customer.getPancardNo());
		pst1.setString(6, customer.getAadharNo());
		pst1.setString(7, customer.getAddress());
		pst1.setString(8, customer.getMobile());
		pst1.setDouble(9, customer.getBalance());
		int i = pst1.executeUpdate();
		if (i == 1) {
			PreparedStatement pst2 = con.connect().prepareStatement("select account_no from customer_details");
			ResultSet rs = pst2.executeQuery();
			rs.next();
			return rs.getLong(1);
		}
		return 0;
	}

	public boolean login(long accountNo, String password) throws Exception {
		// System.out.println("Entered " +accountNo+" "+password);
		PreparedStatement pst = con.connect()
				.prepareStatement("select password from customer_details where account_no=" + accountNo);
		ResultSet rs = pst.executeQuery();
		rs.next();
		if (rs.getString("password").equals(password)) {
			//System.out.println("Matched");
			return true;
		} else
			throw new InvalidPassword("Invalid Password");
	}

}
