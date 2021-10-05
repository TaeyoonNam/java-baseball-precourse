package baseball;

public class Application {
    public static void main(String[] args) {
        boolean isGameStart = true;
        Computer computer = new Computer();

        while (isGameStart) {
            String userBall = InputView.getUserBall();
            User user = new User(userBall);

        }
    }
}
