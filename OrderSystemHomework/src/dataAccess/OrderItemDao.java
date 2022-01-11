package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entities.concretes.OrderItem;

public class OrderItemDao implements BaseOperation<OrderItem>{
	  List<OrderItem> orderItems=new ArrayList<>();

	    @Override
	    public void add(OrderItem data) {
				// TODO Auto-generated method stub
				orderItems.add(data);
		}	

		@Override
		public List<OrderItem> getAll() {
			// TODO Auto-generated method stub
			
			return this.orderItems;
		}

		@Override
		public OrderItem getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(OrderItem c:orderItems) {
				if(c.getLineNbr()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
