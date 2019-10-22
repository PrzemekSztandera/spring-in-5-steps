package com.in28minutes.springbasics.springin5steps;

import com.in28minutes.springbasics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("com.in28minutes.springbasics.springin5steps")
public class SpringIn5StepsXMLContextApplication {

	//What are the beans? @Component
	//What are dependencies of bean? @Autowired
	//Where to search for beans? no need in our case as all is in the same package @ComponentScan

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);


	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext classPathXmlApplicationContext =
					new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) classPathXmlApplicationContext.getBeanDefinitionNames());
//			[xmlJdbcConnection, xmlPersonDAO, xmlJdbcConnectionItem, xmlItemDAO]

			XmlPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection() );

//			XmlItemDAO xmlItemDAO = classPathXmlApplicationContext.getBean(XmlItemDAO.class);
//			System.out.println("------------> xmlItemDAO object: " + xmlItemDAO);

		}
	}

}
