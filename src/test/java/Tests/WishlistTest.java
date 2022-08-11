package Tests;

import Base.Hooks;
import Objects.ApparelObject;
import Objects.LoginObject;
import Objects.WishlistObject;
import Pages.ApparelPage;
import Pages.IndexPage;
import Pages.WishlistPage;
import org.junit.Test;

public class WishlistTest extends Hooks {


    @Test
    public void ListaFavorite() {

        WishlistObject wishlistData = new WishlistObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        WishlistPage wishlistPage = new WishlistPage(getDriver());
        wishlistPage.wishlistTest(wishlistData);

    }

    @Test
    public void validGiftCard() {

        WishlistObject wishlistData = new WishlistObject(testData);


        WishlistPage wishlistPage = new WishlistPage(getDriver());
        wishlistPage.validGiftCard(wishlistData);
    }

    @Test
    public void invalidCardName() {

        WishlistObject wishlistData = new WishlistObject(testData);


        WishlistPage wishlistPage = new WishlistPage(getDriver());
        wishlistPage.invalidGiftCard(wishlistData);

    }


}