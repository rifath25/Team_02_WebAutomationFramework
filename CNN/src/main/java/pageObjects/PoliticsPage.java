package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

public class PoliticsPage extends CommonAPI {
    @FindBy(how = How.CLASS_NAME, using = "cd__headline-text")
    public static WebElement liveUpdatesWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"player-video-player-0\"]/div/button")
    public static WebElement videoPlayerButtonWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"politics-zone-1\"]/div[2]/div/div[2]/ul/li[1]/article/div/div[2]/h3/a/span[1]")
    public static WebElement headLineTextWebElement;
    @FindBy(how = How.CLASS_NAME, using = "cd__headline-text")
    public static WebElement articleSizeWebElement;
    @FindBy(how = How.CSS, using = "#politics-zone-2")
    public static WebElement politicalContentWebElement;
    @FindBy(how = How.CSS, using = "#politics-zone-3 > div.l-container > div > div.column.zn__column--idx-2 > ul > li:nth-child(3) > article > div > div.cd__content > h3")
    public static WebElement newsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/header/div/div[1]/div/div[1]/a[2]/svg")
    public static WebElement HeaderTagNameWebElement;

    public static WebElement getLiveUpdatesWebElement(){
        return liveUpdatesWebElement;
    }
    public static WebElement getVideoPlayerButtonWebElement(){
        return videoPlayerButtonWebElement;
    }
    public static WebElement getHeadLineTextWebElement(){
        return headLineTextWebElement;
    }
    public static WebElement getArticleSizeWebElement(){
        return articleSizeWebElement;
    }
    public static WebElement getPoliticalContentWebElement(){
        return politicalContentWebElement;
    }
    public static WebElement getNewsWebElement(){
        return newsWebElement;
    }
    public static WebElement getHeaderTagNameWebElement(){
        return HeaderTagNameWebElement;
    }
    public void clickOnLiveUpdtaesNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLiveUpdatesWebElement().click();
    }
    public void clickOnVideoPlayerButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getVideoPlayerButtonWebElement().click();
    }
    public void clickOnVideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnLiveUpdtaesNews();
        clickOnVideoPlayerButton();
    }
    public void headLineText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String headLineText= getHeadLineTextWebElement().getText();
        System.out.println(headLineText);
    }
    public void readArticleList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List list= getTextFromWebElements("#politics-zone-1 > div.l-container > div > div.column.zn__column--idx-1");
        System.out.println(list);
    }
    public void articleSize(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Dimension size= getArticleSizeWebElement().getSize();
        System.out.println(size);
    }
    public void politicalContentIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getArticleSizeWebElement().isDisplayed();
    }
    public void mouseHoverArticle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS("#politics-zone-2 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-1 > ul > li:nth-child(2) > article > div > div.cd__content > h3 > a > span.cd__headline-text");
    }
    public void clickOnArticle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#politics-zone-3 > div.l-container > div > div.column.zn__column--idx-2 > ul > li:nth-child(2) > article > div > div.cd__content > h3 > a > span.cd__headline-text");
    }
    public void newsIsSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNewsWebElement().isSelected();
    }
    public void listOfContent(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List list= getTextFromWebElements("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.kkGIDQ");
        System.out.println(list);
    }
    public void HeaderTagName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String tagName= getNewsWebElement().getTagName();
        System.out.println(tagName);
    }

}
