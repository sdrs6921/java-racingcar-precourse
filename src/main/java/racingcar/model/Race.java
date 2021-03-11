package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars;
    private int round;

    public Race() {
        cars = new ArrayList<>();
    }

    public void initRound(int round) {
        this.round = round;
    }
    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getRound() {
        return round;
    }
}
