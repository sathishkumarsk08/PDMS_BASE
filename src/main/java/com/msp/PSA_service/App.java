package com.msp.PSA_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
////@ComponentScan({"com.msp.controller"})
////@ComponentScan({"com.msp.service"})
////@ComponentScan({"com.msp.repository"})
////@EnableCaching(proxyTargetClass = true)
//@EntityScan(basePackages = {"com.msp.model"})
//@EnableJpaRepositories(basePackages = "com.msp.repository")
//
//@ComponentScan(basePackages = { "com" })
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {
		"com",
		"com.msp"
})
public class App extends SpringBootServletInitializer
{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}
	public static void main(String[] args)throws Exception{
		SpringApplication.run(App.class, args);
	}
}
