package Objects;

import java.util.HashMap;

public class ApparelObject {

    private String loginPage;

    private String Email;

    private String Password;

    private String apparelPage;

    private String Size;

    private String Quantity;

    public ApparelObject(HashMap<String, String> inputData) {
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
                case "apparelPage":
                    setApparelPage(inputData.get(key));
                    break;
                case "Size" :
                    setSize(inputData.get(key));
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

    public String getApparelPage() {
        return apparelPage;
    }

    public void setApparelPage(String apparelPage) {
        this.apparelPage = apparelPage;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }
}




