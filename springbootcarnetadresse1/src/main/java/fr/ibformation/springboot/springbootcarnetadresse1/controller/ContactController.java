package fr.ibformation.springboot.springbootcarnetadresse1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.ibformation.springboot.springbootcarnetadresse1.dao.ContactRepository;
import models1.Contact;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping(path="/allcontacts")
	public @ResponseBody Iterable<Contact> getAllContacts() {
		// This returns a JSON or XML with the users
		return contactRepository.findAll();
	}

	
}
