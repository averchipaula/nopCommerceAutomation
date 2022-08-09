package Pages;

import HelpMethods.FrameMethods;
import Objects.WishlistObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

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
    @FindBy(id="add-to-wishlist-button-14")
    private WebElement clickNikonBlack;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[4]/a")
    private WebElement clickDigital;
    @FindBy(xpath = "//a[@title='Show details for If You Wait (donation)']")
    private WebElement clickLondon;
    @FindBy(id="add-to-wishlist-button-35")
    private WebElement addtoLondon;
    @FindBy(xpath = "//a[@title='Show details for Night Visions']")
    private WebElement clickVisions;
    @FindBy(id="add-to-wishlist-button-34")
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
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p[1]")
    private WebElement enterValidName;
    @FindBy(css="//p[text()='Enter valid sender name']")
    private WebElement enterSenderName;
    @FindBy(xpath = "//span[@class='wishlist-label']")
    private WebElement clickWishlistButton;
    @FindBy(xpath = "//button[@class='remove-btn']")
    private List<WebElement> removeFromCart;









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







    public void invalidGiftCardMessage(WishlistObject wishlistData){
        clickGiftCards.click();
        pageMethods.validateTitlePage(wishlistData.getGiftCardsPage());
        elementMethods.clickElement(addGiftCardsOptions.get(1));
        addToWishlistVirtual.click();
        elementMethods.validateElementText(enterValidName, wishlistData.getErrorNameMessage());
        elementMethods.validateElementText(enterSenderName, wishlistData.getErrorSenderMessage());




    }






















}
