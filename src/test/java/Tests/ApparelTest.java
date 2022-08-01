package Tests;

import Base.Hooks;
import Objects.ApparelObject;
import Pages.ApparelPage;
import Pages.IndexPage;
import org.junit.Test;

public class ApparelTest extends Hooks {

    @Test
     public void ClothingTest(){

        ApparelObject apparelData = new ApparelObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.ClickSignin();

        ApparelPage apparelPage = new ApparelPage(getDriver());
        apparelPage.clothingTest(apparelData);




    }




}
