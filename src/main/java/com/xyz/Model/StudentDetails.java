package com.xyz.Model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String mailId;
	private String contact;
	private Date dob;
    private String gender;
    private String profilePicture;
    private String schoolName;
	private String jrCollegeName;
	private String srCollegeName;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getJrCollegeName() {
		return jrCollegeName;
	}
	public void setJrCollegeName(String jrCollegeName) {
		this.jrCollegeName = jrCollegeName;
	}
	public String getSrCollegeName() {
		return srCollegeName;
	}
	public void setSrCollegeName(String srCollegeName) {
		this.srCollegeName = srCollegeName;
	}
	public List<UserPost> getUserPosts() {
		return userPosts;
	}
	public void setUserPosts(List<UserPost> userPosts) {
		this.userPosts = userPosts;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mailId=" + mailId
				+ ", contact=" + contact + ", dob=" + dob + ", gender=" + gender + ", profilePicture=" + profilePicture
				+ ", schoolName=" + schoolName + ", jrCollegeName=" + jrCollegeName + ", srCollegeName=" + srCollegeName
				+ ", userPosts=" + userPosts + "]";
	}
}
	