package home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {
    @FindBy(className = "android.widget.ImageView")
    public WebElement burgerBtn;

    String menuArray[] = {"Your places", "Your timeline", "Your contributions", "Location sharing",
            "Start driving", "Explore", "Wi-Fi only", "Tips and tricks", "Add a missing place", "Settings",
            "Help", "Send feedback", "Terms of Service"};

    public void getMenu() {
        burgerBtn.click();
    }

    public void getYourPlaces(){
        getMenu();
        scrollAndClickByName(menuArray[0]);
    }

    public void geYourTimeline(){
        getMenu();
        scrollAndClickByName(menuArray[1]);
    }
}
