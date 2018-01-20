package pages;

import base.MobileAPI;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainPage extends MobileAPI {
    @FindBy(className = "android.widget.Button")
    public WebElement items;

    @FindBy(xpath = "//*[@class='android.widget.Button'][2]")
    public WebElement donotAllowButton;
    @FindBy(xpath = "//*[@class='android.widget.Button'][2]")
    public WebElement donotAllowButtonNext;
    @FindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    public WebElement denyButton;
    @FindBy(id = "com.thehomedepot:id/loc_options_title_tv")
    public WebElement findAndChooseStore;
    @FindBy(xpath = "//*[@id = 'com.thehomedepot:id/loc_option_store_search_et']")
    public WebElement textBox;
    @FindBy(xpath = "//android.widget.EditText[@bounds='[316,655][1369,796]']")
    public WebElement textBoxBound;
    @FindBy(id = "com.thehomedepot:id/loc_option_signin_btn")
    public WebElement signInButton;
    @FindBy(xpath = "//android.widget.EditText[@text='Enter City, State or Zip']")
    public WebElement enterZipcodeBox;
    @FindBy(id ="com.thehomedepot:id/header_store_IV")
    public WebElement enterClick;
    @FindBy(id = "android:id/search_button")
    public WebElement searchButton;


    List<WebElement> elements = new ArrayList<>();
    public void page(){
        elements = ad.findElements(By.className("android.widget.Button"));
    }
    public void initialAlert() {
       // page();
     //   elements.get(2).click();
        donotAllowButton.click();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        donotAllowButtonNext.click();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        denyButton.click();
    }
    public void enterZipCode() {
       /* textBox.click();
        textBox.sendKeys("98029");*/
        Set<String> windowHandles = ad.getWindowHandles();
        for(String handle: windowHandles){
            ad.switchTo().window("handle");
        }
        textBoxBound.sendKeys("98029");
        //ad.manage().window().setPosition(new Dimension(10, 10)); //manage window using set position
       /* MobileElement mob =(MobileElement)enterZipcodeBox;
        mob.setValue("98029");*/
      // enterZipcodeBox.setText("98029");
       // enterClick.click();
        System.out.println("Enter the zipcode page");
    }
    public void donotAllowAppPermission(){
        while(ad.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0){
            ad.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
        }
    }
    public void usingBound() {
        //for bound [447,1532][634,1768]
        int x = 500;
        int y = 900;
        //TouchAction location = new TouchAction((MobileDriver) driver_touch);
       // location.tap(x, y).perform();
    }
}
