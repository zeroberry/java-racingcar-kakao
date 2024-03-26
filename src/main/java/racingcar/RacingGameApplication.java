package racingcar;

import racingcar.model.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameApplication {

    public static void main(String[] args) {
        final String carNames = InputView.readCarNames();
        int stepCount = InputView.readTurnCount();
        final RacingGame racingGame = new RacingGame(carNames, new RandomNumberGenerator(), stepCount);
        OutputView.printPlayStart();
        while (!racingGame.isEnd()) {
            racingGame.play();
            OutputView.printRoundResult(racingGame.getCars());
        }
        OutputView.printWinner(racingGame.getWinnerNames());
    }
}
