package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/header/div/div[1]/div/a/span")
    public static WebElement clickOnLiveTvWebElement;
    @FindBy(how = How.CSS, using = "#edition-picker-toggle-desktop > svg")
    public static WebElement clickOnEditionDropDownMenuWebElement;
    @FindBy(how = How.CSS, using = "#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > a")
    public static WebElement clickOnHeadlineNewsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[1]/ul")
    public static WebElement clickOnSportsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[2]/ul")
    public static WebElement clickOnOptionWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[4]/ul")
    public static WebElement clickOnWorldWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[5]/ul")
    public static WebElement clickOnUSWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[6]/ul")
    public static WebElement clickOnStyleWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[7]/ul")
    public static WebElement clickOnEntertainmentWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[8]/ul")
    public static WebElement clickOnTechWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[9]/ul")
    public static WebElement clickOnPoliticsWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[10]/ul")
    public static WebElement clickOnScienceNHealthWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[11]/ul")
    public static WebElement clickOnTravelWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[12]/ul")
    public static WebElement clickOnWelcomeToTheFallWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/header/div/div[1]")
    public static WebElement navBarWebElement;
    @FindBy(how = How.CLASS_NAME, using = "search-icon")
    public static WebElement searchButtonWebElement;
    @FindBy(how = How.CSS, using = "#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.branding__BrandingContainer-drmgik-0.cGmtBu > a")
    public static WebElement logoWebElement;
    @FindBy(how = How.CSS, using = "#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > div > div.media > a > img")
    public static WebElement imgWebElement;
    @FindBy(how = How.CSS, using = "body > div.widget-grid-container > div > div:nth-child(3) > div > div > a")
    public static WebElement iFrameWebElement;
    @FindBy(how = How.CSS, using = "#footer-wrap > footer > div:nth-child(5) > div > div.Box-sc-1fet97o-0.cApVqV > nav")
    public static WebElement footerWebElement;
    @FindBy(how = How.CSS, using = "#footer-wrap > footer > div:nth-child(5) > div > div.Box-sc-1fet97o-0.copyright__CopyrightContainer-f3mp1a-2.LmrhR")
    public static WebElement copyRightTextWebElement;
    @FindBy(how = How.CSS, using = "#footer-wrap > footer > div:nth-child(2) > div > div > nav > ul > li:nth-child(12) > ul > li:nth-child(3) > a")
    public static WebElement cnnFlimsWebElement;
    @FindBy(how = How.CSS, using = "#Button_ButtonModule_6_654873196")
    public static WebElement bannerWebElement;
    @FindBy(how = How.CSS, using = "#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-1 > ul > li:nth-child(2) > article > div > div.media > a > img")
    public static WebElement imgSizeWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage4-zone-6\"]/div[2]/div[1]/h2")
    public static WebElement shoppingContentWebElement;
    @FindBy(how = How.CSS, using = "#body > div.widget-grid-container > div > div:nth-child(9) > div > div")
    public static WebElement financeHacksWebElement;
    @FindBy(how = How.CSS, using = "#banner-container > iframe")
    public static WebElement lendingTreeFrameWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"hit\"]")
    public static WebElement lendingTreeiFrameWebElement;


    public static WebElement getClickOnLiveTvWebElement() {
        return clickOnLiveTvWebElement;
    }

    public static WebElement getClickOnEditionDropDownMenuWebElement() {
        return clickOnEditionDropDownMenuWebElement;
    }

    public static WebElement getClickOnHeadlineNewsWebElement() {
        return clickOnHeadlineNewsWebElement;
    }

    public static WebElement getClickOnSportsWebElement() {
        return clickOnSportsWebElement;
    }

    public static WebElement getClickOnOptionWebElement() {
        return clickOnOptionWebElement;
    }

    public static WebElement getClickOnWorldWebElement() {
        return clickOnWorldWebElement;
    }

    public static WebElement getClickOnUSWebElement() {
        return clickOnUSWebElement;
    }

    public static WebElement getClickOnStyleWebElement() {
        return clickOnStyleWebElement;
    }

    public static WebElement getClickOnEntertainmentWebElement() {
        return clickOnEntertainmentWebElement;
    }

    public static WebElement getClickOnTechWebElement() {
        return clickOnTechWebElement;
    }

    public static WebElement getClickOnPoliticsWebElement() {
        return clickOnPoliticsWebElement;
    }

    public static WebElement getClickOnScienceNHealthWebElement() {
        return clickOnScienceNHealthWebElement;
    }

    public static WebElement getClickOnTravelWebElement() {
        return clickOnTravelWebElement;
    }

    public static WebElement getClickOnWelcomeToTheFallWebElement() {
        return clickOnWelcomeToTheFallWebElement;
    }

    public static WebElement getNavBarWebElement() {
        return navBarWebElement;
    }

    public static WebElement getSearchButtonWebElement() {
        return searchButtonWebElement;
    }

    public static WebElement getLogoWebElement() {
        return logoWebElement;
    }

    public static WebElement getImgWebElement() {
        return imgWebElement;
    }

    public static WebElement getiFrameWebElement() {
        return iFrameWebElement;
    }

    public static WebElement getFooterWebElement() {
        return footerWebElement;
    }

    public static WebElement getCopyRightTextWebElement() {
        return copyRightTextWebElement;
    }

    public static WebElement getCnnFlimsWebElement() {
        return cnnFlimsWebElement;
    }

    public static WebElement getBannerWebElement() {
        return bannerWebElement;
    }

    public static WebElement getImgSizeWebElement() {
        return imgSizeWebElement;
    }
    public static WebElement getShoppingContentWebElement(){
        return shoppingContentWebElement;
    }
    public static WebElement getFinanceHacksWebElement(){
        return financeHacksWebElement;
    }
    public static WebElement getLendingTreeiFrameWebElement(){
        return lendingTreeiFrameWebElement;
    }

    public void clickOnLiveTv() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnLiveTvWebElement().click();
        sleepFor(8);
    }

    public void clickOnEditionDropDownMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnEditionDropDownMenuWebElement().click();
    }

    public void clickOnHeadlineNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnHeadlineNewsWebElement().click();
    }

    public void clickOnSportsIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSportsWebElement().click();
    }

    public void clickOnOptionIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnOptionWebElement().click();
    }

    public void clickOnWorldIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnWorldWebElement().click();
    }

    public void clickOnUSIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnUSWebElement().click();
    }

    public void clickOnStyleIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnStyleWebElement().click();
    }

    public void clickOnEntertainmentIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnEntertainmentWebElement().click();
    }
    public void clickOnTechIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnTechWebElement().click();
    }
    public void clickOnPoliticsIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnPoliticsWebElement().click();
    }
    public void clickOnScienceNHealthIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnScienceNHealthWebElement().click();
    }

    public void clickOnTravelIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnTravelWebElement().click();
    }
    public void clickOnWelcomeToTheFallIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnWelcomeToTheFallWebElement().click();
    }
    public void readTopNewsList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List topNewsList = getTextFromWebElements("#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-2 > ul");
        System.out.println(topNewsList);
    }
    public void readNewsAndBuzzList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List newsAndBuzzList = getTextFromWebElements("#homepage2-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-0 > ul");
        System.out.println(newsAndBuzzList);
    }
    public void displayAbleNavBar() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getNavBarWebElement().isDisplayed();
    }
    public void readTrendingNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List trendingNewsList = getTextFromWebElements("#homepage-injection-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-1");
        System.out.println(trendingNewsList);
    }
    public void readCategoriesFromHeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List categories = getTextFromWebElements("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.kkGIDQ > nav > ul");
        System.out.println(categories);
    }

    public void clickOnSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchButtonWebElement().click();
    }

    public void logoIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getLogoWebElement().isDisplayed();
    }

    public void imgIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImgWebElement().isDisplayed();
    }

    public void clickOniFrame() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getiFrameWebElement().click();
    }

    public void footerLocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFooterWebElement().getLocation();
    }

    public void copyRightText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getCopyRightTextWebElement().getText();
        System.out.println(text);
        Assert.assertEquals(text, "© 2019 Cable News Network.Turner Broadcasting System, Inc.All Rights Reserved.\n" +
                "CNN Sans ™ & © 2016 Cable News Network.");
    }

    public void mouseHoverCnnVideo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS("#footer-wrap > footer > div:nth-child(2) > div > div > nav > ul > li:nth-child(12) > a");
    }

    public void cnnFlimsTagName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String tagName = getCnnFlimsWebElement().getTagName();
        System.out.println(tagName);
        Assert.assertEquals(tagName, "a");
    }

    public void bannerIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCopyRightTextWebElement().isDisplayed();
    }

    public void imgSize() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Dimension size = getImgSizeWebElement().getSize();
        System.out.println(size);
    }

    public void paidPartnerContentList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List contentList = getTextFromWebElements("#homepage3-zone-1 > div.l-container.zn__background--content-relative > div > div.column.zn__column--idx-2 > ul");
        System.out.println(contentList);
    }

    public void clickOnLendingTreePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[3]/ul/li[1]/article");
    }
    public void clickOnMediaPlayerIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#homepage4-zone-1 > div.l-container > div.zn__containers > div:nth-child(1) > div > div:nth-child(9) > article > div > div.media > a > i");
    }
    public void shoppingContentIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getShoppingContentWebElement().isDisplayed();
    }
    public void financeHacksText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getFinanceHacksWebElement().isEnabled();
    }
    public void lendingTreeWebpageIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        iframeHandle(lendingTreeFrameWebElement);
        getLendingTreeiFrameWebElement().isDisplayed();
    }
}
