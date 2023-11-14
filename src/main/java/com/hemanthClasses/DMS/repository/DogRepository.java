/**
 * 
 */
package com.hemanthClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hemanthClasses.DMS.Models.Dog;

/**
 * @author Hemanth Kagitha 
 * Nov 12, 2023
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
