
/*
 * @author Hatice Öztürk
 * 
 * */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
	    DecimalFormat df = new DecimalFormat("0.00");   
		 
	     System.out.print("Agirlik giriniz: ");
		 try {
				double weight=scanner.nextDouble();
				//kullanici tarafindan girilen deger dunyadaki agirlik bilgisidir. 
				//bu agirlik degeri dunyadaki yer cekimine bolunerek kutle bulunur.(G=m*g)
				 double mass= weight/9.81;
			     for(Planets planets:Planets.values()) {
			    	//bulunan kütle değeri, enum sınıfının her bir sabiti(gezegen yerçekin değeri) ile çarpılarak ağırlık bulunur.
					System.out.println(planets.name()+" gezegenindeki ağırlık: "+df.format(findWeight(mass,planets.getGravity())));
				 }
		     }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 } 
		
	}

	public static double findWeight(double mass, double gravity) {
		return mass*gravity;
	}
}
