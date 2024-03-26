package racingcar.model;

public class Name {

    private static final String INVALID_LENGTH_MESSAGE = "이름의 길이는 5자 이하여야 합니다.";
    private static final String NOT_ZERO_LENGTH_MESSAGE = "이름의 길이는 0이 될 수 없습니다.";
    private static final String NO_SPACE_AT_EDGE_MESSAGE = "이름 앞뒤에 띄어쓰기가 있을 수 없습니다.";
    private static final int MAX_NAME_LENGTH = 5;
    private static final char SINGLE_SPACE = ' ';

    private final String value;

    public Name(final String inputName) {
        if (inputName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
        }
        if (inputName.isEmpty()) {
            throw new IllegalArgumentException(NOT_ZERO_LENGTH_MESSAGE);
        }
        if (inputName.charAt(inputName.length() - 1) == SINGLE_SPACE || inputName.charAt(0) == SINGLE_SPACE) {
            throw new IllegalArgumentException(NO_SPACE_AT_EDGE_MESSAGE);
        }
        this.value = inputName;
    }

    public String getValue() {
        return value;
    }
}
