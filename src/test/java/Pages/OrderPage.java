package Pages;

import Objects.OrderObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

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
    @FindBy(id="BillingNewAddress_CountryId")
    private WebElement clickcountry;
    @FindBy(xpath = "//select[@name='BillingNewAddress.CountryId']")
    private WebElement selectcountry;
    @FindBy(id="BillingNewAddress_StateProvinceId")
    private WebElement clickState;
    @FindBy(xpath = "//select[@name='BillingNewAddress.StateProvinceId']")
    private WebElement selectState;
    @FindBy(id="BillingNewAddress_City")
    private WebElement fillCity;
    @FindBy(id="BillingNewAddress_Address1")
    private WebElement fillAddress;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    private WebElement zipCode;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    private WebElement phoneNumber;
    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    private WebElement clickContinue;
   // @FindBy(css="#shippingoption_0")
   // private WebElement clickShipping;
    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    private WebElement continueButton;


    public void orderProduct(OrderObject orderData) {

       elementMethods.clickElement(computersElement);
       elementMethods.clickElement(notebooksElement);
       macbookElement.click();
       quantityElement.clear();
       elementMethods.fillElement(quantityElement,"4");
       addcartElement.click();
       asusElement.click();
       quantityasusElement.clear();
       elementMethods.fillElement(quantityasusElement,"1");
       cartElement.click();
       hpspectreElement.click();
       hpspectreqtyElement.clear();
       elementMethods.fillElement(hpspectreqtyElement,"2");
       hpspectrecartElement.click();
       lenovoElement.click();
       lenovoaqtyElement.clear();
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
       clickcountry.click();
      elementMethods.selectTextElement(selectcountry,orderData.getCountry());
      clickcountry.click();
        clickState.click();
        elementMethods.selectTextElement(selectState, orderData.getState());
       elementMethods.fillElement(fillCity,orderData.getCity());
       elementMethods.fillElement(fillAddress,orderData.getAddress());
       elementMethods.fillElement(zipCode, orderData.getZip());
       elementMethods.fillElement(phoneNumber, orderData.getPhone());
       clickContinue.click();
        // clickShipping.click();
   //  continueButton.click();
        continueButton.click();





    }



}


// clickcountry.click();
//  elementMethods.selectTextElement(selectcountry,orderData.getCountry());
//  clickcountry.click();
/// clickState.click();
// elementMethods.selectTextElement(selectState, orderData.getState());
// elementMethods.fillElement(fillCity,orderData.getCity());
// elementMethods.fillElement(fillAddress,orderData.getAddress());
//  elementMethods.fillElement(zipCode, orderData.getZip());
//  elementMethods.fillElement(phoneNumber, orderData.getPhone());
// clickContinue.click();
// clickShipping.click();

