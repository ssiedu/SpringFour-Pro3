package com.ssi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer=context.getBean("cust1",Customer.class);
		System.out.println(customer);
		
		/*
		Employee emp=context.getBean("e1",Employee.class);
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println("ACCOUNT DETAILS : ");
		List<Account> accounts=emp.getAccounts();
		for(Account account:accounts){
		System.out.println(account);
		*/
		}
}
