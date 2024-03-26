package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @DisplayName("자동차의 위치를 한 칸 전진할 수 있다.")
    @Test
    void moveTest() {
        // given
        final Car car = Car.makeNewCar("lucas");

        // when
        car.move();

        // then
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
