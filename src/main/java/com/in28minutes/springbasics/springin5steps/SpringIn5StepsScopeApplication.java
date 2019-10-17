package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	//What are the beans? @Component
	//What are dependencies of bean? @Autowired
	//Where to search for beans? no need in our case as all is in the same package @ComponentScan

	public static void main(String[] args) {

		//Spring will do it for us
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());


		//Application context will maintain all beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);
		System.out.println(binarySearch2);

		int result = binarySearch1.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}

}
