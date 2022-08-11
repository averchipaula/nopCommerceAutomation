package Pages;

import Objects.WishlistObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class WishlistPage extends BasePage {

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='wishlist-label']")
    private WebElement clickWishlist;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    private WebElement clickComputers;
    @FindBy(xpath = "//a[@title='Show products in category Desktops']")
    private WebElement clickDesktops;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[3]")
    private WebElement clickPc;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    private WebElement clickElectronics;
    @FindBy(xpath = "//a[@title='Show products in category Camera & photo']")
    private WebElement clickPhotoCam;
    @FindBy(xpath = "//a[@title='Show details for Nikon D5500 DSLR']")
    private WebElement clickNikon;
    @FindBy(id = "add-to-wishlist-button-14")
    private WebElement clickNikonBlack;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[4]/a")
    private WebElement clickDigital;
    @FindBy(xpath = "//a[@title='Show details for If You Wait (donation)']")
    private WebElement clickLondon;
    @FindBy(id = "add-to-wishlist-button-35")
    private WebElement addtoLondon;
    @FindBy(xpath = "//a[@title='Show details for Night Visions']")
    private WebElement clickVisions;
    @FindBy(id = "add-to-wishlist-button-34")
    private WebElement addtoVisions;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[5]/a")
    private WebElement clickBooks;
    @FindBy(xpath = "//button[@class='button-2 add-to-wishlist-button']")
    private List<WebElement> addBooksOptions;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[6]/a")
    private WebElement clickJewelry;
    @FindBy(xpath = "//button[@class='button-2 add-to-wishlist-button']")
    private List<WebElement> addJewelryOptions;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
    private WebElement clickGiftCards;
    @FindBy(xpath = "//button[@class='button-2 add-to-wishlist-button']")
    private List<WebElement> addGiftCardsOptions;
    @FindBy(xpath = "//button[@class='button-2 add-to-wishlist-button']")
    private WebElement addToWishlistVirtual;
    @FindBy(xpath = "//input[@class='recipient-name']")
    private WebElement enterValidName;
    @FindBy(css = "//p[text()='Enter valid sender name']")
    private WebElement enterSenderName;
    @FindBy(xpath = "//button[@class='button-2 add-to-wishlist-button']")
    private WebElement clickWishlistButton;
    @FindBy(xpath = "//button[@class='remove-btn']")
    private List<WebElement> removeFromCart;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
    private WebElement giftCardsElement;
    @FindBy(xpath = "//input[@name='giftcard_43.RecipientName']")
    private WebElement fillNameElement;
    @FindBy(id = "giftcard_43_RecipientEmail")
    private WebElement fillEmailElement;
    @FindBy(id = "giftcard_43_SenderName")
    private WebElement fillLastElement;
    @FindBy(id = "giftcard_43_SenderEmail")
    private WebElement senderElement;
    @FindBy(xpath = "//p[@class='content']")
    private WebElement validateElement;
    @FindBy(xpath = "//p[text()='Enter valid recipient name']")
    private WebElement invalidNameElement;
    @FindBy(xpath = "//button[@class='remove-btn']")
    private List<WebElement> removeButtonElement;


    public void wishlistTest(WishlistObject wishlistData) {
        pageMethods.validateTitlePage(wishlistData.getLoginPage());
        clickWishlist.click();
        pageMethods.validateTitlePage(wishlistData.getWishlistPage());
        clickComputers.click();
        clickDesktops.click();
        clickPc.click();
        clickElectronics.click();
        clickPhotoCam.click();
        clickNikon.click();
        clickNikonBlack.click();
        clickDigital.click();
        clickLondon.click();
        addtoLondon.click();
        clickVisions.click();
        addtoVisions.click();
        clickBooks.click();
        pageMethods.validateTitlePage(wishlistData.getBooksPage());
        elementMethods.clickElement(addBooksOptions.get(0));
        clickJewelry.click();
        pageMethods.validateTitlePage(wishlistData.getJewelryPage());
        elementMethods.clickElement(addJewelryOptions.get(2));
        clickWishlist.click();


    }

    public void validGiftCard(WishlistObject wishlistData) {
        clickGiftCards.click();
        addToWishlistVirtual.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(fillNameElement));
        elementMethods.fillElement(fillNameElement, wishlistData.getFillCardName());
        elementMethods.fillElement(fillEmailElement, wishlistData.getFillEmail());
        elementMethods.fillElement(fillLastElement, wishlistData.getFillLast());
        elementMethods.fillElement(senderElement, wishlistData.getSender());
        clickWishlistButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(validateElement));
        elementMethods.validateElementText(validateElement, wishlistData.getValidateMessage());

    }

    public void invalidGiftCard(WishlistObject wishlistData) {
        clickGiftCards.click();
        addToWishlistVirtual.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(fillNameElement));
        elementMethods.fillElement(fillEmailElement, wishlistData.getFillEmail());
        elementMethods.fillElement(fillLastElement, wishlistData.getFillLast());
        elementMethods.fillElement(senderElement, wishlistData.getSender());
        clickWishlistButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(validateElement));
        elementMethods.validateElementText(invalidNameElement, wishlistData.getInvalidName());

    }




    }





