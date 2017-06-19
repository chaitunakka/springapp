package com.spring.App;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring")
public class ApplicationConfig {

	/*@Bean
	public Mobile getMobile(){
		return new Mobile();
	}*/
}
