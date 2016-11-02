package com.Broadsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
 private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
			
			case "-version" :
				System.out.println(
						"Implementation version : " + Application.class.getPackage().getImplementationVersion());
				return;
				
				
			default :
				System.err.println("Error : Invalid argument " + args[i]);
				System.err.println("Running the main app");
		
			}
		}
		LOGGER.info("main method called");
		SpringApplication.run(Application.class, args);
	}
}
