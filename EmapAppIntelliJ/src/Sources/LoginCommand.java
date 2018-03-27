package Sources;

public class LoginCommand extends Command {
    public boolean logged;

    @Override
    public boolean execute() {
        return false;

    }

    public boolean login(final String user, final String password) {
        return user.equals("test") && password.equals("test");
    }

}
