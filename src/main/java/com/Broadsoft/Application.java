package com.Broadsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

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
		
		SpringApplication.run(Application.class, args);
	}
}
