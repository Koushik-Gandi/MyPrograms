package com.cg.oracle.bank.service;

import com.cg.oracle.bank.beans.Customer;
import com.cg.oracle.bank.dao.*;

public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	CustomerDetailsDao customerDetails = new CustomerDetailsDaoImpl();

	public long registration(Customer customer) throws Exception {
		return customerDetails.registration(customer);
	}

	public boolean login(int accountNo, String password) {
		return customerDetails.login(accountNo, password);
	}

}
