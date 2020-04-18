package com.eureka.clientOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient  // This annoation is used to make this spring service as eureka client.
@SpringBootApplication
public class ClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientOneApplication.class, args);
	}

}
