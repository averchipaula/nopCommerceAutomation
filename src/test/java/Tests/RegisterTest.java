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

    @Test
    public void registerInvalidName() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerInvalidName(registerData);

    }

    @Test
    public void registerInvalidEmail() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerInvalidEmail(registerData);

    }

    @Test
    public void registerWrongEmail() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerWrongEmail(registerData);


    }

    @Test
    public void registerSameEmailDiffPass() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerSameEmail(registerData);

    }

    @Test
    public void registerWithInvalidPassword() {

        RegisterObject registerData = new RegisterObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickRegister();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerPasswordError(registerData);
    }

}