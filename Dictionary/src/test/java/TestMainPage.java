import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.MobileAPI.ad;

public class TestMainPage extends MainPage {
    MainPage objMainPage;
    @BeforeMethod
    public void initializationOfObjets(){
        objMainPage = PageFactory.initElements(ad, MainPage.class);
    }
    @Test
    public void testMainMenu(){
        objMainPage.mainMenu();
    }
    @Test
    public void testRegister(){
         objMainPage.register();
    }
    @Test
    public void testMoreOptions(){
   objMainPage.moreOptions();
    }
}
