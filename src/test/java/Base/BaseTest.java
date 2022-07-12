package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver Driver;

    public void initiateDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        Driver = new ChromeDriver();
        Driver.get("https://demo.nopcommerce.com/");
        Driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return Driver;
    }

}
