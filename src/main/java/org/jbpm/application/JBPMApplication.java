package org.jbpm.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.jbpm.*")
@SpringBootApplication
public class JBPMApplication {

    public static void main(String[] args) {
        SpringApplication.run(JBPMApplication.class, args);
    }
    
}
