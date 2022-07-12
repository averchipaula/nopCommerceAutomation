package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {

        super(driver);

    }

    @FindBy(xpath="//a[text()='Register']")
    private WebElement registerElement;

    public void clickRegister(){
        elementMethods.clickElement(registerElement);
    }




   // public void clickRegister() {
       // elementMethods.clickElement(registerElement); }
    }



