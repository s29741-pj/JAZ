package com.example.cwiczenia2903.car.service;


import com.example.cwiczenia2903.car.model.Car;
import com.example.cwiczenia2903.car.storage.CarStorage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarService {

    private CarStorage carStorage;

    public CarService(CarStorage carStorage) {
        this.carStorage = carStorage;
    }


    public void add(Car car) {
        carStorage.getCars().add(car);
    }

    public void remove(Car car) {
        carStorage.getCars().remove(car);
    }

    public void remove(int index) {
        carStorage.getCars().remove(index);
    }

    public void update(Car car) {
        carStorage.getCars().set(carStorage.getCars().indexOf(car), car);
    }

    public void update(int index, Car car) {
        carStorage.getCars().set(index, car);
    }

    public Car get(int id) {
        return carStorage.getCars().get(id);
    }

    public ArrayList<Car> getAll() {
        return carStorage.getCars();
    }


}
