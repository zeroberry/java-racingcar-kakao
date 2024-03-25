package racingcar;

import java.util.List;

public class OutputView {

    private OutputView() {
    }

    public static void printPlayStart() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(Cars cars) {
        for (Car car : cars.getValues()) {
            StringBuilder carStatus = new StringBuilder(car.getName() + " : ");
            carStatus.append("-".repeat(car.getPosition()));
            System.out.println(carStatus);
        }
        System.out.println();
    }

    public static void printWinner(List<String> winnerNames) {
        System.out.println(String.join(", ", winnerNames) + "가 최종 우승했습니다.");
    }
}
