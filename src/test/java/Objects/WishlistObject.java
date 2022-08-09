package Objects;

import java.util.HashMap;

public class WishlistObject {

    private String loginPage;
    private String Email;
    private String Password;
    private String wishlistPage;
    private String booksPage;
    private String jewelryPage;
    private String giftCardsPage;
    private String errorNameMessage;
    private String errorSenderMessage;




    public WishlistObject(HashMap<String, String> inputData) {
        populateObject(inputData);
    }

    public void populateObject(HashMap<String, String> inputData) {
        for (String key : inputData.keySet()) {
            switch (key) {
                case "loginPage":
                    setLoginPage(inputData.get(key));
                    break;
                case "Email":
                    setEmail(inputData.get(key));
                    break;
                case "Password":
                    setPassword(inputData.get(key));
                    break;
                case "wishlistPage":
                    setWishlistPage(inputData.get(key));
                    break;
                case "booksPage":
                    setBooksPage(inputData.get(key));
                    break;
                case "jewelryPage":
                    setJewelryPage(inputData.get(key));
                    break;
                case "giftCardsPage":
                    setGiftCardsPage(inputData.get(key));
                    break;
                case "errorNameMessage":
                    setErrorNameMessage(inputData.get(key));
                    break;
                case "errorSenderMessage":
                    setErrorSenderMessage(inputData.get(key));
                    break;

            }
        }
    }


    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getWishlistPage() {
        return wishlistPage;
    }

    public void setWishlistPage(String wishlistPage) {
        this.wishlistPage = wishlistPage;
    }

    public String getBooksPage() {
        return booksPage;
    }

    public void setBooksPage(String booksPage) {
        this.booksPage = booksPage;
    }

    public String getJewelryPage() {
        return jewelryPage;
    }

    public void setJewelryPage(String jewelryPage) {
        this.jewelryPage = jewelryPage;
    }

    public String getGiftCardsPage() {
        return giftCardsPage;
    }

    public void setGiftCardsPage(String giftCardsPage) {
        this.giftCardsPage = giftCardsPage;
    }

    public String getErrorNameMessage() {
        return errorNameMessage;
    }

    public void setErrorNameMessage(String errorNameMessage) {
        this.errorNameMessage = errorNameMessage;
    }

    public String getErrorSenderMessage() {
        return errorSenderMessage;
    }

    public void setErrorSenderMessage(String errorSenderMessage) {
        this.errorSenderMessage = errorSenderMessage;
    }
}
