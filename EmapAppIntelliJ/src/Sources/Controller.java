package Sources;

import java.util.Scanner;

public class Controller {
    public User user;

    public DB dB;

    public void runCommand() {

        Scanner newscanner = new Scanner(System.in);

        String username = getString(newscanner, "Please enter your username: ");

        String password = getString(newscanner, "Please enter your password: ");

        if (new LoginCommand().login(username, password)) {
            System.out.println("Sources.User logged in!");
        }
        else {
            System.out.println("Access denied!");
        }
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
