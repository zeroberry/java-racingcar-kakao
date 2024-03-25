package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.model.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarTest {

    @DisplayName("4이상의 값에서 앞으로 한칸 이동한다.")
    @ParameterizedTest
    @CsvSource(value = {"0, 0", "1, 0", "2, 0", "3, 0", "4, 1", "5, 1", "6, 1", "7, 1", "8, 1", "9, 1"})
    void move_SuccessHigherOrEqual4(final int value, final int expected) {
        // given
        Car car = new Car("abc", 0);

        // when
        car.move(value);

        // then
        assertThat(car.getPosition()).isEqualTo(expected);
    }

    @DisplayName("입력받은 숫자가 0 ~ 9 사이가 아니면 예외 처리한다.")
    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -10, 10, 11, 100, 1000, -100})
    void move_FailWhenInvalidValue(final int value) {
        // given
        Car car = new Car("abc", 0);

        // when & then
        assertThatThrownBy(() -> car.move(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("입력값은 0 이상 9 이하여야 합니다.");
    }
}
