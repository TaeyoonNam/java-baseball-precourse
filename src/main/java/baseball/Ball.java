package baseball;

/**
 * @author : naming
 * @packageName : baseball
 * @date : 2021/10/10
 * @description :
 */
public class Ball {

  private int index;
  private int num;

  public Ball(int index, int num) {
    this.index = index;
    this.num = num;
  }

  public BallStatus play(Ball ball) {
    if(this.num == ball.num && this.index == ball.index) {
      return BallStatus.STRIKE;
    }
    if(this.num == ball.num && !(this.index == ball.index)) {
      return BallStatus.BALL;
    }
    return BallStatus.NOTHING;
  }
}
