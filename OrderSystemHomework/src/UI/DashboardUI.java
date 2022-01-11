package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DashboardUI extends JFrame{
	
	 public DashboardUI() {
		 JLabel tf=new JLabel(); 
		 tf.setText("Hoşgeldiniz..");
		 tf.setBounds(250, 10, 95, 30);
		 //ürün listesi sayfasına gitmek için kullanılan button
		 JButton b=new JButton("Ürünler");  
		    b.setBounds(250,70,95,30);  
		    b.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					  ProductUI productUI=new ProductUI();				
				}   
		           
		        
		    }); 
		    //müşteriler sayfasına gitmek için kullanılan button
		    JButton b2=new JButton("Müşteriler");  
		    b2.setBounds(250,140,95,30);  
		    b2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					CustomerUI customer=new CustomerUI();			
				}   
		           
		        
		    }); 
		    //siparişleri görüntülemek için kullanılan button
		    JButton b3=new JButton("Siparişler");  
		    b3.setBounds(250,210,95,30);  
		    b3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 // ProductUI productUI=new ProductUI();				
				}   
		           
		        
		    }); 
		   add(tf);
		   add(b);
		   add(b2);
		   add(b3);
		   setLayout(null);    
			 setBounds(300,100,600, 500);
			 setTitle("Dashboard");
			 add(b);
			 //setDefaultCloseOperation(EXIT_ON_CLOSE);
			 setVisible(true);
	 }
	
}
