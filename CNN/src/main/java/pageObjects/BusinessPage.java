package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class BusinessPage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[4]/a")
    public static WebElement techWebElement;
    @FindBy(how = How.CSS, using = "#business-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > div > div.media > a")
    public static WebElement mediaImgWebElement;
    @FindBy(how = How.CSS, using = "#business-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > div > div.cd__content > h3 > a > span.cd__headline-text")
    public static WebElement headlineTextWebElement;
    @FindBy(how = How.CSS, using = "#business-zone-1 > div.l-container > div > div.column.zn__column--idx-1 > ul > li:nth-child(2) > article > div")
    public static WebElement contentWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"business-zone-2\"]/div[6]/div/div[1]/ul")
    public static WebElement contentListWebElement;
    @FindBy(how = How.CSS, using = "#business-zone-2 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul > li:nth-child(3) > article > div > div > h3 > a > span.cd__headline-text")
    public static WebElement newsSizeWebElement;
    @FindBy(how = How.CSS,using = "#business-zone-4 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0")
    public static WebElement successContentWebElement;
    @FindBy(how = How.CSS,using = "#business-zone-4 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-1")
    public static WebElement techContentWebElement;
    @FindBy(how = How.CSS,using = "#business-zone-4 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-2")
    public static WebElement mediaContentWebElement;


    public static WebElement getMediaImgWebElement() {
        return mediaImgWebElement;
    }

    public static WebElement getTechWebElement() {
        return techWebElement;
    }

    public static WebElement getHeadlineTextWebElement() {
        return headlineTextWebElement;
    }

    public static WebElement getContentWebElement() {
        return contentWebElement;
    }

    public static WebElement getContentListWebElement() {
        return contentListWebElement;
    }

    public static WebElement getNewsSizeWebElement() {
        return newsSizeWebElement;
    }
    public static WebElement getSuccessContentWebElement(){
        return successContentWebElement;
    }
    public static WebElement getTechContentWebElement(){
        return techContentWebElement;
    }
    public static WebElement getMediaContentWebElement(){
        return mediaContentWebElement;
    }

    public void clickOnBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTechWebElement().click();
    }

    public void mediaImgIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMediaImgWebElement().isDisplayed();
    }

    public void headlineText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String text = getHeadlineTextWebElement().getText();
        System.out.println(text);
    }

    public void contendIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getContentWebElement().isDisplayed();
    }

    public void contentListIsEnabled() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getContentListWebElement().isEnabled();
    }

    public void newsContententSize() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Dimension size = getNewsSizeWebElement().getSize();
        System.out.println(size);
    }

    public void clickOnVideo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"business-zone-3\"]/div[6]/div[2]/div[1]/ul/li/article/div/div[1]/a");
    }
    public void successContentIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSuccessContentWebElement().isDisplayed();
    }
    public void techContentIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getTechWebElement().isDisplayed();
    }
    public void mediaContentIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMediaContentWebElement().isDisplayed();
    }
    public void newsText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String text=getTextByCss("#business-zone-5 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul > li:nth-child(3) > article");
        System.out.println(text);
    }
}
