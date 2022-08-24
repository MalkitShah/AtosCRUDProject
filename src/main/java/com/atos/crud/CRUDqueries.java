package com.atos.crud;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDqueries {
	/*
	  	This is the class that will be carrying out the CRUD queries - where we will be connecting to the database 
	 	4 main things to connect to the DB :
	 	1) Open the connection
	 	2) Write your query
	 	3) Execute the query
	 	4) Close the connection
	 	
	 	
	 */
	private Connection connect;
	private Statement statement;
	private ResultSet rst;
	
	//Open connection within the constructor - initiliase everything
	public CRUDqueries() {
		try {
			connect = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.password);
			this.statement = connect.createStatement();  // this is creating a statement object to execute sql queries 
			System.out.println("Connected Successfully");
			
		} catch(SQLException e) {
			System.out.println("You have provided incorrect credentials");
			e.printStackTrace();
		}
		
	
	
	}
	
	// running queries through CLI 
	// Create Queries 
	
	public void create(String title, String first_name, String last_name, int phone_number, String postcode) {

		String createstatement = "INSERT INTO CUSTOMER(title, first_name, last_name, phone_number, postcode) VALUES('"+title+"','"+first_name+"','"+last_name+"',"+phone_number+",'"+postcode+"');";  
		
		try { 
			statement.executeUpdate(createstatement);
			System.out.println("Your create statement has been executed!");
		}
		catch(SQLException e) {
			System.out.println("Your statement could not be executed");
			e.printStackTrace();
		}
		
		
	}
	
	
	// -- SELECT from DB command
	public void read() {
		String readstatement = "SELECT * FROM CUSTOMER";
		try {
			rst = statement.executeQuery(readstatement);
			while(rst.next()) {
				System.out.println("ID: " + rst.getInt("id"));
				System.out.println("Title: " + rst.getString("title"));
				System.out.println("First Name: " + rst.getString("first_name"));
				System.out.println("Last Name: " + rst.getString("last_name"));
				System.out.println("Phone Number: " + rst.getInt("phone_number"));
				System.out.println("Postcode: " + rst.getString("postcode"));
			}
			
			
		}catch(SQLException e){
			System.out.println("Bad Query");
			e.printStackTrace();
			
		}
		
	}
	
	// --UPDATE from DB command
	public void update(int id, String updateVal) {
		String updatestatement = "UPDATE CUSTOMER SET first_name = '" +updateVal+ "' WHERE id = " + id + ";";
		try {
			statement.executeUpdate(updatestatement);
			System.out.println("Statement has been updated accordingly");
		} catch(SQLException e) {
			System.out.println("Bad Input");
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		String delStatement = "DELETE FROM CUSTOMER WHERE id = "+id+";";
		try {
			statement.executeUpdate(delStatement);
			System.out.println("The data has been deleted for the specified ID");
		} catch(SQLException e) {
			System.out.println("Bad query");
			e.printStackTrace();
		}
	}
	
	
	
	//Close the connection to the DB
	public void closeConnect() {
		try { 
			connect.close();
			System.out.println("Closed connection to database");
		}
		catch(SQLException e) {
			System.out.println("Closing connection to datbase..");
			e.printStackTrace();
		}
		
	}
}
