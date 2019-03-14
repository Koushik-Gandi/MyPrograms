package com.cg.oracle.bank.service;

public interface TransactionDetailsService {

	int deposit(double amount);

	int debit(double amount);

	int checkBalance(double amount);

	int fundTransfer(double amount);

}
