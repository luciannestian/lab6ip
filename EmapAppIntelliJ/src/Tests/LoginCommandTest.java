package Tests;

import Sources.LoginCommand;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCommandTest {

    @Test
    public void loginTestSuccess() {
        assert(new LoginCommand().login("test", "test"));
    }

}