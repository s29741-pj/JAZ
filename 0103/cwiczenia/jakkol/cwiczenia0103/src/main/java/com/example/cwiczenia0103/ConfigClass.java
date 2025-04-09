package com.example.cwiczenia0103;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@Configuration
@EnableAutoConfiguration
@ImportResource("classpath:beans.xml")
public class ConfigClass {


    public ConfigClass(Pojo pojo) {
//        System.out.println(pojo.getText());
    }

    @Bean
    @ConditionalOnProperty(name = "my.test.value", havingValue = "true")
    public InitiateOnTestProfile onTestProfile() {
        return new InitiateOnTestProfile();
    }

    //    @Bean
//    public Pojo pojoExample() {
//        return new Pojo();
//    }


//    @Bean
    public List<String> defaultData() {
        return List.of("string1", "string2", "string3", "string4", "string5");
    }
}

