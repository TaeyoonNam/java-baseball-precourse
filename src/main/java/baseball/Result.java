package baseball;

public class Result {

  private int numberOfStrike;
  private int numberOfBall;

  public Result(int numberOfStrike, int numberOfBall) {
    this.numberOfStrike = numberOfStrike;
    this.numberOfBall = numberOfBall;
  }

  public int getNumberOfStrike() {
    return numberOfStrike;
  }

  public int getNumberOfBall() {
    return numberOfBall;
  }

  public boolean isThreeStrike() {
    if (this.numberOfStrike == 3) {
      return true;
    }
    return false;
  }
}
