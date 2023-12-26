package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import util.DriverFactory;
import util.ElementHelper;

public class careerPage extends DriverFactory {

    ElementHelper elementHelper = new ElementHelper();


    private By findYourDreamJobButton = By.cssSelector("#page-head > div > div > div.col-12.col-lg-6.order-2.order-lg-1 > div > div > a");
    private By seeAllTeamsButton = By.cssSelector("#career-find-our-calling > div > div > a");
    private By ourLocationsTitle = By.cssSelector("#career-our-location > div > div > div > div.col-12.col-md-6 > h3");
    private By lifeAtInsider = By.cssSelector("body > div.elementor.elementor-22610 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-a8e7b90.elementor-section-full_width.elementor-section-height-default.elementor-section-height-default > div > div > div > div.elementor-element.elementor-element-21cea83.elementor-widget.elementor-widget-heading > div > h2");



    public void checkFindYourDreamJobButton(){
        elementHelper.checkElementVisible(findYourDreamJobButton);
    }
    // "findYourDreamJobButton" öğesinin görünür olduğunu kontrol eden metod.
    public void checkSeeAllTeamsButton(){
        elementHelper.checkElementVisible(seeAllTeamsButton);
    }
    // "seeAllTeamsButton" öğesinin görünür olduğunu kontrol eden metod.
    public void checkOurLocationsTitle(){
        elementHelper.checkElementVisible(ourLocationsTitle);
    }
    // "ourLocationsTitle" öğesinin görünür olduğunu kontrol eden metod.
    public void checkTextOurLocationsTitle(){
        elementHelper.checkElementText(ourLocationsTitle,"Our Locations");
    }
    // "ourLocationsTitle" öğesinin metin içeriğini kontrol eden metod.
    public void checkLifeAtInsider(){
        Assert.assertEquals(elementHelper.elementGetText(lifeAtInsider),"Life at Insider");
        // "lifeAtInsider" öğesinin metin içeriğini "Life at Insider" ile karşılaştıran metod.
    }








}

