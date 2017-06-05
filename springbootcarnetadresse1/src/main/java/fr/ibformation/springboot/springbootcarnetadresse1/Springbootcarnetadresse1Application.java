package fr.ibformation.springboot.springbootcarnetadresse1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToMany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.ibformation.springboot.springbootcarnetadresse1.dao.CarnetRepository;
import fr.ibformation.springboot.springbootcarnetadresse1.dao.ContactRepository;
import models1.Carnet;
import models1.Contact;

@SpringBootApplication
public class Springbootcarnetadresse1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootcarnetadresse1Application.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo(CarnetRepository repo, ContactRepository contactRepository)
	{
		return (args)->{
			
			Carnet carnet = new Carnet();
			Contact c1 = new Contact();
			Contact c2 = new Contact();
			
			List<Contact> contacts = carnet.getContacts();
			
			//c1.setBookId(carnet);
			//c2.setBookId(carnet);
			contacts.add(c1);
			contacts.add(c2);
			
			//only save the carnet but not the contacts unless 
			//@OneToMany(mappedBy="carnet", cascade = CascadeType.ALL)
			//private List<Contact> contacts;
			
			repo.save(carnet);
//		//////////////////////////////////////////////	
			
			//works but not cool
//			Carnet carnet = new Carnet();
//			Contact c1 = new Contact();
//			Contact c2 = new Contact();
//			carnet.getContacts().add(c1);
//			carnet.getContacts().add(c2);
//			contactRepository.save(c1);
//			contactRepository.save(c2);
//			repo.save(carnet);
			
			
			
			
		};
	}


//@Bean
public CommandLineRunner demo1(CarnetRepository repoCarnet)
{
	return (args)->{
		repoCarnet.findAll().forEach((carnet)->{
			System.out.println(carnet.getNomCarnet());
		});
		
	};	
}

}
