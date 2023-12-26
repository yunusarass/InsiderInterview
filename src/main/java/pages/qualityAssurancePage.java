package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;
import util.ElementHelper;

public class qualityAssurancePage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();


    private By seeAllQAJobs = By.cssSelector("#page-head > div > div > div.col-12.col-lg-7.order-2.order-lg-1 > div > div > a");
    private By filterByLocationTitle = By.cssSelector("#top-filter-form > div:nth-child(1) > label");
    private By location = By.cssSelector("#top-filter-form > div:nth-child(1) > span");
    private By locationIstanbulOptions = By.xpath("/html/body/span/span/span[2]/ul/li[2]");
    private By department = By.cssSelector("#top-filter-form > div:nth-child(2) > label");
    private By departmentQAOptions = By.cssSelector("#select2-filter-by-department-container");
    private By jobsList = By.id("jobs-list");
    private By positions = By.cssSelector("#jobs-list > div:nth-child(1) > div > span");
    private By viewRoles = By.cssSelector("#jobs-list > div:nth-child(1) > div > a");
    private By applyForJobButton = By.cssSelector("body > div.content-wrapper.posting-page > div > div.section-wrapper.accent-section.page-full-width > div > div.postings-btn-wrapper > a");


    public void checkSeeAllQAJobs() throws InterruptedException {
        elementHelper.checkElementVisible(seeAllQAJobs);
    }

    public void clickSeeAllQAJobs() throws InterruptedException {
        elementHelper.click(seeAllQAJobs);
    }

    public void checkFilterByLocationTitle() throws InterruptedException {
        elementHelper.checkElementVisible(filterByLocationTitle);
    }

    public void clickLocation() throws InterruptedException {
        elementHelper.click(location);
    }

    public void clickLocationIstanbul() throws InterruptedException {
        elementHelper.click(locationIstanbulOptions);
    }

    public void clickDepartment() throws InterruptedException {
        elementHelper.click(department);
    }

    public void clickDepartmentQAOptions() throws InterruptedException {
        elementHelper.click(departmentQAOptions);
    }

    public void checkJobList() throws InterruptedException {
        elementHelper.checkElementVisible(jobsList);
    }

    // 3. case
    public void checkElementsContainsPositionQA(){
        elementHelper.checkElementText(positions,"Quality Assurance");
    }

    // 4.case

    public void clickFirstPositionViewRole(){
        elementHelper.click(viewRoles);
    }

    public void checkApplyForJobButton(){
        elementHelper.checkElementVisible(applyForJobButton);
    }









}
