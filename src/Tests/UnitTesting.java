package Tests;

import Sources.LoginCommand;
import Sources.LogoutCommand;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTesting {

    @Test
    public void loginTestSuccess() {
        assert(new LoginCommand().login("test", "test"));
    }

    @Test
    public void loginTestFail() {
        assert(new LoginCommand().login("test_fail", "test_fail"));
    }

    @Test
    public void logoutTestSuccess(){
        assert(new LogoutCommand().logout("test"));
    }

    @Test
    public void logoutTestFail(){
        assert(new LogoutCommand().logout("test_fail"));
    }
}