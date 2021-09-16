package com.JenelleHanson.prodsNCats.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JenelleHanson.prodsNCats.models.Category;
import com.JenelleHanson.prodsNCats.models.Product;
import com.JenelleHanson.prodsNCats.repositories.CategoryRepository;
import com.JenelleHanson.prodsNCats.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;

	public ProductService(ProductRepository pRepo, CategoryRepository cRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
	}
	
	public List<Product> allProducts() {
		return this.pRepo.findAll();
	}
	
	public void createRelationship(Long productId, Long categoryId) {//Pass these in the correct order
	    
	    // retrieve an instance of a category using another method in the service.
	    Category thisCategory = findCategory(categoryId);
	    
	    // retrieve an instance of a product using another method in the service.
	    Product thisProduct = findProduct(productId);
	    
	    // add the product to this category's list of products
	    thisCategory.getProducts().add(thisProduct);
	    
	    // Save thisCategory, since you made changes to its product list.
	    cRepo.save(thisCategory);
	}
	
	public void createRelate(Long categoryId, Long productId) {//Pass these in the correct order
	    
	    // retrieve an instance of a category using another method in the service.
	    Category thisCategory = findCategory(categoryId);
	    
	    // retrieve an instance of a product using another method in the service.
	    Product thisProduct = findProduct(productId);
	    
	    // add the product to this category's list of products
	    thisProduct.getCategories().add(thisCategory);
	    
	    // Save thisCategory, since you made changes to its product list.
	    pRepo.save(thisProduct);
	}
	
	public Product createProduct(Product product) {
		return pRepo.save(product);
	}
	
	public Product findProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	//Cats
	public List<Category> findCatsNotIncludedByProduct(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public List<Category> findCatsByProduct(Product product){
		return this.cRepo.findAllByProducts(product);
	}
	
	//Prods
	public List<Product> findProdsByCats(Category category){
		return this.pRepo.findAllByCategories(category);
	}
	
	public List<Product> findProdsNotIncludedByCats(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}

	
	//CategoryService
	public List<Category> allCategories() {
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category category) {
		return cRepo.save(category);
	}
	
	public Category findCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
}
