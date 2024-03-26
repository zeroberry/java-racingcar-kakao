package racingcar.model;

public class StepCount {

    private final int count;

    public StepCount(final int inputCount) {
        if (inputCount < 0) {
            throw new IllegalArgumentException("시도 횟수는 음수일 수 없습니다.");
        }
        this.count = inputCount;
    }

    public StepCount decrease() {
        return new StepCount(count - 1);
    }

    public boolean isZero() {
        return count == 0;
    }
}
