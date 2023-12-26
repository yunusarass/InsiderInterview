package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.careerPage;
import pages.general;
import pages.homePage;
import pages.qualityAssurancePage;
import util.DriverFactory;

public class Case4 extends DriverFactory {

    pages.careerPage careerPage = new careerPage();
    pages.general general = new general();
    pages.homePage homePage = new homePage();
    pages.qualityAssurancePage qualityAssurancePage = new qualityAssurancePage();

    @BeforeMethod
    public void setUp(){
        setDriver();
    }

    @Test(priority=1)
    public void Test1() throws InterruptedException {
        general.goToUrlQA();
        Thread.sleep(2000);
        qualityAssurancePage.checkSeeAllQAJobs();
        Thread.sleep(2000);
        qualityAssurancePage.clickSeeAllQAJobs();
        Thread.sleep(2000);
        qualityAssurancePage.checkFilterByLocationTitle();
        Thread.sleep(2000);
        qualityAssurancePage.clickLocation();
        Thread.sleep(2000);
        qualityAssurancePage.clickLocationIstanbul();
        Thread.sleep(2000);
        qualityAssurancePage.clickDepartment();
        Thread.sleep(2000);
        qualityAssurancePage.clickDepartmentQAOptions();
        Thread.sleep(2000);
        qualityAssurancePage.checkJobList();
        Thread.sleep(2000);
        qualityAssurancePage.checkElementsContainsPositionQA();
        Thread.sleep(2000);
        qualityAssurancePage.clickFirstPositionViewRole();
        Thread.sleep(2000);
        qualityAssurancePage.checkApplyForJobButton();
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
