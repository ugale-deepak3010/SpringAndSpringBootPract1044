package com._SpringFramework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// record is new feature in java. 
//It's self create getter and setter and constructor and toString

record Person(String name, int age) {}

record Address(String firstLine, String city) {}

@Configuration
public class MyConfiguration {
	
	@Bean
	String knowMyName() {
		return "Deepak or Manali";
	}
	
	//can't access via System.out.println(context.getBean(String.class));
	// So for this problem solution is use @Primary.
	@Bean
	@Primary
	String knowMyLastName() {		
	 
		return "Deepak Ugale";
	}
	
	@Bean
	@Qualifier("Qualifier_knowMyLastNameS")	
	// it can be use As @Qualifier("Qualifier_knowMyLastNameS") Type in reference.
	String knowMyLastNameS() {		
		return "Ugale or Rahangdhale";
	}

	@Bean
	Person getPerson() {
		return new Person( knowMyName(), 26);
	}
	
	@Bean(name = "MyCustomBeanAddress")
	Address getAddress() {
		return new Address("House of Deepak Ugale", "Jalna");
	}

}
