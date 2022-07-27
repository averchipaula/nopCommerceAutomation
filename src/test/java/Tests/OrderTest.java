package Tests;

import Base.Hooks;
import Objects.OrderObject;
import Pages.IndexPage;
import Pages.OrderPage;
import org.junit.Test;

public class OrderTest extends Hooks{
    @Test
    public void OrderTest(){

        OrderObject orderData = new OrderObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        OrderPage orderPage = new OrderPage(getDriver());
        orderPage.orderProduct(orderData);






    }










}
