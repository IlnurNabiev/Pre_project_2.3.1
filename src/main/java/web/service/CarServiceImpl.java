package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    public static List<Car> getCars() {
        List<Car> cars;
        {
            cars = new ArrayList<>();
            cars.add(new Car(1, "Volvo", 5000));
            cars.add(new Car(2, "VW", 1000));
            cars.add(new Car(3, "Audi", 4000));
            cars.add(new Car(4, "Mercedes", 5000));
            cars.add(new Car(5, "BMW", 3000));
        }
        return cars;
    }
    @Override
    public List<Car> show(List<Car> cars, int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}