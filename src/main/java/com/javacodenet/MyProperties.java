package com.javacodenet;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my")
public class MyProperties {

    private String messageProperty;

    public String getMessageProperty() {
        return messageProperty;
    }

    public void setMessageProperty(String messageProperty) {
        this.messageProperty = messageProperty;
    }
}
