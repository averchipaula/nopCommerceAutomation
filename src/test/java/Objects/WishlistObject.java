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
    private String fillCardName;
    private String fillEmail;
    private String fillLast;
    private String sender;
    private String validateMessage;
    private String invalidName;







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
                case "fillCardName":
                    setFillCardName(inputData.get(key));
                    break;
                case"fillEmail":
                    setFillEmail(inputData.get(key));
                    break;
                case"fillLast":
                    setFillLast(inputData.get(key));
                    break;
                case"sender":
                    setSender(inputData.get(key));
                    break;
                case"validateMessage":
                    setValidateMessage(inputData.get(key));
                    break;
                case"invalidName":
                    setInvalidName(inputData.get(key));
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

    public String getFillCardName() {
        return fillCardName;
    }

    public void setFillCardName(String fillCardName) {
        this.fillCardName = fillCardName;
    }

    public String getFillEmail() {
        return fillEmail;
    }

    public void setFillEmail(String fillEmail) {
        this.fillEmail = fillEmail;
    }

    public String getFillLast() {
        return fillLast;
    }

    public void setFillLast(String fillLast) {
        this.fillLast = fillLast;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getValidateMessage() {
        return validateMessage;
    }

    public void setValidateMessage(String validateMessage) {
        this.validateMessage = validateMessage;
    }

    public String getInvalidName() {
        return invalidName;
    }

    public void setInvalidName(String invalidName) {
        this.invalidName = invalidName;
    }


}
