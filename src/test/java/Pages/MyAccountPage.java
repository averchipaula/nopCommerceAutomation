package Pages;

import Objects.MyAccountObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    private WebElement EmailElement;
    @FindBy(id = "Password")
    private WebElement PasswordElement;
    @FindBy(id = "RememberMe")
    private WebElement ClickRememberElement;
    @FindBy(xpath= "//button[@class='button-1 login-button']")
    private WebElement SubmitLoginElement;
    @FindBy(xpath="//a[text()='My account']")
    private WebElement clickMyaccountElement;
    @FindBy(id="save-info-button")
    private WebElement clickSaveElement;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement clickAdressElement;
    @FindBy(xpath = "//button[@class='button-1 add-address-button']")
    private WebElement addAdressElement;
    @FindBy(id="Address_FirstName")
    private WebElement firstNameElement;
    @FindBy(id="Address_LastName")
    private WebElement lastNameElement;
    @FindBy(id="Address_Email")
    private WebElement emailprElement;
    @FindBy(id="Address_CountryId")
    private WebElement clickCountryElement;
    @FindBy(xpath = "//select[@name='Address.CountryId']")
    private WebElement selectCountryElement;
    @FindBy(id="Address_StateProvinceId")
    private WebElement clickStateElement;
    @FindBy(xpath = "//select[@name='Address.StateProvinceId']")
    private WebElement selectStateElement;
    @FindBy(id="Address_City")
    private WebElement fillCityElement;
    @FindBy(id="Address_Address1")
    private WebElement fillAddressElement;
    @FindBy(id="Address_ZipPostalCode")
    private WebElement fillZipElement;
    @FindBy(id="Address_PhoneNumber")
    private WebElement fillPhoneElement;
    @FindBy(xpath = "//button[@class='button-1 save-address-button']")
    private WebElement saveButtonElement;




    public void createAccount(MyAccountObject myaccountData) {
        pageMethods.validateTitlePage(myaccountData.getLoginPage());
        elementMethods.fillElement(EmailElement, myaccountData.getEmail());
        elementMethods.fillElement(PasswordElement, myaccountData.getPassword());
        elementMethods.clickElement(ClickRememberElement);
        elementMethods.clickElement(SubmitLoginElement);
        clickMyaccountElement.click();
        pageMethods.validateTitlePage(myaccountData.getMyaccountPage());
        clickSaveElement.click();
        clickAdressElement.click();
        addAdressElement.click();
        elementMethods.fillElement(firstNameElement, myaccountData.getFirstName());
        elementMethods.fillElement(lastNameElement, myaccountData.getLastName());
        elementMethods.fillElement(emailprElement, myaccountData.getEmailpr());
        clickCountryElement.click();
        elementMethods.selectTextElement(selectCountryElement, myaccountData.getCountry());
        clickCountryElement.click();
        clickStateElement.click();
        elementMethods.selectTextElement(selectStateElement, myaccountData.getState());
        elementMethods.fillElement(fillCityElement, myaccountData.getCity());
        elementMethods.fillElement(fillAddressElement, myaccountData.getAddress());
        elementMethods.fillElement(fillZipElement, myaccountData.getZip());
        elementMethods.fillElement(fillPhoneElement, myaccountData.getPhone());
        saveButtonElement.click();






    }

}
