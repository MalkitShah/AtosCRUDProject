package com.atos.crud;
import java.util.Scanner;

public class Runner {
	// Connect to the database so that I can perform CRUD on the table 
	
	//Java Database Connectivity - is an API which allows us to connect to a database from a java application 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CRUDqueries query = new CRUDqueries();
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter your title");
		String title = read.nextLine();
		
		System.out.println("Please enter your first name");
		String first_name = read.nextLine();
		
		System.out.println("Please enter your last name");
		String last_name = read.nextLine();
		
		System.out.println("Please enter your number");
		int phone_number = read.nextInt();
		read.nextLine();
		
		System.out.println("Please enter your Postcode");
		String postcode = read.nextLine();
		
		
		query.create(title, first_name, last_name, phone_number, postcode);
		
		
		query.closeConnect();
	}

}
