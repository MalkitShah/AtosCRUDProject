package com.atos.crud;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
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
		/*
		String title = "Mr";
		String first_name = "Malkit";
		String last_name = "Shah";
		int phone_number = 12234;
		String postcode = "UB56JR";
	*/
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
		
		
	}
	
	// --UPDATE from DB command
	public void update() {
		
		
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
