package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author : naming
 * @packageName : baseball
 * @date : 2021/10/10
 * @description :
 */
public class BallTest {

  private Ball com;

  @BeforeEach
  void makeBall() {
    com = new Ball(1, 3);
  }

  @Test
  void isStrike() {
    assertThat(com.play(new Ball(1, 3))).isEqualTo(BallStatus.STRIKE);
  }

  @Test
  void isBall() {
    assertThat(com.play(new Ball(2,3))).isEqualTo(BallStatus.BALL);
  }

  @Test
  void isNothing() {
    assertThat(com.play(new Ball(1,4))).isEqualTo(BallStatus.NOTHING);
  }

}
