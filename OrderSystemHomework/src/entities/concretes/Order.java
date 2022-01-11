package entities.concretes;

import java.util.Date;
import java.util.List;

public class Order {
   //her siparis bir musteriye aittir. Bunun icin customeri referans olarak tutar.
   private Customer customer;
   private int id;
   //bir order da bir veya birden cok orderitem bulunabilir.
   private List<OrderItem> items;
   private Date orderDate;
   private double orderTotal;
   
   public Order() {
	   
   }

public Order(int id, Date orderDate, double orderTotal, Customer customer, List items) {
	super();
	this.id = id;
	this.orderDate = orderDate;
	this.orderTotal = orderTotal;
	this.customer = customer;
	this.items = items;
}
public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<OrderItem> getModel() {
	return items;
}

public void setItems(List<OrderItem> items) {
	this.items = items;
}

public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

public double getOrderTotal() {
	return orderTotal;
}

public void setOrderTotal() {
	
	double result=0;
	for(OrderItem item:items) {
		result=result+item.getItemTotal();	
	}
	
	this.orderTotal = result;
}
//bu method, siparis edilen urunleri listeye ekler.
public void addOrderItem(OrderItem item) {
	   this.items.add(item);
	   //System.out.println(item.getProduct().getName()+" Added.");
   }

   
}
