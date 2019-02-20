package org.javahotfix.threading.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.javahotfix.threading")
@SpringBootApplication
public class Application {
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}
}
