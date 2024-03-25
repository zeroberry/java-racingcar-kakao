package racingcar;

public class Position {

    private int value;

    public Position(final int value) {
        if (value < 0) {
            throw new IllegalArgumentException("위치는 음수일 수 없습니다.");
        }
        this.value = value;
    }
}
