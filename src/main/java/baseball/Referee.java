package baseball;

/**
 * @date        : 2021/10/04
 * @author      : Tom 
 * @description : 
 */
public class Referee {

  private User user;
  private Computer computer;

  public void setUser(User user) {
    this.user = user;
  }

  public void setComputer(Computer computer) {
    this.computer = computer;
  }

  public Referee(User user, Computer computer) {
    this.user = user;
    this.computer = computer;
  }
}