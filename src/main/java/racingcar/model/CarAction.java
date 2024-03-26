package racingcar.model;

public enum CarAction {

    MOVE,
    STAND;

    public static CarAction generate(final int number) {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException("입력값은 0 이상 9 이하여야 합니다.");
        }
        if (number >= 4) {
            return MOVE;
        }
        return STAND;
    }

    public static boolean isMove(final CarAction targetCarAction) {
        return targetCarAction.equals(MOVE);
    }
}
