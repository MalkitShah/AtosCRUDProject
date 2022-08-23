package com.atos.crud;

import java.util.Scanner;

public class Userchoice {
	
	private static Scanner readi = new Scanner(System.in);
	
	public String getInput() {
		System.out.println("Please enter which CRUD choice you'll like to use ");
		return readi.nextLine();
	}
	
	public void options() {
		// Create an instance of the CRUD queries class so that we can open a connection 
		
		CRUDqueries query = new CRUDqueries();
		
		String crud = getInput();
		
		try {
			do {
				switch(crud.toLowerCase()) {
				case "create" :
					System.out.println("Enter your title ");
					String title = readi.nextLine();
					System.out.println("Please enter your first name");
					String first_name = readi.nextLine();
					System.out.println("Please enter your last name");
					String last_name = readi.nextLine();
					System.out.println("Please enter your number");
					int phone_number = readi.nextInt();
					readi.nextLine();
					System.out.println("Please enter your Postcode");
					String postcode = readi.nextLine();
					query.create(title, first_name, last_name, phone_number, postcode);
					break;
				case "read":
					
					break;
					
				case "update":
					
					break;
				
				case "delete":
					
					break;
					
				default:
					System.out.println("You have inputted a invalid CRUD choice");
				}
				
				System.out.println("Would you like to continue (Y/N)?");
				String quit = readi.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'Y' or 'N' to continue ");
				}
			}
			
			while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			query.closeConnect();
		}
		
	}
	
	
	
	
	
}

	
