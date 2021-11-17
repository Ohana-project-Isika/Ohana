package fr.isika.cda11.ohana.project.common.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idContact;
	private String phoneNb;
	private String phoneNb2;     							 
	private String email;
	
	
	//constructeur
	public Contact( ) {}
	
	//pas de Relation (lien unidirectionnel par PersonInfo)

	//getter et setter
	public String getPhoneNb() {return phoneNb;}
	public void setPhoneNb(String phoneNb) {this.phoneNb = phoneNb;}
	
	public String getPhoneNb2() {return phoneNb2;}
	public void setPhoneNb2(String phoneNb2) {this.phoneNb2 = phoneNb2;}

	public String getEmail() {return email;	}
	public void setEmail(String email) {this.email = email;}

	public long getIdContact() {return idContact;}
	


	// hashCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((idContact == null) ? 0 : idContact.hashCode());
		result = prime * result + ((phoneNb == null) ? 0 : phoneNb.hashCode());
		result = prime * result + ((phoneNb2 == null) ? 0 : phoneNb2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idContact == null) {
			if (other.idContact != null)
				return false;
		} else if (!idContact.equals(other.idContact))
			return false;
		if (phoneNb == null) {
			if (other.phoneNb != null)
				return false;
		} else if (!phoneNb.equals(other.phoneNb))
			return false;
		if (phoneNb2 == null) {
			if (other.phoneNb2 != null)
				return false;
		} else if (!phoneNb2.equals(other.phoneNb2))
			return false;
		return true;
	}


	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [idContact=");
		builder.append(idContact);
		builder.append(", phoneNb=");
		builder.append(phoneNb);
		builder.append(", phoneNb2=");
		builder.append(phoneNb2);
		builder.append(", email=");
		builder.append(email);
		builder.append(", personInfo=");
		builder.append("]");
		return builder.toString();
	}

}