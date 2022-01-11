package org.egitim.jpa.model.data;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.joda.time.DateTime;

import net.bytebuddy.asm.Advice.This;


@Entity
@Table(name="courses")
public class Course {

	@Id
	@Column(name = "id", insertable = false, updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "starting_date", nullable = false)
	private Date startingDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false)
	private Date endDate;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@Column(name="vehicle", nullable=false)
	private String vehicle;
	
	//Bir egitmen birden çok kurs verebilir.
	@ManyToOne()
	@JoinColumn(name="instructor_id")
	DriverInstructor instructor;
	
	//Bir kursa birden çok aday başvuru yapabilir. 
	@OneToMany(mappedBy="course")
	List<DriverCandidate> candidates;
	
	@Transient
	public String getInfo() {
		return "Starting Date: "+(new DateTime(this.getStartingDate())).toString("dd.mm.yyyy hh.mm")+" "+
	           "End Date: "+(new DateTime(this.getEndDate())).toString("dd.mm.yyyy hh.mm")+" "+
	           "Price: "+this.getPrice()+" "+
		       "Vehicle: "+this.getVehicleName();
	}
	
	//Bu method ile kursa ait vehicle bilgisi ile Ehliyet enum sınıfı kullanılarak
	//kursta ogretilecek araç ismi bulunur.
	@Transient
	public String getVehicleName() {
		
		for(Ehliyet a:Ehliyet.values()) {
			if(this.vehicle.equals(a.toString())) return a.result;
		}
		return "-";
	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public DriverInstructor getInstructor() {
		return instructor;
	}

	public void setInstructor(DriverInstructor instructor) {
		this.instructor = instructor;
	}

	public List<DriverCandidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<DriverCandidate> candidates) {
		this.candidates = candidates;
	}

}
