package fr.ibformation.springboot.springbootcarnetadresse1.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import models1.Carnet;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface CarnetRepository extends CrudRepository<Carnet, Long>
{
	
}
