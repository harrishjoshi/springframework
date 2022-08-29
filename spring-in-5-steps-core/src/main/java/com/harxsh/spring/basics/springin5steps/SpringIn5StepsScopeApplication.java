package com.harxsh.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harxsh.spring.basics.springin5steps.scope.StudentDAO;;

@Configuration
@ComponentScan("com.harxsh.spring.basics.springin5steps.scope")
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		// Application context
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringIn5StepsScopeApplication.class)) {

			StudentDAO studentDao = context.getBean(StudentDAO.class);

			StudentDAO studentDao2 = context.getBean(StudentDAO.class);

			LOGGER.info("{}", studentDao);
			LOGGER.info("{}", studentDao.getJdbcConnection());

			LOGGER.info("{}", studentDao2);
			LOGGER.info("{}", studentDao2.getJdbcConnection());
		}
	}
}
