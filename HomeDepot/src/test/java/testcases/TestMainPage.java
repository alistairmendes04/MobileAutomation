package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class TestMainPage extends MainPage {
    MainPage objMainPage;
    @BeforeMethod
    public void initializationOfObjets(){
        objMainPage = PageFactory.initElements(ad, MainPage.class);
    }
    @Test(enabled = true)
    public void testInitialAlert(){
        objMainPage.initialAlert();
        String expected  = "Sign In to Your Account";
       // Assert.assertTrue(actual.contains(expected));
        System.out.println("Successfully closed initial alert");
    }
    @Test(enabled = false)
    public void testZipcodeEnter(){
        objMainPage.initialAlert();
        objMainPage.enterZipCode();
    }

}
