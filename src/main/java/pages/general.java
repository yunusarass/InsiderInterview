package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class general {
    ElementHelper elementHelper;
    By cookiebutton = By.id("wt-cli-accept-all-btn");
    public general(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    public void clickAllowCookies() {
        elementHelper.click(cookiebutton);
    }
    public void goToUrlHomePage(){
        elementHelper.goToUrl("https://useinsider.com");
    }
    public void goToUrlQA(){
        elementHelper.goToUrl("https://useinsider.com/careers/quality-assurance");
    }

}
