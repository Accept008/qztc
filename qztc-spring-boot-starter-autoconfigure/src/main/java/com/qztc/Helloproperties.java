package com.qztc;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "qztc.hi")
public class Helloproperties {

    private String preffix;

    private String suffix;

    public String getPrefix() {
        return preffix;
    }

    public void setPrefix(String preffix) {
        this.preffix = preffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
