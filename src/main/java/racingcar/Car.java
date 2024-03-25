package racingcar;

public class Car {
    private final Position position;
    private final Name name;

    public Car(final String name, final int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(final int value) {
        if (value < 0 || value > 9) {
            throw new IllegalArgumentException("입력값은 0 이상 9 이하여야 합니다.");
        }
        if (value >= 4) {
            position.moveFront();
        }
    }

    public int getPosition() {
        return position.getValue();
    }
}
