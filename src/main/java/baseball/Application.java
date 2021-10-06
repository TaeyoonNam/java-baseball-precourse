package baseball;

public class Application {
    public static void main(String[] args) {
        boolean isGaming = true;
        Computer computer = Computer.makeComputerNumber();

        while (isGaming) {
            User user = new User(InputView.getUserNumber());
            if(!user.haveBall()) continue;
        }
    }
}
