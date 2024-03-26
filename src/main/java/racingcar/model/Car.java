package racingcar.model;

public class Car {
    private final Position position;
    private final Name name;

    private Car(final String name, final int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public static Car makeNewCar(final String name) {
        return new Car(name, 0);
    }

    public void move() {
        position.moveFront();
    }

    public int getPosition() {
        return position.getValue();
    }

    public String getName() {
        return name.getValue();
    }
}
