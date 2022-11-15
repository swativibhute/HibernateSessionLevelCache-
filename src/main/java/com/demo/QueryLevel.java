package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryLevel {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Query query =session.createQuery("From Employee");
		query.setCacheable(true);
		
		List<Employee> emp = query.list();
		for (Employee employee : emp) {
			System.out.println("Id>>"+employee.getId());
			System.out.println("name>>"+employee.getName());
			System.out.println("city>>"+employee.getCity());
			System.out.println("mobile>>"+employee.getMobile());
		}
		session.close();
		factory.close();
		System.out.println("Record retrieved successfully.");
	}

}
