package com.assignment3.bankapp;

import java.util.ArrayList;
import java.util.List;

public class HeadOffice {

	private List<Branch> branches = new ArrayList<Branch>(); // Collection

	private Branch branch;

	public HeadOffice() {
		// Default Constructor
	}

	public void createBranch(String id, String branchName) {

		// Create a branch
		branch = new Branch(id, branchName);

		// Adding branch object to a list
		branches.add(branch);

	}

	public Branch getBranchById(int branchID) {
		return branches.get(branchID - 1);

	}

	public List<Branch> getAllBranches() {
		return branches;
	}

}
