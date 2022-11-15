package com.demo;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
//		Employee employee = new Employee();
//		employee.setName("Swati Vibhute");
//		employee.setCity("kothali");
//		employee.setMobile(4523698745l);
//		
//		session.save(employee);
//		transaction.commit();
//		session.close();
//		System.out.println("record iserted");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many student you want to insert>>");
		int ch =sc.nextInt();
		while(ch<5) {
			System.out.println("enter your name>>");
		    String name= sc.next();
			System.out.println("enter your city>>");
			String city= sc.next();
			System.out.println("enter mobile>>");
			long mobile= sc.nextLong();
			
			Employee employee = new Employee();
			employee.setName(name);
			employee.setCity(city);
			employee.setMobile(mobile);
		
			session.save(employee);
			transaction.commit();
			session.close();
			System.out.println("record inserted");
			
		}
		
		
	}

}
