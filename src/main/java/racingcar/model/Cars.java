package racingcar.model;

import java.util.*;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> values;

    public Cars(final String nameInput) {
        this.values = Arrays.stream(nameInput.split(","))
                .map(name -> new Car(name, 0))
                .collect(Collectors.toUnmodifiableList());
    }

    public List<Car> getValues() {
        return values;
    }

    public List<String> getWinnerNames() {
        return values.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .map(car -> values.stream()
                        .filter(c -> c.getPosition() == car.getPosition())
                        .map(Car::getName)
                        .collect(Collectors.toUnmodifiableList()))
                .orElseThrow(() -> new IllegalArgumentException("올바르지 않은 자동차 구성입니다."));
    }
}
