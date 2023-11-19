package com._SpringFramework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com._SpringFramework.Games.GameRunner;
//import com._SpringFramework.Games.MarioGame;
//import com._SpringFramework.Games.Pacman;
//import com._SpringFramework.Games.SuperContra;

/*
 * 	This app is Tightly coupled because need to make changes if want to add other game.
 * 	
 * 	initially it's created for MarioGame but when I adding SuperContra then I need to
 * make many changes in code. hence it's tightly coupled.
 * 		
 * 	Using GamingConsole Interface I make it loose coupling 
 * 
 * 	Now I am using Spring Framework logic
 */


public class BeansExamples {

	public static void main(String[] args) {
		
		try (//Steps1:	Launch the Spring Context.
		var context = new  AnnotationConfigApplicationContext(MyConfiguration.class)) {
			//Steps2:	Configure the things that we want to spring manage - @Configuaration
			var MyName = context.getBean("knowMyName");
			System.out.println(MyName);
			
			var person = context.getBean("getPerson");
			System.out.println(person);
			
			//var address = context.getBean("getAddress");
			var address = context.getBean("MyCustomBeanAddress");
			System.out.println(address);

			System.out.println("-------------");
			
//		var qualifier_knowMyLastNameS = context.getBean("Qualifier_knowMyLastNameS");
//		System.out.println(qualifier_knowMyLastNameS);
			
			System.out.println("-------------");
			
			System.out.println(context.getBean(String.class));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			
			var MyDefinedBeans = context.getBeanDefinitionNames();
			
			System.out.println("\n ------\tList of Spring Beans\t-------\n");
			for (String beanName : MyDefinedBeans) {
				System.out.println(beanName);
			}
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
