package com.JenelleHanson.prodsNCats.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.prodsNCats.models.Category;
import com.JenelleHanson.prodsNCats.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	
	// Retrieves a list of all categories for a particular product
    List<Product> findAllByCategories(Category category);
    
    // Retrieves a list of any categories a particular product does not belong to.
    List<Product> findByCategoriesNotContains(Category category);
}
