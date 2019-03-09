package com.cg.mri.dao;

import com.cg.mri.beans.Account;

public interface AccountDao {

	Account getAccountDetails(String mobile);
	int rechargeAccount(String mobile,double rechargeAmount);
	
}
