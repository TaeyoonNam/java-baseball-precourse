package baseball;

/**
 * @author : Tom
 * @date : 2021/10/04
 * @description :
 */
public class Referee {

  private User user;
  private Computer computer;

  private Referee() {}

  public void setUser(User user) {
    this.user = user;
  }

  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  public static Result getStrikeResult(final User user, final Computer computer) {
    return new Result(countStrike(user, computer), countBall(user, computer));
  }

  private static int countStrike(final User user, final Computer computer) {
    int countStrike = 0;
    if(user.getBall1() == computer.getBall1()) {
      countStrike ++;
    }
    if(user.getBall2() == computer.getBall2()) {
      countStrike ++;
    }
    if(user.getBall2() == computer.getBall2()) {
      countStrike ++;
    }
    return countStrike;
  }

  private static int countBall(final User user, final Computer computer) {
    int countBall = 0;
    if(user.getBall1() == computer.getBall2() || user.getBall1() == computer.getBall3()) {
      countBall ++;
    }
    if(user.getBall2() == computer.getBall1() || user.getBall2() == computer.getBall3()) {
      countBall ++;
    }
    if(user.getBall3() == computer.getBall1() || user.getBall3() == computer.getBall2()) {
      countBall ++;
    }
    return countBall;
  }
}