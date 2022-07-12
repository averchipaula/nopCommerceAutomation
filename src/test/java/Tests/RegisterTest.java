package Tests;

import Base.Hooks;
import Objects.RegisterObject;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTest extends Hooks {

    @Test
    public void registerTest() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerValid(registerData);
    }
}
