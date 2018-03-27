import java.util.Scanner;

public class Controller {
    public User user;

    public DB dB;

    public void runCommand() {

        Scanner newscanner = new Scanner(System.in);

        String username = getString(newscanner, "Please enter your username: ");

        String password = getString(newscanner, "Please enter your password: ");

        new LoginCommand().login(username, password);
    }

    public void getInstace() {
    }

    public void newOperation() {
    }

    private String getString(Scanner newscanner, String ask) {

        System.out.print(ask);

        return newscanner.nextLine();

    }

}
