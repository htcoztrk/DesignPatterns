package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import dataAccess.CustomerDao;
import dataAccess.ProductDao;
import entities.concretes.Customer;
import entities.concretes.Hardware;
import entities.concretes.Individual;
import entities.concretes.Manual;
import entities.concretes.Product;
import entities.concretes.Software;

public class CustomerUI extends JFrame{
	CustomerDao customerDao=new CustomerDao();
	public CustomerUI() {
		
		 final JTextField tf=new JTextField();  
		   tf.setBounds(200,30, 100,20);  
		   tf.setText("**Müşteri Listesi**");  
		    JButton b=new JButton("Müşteri Ekle");  
		    b.setBounds(400,0,105,30);  
		    b.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					  //ProductUI productUI=new ProductUI();				
				}   
		           
		        
		    }); 
		  		 
		List<Customer> customerList = customerDao.getAll(); //listeyi al 
			
		 String customers[][] = new String[customerList.size()][3]; 
		 String column[]={"İsim","Adres","Telefon"};
		/* products[0][0]= "Ürün Türü";
		 products[0][1]= "İsim   ";
		 products[0][2]= "Fiyat  ";
		 products[0][3]= "Warranty";
		 products[0][4]= "Publisher";
		 products[0][5]= "License";
		 products[0][6]= "Tax";*/
		 int i=0;
		 for(Customer p:customerList) {
					customers[i][0] = String.valueOf(p.getName());
					customers[i][1] = String.valueOf(p.getAddress());
					customers[i][2] = String.valueOf(p.getPhone());
					i++;
				}			
		 
		 JTable table = new JTable(customers,column); //
		// JTable table2 = new JTable(column,column);
		 table.setBounds(20,50,500,100);
		 //table2.setBounds(0,0,500,400);
		 //JScrollPane scroll = new JScrollPane(table); // 
		// f.add(table2);
		 add(tf);
		 add(table);
		 setLayout(null);    
		 setBounds(300,100,600, 500);
		 setTitle("Ürünler");
		 add(b);
		 //setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setVisible(true);
	}
}
