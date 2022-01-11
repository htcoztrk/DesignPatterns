package org.egitim.jpa.model.data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.egitim.jpa.model.data.base.BaseEntity;
import org.joda.time.DateTime;

@Entity
@Table(name = "instructors")
public class DriverInstructor extends BaseEntity{

	
	private static final long serialVersionUID = -8403641834510545330L;
	@Column(name = "department")
	private String department;

	@Transient
	@Override
	public String getInfo() {
		return  "Name: "+this.getName()+" "+this.getSurname()+" Department: "+this.getDepartment()+" "+
				"Transaction Date: "+(new DateTime(this.getTransactionDate())).toString("dd.mm.yyyy hh.mm")+
				" Courses: "+this.courses.get(0).getInfo();
				
	}

	@OneToMany(mappedBy="instructor",fetch = FetchType.EAGER)
	private List<Course> courses;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
	public String printCoures() {
		String info="";
		for(Course c:this.getCourses()) {
			info=" "+c.getInfo();
		}
		return info;
	}
	
}
