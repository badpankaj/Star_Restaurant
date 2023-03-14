package com.xyz.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@javax.persistence.Entity
public class Login {
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
		
	    private int id;
		private String userName;
		private String password;
		private int mastertypeid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getMastertypeid() {
			return mastertypeid;
		}
		public void setMastertypeid(int mastertypeid) {
			this.mastertypeid = mastertypeid;
		}
		@Override
		public String toString() {
			return "Login [id=" + id + ", userName=" + userName + ", password=" + password + ", mastertypeid="
					+ mastertypeid + "]";
		}
		
		
}
