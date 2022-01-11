package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;

public class CompanyDao implements BaseOperation<Company>{

	  List<Company> companies=new ArrayList<>();

    @Override
    public void add(Company data) {
			// TODO Auto-generated method stub
			companies.add(data);
	}	

	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		
		return this.companies;
	}

	@Override
	public Company getById(int id) throws Exception  {
		// TODO Auto-generated method stub
		for(Company c:companies) {
			if(c.getId()==id) {
				return c;
			}
		}
		throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
	}

	

}
