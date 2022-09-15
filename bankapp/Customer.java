package com.assignment3.bankapp;

import java.util.ArrayList;
import java.util.List;

class Customer {

	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	private String panNumber;
	private double accountNumber;
	private BankAccount bankAccount;

	public Customer(String panNumber, double accountNumber) {
		this.panNumber = panNumber;
		this.accountNumber = accountNumber;

	}

	public List<BankAccount> getBankAccounts() {
		return accounts;
	}

	public String getPanNumber() {
		return panNumber;
	}


	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
		this.accounts.add(bankAccount);
	}
}
