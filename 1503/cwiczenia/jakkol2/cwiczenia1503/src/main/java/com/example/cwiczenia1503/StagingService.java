package com.example.cwiczenia1503;


import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface{
    @Override
    public String sayHello() {
        return "Hello from Staging";
//        System.out.println("Hello from Staging");
    }

}
