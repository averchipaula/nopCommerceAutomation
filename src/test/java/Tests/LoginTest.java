package Tests;

import Base.Hooks;
import Objects.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends Hooks {

    @Test
    public void metodaLogin(){
        LoginObject loginData = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginValidProcess(loginData);

    }
}
