package models1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity; //import de la javax qui est la spécification
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carnet implements Serializable
{
	@Override
	public String toString() {
		return "Carnet [id=" + id + ", nomCarnet=" + nomCarnet + ", contacts=" + contacts + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nomCarnet;
	@OneToMany(mappedBy="carnet", cascade = CascadeType.ALL)//, fetch=FetchType.EAGER)//fetch eager pour aller chercher la liste de contacts dans le findAll
	private List<Contact> contacts = new ArrayList<Contact>();;
	
	
	
	public Carnet() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomCarnet() {
		return nomCarnet;
	}
	public void setNomCarnet(String nomCarnet) {
		this.nomCarnet = nomCarnet;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
