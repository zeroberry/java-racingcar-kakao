package racingcar.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> values;

    public Cars(final String nameInput) {
        this.values = Arrays.stream(nameInput.split(","))
                .map(Car::makeNewCar)
                .collect(Collectors.toUnmodifiableList());
    }

    public void step(final NumberGenerator numberGenerator) {
        for (final Car car : values) {
            if (CarAction.isMove(CarAction.generate(numberGenerator.generate()))) {
                car.move();
            }
        }
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

    public List<Car> getValues() {
        return values;
    }
}
