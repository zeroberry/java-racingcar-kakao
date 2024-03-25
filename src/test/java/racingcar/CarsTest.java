package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CarsTest {

    @DisplayName("하나의 문자열을 받아 콤마(,)로 구분된 수 만큼 자동차를 생성한다.")
    @Test
    void create_SuccessTest() {
        // given
        final Cars cars = new Cars("lucas,dino,eve,helen");

        // when & then
        assertThat(cars.getValues()).hasSize(4);
    }

    @DisplayName("현재 가장 멀리 간 자동차들의 이름을 반환할 수 있다.")
    @Test
    void getWinnerNamesTest() {
        // given
        final Cars cars = new Cars("lucas,dino,eve,helen");
        cars.getValues().get(0).move(9);
        cars.getValues().get(1).move(9);

        // when
        final List<String> winnerNames = cars.getWinnerNames();

        // then
        assertAll(
                () -> assertThat(winnerNames).hasSize(2),
                () -> assertThat(winnerNames).contains("lucas"),
                () -> assertThat(winnerNames).contains("dino")
        );
    }
}
