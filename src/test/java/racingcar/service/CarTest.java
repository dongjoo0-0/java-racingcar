package racingcar.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차 움직임 테스트")
    public void move()
    {
        Car car = new Car();
        assertThat(car.drive()).isEqualTo(1);
    }
}