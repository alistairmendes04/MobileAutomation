package homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends MobileAPI {
    @FindBy(id = "android:id/button2")
    public static WebElement accessibility;
    @FindBy(id = "bbc.mobile.news.ww:id/push_no")
    public static WebElement pushNot;
    @FindBy(linkText="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView")
    public static WebElement video;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")
    public static WebElement videos;
    @FindBy(linkText="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.TextView")
    public static WebElement myNews;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]")
    public static WebElement news;
    @FindBy(linkText="\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.TextView")
    public static WebElement popular;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]")
    public static WebElement bbcLive;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.ImageButton")
    public static WebElement dropDown;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Africa \"]")
    public static WebElement africa;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Asia \"]")
    public static WebElement asia;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Australia \"]")
    public static WebElement australia;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Europe \"]")
    public static WebElement europe;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Middle East \"]")
    public static WebElement middleEast;
    @FindBy(xpath = "\t//android.widget.TextView[@content-desc=\"Button: Latin America \"]")
    public static WebElement latinAmerica;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: UK \"]")
    public static WebElement uk;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: US & Canada \"]")
    public static WebElement usAndCanada;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Paradise Papers \"]")
    public static WebElement paradisePaper;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Tech \"]")
    public static WebElement tech;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Science \"]")
    public static WebElement science;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Health \"]")
    public static WebElement health;
    @FindBy(xpath = "\t//android.widget.TextView[@content-desc=\"Button: Entertainment \"]")
    public static WebElement entertainment;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Stories \"]")
    public static WebElement stories;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Sport \"]")
    public static WebElement sports;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Football \"]")
    public static WebElement football;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Button: Formula 1 \"]")
    public static WebElement formula1;

    public static void setAccessibility() {accessibility.click();}
    public static void setPushNot() {pushNot.click();}
    public static void setVideo() {videos.click();}
    public static void setMyNews() {news.click();}
    public static void setPopular(){popular.click();}
    public static void setLive() {bbcLive.click();}
    public static void setDropDown(){dropDown.click();}
    public static void setAfrica(){africa.click();}
    public static void setAsia(){asia.click();}
    public static void setAustralia(){australia.click();}
    public static void setEurope(){europe.click();}
    public static void setMiddleEast(){middleEast.click();}
    public static void setLatinAmerica(){latinAmerica.click();}
    public static void setUk(){uk.click();}
    public static void setUsAndCanada(){usAndCanada.click();}
    public static void setParadisePaper(){paradisePaper.click();}
    public static void setTech(){tech.click();}
    public static void setScience(){science.click();}
    public static void setHealth(){health.click();}
    public static void setEntertainment(){entertainment.click();}
    public static void setStories(){stories.click();}
    public static void setSports(){sports.click();}
    public static void setFootball(){football.click();}
    public static void setFormula1(){formula1.click();}
}