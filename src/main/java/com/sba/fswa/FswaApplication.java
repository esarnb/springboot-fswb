package com.sba.fswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class FswaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FswaApplication.class, args);
	}

}
