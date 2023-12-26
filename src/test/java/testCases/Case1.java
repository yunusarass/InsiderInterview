package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.careerPage;
import pages.general;
import pages.homePage;
import pages.qualityAssurancePage;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Case1 extends DriverFactory {
    pages.careerPage careerPage = new careerPage();
    pages.general general = new general();
    pages.homePage homePage = new homePage();
    pages.qualityAssurancePage qualityAssurancePage;



    @BeforeMethod
    public void setUp(){
        setDriver();
    }

    @Test(priority=1)
    public void Test1() throws InterruptedException {
        general.goToUrlHomePage();
        Thread.sleep(2000);
        homePage.checkHomePage();
        Thread.sleep(2000);
        homePage.clickCompany();
        Thread.sleep(2000);
        homePage.checkCompanyDropdown();
        Thread.sleep(2000);
        homePage.clickCareer();
        Thread.sleep(2000);
        careerPage.checkFindYourDreamJobButton();
        Thread.sleep(2000);
        careerPage.checkSeeAllTeamsButton();
        Thread.sleep(2000);
        careerPage.checkOurLocationsTitle();
        Thread.sleep(2000);
        careerPage.checkTextOurLocationsTitle();
        Thread.sleep(2000);
        careerPage.checkLifeAtInsider();
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
