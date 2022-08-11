package Objects;

import java.util.HashMap;

public class MyAccountObject {
    private String loginPage;
    private String Email;
    private String Password;
    private String myaccountPage;
    private String firstName;
    private String lastName;
    private String Emailpr;
    private String Country;
    private String State;
    private String City;
    private String Address;
    private String Zip;
    private String Phone;
    private String emailSc;
    private String invalidEmail;
    private String errorMessage;



    public MyAccountObject(HashMap<String, String> inputData) {
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
                case "myaccountPage":
                    setMyaccountPage(inputData.get(key));
                    break;
                case "firstName":
                    setFirstName(inputData.get(key));
                    break;
                case "lastName":
                    setLastName(inputData.get(key));
                    break;
                case "Emailpr":
                    setEmailpr(inputData.get(key));
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
                case "emailSc":
                    setEmailSc(inputData.get(key));
                    break;
                case "invalidEmail":
                    setInvalidEmail(inputData.get(key));
                    break;
                case "errorMessage":
                    setErrorMessage(inputData.get(key));
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

    public String getMyaccountPage() {
        return myaccountPage;
    }

    public void setMyaccountPage(String myaccountPage) {
        this.myaccountPage = myaccountPage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailpr() {
        return Emailpr;
    }

    public void setEmailpr(String emailpr) {
        Emailpr = emailpr;
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

    public String getEmailSc() {
        return emailSc;
    }

    public void setEmailSc(String emailSc) {
        this.emailSc = emailSc;
    }

    public String getInvalidEmail() {
        return invalidEmail;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

