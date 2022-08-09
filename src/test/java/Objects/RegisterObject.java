package Objects;

import java.util.HashMap;

public class RegisterObject {
    private String RegisterPage;

    private String FirstName;

    private String LastName;

    private String Day;

    private String Month;

    private String Year;

    private String emailAddress;

    private String Company;

    private String password;

    private String confirmPassword;

    private String firstNameError;

    private String emailInvalid;

    private String wrongEmail;

    private String sameEmail;

    private String passwordForEmail;

    private String confirmPasswordForEmail;

    private String passwordError;

    private String PasswordErrorShort;

    private String ConfirmPasswordErrorShort;

    public RegisterObject(HashMap<String, String> inputData){
        populateObject(inputData);


    }

    public void populateObject(HashMap<String, String> inputData){
        for (String key: inputData.keySet()){
            switch (key){
                case "RegisterPage":
                    setRegisterPage(inputData.get(key));
                    break;

                case "FirstName":
                    setFirstName(inputData.get(key));
                    break;

                case "LastName":
                    setLastName(inputData.get(key));
                    break;

                case "emailAddress":
                    setEmail(inputData.get(key));
                    break;

                case "Company":
                    setCompany(inputData.get(key));

                case "Year":
                    setYear(inputData.get(key));
                    break;

                case "Month":
                    setMonth(inputData.get(key));
                    break;

                case "Day":
                    setDay(inputData.get(key));
                    break;

                case "Password":
                    setPassword(inputData.get(key));
                    break;

                case "ConfirmPassword":
                    setConfirmPassword(inputData.get(key));
                    break;
                case "firstNameError":
                    setFirstNameError(inputData.get(key));
                    break;
                case "emailInvalid":
                    setEmailInvalid(inputData.get(key));
                    break;
                case "wrongEmail":
                    setWrongEmail(inputData.get(key));
                    break;
                case "sameEmail":
                    setSameEmail(inputData.get(key));
                    break;
                case "passwordForEmail":
                    setPasswordForEmail(inputData.get(key));
                    break;
                case "confirmPasswordForEmail":
                    setConfirmPasswordForEmail(inputData.get(key));
                    break;
                case "passwordErrorShort":
                    setPasswordErrorShort(inputData.get(key));
                    break;
                case "ConfirmPasswordErrorShort":
                    setConfirmPasswordErrorShort(inputData.get(key));
                    break;
                case "passwordError":
                    setPasswordError(inputData.get(key));
                    break;


            }
        }
    }


    public String getRegisterPage() {
        return RegisterPage;
    }

    public void setRegisterPage(String registerPage) {
        RegisterPage = registerPage;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        this.Day = day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        this.Month = month;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getEmail() {
        return emailAddress;
    }

    public void setEmail(String email) {
        this.emailAddress = email;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFirstNameError() {
        return firstNameError;
    }

    public void setFirstNameError(String firstNameError) {
        this.firstNameError = firstNameError;
    }

    public String getEmailInvalid() {
        return emailInvalid;
    }

    public void setEmailInvalid(String emailInvalid) {
        this.emailInvalid = emailInvalid;
    }

    public String getWrongEmail() {
        return wrongEmail;
    }

    public void setWrongEmail(String wrongEmail) {
        this.wrongEmail = wrongEmail;
    }

    public String getSameEmail() {
        return sameEmail;
    }

    public void setSameEmail(String sameEmail) {
        this.sameEmail = sameEmail;
    }

    public String getPasswordForEmail() {
        return passwordForEmail;
    }

    public void setPasswordForEmail(String passwordForEmail) {
        this.passwordForEmail = passwordForEmail;
    }

    public String getConfirmPasswordForEmail() {
        return confirmPasswordForEmail;
    }

    public void setConfirmPasswordForEmail(String confirmPasswordForEmail) {
        this.confirmPasswordForEmail = confirmPasswordForEmail;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getPasswordErrorShort() {
        return PasswordErrorShort;
    }

    public void setPasswordErrorShort(String passwordErrorShort) {
        PasswordErrorShort = passwordErrorShort;
    }

    public String getConfirmPasswordErrorShort() {
        return ConfirmPasswordErrorShort;
    }

    public void setConfirmPasswordErrorShort(String confirmPasswordErrorShort) {
        ConfirmPasswordErrorShort = confirmPasswordErrorShort;
    }
}
