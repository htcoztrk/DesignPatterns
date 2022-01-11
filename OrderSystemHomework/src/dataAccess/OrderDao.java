package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;
import entities.concretes.Order;

public class OrderDao implements BaseOperation<Order>{
	  List<Order> orders=new ArrayList<>();

	    @Override
	    public void add(Order data) {
				// TODO Auto-generated method stub
				orders.add(data);
		}	

		@Override
		public List<Order> getAll() {
			// TODO Auto-generated method stub
			
			return this.orders;
		}

		@Override
		public Order getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Order c:orders) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
