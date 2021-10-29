package com.JenelleHanson.YogaSite.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String name;
	private String picture;
	@Email
	@NotBlank
	private String email;
	@Size(min=8)
	private String password;
	@Transient
	private String passwordConfirm;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	
//	one to many
//	private List<video> videos;
//	many to many
//	private List<video> favorited;
//	
	//list Of 
	//private List<String> albums;
	//private List<String> favoritePics;
	//private List<String> comments;
	
	public User() {
	}
	
	@PrePersist
	protected void onCreate() {
	        this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
	        this.updatedAt = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	
//	public List<Video> getVideos() {
//		return videos;
//	}
//
//	public void setVideos(List<Video> videos) {
//		this.videos = videos;
//	}
//
//	public List<Video> getFavorited() {
//		return favorited;
//	}
//
//	public void setFavorited(List<Video> favorited) {
//		this.favorited = favorited;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
