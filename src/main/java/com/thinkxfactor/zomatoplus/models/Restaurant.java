package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="Restaurant_id")
	private Long Id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="address")
	private String address;
	
	@Column(name="likeCount")
	private Integer likeCount;
	
	@Column(name="contact")
	private Integer contact;
	
	@Column(name="description")
	private String description;
	
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getLikeCount() {
		return likeCount;
	}


	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}


	public Integer getContact() {
		return contact;
	}


	public void setContact(Integer contact) {
		this.contact = contact;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Restaurant(Long id, String name, String website, String address, Integer likeCount, Integer contact,
			String description) {
		super();
		Id = id;
		this.name = name;
		this.website = website;
		this.address = address;
		this.likeCount = likeCount;
		this.contact = contact;
		this.description = description;
	}


	public Restaurant() {
		
	}

}
