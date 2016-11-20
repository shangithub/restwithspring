package com.cognizantminds.rws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@PropertySource({ "classpath:rws.properties" })
public class RwsContextConfig {

	public RwsContextConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// bean definitions

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;
    }

}
