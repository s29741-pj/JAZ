package com.example.cwiczenia2903.car.storage;

import com.example.cwiczenia2903.car.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CarStorage {
    public ArrayList<Car> cars = new ArrayList<Car>();

    public CarStorage() {
        cars.add(new Car("Aston Martin", "DB9", "silver"));
        cars.add(new Car("Volkswagen", "Passat", "blue"));
        cars.add(new Car("FSO", "Polonez", "red"));
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

}
