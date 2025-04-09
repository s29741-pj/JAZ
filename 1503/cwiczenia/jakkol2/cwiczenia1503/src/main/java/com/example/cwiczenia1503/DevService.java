package com.example.cwiczenia1503;

import org.springframework.stereotype.Service;

@Service
public class DevService implements HandlerServiceInterface {
    @Override
    public String sayHello() {
        return "Hello from Dev";
//        System.out.println("Hello from Dev");
    }
}
