package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import Objects.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath= "//button[text()='Log in']")
    private WebElement SubmitLoginElement;

    @FindBy(css="//div[text()='Login was unsuccessful. Please correct the errors and try again.']")
    private WebElement ValidateErrorMessage;


    public void loginValidProcess(LoginObject loginData) {
        pageMethods.validateTitlePage(loginData.getLoginPage());
        elementMethods.fillElement(EmailElement, loginData.getEmail());
        elementMethods.fillElement(PasswordElement, loginData.getPassword());
        elementMethods.clickElement(ClickRememberElement);
        elementMethods.clickElement(SubmitLoginElement);
        elementMethods.validateElementText(ValidateErrorMessage,loginData.getValidateErrorMessage());

    }


}
