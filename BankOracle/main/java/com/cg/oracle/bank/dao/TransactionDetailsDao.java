package com.cg.oracle.bank.dao;

public interface TransactionDetailsDao {

	int deposit(double amount);
	int debit(double amount);
	int checkBalance(double amount);
	int fundTransfer(double amount);
}
