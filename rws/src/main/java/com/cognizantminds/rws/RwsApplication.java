package com.cognizantminds.rws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizantminds.rws.config.RwsContextConfig;
import com.cognizantminds.rws.config.RwsServletConfig;
import com.cognizantminds.rws.config.RwsWebConfig;

@SpringBootApplication
public class RwsApplication {
	
	private final static Object[] CONFIGS = { 
    		RwsApplication.class,
    		RwsWebConfig.class,
    		RwsServletConfig.class,
    		RwsContextConfig.class
    };

	public static void main(String[] args) {
		SpringApplication.run(CONFIGS, args);
	}
}
