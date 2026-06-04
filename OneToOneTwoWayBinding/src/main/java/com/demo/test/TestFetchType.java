package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address111;
//import com.demo.model.Student;

public class TestFetchType {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		System.out.println("Before load / find");
		//Student s2=session.find(Student.class, 11);
		Address111 a1=session.find(Address111.class, 111);
		System.out.println("After load / find"); 
		System.out.println(a1);
		System.out.println(a1.getS());
		tr.commit();
		session.close();
	
		sf.close();

	}

}
