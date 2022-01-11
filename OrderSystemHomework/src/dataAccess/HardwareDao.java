package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entities.concretes.Hardware;

public class HardwareDao implements BaseOperation<Hardware>{

	  List<Hardware> hardwares=new ArrayList<>();

	    @Override
	    public void add(Hardware data) {
				// TODO Auto-generated method stub
				hardwares.add(data);
		}	

		@Override
		public List<Hardware> getAll() {
			// TODO Auto-generated method stub
			
			return this.hardwares;
		}

		@Override
		public Hardware getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Hardware c:hardwares) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}


}
