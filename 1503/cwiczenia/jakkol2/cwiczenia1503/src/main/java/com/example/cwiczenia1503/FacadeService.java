package com.example.cwiczenia1503;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class FacadeService {

    private String activeService;

    private final Map<String, HandlerServiceInterface> services;
    Pattern pattern = Pattern.compile("^(.*?)(?=Service)");

    public FacadeService(Map<String, HandlerServiceInterface> services) {
        this.services = services;
    }

//  Home 03
    private void selectEnvironment(String environment) {
        boolean found = false;

        for(HandlerServiceInterface service: services.values()) {
             Matcher matcher = pattern.matcher(service.getClass().getSimpleName());
            if(matcher.find() && environment.equalsIgnoreCase(matcher.group(1))) {
                System.out.println(service.sayHello());
                activeService =  service.sayHello();
                found = true;
                break;
            } else if (environment.equalsIgnoreCase("default")) {
                System.out.println("Hello from default");
                activeService = environment;
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Environment " + environment + " not found");
        }
    }

    public String getActiveService() {
        return activeService;
    }

    public void execute(String environment) {
        selectEnvironment(environment);
    }

    // previous setup
//    private final ProdService prodService;
//    private final DevService devService;
//    private final QaService qaService;
//    private final StagingService stagingService;
    // previous setup
//    public FacadeService(ProdService prodService, DevService devService, QaService qaService, StagingService stagingService) {
//        this.prodService = prodService;
//        this.devService = devService;
//        this.qaService = qaService;
//        this.stagingService = stagingService;
//    }

// previous setup
//    public void selectEnvironment(String environment) {
//        switch (environment){
//            case "prod":
//                prodService.sayHello();
//                break;
//            case "qa":
//                qaService.sayHello();
//                break;
//  Home 01
//            case "staging":
//                stagingService.sayHello();
//                break;
//            default:
//                devService.sayHello();
//        }
//    }

}
