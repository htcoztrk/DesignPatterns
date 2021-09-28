package Composite;


public class Test {

	public static void main(String[] args) {
		
		Employee yonetici=new Employee("Ahmet","Yonetici");
		
		Employee takimLideri=new Employee("Yardımci","yardımcı");
		
		Employee takimUyesi1=new Employee("hademe1","hademe");
		Employee takimUyesi2=new Employee("hademe2","hademe");
		
		yonetici.add(takimLideri);
		
		takimLideri.add(takimUyesi1);
		takimLideri.add(takimUyesi2);
		
		System.out.println(yonetici);
		
		for(Employee lider:yonetici.getEmployees()) {
			System.out.println(lider);
			
			for(Employee uyeler:lider.getEmployees()) {
				System.out.println(uyeler);
			}
		}
	}
}
