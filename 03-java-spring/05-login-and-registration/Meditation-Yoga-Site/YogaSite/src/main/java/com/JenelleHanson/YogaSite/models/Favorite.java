package com.JenelleHanson.YogaSite.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//User id or
	//private ArrayList<String> favoritePics;
	public Favorite() {
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
