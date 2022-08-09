package Objects;

import java.util.HashMap;

public class LoginObject {

    private String loginPage;

    private String Email;

    private String Password;

    private String emailErrorMessage;

    private String PasswordErrorMessage;

    public LoginObject(HashMap<String, String> inputData){
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
                case "EmailErrorMessage":
                    setEmailErrorMessage(inputData.get(key));
                    break;
                case "PasswordErrorMessage":
                    setPasswordErrorMessage(inputData.get(key));
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

    public String getEmailErrorMessage() {
        return emailErrorMessage;
    }

    public void setEmailErrorMessage(String emailErrorMessage) {
        this.emailErrorMessage = emailErrorMessage;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPasswordErrorMessage() {
        return PasswordErrorMessage;
    }

    public void setPasswordErrorMessage(String passwordErrorMessage) {
        PasswordErrorMessage = passwordErrorMessage;
    }
}
