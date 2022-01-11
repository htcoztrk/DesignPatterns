package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import dataAccess.ProductDao;
import entities.concretes.Hardware;
import entities.concretes.Manual;
import entities.concretes.Product;
import entities.concretes.Software;

public class ProductUI extends JFrame{
ProductDao productDao=new ProductDao();
	public ProductUI() {
		
		 final JTextField tf=new JTextField();  
		   tf.setBounds(200,30, 100,20);  
		   tf.setText("**Ürün Listesi**");  
		    JButton b=new JButton("Ürün Ekle");  
		    b.setBounds(400,0,95,30);  
		    b.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					  ProductUI productUI=new ProductUI();				
				}   
		           
		        
		    }); 
		  		 
		List<Product> productList = productDao.getAll(); //listeyi al 
			
		 String products[][] = new String[productList.size()][7]; 
		 String column[]={"Ürün Türü","İsim","Fiyat","Warranty","Publisher","License","Tax"};
		/* products[0][0]= "Ürün Türü";
		 products[0][1]= "İsim   ";
		 products[0][2]= "Fiyat  ";
		 products[0][3]= "Warranty";
		 products[0][4]= "Publisher";
		 products[0][5]= "License";
		 products[0][6]= "Tax";*/
		 int i=0;
		 for(Product p:productList) {
			 if(p instanceof Hardware) { 
					products[i][0] = "Hardware";
					products[i][1] = String.valueOf(p.getName());
					products[i][2] = String.valueOf(((Hardware) p).getRetailPrice());
					products[i][3] = String.valueOf(((Hardware)p).getWarrantyPeriod());
					//products[i][5] = String.valueOf(p.getRetailPrice());
					products[i][6] = String.valueOf(((Hardware)p).getTax());
				}
				else if(p instanceof Manual) {
					products[i][0] = "Manual";
					products[i][1] = String.valueOf(p.getName());
					products[i][2] = String.valueOf(((Manual) p).getRetailPrice());
					products[i][4] = String.valueOf(((Manual)p).getPublisher());
					
				}
				else if(p instanceof Software) {
					products[i][0] = "Software";
					products[i][1] = String.valueOf(p.getName());
					products[i][2] = String.valueOf(((Software) p).getRetailPrice());
					products[i][5] = String.valueOf(((Software)p).getLicense());
				}
				i++;
		 }
		 JTable table = new JTable(products,column); //
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
