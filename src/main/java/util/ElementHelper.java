package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper extends DriverFactory {
    WebDriver driver;
    Select select;
    Actions action ;
    WebDriverWait wait ;



    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));//wait.until sayfa geç yüklenir diye 10 saniye bekliyoruz gelmezse hata döndür
    }
    public WebElement findElement(By key) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(key));
            JavascriptExecutor j = (JavascriptExecutor) driver;
            j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", element);

            return element;
        }catch (Exception e) {
            throw new RuntimeException("Element bulunamadi", e);
        }
    }//Hatalı
    public List<WebElement> presenceElements(By key) {
        return driver.findElements(key);
    }
    public List<WebElement> findElements(By key) {
        try {
            List<WebElement> elements = presenceElements(key);
            return elements;
        }catch (Exception e) {
            System.out.println("Elementler bulunamadı: " + e.getMessage());
            return null;
        }
    }
    public String elementGetText(By key) {
        WebElement element = driver.findElement(key);
        String text = element.getText();
        return text;

    }

    public void click(By key){
        findElement(key).click();
    }
    public void move(By key){
        try {
            action.moveToElement(driver.findElement(key)).build().perform();
        } catch (Exception e) {

        }
    }
    public void checkElementVisible(By key){
        try {
            findElement(key);
            wait.until(ExpectedConditions.visibilityOfElementLocated(key));
        }catch (Exception ignored) {
            Assert.fail("Element bulunamadi");
        }
    }
    public void checkElementText(By key, String text) {
        Assert.assertEquals(elementGetText(key), text);
    }
    public void waitElementText(By key, String text) {
        wait.until(ExpectedConditions.textToBe(key, text));
    }
    public void goToUrl(String url){
        driver.get(url);
    }
    public void clickElementWithText(By key, String text) {
        boolean find = false;
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            if (elementGetText((By) element).contains(text)) {
                element.click();
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }
    public void checkElementWithText(By key, String text) {
        boolean find = false;
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            if (elementGetText((By) element).contains(text)) {
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }
    public void checkElementsWithText(By key, String text) {
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            Assert.assertTrue(findElement((By) element).getText().contains(text));
        }
    }
    public void moveToElement(WebElement element) {
        action.moveToElement(element).release().perform();
    }
    public void select(By key, int index){
        select = new Select(findElement(key));
        select.selectByIndex(index);
    }

}
