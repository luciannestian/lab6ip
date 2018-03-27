package Sources;

public class LogoutCommand extends Command {
    @Override
    public boolean execute() {
        return false;
    }

    public boolean logout(final String user) {
        return user.equals("test");
    }

}
