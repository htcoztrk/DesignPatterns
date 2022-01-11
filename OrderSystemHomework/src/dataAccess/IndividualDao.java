package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;
import entities.concretes.Individual;

public class IndividualDao implements BaseOperation<Individual>{
	  List<Individual> individuals=new ArrayList<>();

	    @Override
	    public void add(Individual data) {
				// TODO Auto-generated method stub
				individuals.add(data);
		}	

		@Override
		public List<Individual> getAll() {
			// TODO Auto-generated method stub
			
			return this.individuals;
		}

		@Override
		public Individual getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Individual c:individuals) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
