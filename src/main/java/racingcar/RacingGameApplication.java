package racingcar;

public class RacingGameApplication {

    public static void main(String[] args) {
        final String carNames = InputView.readCarNames();
        int roundCount = InputView.readTurnCount();

        final RacingGame racingGame = new RacingGame(carNames);
        OutputView.printPlayStart();
        for (int i = 0; i < roundCount; i++) {
            racingGame.moveCars();
            OutputView.printRoundResult(racingGame.getCars());
        }
        OutputView.printWinner(racingGame.getWinnerNames());
    }
}
