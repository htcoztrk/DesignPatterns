package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;
import entities.concretes.Customer;
import entities.concretes.Individual;

public class CustomerDao implements BaseOperation<Customer>{
	  List<Customer> customers=new ArrayList<>();

	  public CustomerDao () {
		  Customer company1=new Company(1,"Müşteri1","Ankara","1234556", 12,"1234455");
		  Customer individual1=new Individual(2,"Müşteri2","İstanbul","458484","12");
		  customers.add(individual1);
		  customers.add(company1);
		  
	  }
	  
	    @Override
	    public void add(Customer data) {
				// TODO Auto-generated method stub
				customers.add(data);
		}	

		@Override
		public List<Customer> getAll() {
			// TODO Auto-generated method stub
			
			return this.customers;
		}

		@Override
		public Customer getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Customer c:customers) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
