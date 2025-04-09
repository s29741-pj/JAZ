package com.example.cwiczenia0103;

import org.springframework.stereotype.Component;

@Component
public class SecondComp {
    public SecondComp(FirstComp firstComp) {
//        System.out.println("secondComp");
//        firstComp.sayHello();
//        compNameAndMethod();
    }

    public void compNameAndMethod() {
        System.out.println("secondComp, compNameAndMethod");
    }
}
