import ExtentReport.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestHomePage extends HomePage{
    HomePage objHomePage;
    @BeforeMethod
    public void initialize(){
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }
    @Test
    public void test1BurgerButton(){
        TestLogger.log("Seattle Times app is launched ...");
        objHomePage.clickBurgerButton();
        System.out.println("testBurgerButton passed");
    }
    @Test (enabled = false)
    public void test2scrollMenuList(){
        TestLogger.log("Menu list opened ...");
        objHomePage.clickBurgerButton();
        objHomePage.getMenuItems();
        System.out.println("scrollMenuList passed");
    }
    @Test (enabled = true)
    public void test3scrollToMyReadingList() {
        TestLogger.log("Menu list opened ...");
        objHomePage.getMyreadingList1();
        System.out.println("scrollMenuList for Myreading passed");
    }
    @Test (enabled = true)
    public void test4scrollToLocal(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getLocalNews();
        System.out.println("scrollMenuList for LocalNews passed");
    }
    @Test (enabled = true)
    public void test5scrollToBusiness(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getBusinessTech();
        System.out.println("scrollMenuList for Business/Tech passed");
    }
    @Test (enabled = true)
    public void test6scrollToSports(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getBusinessTech();
        System.out.println("scrollMenuList for Sports passed");
    }
    //scroll and click to PNW Magazine and navigate back to home and click again to Opinion link
    @Test (enabled = true)
    public void test7scrollPNWMagazine(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getPnwMagazine();
        System.out.println("scrollMenuList for PNW Magazine passed");
    }
}
