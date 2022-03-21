package com.sba.fswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Spring Boot injection decorator
@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class FswaApplication {

	/**
	 * Main program initializer
	 * @param args initial args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FswaApplication.class, args);
	}

}
