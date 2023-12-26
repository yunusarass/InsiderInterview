package pages;

import org.openqa.selenium.By;
import util.DriverFactory;
import util.ElementHelper;

public class homePage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();

    private By homePage = By.cssSelector("#revamp-head-desktop > div > div > div > div > h1");
    private By company = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/a");
    private By companyDropdown = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/div");
    private By career = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/div/div[2]/a[2]");


    public void checkHomePage(){
        elementHelper.checkElementVisible(homePage);
    }

    public void clickCompany() throws InterruptedException {
        elementHelper.click(company);
    }

    public void checkCompanyDropdown() throws InterruptedException {
        elementHelper.checkElementVisible(companyDropdown);
    }
    public void clickCareer() throws InterruptedException {
        elementHelper.click(career);
    }

}
