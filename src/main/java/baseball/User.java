package baseball;

import java.util.HashSet;
import java.util.Set;

public class User {

  private int ball1 = 0;

  private int ball2 = 0;

  private int ball3 = 0;

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
    this.ball1 = Integer.parseInt(userBall.substring(0,1));
    this.ball2 = Integer.parseInt(userBall.substring(1,2));
    this.ball3 = Integer.parseInt(userBall.substring(2,3));
  }

  public boolean haveBall() {
    if(ball1 == 0 || ball2 == 0 || ball3 == 0) {
      return false;
    }
    return true;
  }


  private boolean userBallValidationCheck(String userBall) {
    if (!(userBall.length() == 3)) {
      System.out.println("[ERROR] 3자리 숫자를 입력해주시기 바랍니다.");
      return false;
    }
    if (!isDigit(userBall)) {
      return false;
    }
    if (!isOneToNineDigit(userBall)) {
      return false;
    }
    if (isDuplicateNumExist(userBall)) {
      return false;
    }
    return true;
  }

  private boolean isDigit(String userBall) {
    if (!Character.isDigit(userBall.charAt(0))
        || !Character.isDigit(userBall.charAt(1))
        || !Character.isDigit(userBall.charAt(2))) {
      System.out.println("[ERROR] 숫자만 입력 할 수 있습니다.");
      return false;
    }
    return true;
  }

  private boolean isOneToNineDigit(String userBall) {
    boolean isOneToNine = true;
    if (!(0 < Character.getNumericValue(userBall.charAt(0))
        && Character.getNumericValue(userBall.charAt(0)) <= 9)) {
      isOneToNine = false;
    }
    if (!(0 < Character.getNumericValue(userBall.charAt(1))
        && Character.getNumericValue(userBall.charAt(1)) <= 9)) {
      isOneToNine = false;
    }
    if (!(0 < Character.getNumericValue(userBall.charAt(2))
        && Character.getNumericValue(userBall.charAt(2)) <= 9)) {
      isOneToNine = false;
    }
    if (!isOneToNine) {
      System.out.println("[ERROR] 1부터 9까지 숫자만 입력 할 수 있습니다.");
    }
    return isOneToNine;
  }

  private boolean isDuplicateNumExist(String userBall) {
    Set<Character> characterSet = new HashSet<>();
    boolean isDuplicateNumExist = false;
    characterSet.add(userBall.charAt(0));
    if (characterSet.contains(userBall.charAt(1))) {
      isDuplicateNumExist = true;
    }
    characterSet.add(userBall.charAt(1));
    if (characterSet.contains(userBall.charAt(2))) {
      isDuplicateNumExist = true;
    }
    if (isDuplicateNumExist) {
      System.out.println("[ERROR] 1부터 9까지 서로 다른 수를 입력해주세요.");
    }
    return isDuplicateNumExist;
  }
}
