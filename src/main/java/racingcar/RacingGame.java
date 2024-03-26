package racingcar;

import racingcar.model.NumberGenerator;
import racingcar.model.Cars;
import racingcar.model.StepCount;

import java.util.List;

public class RacingGame {

    private final Cars cars;
    private final NumberGenerator numberGenerator;
    private StepCount stepCount;

    public RacingGame(final String inputNames, final NumberGenerator numberGenerator, final int inputCount) {
        this.cars = new Cars(inputNames);
        this.numberGenerator = numberGenerator;
        this.stepCount = new StepCount(inputCount);
    }

    public void play() {
        stepCount = stepCount.decrease();
        cars.step(numberGenerator);
    }

    public boolean isEnd() {
        return stepCount.isZero();
    }

    public Cars getCars() {
        return cars;
    }

    public List<String> getWinnerNames() {
        return cars.getWinnerNames();
    }
}
