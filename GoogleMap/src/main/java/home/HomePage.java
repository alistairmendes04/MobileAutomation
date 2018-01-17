package home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {
    @FindBy(className = "android.widget.ImageView")
    public WebElement burgerBtn;
    @FindBy(linkText = "Set home address")
    public WebElement setHomeAddress;
    String menuArray[] = {"Your places", "Your timeline", "Your contributions", "Location sharing",
            "Start driving", "Explore", "Tips and tricks", "Add a missing place", "Settings",
            "Help", "Send feedback", "Terms of Service"};

    public void getMenu() {
        burgerBtn.click();
    }

    public void getYourPlaces() {
        getMenu();
        scrollAndClickByName(menuArray[0]);
    }

    public void getYourTimeline() {
        getMenu();
        scrollAndClickByName(menuArray[1]);
    }

    public void getYourContributions() {
        getMenu();
        scrollAndClickByName(menuArray[2]);
    }

    public void getLocationSharing() {
        getMenu();
        scrollAndClickByName(menuArray[3]);
    }

    public void getStartDriving() {
        getMenu();
        scrollAndClickByName(menuArray[4]);
    }
    public void getExplore(){
        getMenu();
        scrollAndClickByName(menuArray[5]);
    }

    public void getTipsAndTricks() {
        getMenu();
        scrollAndClickByName(menuArray[6]);
    }

    public void getAddAMissingPlace() {
        getMenu();
        scrollAndClickByName(menuArray[7]);
    }

    public void getSettings() {
        getMenu();
        scrollAndClickByName(menuArray[8]);
    }

    public void getHelp() {
        getMenu();
        scrollAndClickByName(menuArray[9]);
    }

    public void getSendFeedback() {
        getMenu();
        scrollAndClickByName(menuArray[10]);
    }
    public void getTermsOfServices(){
        getMenu();
        scrollAndClickByName(menuArray[11]);
    }
    public void setHomeAddressInYourPlaces(){
        /*getMenu();
        getYourPlaces();*/
        burgerBtn.click();
        getYourPlaces();
        setHomeAddress.click();


    }


}
