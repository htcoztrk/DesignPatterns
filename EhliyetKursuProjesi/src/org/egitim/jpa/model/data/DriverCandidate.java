package org.egitim.jpa.model.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.egitim.jpa.model.data.base.BaseEntity;
import org.joda.time.DateTime;

@Entity
@Table(name = "candidates")
public class DriverCandidate extends BaseEntity{

	
	private static final long serialVersionUID = -4987889110519648543L;

	@Column(name = "identity_number", length = 11, nullable = false, unique = true)
	private String identity_number;
	
	@Column(name = "register_date", nullable = false)
	private Date registerDate;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_id")
	Course course;
	
	@Transient
	@Override
	public String getInfo() {
		return  "Name: "+this.getName()+" "+this.getSurname()+" "+
				"Transaction Date: "+(new DateTime(this.getTransactionDate())).toString("dd.mm.yyyy hh.mm");
	}

	public String getIdentity_number() {
		return identity_number;
	}

	public void setIdentity_number(String identity_number) {
		this.identity_number = identity_number;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
}
