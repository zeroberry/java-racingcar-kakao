package racingcar.dto;

import racingcar.model.Car;
import racingcar.model.Name;
import racingcar.model.Position;

public class CarDTO {

    private final Name name;
    private final Position position;

    public CarDTO(final Car car) {
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName() {
        return name.getValue();
    }

    public int getPosition() {
        return position.getValue();
    }
}
