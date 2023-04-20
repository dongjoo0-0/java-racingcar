package racingcar;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private static final String QUESTION_FOR_CAR_NAMES = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String QUESTION_FOR_TOTAL_TRY_COUNT = "시도할 회수는 몇 회 인가요?";

    @Override
    public Race setRaceAndRetryIfInvalid() {
        Race race = null;
        while (race == null) {
            race = setRaceOrNullIfInvalid();
        }
        return race;
    }

    private Race setRaceOrNullIfInvalid() {
        try {
            return this.setRace();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }

    private Race setRace() {
        Scanner scanner = new Scanner(System.in);

        askTotalCarCount();
        String carNamesString = scanner.nextLine();

        askTotalTryCount();
        Integer totalTryCount = scanner.nextInt();

        return new Race(carNamesString, totalTryCount);
    }

    private static void askTotalTryCount() {
        System.out.println(QUESTION_FOR_TOTAL_TRY_COUNT);
    }

    private static void askTotalCarCount() {
        System.out.println(QUESTION_FOR_CAR_NAMES);
    }
}