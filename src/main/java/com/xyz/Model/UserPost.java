package com.xyz.Model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class UserPost {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int userPostId;
	private int userPostlikes;
	private String userPostText;
	private Date userPostDate;
	private Time userPostTime;
	private String userPostImage;
	private String userPostVideo;
	public int getUserPostId() {
		return userPostId;
	}
	public void setUserPostId(int userPostId) {
		this.userPostId = userPostId;
	}
	public int getUserPostlikes() {
		return userPostlikes;
	}
	public void setUserPostlikes(int userPostlikes) {
		this.userPostlikes = userPostlikes;
	}
	public String getUserPostText() {
		return userPostText;
	}
	public void setUserPostText(String userPostText) {
		this.userPostText = userPostText;
	}
	public Date getUserPostDate() {
		return userPostDate;
	}
	public void setUserPostDate(Date userPostDate) {
		this.userPostDate = userPostDate;
	}
	public Time getUserPostTime() {
		return userPostTime;
	}
	public void setUserPostTime(Time userPostTime) {
		this.userPostTime = userPostTime;
	}
	public String getUserPostImage() {
		return userPostImage;
	}
	public void setUserPostImage(String userPostImage) {
		this.userPostImage = userPostImage;
	}
	public String getUserPostVideo() {
		return userPostVideo;
	}
	public void setUserPostVideo(String userPostVideo) {
		this.userPostVideo = userPostVideo;
	}
	@Override
	public String toString() {
		return "UserPost [userPostId=" + userPostId + ", userPostlikes=" + userPostlikes + ", userPostText="
				+ userPostText + ", userPostDate=" + userPostDate + ", userPostTime=" + userPostTime
				+ ", userPostImage=" + userPostImage + ", userPostVideo=" + userPostVideo + "]";
	}
	
}
