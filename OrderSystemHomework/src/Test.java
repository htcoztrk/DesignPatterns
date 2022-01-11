import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import UI.DashboardUI;
import UI.ProductUI;
import dataAccess.CompanyDao;
import dataAccess.ProductDao;
import entities.concretes.Company;
import entities.concretes.Customer;
import entities.concretes.Hardware;
import entities.concretes.Individual;
import entities.concretes.Manual;
import entities.concretes.Order;
import entities.concretes.OrderItem;
import entities.concretes.Product;
import entities.concretes.Software;
public class Test {

	public static void main(String[] args) {

	

//ProductUI d=new ProductUI();
  DashboardUI d=new DashboardUI();
//k.setLocation(500,150);
//
		
	}
	//bu method tüm musterilerin listesini yazdiriyor
	/*public static void customerList(Customer ...customers) {
		int i=1;
		System.out.println("  İsim  -- Telefon  -- Adres ");
		for(Customer c:customers) {
			System.out.println(i+"."+c.getName()+" - "+c.getPhone()+" - "+c.getAddress());
			i++;
		}
	}
	//bu method tüm ürün listesini ekrana yaziyor
	public static void productList(Product ...products) {
		int i=1;
		System.out.println("İsim  --  Fiyat  --  Aciklama");
		for(Product p:products) {
			System.out.println(i+"."+p.getName()+" - "+p.getRetailPrice()+"TL"+" - "+p.getDescription());
			i++;
		}
	}
	//bu method tüm siparişleri detaylariyla birlikte ekrana yazıyor
	public static void orderListWithDetail(List<Order>orders) {
		int i=1;
		for(Order o:orders) {
			System.out.println(i+". Musteri: "+o.getCustomer().getName()+""
					+"\n Tarih: "+o.getOrderDate()
					+"\n Ürünler:");
			for(int a=0;a<o.getModel().size();a++) {
				System.out.println(" "+o.getModel().get(a).getProduct().getName());
			}
			System.out.println(" Toplam Fiyat: "+o.getOrderTotal());
			i++;
		}
	}
	//bu method parametre olarak girilen müsteriye ait tüm siparişleri ekrama yazıyor.
	//veri tabanı baglantisi olmadigi için tüm siparisler bir listede tutulmuştu. 
	//bu liste icerisinden arama yapılarak musteriye ait siparisler bulunur.
    public static  void getOrdersByCustomer(Customer customer,List<Order> orders) {
    	int id=customer.getId();
    	int i=1;
    	System.out.println(customer.getName()+"'e ait tüm siparişler");
    	List<Order> ordr=new ArrayList<>();
    	for(Order o:orders) {
    		if(o.getCustomer().getId()==id) {
    			ordr.add(o);
    		}
    	}
    	orderListWithDetail(ordr);
    }*/
}
