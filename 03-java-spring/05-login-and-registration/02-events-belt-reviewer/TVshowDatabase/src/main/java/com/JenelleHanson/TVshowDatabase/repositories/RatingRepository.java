package com.JenelleHanson.TVshowDatabase.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.TVshowDatabase.models.Rating;
@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {
	List<Rating> findAll();
}
