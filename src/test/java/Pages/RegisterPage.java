package Pages;

import Objects.LoginObject;
import Objects.RegisterObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id="gender-female")
    private WebElement ClickGender;
    @FindBy(id="FirstName")
    private WebElement FirstNameElement;
    @FindBy(id="LastName")
    private WebElement LastNameElement;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    private WebElement dayElement;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement monthElement;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    private WebElement yearElement;
    @FindBy(id="Email")
    private WebElement emailAddress;
    @FindBy(id="Company")
    private WebElement Company;
    @FindBy(id="Newsletter")
    private WebElement ClickNewsletter;
    @FindBy(id="Password")
    private WebElement Password;
    @FindBy(id = "ConfirmPassword")
    private WebElement ConfirmPassword;
    @FindBy(id="register-button")
    private WebElement SubmitButton;
    @FindBy(id="FirstName-error")
    private WebElement firstNameError;
    @FindBy(id="Email-error")
    private WebElement invalidEmail;
    @FindBy(xpath="//li[text()='The specified email already exists']")
    private WebElement emailExists;
    @FindBy(xpath="//span/p[text()='Password must meet the following rules: ']")
    private WebElement passwordErrorwWthLesChar;



    public void registerValid(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(FirstNameElement, registerData.getFirstName());
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(emailAddress,registerData.getEmail());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPassword());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPassword());
        elementMethods.clickElement(SubmitButton);


    }

    public void registerInvalidName(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(emailAddress,registerData.getEmail());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPassword());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPassword());
        elementMethods.clickElement(SubmitButton);
        elementMethods.validateElementText(firstNameError, registerData.getFirstNameError());

    }

    public void registerInvalidEmail(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(FirstNameElement, registerData.getFirstName());
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPassword());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPassword());
        elementMethods.clickElement(SubmitButton);
        elementMethods.validateElementText(invalidEmail, registerData.getEmailInvalid());

    }

    public void registerWrongEmail(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(FirstNameElement, registerData.getFirstName());
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPassword());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPassword());
        elementMethods.clickElement(SubmitButton);
        elementMethods.validateElementText(invalidEmail, registerData.getWrongEmail());

    }
    public void registerSameEmail(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(FirstNameElement, registerData.getFirstName());
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(emailAddress,registerData.getEmail());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPasswordForEmail());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPasswordForEmail());
        elementMethods.clickElement(SubmitButton);
        elementMethods.validateElementText(emailExists, registerData.getSameEmail());

    }

    public void registerPasswordError(RegisterObject registerData){
        pageMethods.validateTitlePage(registerData.getRegisterPage());
        elementMethods.clickElement(ClickGender);
        elementMethods.fillElement(FirstNameElement, registerData.getFirstName());
        elementMethods.fillElement(LastNameElement,registerData.getLastName());
        elementMethods.selectValueElement(dayElement,registerData.getDay());
        elementMethods.clickElement(monthElement);
        elementMethods.selectTextElement(monthElement,registerData.getMonth());
        elementMethods.selectValueElement(yearElement,registerData.getYear());
        elementMethods.fillElement(emailAddress,registerData.getEmail());
        elementMethods.fillElement(Company,registerData.getCompany());
        elementMethods.clickElement(ClickNewsletter);
        elementMethods.fillElement(Password, registerData.getPasswordErrorShort());
        elementMethods.fillElement(ConfirmPassword, registerData.getConfirmPasswordErrorShort());
        elementMethods.clickElement(SubmitButton);
        elementMethods.validateElementText(passwordErrorwWthLesChar, registerData.getPasswordError());

    }

    }






