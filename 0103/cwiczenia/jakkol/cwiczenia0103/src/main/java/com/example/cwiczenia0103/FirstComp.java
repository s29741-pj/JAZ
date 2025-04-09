package com.example.cwiczenia0103;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FirstComp {
    public FirstComp(@Value("${my.custom.property:default value}") String propertiesValue) {
//        System.out.println("firstComp");
//        System.out.println(propertiesValue);
//        compNameAndMethod();
    }

    public void sayHello() {
        System.out.println("hello");
    }

    public void compNameAndMethod() {
        System.out.println("firstComp, compNameAndMethod");
    }
}
