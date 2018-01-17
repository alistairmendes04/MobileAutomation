import base.MobileAPI;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends MobileAPI {
    @AndroidFindBy (accessibility = "More options")
    public WebElement moreOptions;
    @FindBy(id = "android:id/search_button")
    public WebElement searchButton;
    //@FindBy(id = "//android.webkit.WebView[@content-desc=\"The Free Dictionary\"]/android.view.View[1]")
   // @AndroidFindBy(accessibility ="Log in")
    @FindBy (xpath = "//android.webkit.WebView[@content-desc=\"The Free Dictionary\"]/android.view.View[8]/android.view.View\n")
    public WebElement logIn;
    @FindBy(id = "com.tfd.mobile.TfdSearch:id/emailEdit")
    public WebElement emailBox;
    @FindBy(id = "com.tfd.mobile.TfdSearch:id/passwordEdit")
    public WebElement password;
    @FindBy(id = "com.tfd.mobile.TfdSearch:id/displayNameEdit")
    public WebElement displayName;
    @FindBy(xpath = "//android.webkit.WebView[@content-desc='The Free Dictionary']/android.view.View[8]")
    public WebElement register;

    //String moreOptionsIcon[] = {};

    public void mainMenu() {
        System.out.println("Application launched");searchButton.click();
        //waitUntilClickable(ad, searchButton);
        searchButton.sendKeys("joy", Keys.ENTER);

    }

    public void register() {
        waitUntilClickable(ad, logIn);
        ad.tap(1,logIn, 4);
        //logIn.click();
        emailBox.sendKeys("testdata.islam@gmail.com");
        password.sendKeys("testdata");
        displayName.sendKeys("jj");
        register.click();
    }
    public void moreOptions(){
        moreOptions.click();
       // ad.scrollTo()
    }
}
