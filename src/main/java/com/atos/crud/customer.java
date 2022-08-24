package com.atos.crud;

public class customer {
	private int id;
	private String title;
	private String first_name;
	private String last_name;
	private int phone_number;
	private String postcode;
	
	
	public customer() {
		super();
	}


	public customer(int id, String title, String first_name, String last_name, int phone_number, String postcode) {
		super();
		this.id = id;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.postcode = postcode;
	}
	
	
	
	
	
	public customer(String title, String first_name, String last_name, int phone_number, String postcode) {
		super();
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.postcode = postcode;
	}







	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "customer [title=" + title + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phone_number=" + phone_number + ", postcode=" + postcode + "]";
	}
	
	

}
