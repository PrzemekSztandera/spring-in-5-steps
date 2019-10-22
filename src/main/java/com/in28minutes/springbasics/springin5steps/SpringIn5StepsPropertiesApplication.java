package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.springin5steps.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.in28minutes.springbasics.springin5steps")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	//What are the beans? @Component
	//What are dependencies of bean? @Autowired
	//Where to search for beans? no need in our case as all is in the same package @ComponentScan

	public static void main(String[] args) {

		//Spring will do it for us
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());


		//Application context will maintain all beans



		try(AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {

			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println("Some external service: " + someExternalService.returnServiceUrl());
		}
	}

}
