package racingcar.model;

public class StepCount {

    private static final String COUNT_UNDER_ZERO_MESSAGE = "시도 횟수는 음수일 수 없습니다.";
    private static final int ZERO = 0;
    private static final int ONE = 1;


    private final int count;

    public StepCount(final int inputCount) {
        if (inputCount < ZERO) {
            throw new IllegalArgumentException(COUNT_UNDER_ZERO_MESSAGE);
        }
        this.count = inputCount;
    }

    public StepCount decrease() {
        return new StepCount(count - ONE);
    }

    public boolean isZero() {
        return count == ZERO;
    }
}
