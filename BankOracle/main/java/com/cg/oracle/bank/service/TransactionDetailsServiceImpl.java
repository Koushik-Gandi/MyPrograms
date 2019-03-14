package com.cg.oracle.bank.service;

import com.cg.oracle.bank.dao.*;

public class TransactionDetailsServiceImpl implements TransactionDetailsService {

	TransactionDetailsDao transaction = new TransactionDetailsDaoImpl();

	public int deposit(double amount) {

		return transaction.deposit(amount);
	}

	public int debit(double amount) {
		return transaction.debit(amount);
	}

	public int checkBalance(double amount) {
		return transaction.checkBalance(amount);
	}

	public int fundTransfer(double amount) {
		return transaction.fundTransfer(amount);
	}

}
