package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota", "LandCriuser", "200"));
        cars.add(new Car("Mitsubishi", "Pajero", "IV"));
        cars.add(new Car("Porshe", "Cayenne", "III"));
        cars.add(new Car("Maserati", "GranTurismo", "II"));
        cars.add(new Car("Mersedes", "GLS", "II"));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count < 0) {
            count = cars.size();
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
