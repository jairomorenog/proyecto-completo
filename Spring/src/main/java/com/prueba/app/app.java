package com.prueba.app;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.Spring.appconfig;
import com.prueba.Spring.saludo;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//ApplicationContext appContext= new ClassPathXmlApplicationContext("com/prueba/contextxml/beans.xml");
		
		ApplicationContext appContext= new AnnotationConfigApplicationContext(appconfig.class);
		
		
		saludo s= appContext.getBean(saludo.class);
		
		System.out.println(s.getSaludo());
		
		((ConfigurableApplicationContext) appContext).close();
	}

}
