package com.example.cwiczenia1503;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



@Service
public class EnvironmentData {
    private final Environment environment;

    public EnvironmentData(Environment environment) {
        this.environment = environment;
    }

    public boolean isEnvironmentPresent(){
        return environment.containsProperty("app.environment");
    }

    public String getProfileName(){
        return environment.getProperty("app.environment");
    }



}
