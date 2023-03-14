package com.xyz.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class DrDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String mailId;
	private String contact;
	private String address;
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	@OneToMany(cascade=CascadeType.ALL)
	private List<UserPost> userPosts =new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public List<UserPost> getUserPosts() {
		return userPosts;
	}
	public void setUserPosts(List<UserPost> userPosts) {
		this.userPosts = userPosts;
	}
	@Override
	public String toString() {
		return "DrDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailId=" + mailId
				+ ", contact=" + contact + ", address=" + address + ", login=" + login + ", userPosts=" + userPosts
				+ "]";
	}
	
}
