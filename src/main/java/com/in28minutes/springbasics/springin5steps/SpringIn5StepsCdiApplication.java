package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.springin5steps.cdi.SomeCdiBusiness;
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
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {


		//Application context will maintain all beans
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);
				//SpringApplication.run(SpringIn5StepsCdiApplication.class, args);

		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDAO());
	}
}
