package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address111;
import com.demo.model.Student111;

public class TestStudent {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Address111 addr=new Address111(111,"Aundh","Pune","Maharashtra",null);
		Address111 addr1=new Address111(112,"Kothrud","Pune","Maharashtra",null);
		Student111 s=new Student111(11,"Rohan","3333",addr);
		Student111 s1=new Student111(131,"Rohit","444444",addr1);
		addr.setS(s);
		addr1.setS(s1);
		
		session.persist(addr);
		session.persist(addr1);
		session.persist(s1);
		session.persist(s);	
		tr.commit();
		session.close();
		/*Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		//retrive student
		Student s2=session1.find(Student.class, 11);
		System.out.println(s2);
		tr1.commit();
		session1.close();*/
		sf.close();

	}

}
