package com.rafi.LearnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		
		InjectViaConstructor injectViaConstructor = (InjectViaConstructor) context.getBean("injectViaConstructor");
		injectViaConstructor.getMessage();

		InjectViaSetter injectViaSetter = (InjectViaSetter) context.getBean("injectViaSetter");
		injectViaSetter.getMessage();
	}

}
