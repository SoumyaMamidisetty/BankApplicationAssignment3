package com.assignment3.bankapp;

import java.util.ArrayList;
import java.util.List;

class Branch {

	private String branchId;
	private String branchName;
	private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
	private List<Customer> customers = new ArrayList<Customer>();

	public Branch(String branchId, String branchName) {
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public void printMyName() {
		// Dummy Method
		System.out.println(branchId + " : " + branchName);
	}

	public void createBankAccount(String panNumber, String type, double amount) {
		// Check if the panNumber exits
		// Add to existing cutomer

		// If not exits
		// Create a new Customer
		// TODO generate Auto account number
		Customer customer = new Customer(panNumber, 10001);
		// we cannot create bankaccount object because it is abstract class
		// BankAccount bankacc = new BankAccount("10001", 10000, amount, 4 );
		SavingAccount savingAcc = new SavingAccount("10001", 10000, amount, 4);
		bankAccounts.add(savingAcc);
		customer.setBankAccount(savingAcc);
		

	}

	public Customer getCustomerByPanNumber(String panNumbder) { 
		// Input Params

		// Customer customer = new Customer();

		return null; // output parameters
	}

	public String getAccountByAccountNumber() {

		return "";

	}

	public String getBranchId() {

		return branchId;

	}

	public String getBranchName() {
		return branchName;
	}
}
