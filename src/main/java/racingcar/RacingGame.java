package racingcar;

import racingcar.model.NumberGenerator;
import racingcar.model.Cars;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final NumberGenerator numberGenerator;

    public RacingGame(final String inputNames, final NumberGenerator numberGenerator) {
        this.cars = new Cars(inputNames);
        this.numberGenerator = numberGenerator;
    }

    public void play() {
        cars.step(numberGenerator);
    }


    public Cars getCars() {
        return cars;
    }

    public List<String> getWinnerNames() {
        return cars.getWinnerNames();
    }
}
