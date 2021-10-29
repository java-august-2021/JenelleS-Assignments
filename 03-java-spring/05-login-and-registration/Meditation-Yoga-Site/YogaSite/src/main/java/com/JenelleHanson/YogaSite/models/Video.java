package com.JenelleHanson.YogaSite.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="videos")
public class Video {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String title;
	
//	many to one
//	many to many
	private User uploader;
	private List<User> uFaved;
//	
	//DOJO OVER FLOW WALK THROUGH look up relevant syntax!!!!
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUploader() {
		return uploader;
	}
	public void setUploader(User uploader) {
		this.uploader = uploader;
	}
	public List<User> getuFaved() {
		return uFaved;
	}
	public void setuFaved(List<User> uFaved) {
		this.uFaved = uFaved;
	}
	
}
