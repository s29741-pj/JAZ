package com.example.cwiczenia1503;


import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface{
    @Override
    public String sayHello() {
        return "Hello from QA";
//        System.out.println("Hello from QA");
    }
}
