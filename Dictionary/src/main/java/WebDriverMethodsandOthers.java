import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDriverMethodsandOthers extends MobileAPI {
    @FindBy(id = "islam")
    public WebElement welcome;

    //
    public void methods() {
        ad.context("life");
        ad.tap(1, welcome, 20);
        ad.getContextHandles();
        ad.switchTo().defaultContent();
        ad.switchTo().window("window name");
        ad.switchTo().defaultContent();
        ad.switchTo().alert().dismiss();
        ad.switchTo().alert().getText();
        ad.switchTo().alert().accept();
        ad.switchTo().alert().sendKeys("hhh");
        ad.switchTo().frame("frame name");
        ad.switchTo().parentFrame();
        ad.switchTo().notify();
        ad.installApp("Path");
        ad.launchApp();
        ad.isAppInstalled("");
        ad.removeApp("");
        ad.getAppStrings();
        welcome.submit();
        welcome.getLocation();
        welcome.isEnabled();
        welcome.isDisplayed();
        welcome.click();
        welcome.click();
        welcome.getSize();
        welcome.getAttribute("");
        welcome.notifyAll();


    }

}
