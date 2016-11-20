package com.cognizantminds.rws;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.cognizantminds.rws.config.RwsContextConfig;
import com.cognizantminds.rws.config.RwsServletConfig;
import com.cognizantminds.rws.config.RwsWebConfig;

public class ServletInitializer extends SpringBootServletInitializer {
	
    private final static Object[] CONFIGS = { 
    		RwsApplication.class,
    		RwsWebConfig.class,
    		RwsServletConfig.class,
    		RwsContextConfig.class
    };

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CONFIGS);
	}

}
