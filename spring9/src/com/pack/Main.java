package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Resource res=new ClassPathResource("hello.xml");
		BeanFactory f=new XmlBeanFactory(res);*/
		ApplicationContext f=new ClassPathXmlApplicationContext("hello.xml");
		Profile s=(Profile)f.getBean("profile");//will provide the reference of profile object and call profile const
		s.showName();
		s.showAge();
		
	}

}
