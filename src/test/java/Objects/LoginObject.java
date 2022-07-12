package Objects;

import java.util.HashMap;

public class LoginObject {

    private String loginPage;

    private String Email;

    private String Password;

    private String ValidateErrorMessage;

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
                case "ValidateErrorMessage":
                    setValidateErrorMessage(inputData.get(key));
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

    public String getValidateErrorMessage() {
        return ValidateErrorMessage;
    }

    public void setValidateErrorMessage(String validateErrorMessage) {
        ValidateErrorMessage = validateErrorMessage;
    }

    public void setPassword(String password) {
        Password = password;





    }
}
