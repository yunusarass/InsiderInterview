package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

import java.util.ArrayList;

public class qualityAssurancePage {

    WebDriver driver;

    ElementHelper elementHelper;

    public qualityAssurancePage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }



    private By seeAllQAJobs = By.cssSelector("#page-head > div > div > div.col-12.col-lg-7.order-2.order-lg-1 > div > div > a");
    private By filterByLocationTitle = By.cssSelector("#top-filter-form > div:nth-child(1) > label");
    private By location = By.id("filter-by-location");
    private By locationIstanbulOptions = By.xpath("/html/body/span/span/span[2]/ul/li[2]");
    private By department = By.cssSelector("#top-filter-form > div:nth-child(2) > label");
    private By departmentQAOptions = By.cssSelector("#select2-filter-by-department-container");
    private By jobsList = By.id("jobs-list");
    private By positions = By.cssSelector("#jobs-list > div:nth-child(1) > div > span");
    private By viewRoles = By.cssSelector("#jobs-list > div:nth-child(1) > div > a");
    private By applyForJobButton = By.cssSelector(".postings-btn-wrapper");


    public void checkSeeAllQAJobs() {
        elementHelper.checkElementVisible(seeAllQAJobs);
    }

    public void clickSeeAllQAJobs() {
        elementHelper.click(seeAllQAJobs);
    }

    public void checkFilterByLocationTitle() {
        elementHelper.checkElementVisible(filterByLocationTitle);
    }

    public void clickLocation() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.select(location, 1);
    }

    public void clickLocationIstanbul() {
        elementHelper.click(locationIstanbulOptions);
    }

    public void clickDepartment() {
        elementHelper.click(department);
    }

    public void clickDepartmentQAOptions() {
        elementHelper.click(departmentQAOptions);
    }

    public void checkJobList() {
        elementHelper.checkElementVisible(jobsList);
    }

    // 3. case
    public void checkElementsContainsPositionQA(){
        elementHelper.waitElementText(positions,"Quality Assurance");
    }

    // 4.case

    public void clickFirstPositionViewRole(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.move(viewRoles);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementHelper.click(viewRoles);
    }

    public void checkApplyForJobButton(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        elementHelper.checkElementVisible(applyForJobButton);
    }









}
