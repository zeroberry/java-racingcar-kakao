package racingcar;

import racingcar.model.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {
        final String carNames = InputView.readCarNames();
        int roundCount = InputView.readTurnCount();

        final RacingGame racingGame = new RacingGame(carNames, new RandomNumberGenerator());
        OutputView.printPlayStart();
        for (int i = 0; i < roundCount; i++) {
            racingGame.play();
            OutputView.printRoundResult(racingGame.getCars());
        }
        OutputView.printWinner(racingGame.getWinnerNames());
    }
}
