package com.example.cwiczenia2903.sandbox.controllers;


import com.example.cwiczenia2903.car.model.Car;
import com.example.cwiczenia2903.car.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {
    private final CarService carService;

    public HomeworkRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/start/{value}")
    public ResponseEntity<String> handlePathVariable(@PathVariable String value) {
        return ResponseEntity.ok(value + "");
    }

    @GetMapping("/start/")
    public ResponseEntity<String> handleReqParam(@RequestParam String value) {
        return ResponseEntity.ok(value + "");
    }

    @PutMapping("/replace/{id}/")
    public ResponseEntity<String> handleReplace(@PathVariable int id, @RequestBody Car car) {
        String old_record = carService.get(id).getCarData();
        Car newCar = new Car();
        newCar.setBrandName(car.getBrandName());
        newCar.setModel(car.getModel());
        newCar.setColor(car.getColor());
        carService.update(id ,newCar);

        String new_record = carService.get(id).getCarData();
        return ResponseEntity.ok("replaced " + old_record + " with " + new_record);
    }

    @PostMapping("/add")
    public ResponseEntity<String> handleAdd(@RequestBody Car car) {
        carService.add(car);
        int last_index = carService.getAll().size()-1;
        String new_record = carService.get(last_index).getCarData();
        return ResponseEntity.ok("added " + new_record);
    }

    @DeleteMapping("/delete/{id}/")
    public ResponseEntity<String> handleDelete(@PathVariable int id) {
        carService.remove(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
