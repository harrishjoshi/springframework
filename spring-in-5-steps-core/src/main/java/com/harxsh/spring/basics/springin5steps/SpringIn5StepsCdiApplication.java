package com.harxsh.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harxsh.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
		// Application context
		try (AnnotationConfigApplicationContext conext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCdiApplication.class)) {

			SomeCdiBusiness business = conext.getBean(SomeCdiBusiness.class);

			LOGGER.info("dao - {}", business.getSomeCdiDao());
		}
	}
}
