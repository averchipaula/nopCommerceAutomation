package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    private WebElement EmailElement;

    @FindBy(id = "Password")
    private WebElement PasswordElement;

    @FindBy(id = "RememberMe")
    private WebElement ClickRememberElement;

    @FindBy(xpath= "//button[@class='button-1 login-button']")
    private WebElement SubmitLoginElement;

    @FindBy(xpath="//span[@class='field-validation-error']")
    private WebElement EmailErrorMessage;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']/ul/li")
    private WebElement PasswordErrorMessage;



    public void loginValidProcess(LoginObject loginData) {
        pageMethods.validateTitlePage(loginData.getLoginPage());
        elementMethods.fillElement(EmailElement, loginData.getEmail());
        elementMethods.fillElement(PasswordElement, loginData.getPassword());
        elementMethods.clickElement(ClickRememberElement);
        elementMethods.clickElement(SubmitLoginElement);


    }

    public void invalidUserName(LoginObject loginData){
       pageMethods.validateTitlePage(loginData.getLoginPage());
       elementMethods.fillElement(PasswordElement, loginData.getPassword());
       elementMethods.clickElement(SubmitLoginElement);
       elementMethods.validateElementText(EmailErrorMessage, loginData.getEmailErrorMessage());
    }

    public void invalidPassword(LoginObject loginData){
        pageMethods.validateTitlePage(loginData.getLoginPage());
        elementMethods.fillElement(EmailElement, loginData.getEmail());
        elementMethods.clickElement(SubmitLoginElement);
        elementMethods.validateElementText(PasswordErrorMessage,loginData.getPasswordErrorMessage());
    }


    }






