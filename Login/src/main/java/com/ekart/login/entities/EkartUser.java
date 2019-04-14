package com.ekart.login.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class EkartUser extends AbstractEntity {
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String gender;
	@Column
	private String dob;
	@OneToMany(targetEntity = Addrerss.class, cascade = CascadeType.PERSIST, mappedBy = "id")
	private Set<Addrerss> address_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Set<Addrerss> getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Set<Addrerss> address_id) {
		this.address_id = address_id;
	}

	@Override
	public String toString() {
		return "EkartUser [name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + ", address_id="
				+ address_id + "]";
	}

}
