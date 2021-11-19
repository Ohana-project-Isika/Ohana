package fr.isika.cda11.ohana.project.membership.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Membership {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMbs;
	private String nameMbs;
	
	private LocalDate dateOfStart;
	private LocalDate dateOfEnd;
	@Column(scale = 2)
	private BigDecimal priceOfFee;

	// relations
	@ManyToOne
	@JoinColumn(name="MEMBERSHIPMANAGE_ID")
	private MemberShipManage memberShipManage;
	
	@OneToMany
	@JoinColumn(name="MEMBERSHIP_ID")
	private List<Member> members = new ArrayList<Member>();

	//constructeur
	public Membership() {}

	// getter et setter
	public String getNameMbs()			{return nameMbs;}
	public void setNameMbs(String nameMbs){this.nameMbs = nameMbs;	}

	public LocalDate getDateOfStart() 				{return dateOfStart;}
	public void setDateOfStart(LocalDate dateOfStart){this.dateOfStart = dateOfStart;	}

	public LocalDate getDateOfEnd() {return dateOfEnd;}
	public void setDateOfEnd(LocalDate dateOfEnd) {this.dateOfEnd = dateOfEnd;}



	public MemberShipManage getMemberShipManage() {
		return memberShipManage;
	}

	public void setMemberShipManage(MemberShipManage memberShipManage) {
		this.memberShipManage = memberShipManage;
	}

	public void setIdMbs(Long idMbs) {
		this.idMbs = idMbs;
	}



	public long getIdMbs() {return idMbs;}

	public BigDecimal getPriceOfFee() {
		return priceOfFee;
	}

	public void setPriceOfFee(BigDecimal priceOfFee) {
		this.priceOfFee = priceOfFee;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfEnd == null) ? 0 : dateOfEnd.hashCode());
		result = prime * result + ((dateOfStart == null) ? 0 : dateOfStart.hashCode());
		result = prime * result + ((idMbs == null) ? 0 : idMbs.hashCode());
		result = prime * result + ((memberShipManage == null) ? 0 : memberShipManage.hashCode());
		result = prime * result + ((members == null) ? 0 : members.hashCode());
		result = prime * result + ((nameMbs == null) ? 0 : nameMbs.hashCode());
		result = prime * result + ((priceOfFee == null) ? 0 : priceOfFee.hashCode());
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
		Membership other = (Membership) obj;
		if (dateOfEnd == null) {
			if (other.dateOfEnd != null)
				return false;
		} else if (!dateOfEnd.equals(other.dateOfEnd))
			return false;
		if (dateOfStart == null) {
			if (other.dateOfStart != null)
				return false;
		} else if (!dateOfStart.equals(other.dateOfStart))
			return false;
		if (idMbs == null) {
			if (other.idMbs != null)
				return false;
		} else if (!idMbs.equals(other.idMbs))
			return false;
		if (memberShipManage == null) {
			if (other.memberShipManage != null)
				return false;
		} else if (!memberShipManage.equals(other.memberShipManage))
			return false;
		if (members == null) {
			if (other.members != null)
				return false;
		} else if (!members.equals(other.members))
			return false;
		if (nameMbs == null) {
			if (other.nameMbs != null)
				return false;
		} else if (!nameMbs.equals(other.nameMbs))
			return false;
		if (priceOfFee == null) {
			if (other.priceOfFee != null)
				return false;
		} else if (!priceOfFee.equals(other.priceOfFee))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Membership [idMbs=" + idMbs + ", nameMbs=" + nameMbs + ", dateOfStart=" + dateOfStart + ", dateOfEnd="
				+ dateOfEnd + ", priceOfFee=" + priceOfFee + ", memberShipManage=" + memberShipManage + ", members="
				+ members + "]";
	}

	
	
}