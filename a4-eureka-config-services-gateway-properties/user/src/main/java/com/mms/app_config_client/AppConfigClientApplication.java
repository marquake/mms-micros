package com.mms.app_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppConfigClientApplication.class, args);
	}
}
