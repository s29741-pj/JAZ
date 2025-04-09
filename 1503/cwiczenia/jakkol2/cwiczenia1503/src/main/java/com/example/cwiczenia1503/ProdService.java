package com.example.cwiczenia1503;


import org.springframework.stereotype.Service;

@Service
public class ProdService implements HandlerServiceInterface{
    @Override
    public String sayHello() {
        return "Hello from Prod";
//        System.out.println("Hello from Prod");
    }
}
