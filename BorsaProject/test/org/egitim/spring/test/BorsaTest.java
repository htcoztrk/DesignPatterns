package org.egitim.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.egitim.spring.domain.AraciKurum;
import org.egitim.spring.domain.Company;
import org.egitim.spring.domain.Customer;
import org.egitim.spring.domain.Doviz;
import org.egitim.spring.domain.Emtia;
import org.egitim.spring.domain.HisseSenedi;
import org.egitim.spring.domain.SatisIslemiFacade;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BorsaTest {

	/*Observer ve Facade patternleri kullanilarak Borsa Projesi yapildi.
	 * Borsa da satisa sunulan herhangi bir stock fiyatinda degisiklik 
	 * yapildiginda bu degisikliklerden musteri ve sirketler bilgilendirildi. Bunun icin observer patterni kullanildi
	 *
	 * 
	 * Borsada alisveris icin satilacak veya alinacak stock bir araci kurum vasitasi ile satilir.
	 * stocun turu ve turune gore farkli ozellikleri vardir.
	 * bir stock sirket tarafindan veya musteri tarafindan alinip satilabilir.
	 * burada oldukca karmasik bir yapi vardir. Alisveris yapacak user icin facade patterni
	 * kullanilarak bir ara birim olusturuldu.
	 * */
	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/context.xml");
		
		////----OBSERVERS----------------
		Company company=(Company) context.getBean("company");
		company.setId(1);
		company.setCompanyName("Acibadem Saglik");
		
		Customer customer=	context.getBean("customer",Customer.class);
		customer.setId(1);
		customer.setName("Hatice Ozturk");
		
		
		////----BORSADA SATILIP ALINACAK STOCKLAR---------
		HisseSenedi hisseSenedi=(HisseSenedi) context.getBean("hisseSenedi");
		hisseSenedi.setPrice(300);
		hisseSenedi.setType("Nama");
		hisseSenedi.chancePrice();
		System.out.println("****************************");
		Doviz doviz=(Doviz) context.getBean("doviz");
		doviz.setIslemHacmi(200);
		doviz.setVadeliIslem("Dolar/TL");
		doviz.chancePrice();
		System.out.println("****************************");
		Emtia emtia=(Emtia) context.getBean("emtia");
		emtia.setGroup("Kimyasal");
		emtia.setPrice(500);
		emtia.chancePrice();
		System.out.println("****************************");
		///----ARACI KURUM---------
		AraciKurum araciKurum=(AraciKurum) context.getBean("araciKurum");
		araciKurum.setName("Forex");
		
		///-------FACADE PATTERN-----
		//sistemin karmaşıklıklarını gizler ve 
		//istemciye sisteme erişebilecegi bir ara birim sağlar.
		SatisIslemiFacade satisIslemiFacade=(SatisIslemiFacade) context.getBean("satisIslemiFacade");
		satisIslemiFacade.setAlici(customer);
		satisIslemiFacade.setSatici(company);
		satisIslemiFacade.setAraciKurum(araciKurum);
		satisIslemiFacade.setStock(doviz);
		System.out.println("***Borsa Alisveris Detayi***");
		satisIslemiFacade.alisverisYap();
		
	}

}
