package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
    FileUploadProperties.class
})
public class SpringBootFileUploadOracleDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileUploadOracleDbApplication.class, args);
		System.out.println("Oracle DB file uploads=>");
	}

}
