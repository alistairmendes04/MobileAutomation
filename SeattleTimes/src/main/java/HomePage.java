import base.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends MobileAPI {
    @FindBy(className="android.widget.ImageButton")
    public static WebElement burgerButton;
    @FindBy(xpath="//android.widget.TextView[@text='MY READING LIST']")
    public static WebElement myreadingListLink;
    @FindBy(xpath="//android.widget.TextView[@text='LOCAL NEWS']")
    public static WebElement localNewsLink;
    @FindBy(xpath="//android.widget.TextView[@text='BUSINESS/TECH']")
    public static WebElement businessLink;
    @FindBy(xpath="//android.widget.TextView[@text='SPORTS']")
    public static WebElement sportsLink;
    @FindBy(xpath="//android.widget.TextView[@text='NATION & WORLD']")
    public static WebElement nationWorldLink;
    @FindBy(xpath="//android.widget.TextView[@text='OPINION']")
    public static WebElement opinionLink;
    @FindBy(xpath="//android.widget.TextView[@text='ENTERTAINMENT']")
    public static WebElement entertainmentLink;
    @FindBy(xpath="//android.widget.TextView[@text='LIFE']")
    public static WebElement lifeLink;
    @FindBy(xpath="//android.widget.TextView[@text='PNW MAGAZINE']")
    public static WebElement pnwMagazineLink;
    @FindBy(id="com.seattletimes.android.SeattleTimesMobileNews:id/design_navigation_view")
    List<WebElement> mainMenu = new ArrayList<>();

    String[] menuListArray = {"MY READING LIST","LOCAL NEWS","BUSINESS/TECH","SPORTS","NATION & WORLD","OPINION","ENTERTAINMENT","LIFE","PNW MAGAZINE"};

    //Click on Burger Button
    public void clickBurgerButton() {
        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        burgerButton.click();
    }
    // get list in the Burger button (Menu)
    public void getMenuItems(){
        List<WebElement> items = ad.findElements(By.className("android.widget.ImageButton"));
        for (WebElement item: items){
            System.out.println("Item: "+item.getText());
            ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
    //scroll to Myreading List and click using String text
    public void getMyreadingList(){
        clickBurgerButton();
        scrollAndClickByName("MY READING LIST");
        System.out.println("My Reading List clicked");
    }
    //scroll to Myreading List and click using webelement
    public void getMyreadingList1(){
        clickBurgerButton();
        clickByXpathWebElement(myreadingListLink);
        System.out.println("My Reading List clicked by xpath");
    }
    //scroll to Local News and click
    public void getLocalNews(){
        clickBurgerButton();
        clickByXpathWebElement(localNewsLink);
        System.out.println("Local News clicked");
    }
    //scroll to Business/Tech and click
    public void getBusinessTech(){
        clickBurgerButton();
        clickByXpathWebElement(businessLink);
        System.out.println("Business/Tech clicked");
    }
    //scroll to Sports and click
    public void getSports(){
        clickBurgerButton();
        clickByXpathWebElement(sportsLink);
        System.out.println("Sports clicked");
    }
    //scroll to Nation & World and click
    public void getNationWorld(){
        clickBurgerButton();
        clickByXpathWebElement(nationWorldLink);
        System.out.println("'Nation & World' clicked");
    }
    //scroll to Opinion and click
    public void getOpinion(){
        clickBurgerButton();
        clickByXpathWebElement(opinionLink);
        System.out.println("Opinion clicked");
    }
    //scroll to Entertainment and click
    public void getEntertainment(){
        clickBurgerButton();
        clickByXpathWebElement(entertainmentLink);
        System.out.println("Entertainment clicked");
    }
    //scroll to Life and click
    public void getLife(){
        clickBurgerButton();
        clickByXpathWebElement(lifeLink);
        System.out.println("Life clicked");
    }
    //scroll and click to PNW Magazine and navigate back to home and click again to Opinion link
    public void getPnwMagazine(){
        clickBurgerButton();
        clickByXpathWebElement(pnwMagazineLink);
       // String text = ad.getTitle();
      //  System.out.println("text of current page: "+text);
        ad.navigate().back();
       /* setWait(2);
        String str = ad.getCurrentUrl();
        System.out.println("Home url: "+str);*/
    }
    //scroll to Myreading List and check
    public void scrollMenuList(){
        clickBurgerButton();
        scrollToElement(ad, "MY READING LIST");
        scrollToElement(ad, "BUSINESS/TECH");
        scrollToElement(ad, "ENTERTAINMENT");
        scrollToElement(ad, "PNW MAGAZINE");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "SPORTS");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "LIFE");
        scrollToElement(ad, "NATION & WORLD");
        scrollToElement(ad, "OPINION");
        System.out.println("Scroll down of My Reading List clicked");
    }
}
