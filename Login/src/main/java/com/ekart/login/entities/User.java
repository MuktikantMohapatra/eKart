package com.ekart.login.entities;

import javax.persistence.Entity;

@Entity
public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String dob;
	private Addrerss addressID;
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Addrerss getAddressID() {
		return addressID;
	}

	public void setAddressID(Addrerss addressID) {
		this.addressID = addressID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
