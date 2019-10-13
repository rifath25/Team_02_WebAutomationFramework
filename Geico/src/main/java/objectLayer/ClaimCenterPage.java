package objectLayer;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClaimCenterPage extends CommonAPI {

    @FindBy(css = "#page-footer > ul.footer-desktop")
    public static WebElement footer;
    @FindBy(css = "#page-footer > ul.footer-desktop > li.middle")
    public static WebElement footerMidsection;
    public static WebElement getFooter() {
        return footer;
    }
    public static WebElement getFooterMidsection() {
        return footerMidsection;
    }
    public void checkFooter(){
        checkurl();
        getFooter().isDisplayed();
    }
    public void checkFooterMidSec(){
        checkurl();
        getFooterMidsection().isDisplayed();
    }
    public void getListOfFooter(){

        List l = getTextFromWebElements("#page-footer > ul.footer-desktop > li.middle#page-footer > ul.footer-desktop > li.middle");
        System.out.println(l);
    }
    public void checkurl() {
        driver.get("http://claims.geico.com/uc.html");
        getCurrentPageUrl();
    }
    public void clickIcon1getUrl() {
        checkurl();
        clickOnElement("#quick-help > div > div:nth-child(1) > a > span");
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }
    public void clickIcon2getUrl() {
        checkurl();
        clickOnElement("#quick-help > div > div:nth-child(2) > a > span");
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }
    public void clickIcon3getUrl() {
        checkurl();
        clickOnElement("#quick-help > div > div:nth-child(3)");
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }
    public void clickIcon4getUrl() {
        checkurl();
        clickOnElement("#quick-help > div > div:nth-child(4)");
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }
    public void clickIcon5getUrl() {
        checkurl();
        clickOnElement("#quick-help > div > div:nth-child(5)");
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }
}
