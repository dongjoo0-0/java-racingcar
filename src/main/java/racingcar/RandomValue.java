package racingcar;

import java.util.Random;

public class RandomValue implements RandomValueGenerator{

    private static final int RANDOM_NUMBER_UPPER_RANGE = 10;

    @Override
    public int generate() {
        return new Random().nextInt(RANDOM_NUMBER_UPPER_RANGE);
    }

//    public static int getValue() {
//        return new Random().nextInt(10);
//    }
}
