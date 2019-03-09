package com.cg.mri.service;

import com.cg.mri.beans.Account;
import com.cg.mri.dao.AccountDao;
import com.cg.mri.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{

	AccountDao accountDao=new AccountDaoImpl();
	public Account getAccountDetails(String mobile) {
		
		return accountDao.getAccountDetails(mobile);
	}
	public int rechargeAccount(String mobile, double rechargeAmount) {
		return accountDao.rechargeAccount(mobile, rechargeAmount);	
	}

}
