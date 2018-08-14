package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.org.*;

public class Test {

	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		/*MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");
		renderer.render();*/
		
		Organization org = (Organization) context.getBean("org");
		System.out.println(org);
		
	}
	
}
