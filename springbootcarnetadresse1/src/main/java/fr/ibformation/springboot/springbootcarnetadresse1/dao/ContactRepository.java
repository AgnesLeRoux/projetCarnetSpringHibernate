package fr.ibformation.springboot.springbootcarnetadresse1.dao;

import org.springframework.data.repository.CrudRepository;

import models1.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer>
{
	Contact findByNomContact(String nomContact);//add this method
	
}
