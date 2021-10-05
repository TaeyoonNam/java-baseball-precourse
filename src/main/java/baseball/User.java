package baseball;

import java.util.HashSet;
import java.util.Set;

public class User {

  private int ball1;

  private int ball2;

  private int ball3;

  public int getBall1() {
    return ball1;
  }

  public int getBall2() {
    return ball2;
  }

  public int getBall3() {
    return ball3;
  }

  public User(String userBall) {
    if (!userBallValidationCheck(userBall)) {
      return;
    }
    this.ball1 = userBall.charAt(0);
    this.ball2 = userBall.charAt(1);
    this.ball3 = userBall.charAt(2);
  }

  private boolean userBallValidationCheck(String userBall) {
    return true;
  }

}
