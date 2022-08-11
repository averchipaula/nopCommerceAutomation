package Base;

import PropertyFile.propertyFile;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.HashMap;

public class Hooks extends BaseTest {

    public HashMap<String, String> testData;

    @Before
    public void setUp(){
        initiateDriver();
        String className = this.getClass().getSimpleName();
        propertyFile propertyFile = new propertyFile(className);
        testData = propertyFile.getAllValues();

    }

    @After
    public void clearEnv(){
        getDriver().close();

    }

}
