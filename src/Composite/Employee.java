package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String departmen;
	private List<Employee> employees;
	public Employee(String name, String departmen) {
		super();
		this.name = name;
		this.departmen = departmen;
		employees=new ArrayList<Employee>();
	}
	public void add(Employee e) {
		employees.add(e);
	}
	public void remove(Employee e) {
		employees.remove(e);
	}
	public List<Employee> getEmployees(){
		return employees;
	}
	public String toString() {
		return ("Employee:[Name:"+name+",dep:"+departmen +"]");
	}
}
