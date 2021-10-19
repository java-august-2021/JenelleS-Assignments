package com.JenelleHanson.YogaSite.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//user id or
	//private ArrayList<String> comments;

	public Comment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
