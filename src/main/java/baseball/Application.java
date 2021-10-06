package baseball;

public class Application {
    public static void main(String[] args) {
        boolean isGaming = true;
        Computer computer = null;
        while (isGaming) {
            computer = new Computer();
            String userBall = InputView.getUserBall();
            User user = new User(userBall);
            if(!user.haveBall()) continue;
        }
    }
}
