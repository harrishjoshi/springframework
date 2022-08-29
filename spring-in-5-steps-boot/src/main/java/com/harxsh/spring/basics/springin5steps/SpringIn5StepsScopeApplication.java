package com.harxsh.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.harxsh.spring.basics.springin5steps.scope.StudentDAO;;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 

	public static void main(String[] args) {	
		 // Application context
		 ApplicationContext applicationContext = 
				 SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		 
		 StudentDAO studentDao =
				 applicationContext.getBean(StudentDAO.class);
		
		 StudentDAO studentDao2 =
				 applicationContext.getBean(StudentDAO.class);
		
		LOGGER.info("{}", studentDao);
		LOGGER.info("{}", studentDao.getJdbcConnection());
		
		LOGGER.info("{}", studentDao2);
		LOGGER.info("{}", studentDao2.getJdbcConnection());
	}
}
