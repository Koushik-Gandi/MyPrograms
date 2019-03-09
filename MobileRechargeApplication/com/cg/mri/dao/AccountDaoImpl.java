package com.cg.mri.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mri.beans.Account;

public class AccountDaoImpl implements AccountDao{

	Map<String,Account> accountEntry;
	
	public AccountDaoImpl() {
		accountEntry=new HashMap<>();
		accountEntry.put("9911223344",new Account("Prepaid","Koushik",560));
		accountEntry.put("9123456789",new Account("Prepaid","Prabhusai",420));
		accountEntry.put("9987654321",new Account("Prepaid","Vivek",390));
		accountEntry.put("9988776655",new Account("Prepaid","Pavan",410));
		accountEntry.put("9898787878",new Account("Prepaid","Shiva",320));
	}
	public Account getAccountDetails(String mobile) {
		
		if(accountEntry.containsKey(mobile)) {
			Account getValues=new Account();
			getValues=accountEntry.get(mobile);
			return getValues;
		}	
		else
			return null;
		
	}

	
	public int rechargeAccount(String mobile, double rechargeAmount) {
		if(accountEntry.containsKey(mobile)) {
			Account getValues=new Account();
			double amount=accountEntry.get(mobile).getAccount_amount()+rechargeAmount;
			System.out.println("Your Account Recharged Successfully.");
			System.out.println("Hi "+getValues.getCustomer_name()+" ,Available Balance is "+amount);	
		}	
		else {
			System.out.println("ERROR: Cannot Recharge Account as Given Mobile No Does Not Exists");
		}
		return 0;
			
	}
	
}
