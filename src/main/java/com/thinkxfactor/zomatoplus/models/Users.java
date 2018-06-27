package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_users")
public class Users implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long id;
	
	@Column(name="username",unique=true)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="type")
	private String type;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="pincode")
	private String pincode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Users(Long id, String username, String password, String type, String landmark, String contact,
			String pincode) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.landmark = landmark;
		this.contact = contact;
		this.pincode = pincode;
	}

	public Users() {
		
	}
	
	

}
