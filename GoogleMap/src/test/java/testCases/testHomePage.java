package testCases;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.element.PackageElement;

public class testHomePage extends HomePage {
    HomePage objHomePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }

    @Test
    public void testMenu() {
        objHomePage.getMenu();
    }

    @Test
    public void testYourPlaces() {
        objHomePage.getYourPlaces();
    }
    @Test
    public void testYourTimeline(){
        objHomePage.geYourTimeline();
    }
}
