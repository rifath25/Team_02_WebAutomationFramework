package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

public class WorldPage extends CommonAPI {
    @FindBy(how = How.CLASS_NAME,using = "cd__headline-text")
    public static WebElement headlineTextWebElement;
    @FindBy(how = How.CSS, using = "#body-text > div.l-container > div.el__embedded.el__embedded--fullwidth > div > div > img")
    public static WebElement imgWebElement;
    @FindBy(how = How.CSS, using = "#outbrain_widget_1 > div > div.ob-widget-section.ob-first")
    public static WebElement paidContendWebElement;
    @FindBy(how = How.CSS, using = "#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div")
    public static WebElement navBarWebElement;
    @FindBy(how = How.CSS, using = "#outbrain_widget_2 > div > div.ob-widget-section.ob-last")
    public static WebElement moreFromCNNWebElement;
    public static WebElement getHeadlineTextWebElement(){
        return headlineTextWebElement;
    }
    public static WebElement getImgWebElement(){
        return imgWebElement;
    }
    public static WebElement getPaidContendWebElement(){
        return paidContendWebElement;
    }
    public static WebElement getNavBarWebElement(){
        return navBarWebElement;
    }
    public static WebElement getMoreFromCNNWebElement(){
        return moreFromCNNWebElement;
    }
    public void headlineTextIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHeadlineTextWebElement().isDisplayed();
    }
    public void imgIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImgWebElement().isDisplayed();
    }
    public void mediaCaption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text=getTextByCss("#body-text > div.l-container > div.el__embedded.el__embedded--fullwidth > div > div > div.media__caption.el__gallery_image-title > div");
        System.out.println(text);
    }
    public void readParagraphFromNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String paragraph= getTextByXpath("//*[@id=\"body-text\"]/div[1]/div[12]/div[1]");
        System.out.println(paragraph);
    }
    public void paidContentIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPaidContendWebElement().isEnabled();
    }
    public void clickOnNewsLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#outbrain_widget_1 > div > div.ob-widget-section.ob-first > ul:nth-child(2) > li.ob-dynamic-rec-container.ob-recIdx-0.ob-p.ob-rtb > a > span.ob-unit.ob-rec-text");
    }
    public void navBarIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNavBarWebElement().isDisplayed();
    }
    public void moreFromCNNIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getMoreFromCNNWebElement().isEnabled();
    }
    public void readNewsListFromMoreFromCNN(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List list= getTextFromWebElements("#outbrain_widget_2 > div > div.ob-widget-section.ob-last > ul");
        System.out.println(list);
    }
    public void readNewsFromPaidContentList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text= getTextByCss("#outbrain_widget_2 > div > div.ob-widget-section.ob-first > ul > li.ob-dynamic-rec-container.ob-recIdx-0.ob-p > a > span.ob-unit.ob-rec-text");
        System.out.println(text);
    }

}
