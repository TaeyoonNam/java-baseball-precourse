package baseball;

import nextstep.utils.Console;

/**
 * @author : Tom
 * @packageName : baseball
 * @fileName : InputView
 * @date : 2021/10/04
 * @description :
 */
public class InputView {

  private static final String gameMessage = "숫자를 입력해주세요 : ";
  private static final String restartGameMessage = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

  public static String getUserNumber() {
    System.out.print(gameMessage);
    String userBall = Console.readLine();
    return userBall;
  }

}
