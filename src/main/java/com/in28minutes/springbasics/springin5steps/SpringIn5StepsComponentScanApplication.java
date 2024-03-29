package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.componentscan.ComponentDAO;
/*
Needed when using Spring Boot
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
@ComponentScan("com.in28minutes.springbasics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {


		//Application context will maintain all beans
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
				//SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);

	}
}
