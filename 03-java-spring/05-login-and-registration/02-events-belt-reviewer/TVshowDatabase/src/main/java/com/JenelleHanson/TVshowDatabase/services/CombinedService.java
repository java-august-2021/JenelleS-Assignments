package com.JenelleHanson.TVshowDatabase.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.TVshowDatabase.models.Rating;
import com.JenelleHanson.TVshowDatabase.models.Show;
import com.JenelleHanson.TVshowDatabase.models.User;
import com.JenelleHanson.TVshowDatabase.repositories.RatingRepository;
import com.JenelleHanson.TVshowDatabase.repositories.ShowRepository;
import com.JenelleHanson.TVshowDatabase.repositories.UserRepository;

@Service
public class CombinedService {
	@Autowired
	private ShowRepository sRepo;
	
	@Autowired
	private RatingRepository rRepo;

	@Autowired
	private UserRepository uRepo;	

	public CombinedService(ShowRepository sRepo, RatingRepository rRepo, UserRepository uRepo) {
		this.sRepo = sRepo;
		this.rRepo = rRepo;
		this.uRepo = uRepo;
	}

	//Shows
	public List<Show> allShows(){
		return this.sRepo.findAll();
	}

	public Show findShow(Long id) {
		return this.sRepo.findById(id).orElse(null);
	}
	
	public Show createShow(Show Show) {
		return this.sRepo.save(Show);
	}
	
	public Show updateShow(Show Show) {
		return this.sRepo.save(Show);
	}
	
	public void deleteShow(Long id) {
		this.sRepo.deleteById(id);
	}
	
	//Rating
	public List<Rating> allRatings(){
		return this.rRepo.findAll();
	}
	
	public Rating createRating(Rating rating) {
		return this.rRepo.save(rating);
	}
	
	public Rating findRating(Long id) {
		Rating rating = this.rRepo.findById(id).orElse(null);
		return rating;
	}
	
	//User info
	public List<User> allUsers(){
		return this.uRepo.findAll();
	}
	
	public User findUser(Long id) {
		User user = this.uRepo.findById(id).orElse(null);
		return user;
	}
	
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = this.uRepo.findByEmail(email);
		
		if(user==null) {
			return false;
		}
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
}
