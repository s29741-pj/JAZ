package com.example.cwiczenia1503;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sandbox")
public class MyRestController {
    private FacadeService facadeService;

    public MyRestController(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

//  Home 04
    @GetMapping("/active-service")
    public ResponseEntity<String> activeService() {
        return ResponseEntity.ok(facadeService.getActiveService());
    }
}
