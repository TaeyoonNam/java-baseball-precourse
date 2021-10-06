package baseball;

public class OutputView {

  private static final String FINISH_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 끝";
  private static final String NOTHING = "낫싱";
  private static final String STRIKE_MESSAGE = "%d스트라이크";
  private static final String BALL_MESSAGE = "%d볼";

  public static void gameResult(final Result result) {
    String strikeMessage = getStrikeMsg(result.getNumberOfStrike());
    String ballMessage = getBallMsg(result.getNumberOfBall());
    if(result.isThreeStrike()) {
      System.out.println(strikeMessage + "\n" +FINISH_MESSAGE);
      return;
    }
    if(result.getNumberOfStrike() == 0 && result.getNumberOfBall() == 0) {
      System.out.println(NOTHING);
      return;
    }
    System.out.println(new StringBuilder().append(strikeMessage).append(ballMessage).toString());
  }

  private static String getBallMsg(final int numberOfBall){
    if(numberOfBall == 0) {
      return "";
    }
    return String.format(BALL_MESSAGE, numberOfBall);
  }

  private static String getStrikeMsg(final int numberOfStrike) {
    if(numberOfStrike == 0) {
      return "";
    }
    return String.format(STRIKE_MESSAGE, numberOfStrike);
  }
}
