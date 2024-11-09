package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao	dao=(EmployeeDao)context.getBean("edao");
		int status=dao.SaveEmployee(new Employee(112,"latha",33333));
		
		//int status =dao.UpdateEmployee(new Employee(111,"beeman",22222));
		
		System.out.println(status);
	}
}
