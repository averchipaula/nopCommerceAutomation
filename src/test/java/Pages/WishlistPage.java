package Pages;

import Objects.WishlistObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(xpath = "//div/button[@class='button-2 add-to-wishlist-button']['return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/35/2/1\"),!1']")
    private WebElement clickLondon;




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




    }


}
