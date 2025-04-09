package com.example.cwiczenia1503;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cwiczenia1503Application {
    private final RequestExecutor executor;
    private final FacadeService facadeService;

    public Cwiczenia1503Application(RequestExecutor executor, FacadeService facadeService) {
        this.executor = executor;
        this.facadeService = facadeService;
        run();
    }


    public void run(){
//    cwiczenia 1-3
//        System.out.println(config.getLoginUrl());
//        System.out.println(config.getCredentials().getUser());
//        System.out.println(config.getCredentials().getPassword());
        executor.runFacade();
    }

    public static void main(String[] args) {
        SpringApplication.run(Cwiczenia1503Application.class, args);
    }

}
