package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;
import entities.concretes.Software;

public class SoftwareDao implements BaseOperation<Software>{
	  List<Software> softwares=new ArrayList<>();

	    @Override
	    public void add(Software data) {
				// TODO Auto-generated method stub
				softwares.add(data);
		}	

		@Override
		public List<Software> getAll() {
			// TODO Auto-generated method stub
			
			return this.softwares;
		}

		@Override
		public Software getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Software c:softwares) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
