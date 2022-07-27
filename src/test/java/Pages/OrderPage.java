package Pages;

import Objects.OrderObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

   @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    private WebElement computersElement;
    @FindBy(xpath="//a[@title='Show products in category Notebooks']")
    private WebElement notebooksElement;
    @FindBy(xpath = "//a[@title='Show details for Apple MacBook Pro 13-inch']")
    private WebElement macbookElement;
    @FindBy(id = "product_enteredQuantity_4")
    private WebElement quantityElement;
    @FindBy(id = "add-to-cart-button-4")
    private WebElement addcartElement;
    @FindBy(xpath = "//a[@title='Show details for Asus N551JK-XO076H Laptop']")
    private WebElement asusElement;
    @FindBy(id = "product_enteredQuantity_5")
    private WebElement quantityasusElement;
    @FindBy(id = "add-to-cart-button-5")
    private WebElement cartElement;
    @FindBy(xpath = "//a[@title='Show details for HP Spectre XT Pro UltraBook']")
    private WebElement hpspectreElement;
    @FindBy(id = "product_enteredQuantity_7")
    private WebElement hpspectreqtyElement;
    @FindBy(id = "add-to-cart-button-7")
    private WebElement hpspectrecartElement;
    @FindBy(xpath = "//a[@title='Show details for Lenovo Thinkpad X1 Carbon Laptop']")
    private WebElement lenovoElement;
    @FindBy(id = "product_enteredQuantity_9")
    private WebElement lenovoaqtyElement;
    @FindBy(id="add-to-cart-button-9")
    private WebElement lenovoaddcardElement;
    @FindBy(id="topcartlink")
    private WebElement clickCartElement;
    @FindBy(id="termsofservice")
    private WebElement termsofserviceElement;
    @FindBy(id="checkout")
    private WebElement checkoutElement;
    @FindBy(id="Email")
    private WebElement emailElement;
    @FindBy(id="Password")
    private WebElement passwordElement;
    @FindBy(id="RememberMe")
    private WebElement remembermeElement;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement signinElement;
    @FindBy(id="termsofservice")
    private WebElement termsofServiceElement;
    @FindBy(id="checkout")
    private WebElement checkOutElement;

    public void orderProduct(OrderObject orderData) {

       elementMethods.clickElement(computersElement);
       elementMethods.clickElement(notebooksElement);
       macbookElement.click();
       elementMethods.fillElement(quantityElement,"4");
       addcartElement.click();
       asusElement.click();
       elementMethods.fillElement(quantityasusElement,"1");
       cartElement.click();
       hpspectreElement.click();
       elementMethods.fillElement(hpspectreqtyElement,"2");
       hpspectrecartElement.click();
       lenovoElement.click();
       elementMethods.fillElement(lenovoaqtyElement,"3");
       lenovoaddcardElement.click();
       clickCartElement.click();
       termsofserviceElement.click();
       checkoutElement.click();
       elementMethods.fillElement(emailElement,orderData.getEmail());
       elementMethods.fillElement(passwordElement,orderData.getPassword());
       remembermeElement.click();
       signinElement.click();
       termsofServiceElement.click();
       checkOutElement.click();




    }



}
