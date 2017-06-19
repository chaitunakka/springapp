package com.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args){
    	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	Mobile m = context.getBean(Mobile.class);
    	m.getMobile();
    }
}
