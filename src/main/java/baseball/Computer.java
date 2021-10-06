package baseball;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import nextstep.utils.Randoms;

/**
 * @author : Tom
 * @date : 2021/10/04
 * @description :
 */
public class Computer {

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

  public static Computer makeComputerNumber() {
    Iterator<Integer> computerNumber = makeNumber(Randoms.pickNumberInRange(1, 9),
        Randoms.pickNumberInRange(1, 9), Randoms.pickNumberInRange(1, 9)).iterator();
    List<Integer> integerList = new ArrayList<>();
    while (computerNumber.hasNext()) {
      integerList.add(computerNumber.next());
    }
    return new Computer(integerList.get(0), integerList.get(1), integerList.get(2));
  }

  private Computer(int ball1, int ball2, int ball3) {
    this.ball1 = ball1;
    this.ball2 = ball2;
    this.ball3 = ball3;
  }

  private static Set<Integer> makeNumber(int num1, int num2, int num3) {
    Set<Integer> integerSet = new LinkedHashSet<>();
    integerSet.add(num1);
    while (integerSet.contains(num2)) {
      num2 = Randoms.pickNumberInRange(1, 9);
    }
    integerSet.add(num2);
    while (integerSet.contains(num3)) {
      num3 = Randoms.pickNumberInRange(1, 9);
    }
    integerSet.add(num3);
    return integerSet;
  }
}
