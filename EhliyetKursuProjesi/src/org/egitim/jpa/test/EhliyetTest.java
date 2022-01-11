package org.egitim.jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.egitim.jpa.model.data.Course;
import org.egitim.jpa.model.data.DriverCandidate;
import org.egitim.jpa.model.data.DriverInstructor;
import org.egitim.jpa.model.data.base.BaseEntity;
import org.egitim.jpa.utility.HibernateUtility;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

class EhliyetTest {

	/*
	 * Ehliye Kursu projesinde; adaylar, eğitmenler ve kurslar olmak üzere üç farklı sınıfımız var.
	 * Ortak olan alanların bir yerde toplanması için BaseEntity oluşturuldu.
	 * Kurs sonunda adayların alacağı ehliyet türleri için Ehliyet adında enum sınıf kullanıldı.
	 * 
	 * 
	 * */
	private static Session session;

	@Test
	void test() {
		session = HibernateUtility.getSessionFactory().openSession();
		System.out.println("Session: " + session);
		System.out.println("LIST OF INSTRUCTOR");
		printEntityList((ArrayList<DriverInstructor>)selectEntityList("DriverInstructor"));
		System.out.println("LIST OF CANDIDATE");
		printEntityList((ArrayList<DriverCandidate>)selectEntityList("DriverCandidate"));
		System.out.println("LIST OF COURSE");
		printCoursesList((ArrayList<Course>)selectCoursesList("Course"));
	}

	/* Select Methodlari */
	@SuppressWarnings("unchecked")
	private ArrayList<? extends BaseEntity> selectEntityList(String entityName) {
		return (ArrayList<BaseEntity>) session.createQuery("FROM " + entityName).list();
	}
	@SuppressWarnings("unchecked")
	private ArrayList<Course> selectCoursesList(String entityName) {
		return  (ArrayList<Course>) session.createQuery("FROM " + entityName).list();
	}
	
	private void printEntityList(ArrayList<? extends Object > arrayList) {	
		for (Object entity : arrayList) {
			System.out.println(((BaseEntity) entity).getInfo());
		}
		System.out.println("");
	}
	private void printCoursesList(List<Course>  courses) {
		for (Course course : courses) {
			System.out.println(course.getInfo());
		}
		System.out.println("");
	}
	
}
