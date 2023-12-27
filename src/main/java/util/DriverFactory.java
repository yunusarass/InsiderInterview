package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class DriverFactory{

    public WebDriver driver;

    public WebDriver setDriver(String browser){
        if(browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equals("Safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }else if (browser.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        return driver;
    }

    public WebDriver getDriver(){
        return driver;
    }


}
