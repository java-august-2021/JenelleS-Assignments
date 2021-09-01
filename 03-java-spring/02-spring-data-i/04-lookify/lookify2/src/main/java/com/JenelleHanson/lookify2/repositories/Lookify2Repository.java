package com.JenelleHanson.lookify2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.lookify2.models.Lookify2;

@Repository
public interface Lookify2Repository extends CrudRepository<Lookify2, Long> {
	List<Lookify2> findAll();
	List<Lookify2> findTop10ByOrderByRatingDesc();
	List<Lookify2> findByArtistContaining(String artist);
}
