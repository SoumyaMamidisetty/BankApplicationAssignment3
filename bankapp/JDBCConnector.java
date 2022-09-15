package com.assignment3.bankapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.assignment1.managingcontacts.Address;
import com.assignment1.managingcontacts.Contact;
import com.assignment1.managingcontacts.PhoneNumber;

public class JDBCConnector {

	static Connection conn = null;

	public static void createJDBCConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "SRojesh091692");

			// Statement stmt = conn.createStatement();
			// stmt.executeUpdate(
			// "INSERT INTO AddressBook.BOOK (NAME,Organisation,PhoneNumber,Addresses)
			// VALUES('ROJESH','MEDTRONIC','678789532','TAVARKEREE')");

			// ResultSet rs = stmt.executeQuery("SELECT * FROM AddressBook.Book");

			/*
			 * while (rs.next()) { // Display values System.out.println("Name" +
			 * rs.getString(1) + "Organisation" + rs.getString(2) + "PhoneNumber" +
			 * rs.getString(3) + "Addresses" + rs.getString(4)); }
			 */

		} catch (Exception e) {

		}

	}

	public static void InsertContact(Contact contact) throws Exception {

		Statement stmt = conn.createStatement();
		/*
		 * stmt.executeUpdate(
		 * "INSERT INTO AddressBook.BOOK (NAME,Organisation,PhoneNumber,Addresses) VALUES("
		 * +contact.getName()+"," +
		 * ""+contact.getOrganisation()+","+contact.getPhoneNumber()+","+contact.
		 * getAdresses()+")");
		 */

		// Changig list to String
		String allNumbers = "";
		List<PhoneNumber> phoneNumbes = contact.getPhoneNumbers();
		for (PhoneNumber phone : phoneNumbes) {
			allNumbers = allNumbers + phone.getPhoneNumber() + " : " + phone.getLabel();
		}

		System.out.print(allNumbers);

		String allAddresses = " ";
		List<Address> addresses = contact.getAddresses();
		for (Address address : addresses) {
			allAddresses = allAddresses + address.getAddress() + " : " + address.getLabel();
		}

		System.out.print(allAddresses);
		String name = contact.getName();
		String organisation = contact.getOrganisation();
		// System.out.print(name);

		stmt.executeUpdate("INSERT INTO AddressBook.BOOK (NAME,Organisation,PhoneNumber,Addresses) " + "VALUES ('"
				+ name + "','" + organisation + "','" + allNumbers + "','" + allAddresses + "')");

	}

	public static void ReadContact() {

	}

	public static void closeJDBCConnection() throws Exception {
		conn.close();
	};

}
