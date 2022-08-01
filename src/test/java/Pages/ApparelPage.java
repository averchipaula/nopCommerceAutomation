package Pages;

import Objects.ApparelObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApparelPage extends BasePage{


    //constructor
    public ApparelPage(WebDriver driver){
        super(driver);
    }

   @FindBy(css="body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > a")
    private WebElement apparelElement;
   @FindBy(xpath = "//a[@title='Show products in category Shoes']")
    private WebElement shoesElement;
   @FindBy(xpath = "//a[@title='Show details for adidas Consortium Campus 80s Running Shoes']")
   private WebElement adidasElement;
   @FindBy(id="product_attribute_9")
   private WebElement adidasSizeElement;
   @FindBy(xpath = "//span[@class='attribute-square-container']")
   private WebElement redColorElement;
   @FindBy(id="product_enteredQuantity_25")
   private WebElement quantityElement;
   @FindBy(id="add-to-cart-button-25")
   private WebElement cartbuttonElement;
  @FindBy(xpath="//span[text()='Shopping cart']")
   private WebElement clickshoppingcartElement;
  // @FindBy(xpath = "//li/a[@title='Show details for Nike Floral Roshe Customized Running Shoes']")
  // private WebElement clickNikeFloralElement;











    public void clothingTest(ApparelObject apparelData){
        pageMethods.validateTitlePage(apparelData.getLoginPage());
        apparelElement.click();
        pageMethods.validateTitlePage(apparelData.getApparelPage());
        shoesElement.click();
        adidasElement.click();
        adidasSizeElement(apparelData.getSize());
        redColorElement.click();
        fillquantityElement(apparelData.getQuantity());
        cartbuttonElement.click();
        clickshoppingcartElement.click();
       // clickNikeFloralElement.click();













    }

    public void adidasSizeElement(String value){
        elementMethods.selectTextElement(adidasSizeElement,value);
    }

    public void fillquantityElement(String value){
        elementMethods.fillElement(quantityElement,value);
    }









}
