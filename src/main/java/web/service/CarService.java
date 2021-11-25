package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private List<Car> cars = new LinkedList<>();

    public CarService() {
        this(5);
    }

    public CarService(int count) {
        for (int i = 0; i < count; i++){
            cars.add(new Car("AL_" + i, "mod_" + i, i));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByCount(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
