package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author : naming
 * @packageName : baseball
 * @date : 2021/10/10
 * @description :
 */
public class ValidationUtilsTest {

  @Test
  @DisplayName("1부터_9까지의_숫자확인")
  public void oneToNineNum(){
    assertThat(ValidationUtils.validNum(0)).isFalse();
    assertThat(ValidationUtils.validNum(10)).isFalse();
    assertThat(ValidationUtils.validNum(1)).isTrue();
    assertThat(ValidationUtils.validNum(9)).isTrue();
  }

}
