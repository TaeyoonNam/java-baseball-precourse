package baseball;

public class Application {

  public static void main(String[] args) {
    boolean isGaming = true;
    Computer computer = new Computer();
    while (isGaming) {
      User user = new User(InputView.getUserNumber());
      if (!user.haveBall()) continue;

      Result result = Referee.getStrikeResult(user, computer);
      OutputView.gameResult(result);

      if (result.isThreeStrike()) {
        isGaming = InputView.isGameRestart();
        computer = new Computer();
      }
    }
  }
}
