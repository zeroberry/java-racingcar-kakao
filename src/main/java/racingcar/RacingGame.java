package racingcar;

import racingcar.dto.CarDTO;
import racingcar.model.CarMoveStrategy;
import racingcar.model.Cars;
import racingcar.model.StepCount;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    private final Cars cars;
    private final CarMoveStrategy carMoveStrategy;
    private StepCount stepCount;

    public RacingGame(final String inputNames, final CarMoveStrategy carMoveStrategy, final int inputCount) {
        this.cars = new Cars(inputNames);
        this.carMoveStrategy = carMoveStrategy;
        this.stepCount = new StepCount(inputCount);
    }

    public void play() {
        stepCount = stepCount.decrease();
        cars.step(carMoveStrategy);
    }

    public boolean isEnd() {
        return stepCount.isZero();
    }

    public List<CarDTO> extractCarDTOs() {
        return cars.getValues().stream()
                .map(CarDTO::new)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<String> getWinnerNames() {
        return cars.getWinners().getNames();
    }
}
