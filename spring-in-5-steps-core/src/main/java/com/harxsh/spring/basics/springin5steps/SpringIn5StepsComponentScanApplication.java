package com.harxsh.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harxsh.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.harxsh.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		// Application context
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentScanApplication.class)) {

			ComponentDAO componentDAO = context.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
		}
	}
}
