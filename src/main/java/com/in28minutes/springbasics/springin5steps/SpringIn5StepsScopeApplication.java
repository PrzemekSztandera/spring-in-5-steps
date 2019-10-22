package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.springin5steps.scope.PersonDAO;
/*
Needed when using Spring boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {


		//Application context will maintain all beans
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
				//SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());
		LOGGER.info("----------------------------------");
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}
}
