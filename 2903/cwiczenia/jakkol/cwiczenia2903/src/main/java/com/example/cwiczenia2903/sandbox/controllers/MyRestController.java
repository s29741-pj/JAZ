package com.example.cwiczenia2903.sandbox.controllers;


import com.example.cwiczenia2903.car.model.Car;
import com.example.cwiczenia2903.car.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyRestController {

    private final CarService carService;

    public MyRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<String> handleCar() {
        String response = carService.get(0).getCarData();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> handlePathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/")
    public ResponseEntity<String> handleParam(@RequestParam String reqParam) {
        return ResponseEntity.ok("reqParam" + reqParam);
    }

    @PostMapping(value="/model/")
    @ResponseBody
    public ResponseEntity<String> handlePost(@RequestBody Car car) {
        Car newCar = new Car();
        newCar.setBrandName(car.getBrandName());
        newCar.setModel(car.getModel());
        newCar.setColor(car.getColor());
        carService.add(newCar);

        String response = newCar.getCarData();  
        return ResponseEntity.ok("Car created " + response);
    }
}
