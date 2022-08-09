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


    @Test
    public void invalidUsername(){

        LoginObject loginData = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.invalidUserName(loginData);

    }

    @Test
    public void invalidPassword(){
        LoginObject loginData = new LoginObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.invalidPassword(loginData);
    }



}
