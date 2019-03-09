package com.cg.mri.service;

import com.cg.mri.beans.Account;

public interface AccountService {

	Account getAccountDetails(String mobile);
	int rechargeAccount(String mobile,double rechargeAmount);
	
}
