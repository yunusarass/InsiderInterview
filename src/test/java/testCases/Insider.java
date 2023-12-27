package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.careerPage;
import pages.general;
import pages.homePage;
import pages.qualityAssurancePage;
import util.DriverFactory;

public class Insider {
    DriverFactory driverFactory;
    WebDriver driver;
    careerPage careerPage;
    general general;
    homePage homePage;
    qualityAssurancePage qualityAssurancePage;


    @BeforeMethod
    public void setUp(){
        driverFactory = new DriverFactory();
        driver = driverFactory.setDriver("Chrome");
        careerPage = new careerPage(driver);
        general = new general(driver);
        homePage = new homePage(driver);
        qualityAssurancePage = new qualityAssurancePage(driver);
    }

    @Test(priority = 0)
    public void Test0() {
        general.goToUrlHomePage();
        general.clickAllowCookies();
        homePage.checkHomePage();
        homePage.clickCompany();
        homePage.checkCompanyDropdown();
        homePage.clickCareer();
        careerPage.checkFindYourDreamJobButton();
        careerPage.checkSeeAllTeamsButton();
        careerPage.checkOurLocationsTitle();
        careerPage.checkTextOurLocationsTitle();
        careerPage.checkLifeAtInsider();
        general.goToUrlQA();
        qualityAssurancePage.checkSeeAllQAJobs();
        qualityAssurancePage.clickSeeAllQAJobs();
        qualityAssurancePage.checkFilterByLocationTitle();
        qualityAssurancePage.clickLocation();
        qualityAssurancePage.checkJobList();
        qualityAssurancePage.checkElementsContainsPositionQA();
        qualityAssurancePage.clickFirstPositionViewRole();
        qualityAssurancePage.checkApplyForJobButton();
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
