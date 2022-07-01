package com.learn.deploy.For.deployment.into.tomca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ForDeploymentIntoTomcatApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ForDeploymentIntoTomcatApplication.class, args);
	}

	// Configuring method has to be overridden
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(ForDeploymentIntoTomcatApplication.class);
    }
	
}
