package racingcar;

import racingcar.model.Car;

public class CarInfo {

    private final String name;
    private final int position;

    public CarInfo(final Car car) {
        this.name = car.getName().getValue();
        this.position = car.getPosition();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
