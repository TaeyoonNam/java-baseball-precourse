package baseball;

/**
 * @author : naming
 * @packageName : baseball
 * @date : 2021/10/10
 * @description :
 */
public class ValidationUtils {

  private static int MIN_VALUE = 1;
  private static int MAX_VALUE = 9;

  public static boolean validNum(int num) {
    return num >= MIN_VALUE && num <= MAX_VALUE;
  }
}
