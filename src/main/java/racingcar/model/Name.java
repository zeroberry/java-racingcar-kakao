package racingcar.model;

public class Name {

    private final String value;

    public Name(final String inputName) {
        if (inputName.length() > 5) {
            throw new IllegalArgumentException("이름의 길이는 5자 이하여야 합니다.");
        }
        if (inputName.isEmpty()) {
            throw new IllegalArgumentException("이름의 길이는 0이 될 수 없습니다.");
        }
        if (inputName.charAt(inputName.length() - 1) == ' ' || inputName.startsWith(" ")) {
            throw new IllegalArgumentException("이름 앞뒤에 띄어쓰기가 있을 수 없습니다.");
        }
        this.value = inputName;
    }

    public String getValue() {
        return value;
    }
}
