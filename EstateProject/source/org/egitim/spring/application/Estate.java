package org.egitim.spring.application;

import org.egitim.spring.domain.Home;
import org.egitim.spring.domain.Lessor;
import org.egitim.spring.domain.Renter;
import org.egitim.spring.system.SystemManager;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Estate{
	/* Sistemimiz üç temel kullanıcı türüne sahiptir.
	 * 1-Kiracı(Renter), 2-Emlakçı(Lessor), 3-Admin
	 * Emlakçı, kiraya vermek istediği mülklerini sisteme girer ve kiracı bu mülkleri inceleyip kiralar.
	 * Kullanıcıların ortak özellikleri User classında tutuldu ve diger kullanıcı türleri User classından türedi.
	 * Herbir evin bir türü vardır örn: villa,apartman. Bu türler, Hashset'de tutuldu.
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring/context.xml");		
		
		//-------SYS MANAGER-------------
		SystemManager systemManager=(SystemManager)context.getBean("systemManager");
		System.out.println("System Manager: "+systemManager);
		 
		//-------Lessor----------
		System.out.println("-----------Lessor---------");
		Lessor lessor=context.getBean("lessor",Lessor.class);
		System.out.println(lessor.toString());
		
		System.out.println("--------Home List----------");
		for(Home h:systemManager.getHomes()) {
		    	System.out.println(h);
		   }
		//-------Renter----------
		System.out.println("-----------Renter---------");
		Renter renter=context.getBean("renter",Renter.class);
		System.out.println(renter.toString());
		
		//---------Home-----------
		System.out.println("--------Home List----------");
		for(Home h:systemManager.getHomes()) {
		    	System.out.println(h);
		   }
		//---------Home Type List------------------ 
		System.out.println("----------Home Type List Set--------------");
		for(String typeList:systemManager.getHomeCategoryList()) {
		    	System.out.println(typeList);
		  }
		
		context.registerShutdownHook();
	}

}
