package com.harxsh.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.harxsh.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class); 

	public static void main(String[] args) {	
		 // Application context
		 ApplicationContext applicationContext = 
				 SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		 
		 SomeCdiBusiness business =
				 applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{} ", business.getSomeCdiDao());
	}
}
