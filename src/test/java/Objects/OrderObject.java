package Objects;

import java.util.HashMap;

public class OrderObject {

    private String loginPage;

    private String Email;

    private String Password;

    private String Quantity;


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

















}

