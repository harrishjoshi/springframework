package com.harxsh.springboot.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println("Bean Name: " + beanName);
        }
    }

}
