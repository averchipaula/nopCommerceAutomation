package Objects;

import java.util.HashMap;

public class OrderObject {

    private String loginPage;

    private String Email;

    private String Password;

    private String Quantity;

    private String Country;

    private String State;

    private String City;

    private String Address;

    private String Zip;

    private String Phone;

    private String confirmation;

    private String cardType;

    private String cardHolder;

    private String cardNumber;

    private String dayCard;

    private String expireYear;

    private String cardCode;


    public OrderObject(HashMap<String, String> inputData){
        populateObject(inputData);
    }


    public void populateObject(HashMap<String, String> inputData){
        for (String key: inputData.keySet()){
            switch (key){
                case "loginPage":
                    setLoginPage(inputData.get(key));
                    break;
                case "Email":
                    setEmail(inputData.get(key));
                    break;
                case "Password":
                    setPassword(inputData.get(key));
                    break;
                case "Quantity":
                    setQuantity(inputData.get(key));
                    break;
                case "Country":
                    setCountry(inputData.get(key));
                    break;
                case "State":
                    setState(inputData.get(key));
                    break;
                case "City":
                    setCity(inputData.get(key));
                    break;
                case "Address":
                    setAddress(inputData.get(key));
                    break;
                case "Zip":
                    setZip(inputData.get(key));
                    break;
                case "Phone":
                    setPhone(inputData.get(key));
                    break;
                case "confirmation":
                    setConfirmation(inputData.get(key));
                    break;
                case "cardType":
                    setCardType(inputData.get(key));
                    break;
                case "cardHolder":
                    setCardHolder(inputData.get(key));
                    break;
                case "cardNumber":
                    setCardNumber(inputData.get(key));
                    break;
                case "dayCard":
                    setDayCard(inputData.get(key));
                    break;
                case "expireYear":
                    setExpireYear(inputData.get(key));
                    break;
                case "cardCode":
                    setCardCode(inputData.get(key));
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

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDayCard() {
        return dayCard;
    }

    public void setDayCard(String dayCard) {
        this.dayCard = dayCard;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
}

