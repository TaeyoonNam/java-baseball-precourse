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

  public User(String userNumber) {
    if (!userBallValidationCheck(userNumber)) {
      return;
    }
    this.ball1 = Integer.parseInt(userNumber.substring(0,1));
    this.ball2 = Integer.parseInt(userNumber.substring(1,2));
    this.ball3 = Integer.parseInt(userNumber.substring(2,3));
  }

  public boolean haveBall() {
    if(ball1 == 0 || ball2 == 0 || ball3 == 0) {
      return false;
    }
    return true;
  }


  private boolean userBallValidationCheck(String userNumber) {
    if (!(userNumber.length() == 3)) {
      System.out.println("[ERROR] 3자리 숫자를 입력해주시기 바랍니다.");
      return false;
    }
    if (!isDigit(userNumber)) {
      return false;
    }
    if (!isOneToNineDigit(userNumber)) {
      return false;
    }
    if (isDuplicateNumExist(userNumber)) {
      return false;
    }
    return true;
  }

  private boolean isDigit(String userNumber) {
    if (!Character.isDigit(userNumber.charAt(0))
        || !Character.isDigit(userNumber.charAt(1))
        || !Character.isDigit(userNumber.charAt(2))) {
      System.out.println("[ERROR] 숫자만 입력 할 수 있습니다.");
      return false;
    }
    return true;
  }

  private boolean isOneToNineDigit(String userNumber) {
    boolean isOneToNine = true;
    if (!(0 < Character.getNumericValue(userNumber.charAt(0))
        && Character.getNumericValue(userNumber.charAt(0)) <= 9)) {
      isOneToNine = false;
    }
    if (!(0 < Character.getNumericValue(userNumber.charAt(1))
        && Character.getNumericValue(userNumber.charAt(1)) <= 9)) {
      isOneToNine = false;
    }
    if (!(0 < Character.getNumericValue(userNumber.charAt(2))
        && Character.getNumericValue(userNumber.charAt(2)) <= 9)) {
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
