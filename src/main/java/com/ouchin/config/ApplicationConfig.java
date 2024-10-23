package com.ouchin.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.ouchin")
public class ApplicationConfig {

    @Bean
    public ApplicationContext applicationContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return context;
    }



    // TO DO : her : injection de dependance
    // xml : configuration with  database
    // step 3 : annotation
}
