package models1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Contact implements Serializable
{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nomContact;
	private String prenomContact;
	private int age;
	private String numeroTelephone;
	@ManyToOne
	private Carnet carnet;
	
	
	public Contact() {
	}

	public String getNomContact() {
		return nomContact;
	}


	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}


	public String getPrenomContact() {
		return prenomContact;
	}


	public void setPrenomContact(String prenomContact) {
		this.prenomContact = prenomContact;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNumeroTelephone() {
		return numeroTelephone;
	}


	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}


	@Override
	public String toString() {
		return "Contact [id="+ id+ " nomContact=" + nomContact + ", prenomContact=" + prenomContact + ", age=" + age
				+ ", numeroTelephone=" + numeroTelephone + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Carnet getBookId() {
		return carnet;
	}


	public void setBookId(Carnet bookId) {
		this.carnet = bookId;
	}
}
