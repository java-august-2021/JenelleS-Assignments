package com.JenelleHanson.YogaSite.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="albums")
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//user id or
	//private ArrayList<String> albums;

	public Album() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
