package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;

public class OutputView {

    private static final String PLAY_RESULT_MESSAGE = "\n실행 결과";
    private static final String RESULT_SEPARATOR = " : ";
    private static final String MOVING_BAR = "-";
    private static final String WINNER_JOINING_DELIMITER = ", ";
    private static final String FINAL_RESULT_MESSAGE = "가 최종 우승했습니다.";

    private OutputView() {
    }

    public static void printPlayStart() {
        System.out.println(PLAY_RESULT_MESSAGE);
    }

    public static void printRoundResult(Cars cars) {
        for (Car car : cars.getValues()) {
            StringBuilder carStatus = new StringBuilder(car.getName() + RESULT_SEPARATOR);
            carStatus.append(MOVING_BAR.repeat(car.getPosition()));
            System.out.println(carStatus);
        }
        System.out.println();
    }

    public static void printWinner(List<String> winnerNames) {
        System.out.println(String.join(WINNER_JOINING_DELIMITER, winnerNames) + FINAL_RESULT_MESSAGE);
    }
}
