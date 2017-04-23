package com.javacodenet;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my", locations = "classpath:custom.properties")
public class CustomProperties {

    private String customMessageProperty;

    public String getCustomMessageProperty() {
        return customMessageProperty;
    }

    public void setCustomMessageProperty(String customMessageProperty) {
        this.customMessageProperty = customMessageProperty;
    }
}
