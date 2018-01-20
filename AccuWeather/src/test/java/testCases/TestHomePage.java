package testCases;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    HomePage objHomePage;
    @BeforeMethod
    public void initializationOfObject(){
        objHomePage = PageFactory.initElements(ad,HomePage.class);
    }

}
