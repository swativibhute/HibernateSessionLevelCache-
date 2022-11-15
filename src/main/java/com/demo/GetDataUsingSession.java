package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Using Session query hits to database all the time
public class GetDataUsingSession {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Employee employee = session.get(Employee.class, 1);
		System.out.println("Employee student data is>>");
		System.out.println("Name>>" + employee.getName());
		System.out.println("City>>" + employee.getCity());
		System.out.println("Mobile>>" + employee.getMobile());
		
		Employee employee2 = session.get(Employee.class, 2);
		System.out.println("Employee student data is>>");
		System.out.println("Name>>" + employee2.getName());
		System.out.println("City>>" + employee2.getCity());
		System.out.println("Mobile>>" + employee2.getMobile());
		
	}

}
