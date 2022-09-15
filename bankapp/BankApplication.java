package com.assignment3.bankapp;

import java.util.List;

public class BankApplication {

	public static void main(String args[]) {

		// Step 1 . Create a HeadOffice
		HeadOffice headOffice = new HeadOffice();

		// Step2 . Create branch
		headOffice.createBranch("1", "BTM Branch");
		headOffice.createBranch("2", "MG Road Branch");
		headOffice.createBranch("3", "WhiteField Branch");
		headOffice.createBranch("4", "Belandur Branch");
		headOffice.createBranch("5", "Marthalli Branch");

		Branch branch1 = headOffice.getBranchById(5);
		branch1.printMyName(); //TODO Remove

		List<Branch> branches_list = headOffice.getAllBranches();  //TODO Remove
		// Print all branches names

		for (int i = 0; i < branches_list.size(); i++) { //TODO Remove
			System.out.println(branches_list.get(i).getBranchName()+ "," +branches_list.get(i).getBranchId());
		}

		// Step 3 
		//Create a bank account for branch 1
		branch1.createBankAccount("BBSOU6555M", "Savings", 100000.00);
		
	}

}
