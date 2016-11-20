package com.cognizantminds.rws.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class RwsServletConfig {

	public RwsServletConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean dispatcherServletRegistration() {
        final ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/rws/api/*");
        final Map<String, String> params = new HashMap<String, String>();
        params.put("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        params.put("dispatchOptionsRequest", "true");
        registration.setInitParameters(params);
        registration.setLoadOnStartup(1);
        return registration;
    }

}
