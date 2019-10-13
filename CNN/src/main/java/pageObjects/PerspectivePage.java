package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

public class PerspectivePage extends CommonAPI {
    @FindBy(how = How.CSS,using = "#perspectives-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > div > div.media > a > img")
    public static WebElement imgWebElement;
    @FindBy(how = How.CSS,using = "#REACT_ticker-ribbon > div > div > div > div.carousel__OverflowContainer-cie5r-1.feRXzh")
    public static WebElement navBarWebElement;
    public static WebElement getImgWebElement(){
        return imgWebElement;
    }
    public static WebElement getNavBarWebElement(){
        return navBarWebElement;
    }
    public void clickOnPerspective(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.kkGIDQ > nav > ul > li:nth-child(5)");
    }
    public void imgIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImgWebElement().isDisplayed();
    }
    public void clickOnSlideButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#REACT_ticker-ribbon > div > div > div > div.carousel__Controls-cie5r-2.bFBIDu > button:nth-child(2)");
    }
    public void clickOnDropDownButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#REACT_ticker-ribbon > div > div > div > div.carousel__OverflowContainer-cie5r-1.feRXzh > a:nth-child(1) > div > div > svg");
    }
    public void getHeadlineText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text= getTextByCss("#REACT_ticker-ribbon > div > div > div > div.carousel__OverflowContainer-cie5r-1.feRXzh > a:nth-child(1) > div > span");
        System.out.println(text);
    }
    public void navBarIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNavBarWebElement().isDisplayed();
    }
    public void clickOnHeadlineText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#perspectives-zone-2 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul > li:nth-child(4) > article > div > div");
    }
    public void getNewsList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List list= getTextFromWebElements("#perspectives-zone-2 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul");
        System.out.println(list);
    }
    public void getHeadlineNewsText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text=getTextByCss("#perspectives-zone-2 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-1 > ul > li:nth-child(4) > article > div");
        System.out.println(text);
    }

}
