package racingcar;

import java.util.List;
import java.util.Random;

public class RacingGame {

    private final Cars cars;

    private static final Random RANDOM = new Random();

    public RacingGame(final String inputNames) {
        this.cars = new Cars(inputNames);
    }

    public void moveCars() {
        for (final Car car : cars.getValues()) {
            car.move(numberGenerator());
        }
    }

    private int numberGenerator() {
        return RANDOM.nextInt(10);
    }

    public Cars getCars() {
        return cars;
    }

    public List<String> getWinnerNames() {
        return cars.getWinnerNames();
    }
}
