package racingcar.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private static final String SPLIT_REGEX = ",";
    private static final String INVALID_CARS_STATE_MESSAGE = "올바르지 않은 자동차 구성입니다.";

    private final List<Car> values;

    public Cars(final String nameInput) {
        this.values = Arrays.stream(nameInput.split(SPLIT_REGEX))
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

    public Winners getWinners() {
        return new Winners(values.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .map(car -> values.stream()
                        .filter(c -> c.getPosition() == car.getPosition())
                        .map(Car::getName)
                        .collect(Collectors.toUnmodifiableList()))
                .orElseThrow(() -> new IllegalArgumentException(INVALID_CARS_STATE_MESSAGE)));
    }

    public List<Car> getValues() {
        return values;
    }
}
