package com.cg.oracle.bank.service;

import com.cg.oracle.bank.beans.Customer;

public interface CustomerDetailsService {


	long registration(Customer customer) throws Exception;
	boolean login(int accountNo, String password);
	
}
