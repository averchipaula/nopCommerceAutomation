package Tests;

import Base.Hooks;
import Objects.MyAccountObject;
import Objects.OrderObject;
import Pages.IndexPage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.OrderPage;
import org.junit.Test;

public class MyAccountTest extends Hooks {

    @Test
    public void MyAccountTest() {

        MyAccountObject myaccountData = new MyAccountObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();


        MyAccountPage myaccountPage = new MyAccountPage(getDriver());
        myaccountPage.createAccount(myaccountData);




    }

    @Test
    public void MyAccountSecondTest() {

        MyAccountObject myaccountData = new MyAccountObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();


        MyAccountPage myaccountPage = new MyAccountPage(getDriver());
        myaccountPage.createSecondAccount(myaccountData);




    }

    @Test
    public void InvalidEmailTest() {

        MyAccountObject myaccountData = new MyAccountObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();


        MyAccountPage myaccountPage = new MyAccountPage(getDriver());
        myaccountPage.invalidEmailAccount(myaccountData);




    }


}
