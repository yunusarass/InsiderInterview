package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

public class homePage {

    ElementHelper elementHelper;

    public homePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }


    private By homePage = By.cssSelector("#revamp-head-desktop > div > div > div > div > h1");
    private By company = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/a");
    private By companyDropdown = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/div");
    private By career = By.xpath("/html/body/nav/div[2]/div/ul[1]/li[6]/div/div[2]/a[2]");

    public void checkHomePage(){
        elementHelper.checkElementVisible(homePage);
    }
    public void clickCompany() {
        elementHelper.click(company);
    }
    public void checkCompanyDropdown() {
        elementHelper.checkElementVisible(companyDropdown);
    }
    public void clickCareer() {
        elementHelper.click(career);
    }

}
