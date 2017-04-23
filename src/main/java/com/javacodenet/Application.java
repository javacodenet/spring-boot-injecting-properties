package com.javacodenet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@EnableConfigurationProperties(value=MyProperties.class) This will be required if you remove @Component annotation
// from MyProperties.java
public class Application {

    @Autowired
    MyProperties myProperties;

    @Autowired
    CustomProperties customProperties;

    @RequestMapping("/")
    public String myMessageProperty() {
        return "Value read from application.properties is: " + myProperties.getMessageProperty() + " " +
                "And value read from custom.properties is: " + customProperties.getCustomMessageProperty();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}