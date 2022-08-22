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
