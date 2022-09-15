package com.assignment3.bankapp;

import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {

	private String accountNumber;
	private double minimumBalance;
	private double currentBalance;
	private double interestRate;
	
	
	public BankAccount(String accountNumber, double minBalance, double currentBal, double interestRate ) {
		this.accountNumber = accountNumber;
		minimumBalance = minBalance;
		this.currentBalance = currentBal;
		this.interestRate = interestRate;
		
	}

	private List<Transaction> transactions = new ArrayList<Transaction>();

	public void withdraw(double amount) {

	}

	public void deposit(double amount) {

	}

	public void getTransactionHistory() {

	}

	public void getMiniStatement() {

	}

	public double getMinimumBalance() {
		return minimumBalance;

	}

	public double getCurrentBalance() {

		return currentBalance;
	}

	public double getInterestRate() {
		return interestRate;

	}

	abstract public void getType();

}

/*
 * //non abstract method or concrete method public void running() {
 * System.out.println("running"); } //running, standing method name
 * //between{}-- is the body of the method
 * 
 * //abstract method public abstract void standing();
 */
