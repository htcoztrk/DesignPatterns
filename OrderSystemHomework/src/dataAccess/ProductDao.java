package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.concretes.Company;
import entities.concretes.Hardware;
import entities.concretes.Manual;
import entities.concretes.Product;
import entities.concretes.Software;

public class ProductDao implements BaseOperation<Product>{
	  
	  List<Product> products=new ArrayList<>();
	  
	  public ProductDao() {
		 Product hardware1=new Hardware("Acıklama1",1,"Hardware1",200,2);
		 Product software1=new Software("Açıklama2",2,"Software1",300,"12-12");
		 Product manual1=new Manual("Açıklama",3,"Manual1",100,"publisher");
		 products.add(hardware1);
		 products.add(software1);
		 products.add(manual1);
	  }

	    @Override
	    public void add(Product data) {
				// TODO Auto-generated method stub
				products.add(data);
		}	

		@Override
		public List<Product> getAll() {
			// TODO Auto-generated method stub
			
			return this.products;
		}

		@Override
		public Product getById(int id) throws Exception  {
			// TODO Auto-generated method stub
			for(Product c:products) {
				if(c.getId()==id) {
					return c;
				}
			}
			throw new Exception(String.format("Ürün bulunamadı! (Id = %s)", id));
		}

}
