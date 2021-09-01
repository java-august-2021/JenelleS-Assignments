package com.JenelleHanson.lookify2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.lookify2.models.Lookify2;
import com.JenelleHanson.lookify2.repositories.Lookify2Repository;

@Service
public class Lookify2Service {
	@Autowired
	private final Lookify2Repository lRepo;

	public Lookify2Service(Lookify2Repository lRepo) {
		this.lRepo = lRepo;
	}
	
	public List<Lookify2> allSongs() {
		return this.lRepo.findAll();
	}
	
	public List<Lookify2> findTopTen() {
		return this.lRepo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Lookify2> searchArtist(String artist){
		return this.lRepo.findByArtistContaining(artist);		
	}
	
	public Lookify2 createSong(Lookify2 song) {
		return lRepo.save(song);
	}
	
	public Lookify2 findSong(Long id) {
		return this.lRepo.findById(id).orElse(null);
//		Optional<Lookify2> optionalSong = lRepo.findById(id);
//		if(optionalSong.isPresent()) {
//			return optionalSong.get();
//		} else {
//			return null;
//		} functionally the same as above
	}
	
	public Lookify2 updateSong(Lookify2 song) {
		return lRepo.save(song);
	}
	
	public void deleteSong(Long id) {
		this.lRepo.deleteById(id);
	}
}
