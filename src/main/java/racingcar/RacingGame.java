package racingcar;

import java.util.List;
import java.util.Random;

public class RacingGame {

    private final Cars cars;

    private static final Random RANDOM = new Random();

    public RacingGame(String inputNames) {
        this.cars = new Cars(inputNames);
    }

    public List<String> play(int round) {
        for (int i = 0; i < round; i++) {
            moveCars();
        }
        return cars.getWinnerNames();
    }

    private void moveCars() {
        for (Car car : cars.getValues()) {
            car.move(numberGenerator());
        }
    }

    private int numberGenerator() {
        return RANDOM.nextInt(10);
    }
}
