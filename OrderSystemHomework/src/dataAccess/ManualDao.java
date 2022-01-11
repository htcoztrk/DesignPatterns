package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entities.concretes.Manual;

public class ManualDao implements BaseOperation<Manual>{
	  List<Manual> manuals=new ArrayList<>();

	    @Override
	    public void add(Manual data) {
				// TODO Auto-generated method stub
				manuals.add(data);
		}	

		@Override
		public List<Manual> getAll() {
			// TODO Auto-generated method stub
			
			return this.manuals;
		}

		@Override
		public Manual getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Manual c:manuals) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
