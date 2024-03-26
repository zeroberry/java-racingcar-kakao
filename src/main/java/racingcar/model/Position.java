package racingcar.model;

public class Position {

    private static final int ZERO = 0;
    private static final String POSITION_UNDER_ZERO_MESSAGE = "위치는 음수일 수 없습니다.";

    private int value;

    public Position(final int value) {
        checkInvalidPosition(value);
        this.value = value;
    }

    private void checkInvalidPosition(final int value) {
        if (value < ZERO) {
            throw new IllegalArgumentException(POSITION_UNDER_ZERO_MESSAGE);
        }
    }

    public int getValue() {
        return value;
    }

    public void moveFront() {
        value++;
    }
}
