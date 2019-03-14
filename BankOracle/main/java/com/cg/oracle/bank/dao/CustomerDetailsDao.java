package com.cg.oracle.bank.dao;

import com.cg.oracle.bank.beans.*;

public interface CustomerDetailsDao {
	
	long registration(Customer customer) throws Exception;
	boolean login(int accountNo, String password);
}
