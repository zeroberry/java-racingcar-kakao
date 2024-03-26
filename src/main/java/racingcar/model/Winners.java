package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    private final List<Name> names;

    public Winners(List<Name> winnerNames) {
        if (winnerNames.isEmpty()) {
            throw new IllegalArgumentException("우승자는 1명이상 존재해야 합니다.");
        }
        this.names = winnerNames;
    }

    public List<String> getNames() {
        return names.stream()
                .map(Name::getValue)
                .collect(Collectors.toUnmodifiableList());
    }
}
