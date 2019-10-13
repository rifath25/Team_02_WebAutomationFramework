package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI
{
    //findElements
    @FindBy (how = How.CLASS_NAME, using = "nav-search-dropdown searchSelect")
    public static WebElement categoriesDropDownMenuWebElement;

    @FindBy (how = How.ID, using = "nav-xshop-container")
    public static WebElement isNavBarDisplayedWebElement;

    @FindBy (how = How.CSS, using = "#a-page > header")
    public static WebElement isHeaderDisplayedWebElement;

    @FindBy (how = How.CSS,using = "#glow-ingress-line2")
    public static WebElement textOfDeliverToWebElement;

    @FindBy (how = How.CSS,using = "#navFooter > div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright > ul > li.nav_last")
    public static WebElement amazonCopyrightTextWebElement;

    @FindBy (how = How.CSS,using = "#nav-xshop > a:nth-child(2)")
    public static WebElement amazonBestSellersWebElement;

    @FindBy (how = How.CSS,using = "#nav-xshop > a:nth-child(3)")
    public static WebElement amazonGiftIdeasWebElement;

    @FindBy (how = How.CSS,using = "#nav-xshop > a:nth-child(4)")
    public static WebElement amazonNewReleasesWebElement;

    @FindBy (how = How.CSS,using = "#nav-xshop > a:nth-child(5)")
    public static WebElement amazonWholeFoodsWebElement;

    @FindBy (how = How.CSS,using = "#nav-xshop")
    public static WebElement selectedNavBarWebElement;

    @FindBy (how = How.CSS,using = "#pageContent")
    public static WebElement isPageContentsDisplayedWebElement;

    @FindBy (how = How.CSS,using = "#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li:nth-child(2) > a")
    public static WebElement amazonBlogWebElement;

//----------------------------------------------------------------------------------------------------------------------------------

    //getElements
    public static WebElement getCategoriesDropDownMenuWebElement()
    {
        return categoriesDropDownMenuWebElement;
    }

    public static WebElement getIsNavBarDisplayedWebElement()
    {
        return isNavBarDisplayedWebElement;
    }

    public static WebElement getIsHeaderDisplayedWebElement()
    {
        return isHeaderDisplayedWebElement;
    }

    public static WebElement getTextOfDeliverToWebElement()
    {
        return textOfDeliverToWebElement;
    }

    public static WebElement getAmazonCopyrightTextWebElement()
    {
        return amazonCopyrightTextWebElement;
    }

    public static WebElement getAmazonBestSellersWebElement()
    {
        return amazonBestSellersWebElement;
    }

    public static WebElement getAmazonGiftIdeasWebElement()
    {
        return amazonGiftIdeasWebElement;
    }

    public static WebElement getAmazonNewReleasesWebElement()
    {
        return amazonNewReleasesWebElement;
    }

    public static WebElement getAmazonWholeFoodsWebElement()
    {
        return amazonWholeFoodsWebElement;
    }

    public static WebElement getSelectedNavBarWebElement()
    {
        return selectedNavBarWebElement;
    }

    public static WebElement getIsPageContentsDisplayedWebElement()
    {
        return isPageContentsDisplayedWebElement;
    }

    public static WebElement getAmazonBlogWebElement()
    {
        return amazonBlogWebElement;
    }

//-----------------------------------------------------------------------------------------------------------------------------------

    //executeTestStepsOfElements
    public void categoriesDropDownMenu()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCategoriesDropDownMenuWebElement().click();
    }

    public void isNavBarDisplayed()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIsNavBarDisplayedWebElement().isDisplayed();
    }

    public void isHeaderDisplayed()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIsHeaderDisplayedWebElement().isDisplayed();
    }

    public void textOfDeliverTo()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(getTextOfDeliverToWebElement().getText());
    }

    public void amazonCopyrightText()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text = getAmazonCopyrightTextWebElement().getText();
        System.out.println(text);
        Assert.assertEquals(text,"© 1996-2019, Amazon.com, Inc. or its affiliates");
    }

    public void amazonBestSellers()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAmazonBestSellersWebElement().click();
    }

    public void amazonGiftIdeas()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAmazonGiftIdeasWebElement().click();
    }

    public void amazonNewReleases()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAmazonNewReleasesWebElement().click();
    }

    public void amazonWholeFoods()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAmazonWholeFoodsWebElement().click();
    }

    public void selectedNavBar()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectedNavBarWebElement().isSelected();
    }

    public void isPageContentsDisplayed()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getIsPageContentsDisplayedWebElement().isDisplayed();
    }

//--------------------------------------------------------------------------------------------------------------------------

    public void helpWindowUrl()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.get("https://www.amazon.com/gp/help/customer/display.html?ie=UTF8&nodeId=508510&ref_=footer_gw_m_b_he");
    }

    public void navigateToCart()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-cart\"]/span[2]");        //ByXpath
    }

    public void clickableSignInButton()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("nav-line-1");       //ByClassName
    }

    public void positiveSignIn() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-link-accountList\"]");        //ByXpath
        sleepFor(2);
        typeByXpath("//*[@id=\"ap_email\"]","raihankabir.rahi@yahoo.com");      //ByXpath
        sleepFor(1);
        clickOnElement("//input[@id=\"continue\"]");        //ByXpath
        sleepFor(1);
        typeByXpath("//*[@id=\"ap_password\"]","rk12%$#&");     //ByXpath
        sleepFor(1);
        clickOnElement("//*[@id=\"signInSubmit\"]");        //ByXpath
        sleepFor(2);
    }

    public void negativeSignIn() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-link-accountList\"]");        //ByXpath
        sleepFor(2);
        typeByXpath("//*[@id=\"ap_email\"]","rksdcs@yahoo.com");
        clickOnElement("//input[@id=\"continue\"]");        //ByXpath
        sleepFor(1);
    }

    public void searchItem() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"twotabsearchtextbox\"]");     //ByXpath
        typeByXpath("//*[@id=\"twotabsearchtextbox\"]","glass");
        clickOnElement("//*[@id=\"nav-search\"]/form/div[2]/div/input");        //ByXpath
    }

    public void amazonPrime() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//*[@id=\"nav-logo\"]/a[2]");       //ByXpath
        sleepFor(2);
        clickOnElement("#prime-header-CTA > span > input");     //ByCSS Selector
    }

    public void amazonMusic() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(1) > td:nth-child(1) > a");       //ByCSS Selector
        sleepFor(3);
    }

    public void amazonBusiness() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(3) > td:nth-child(1) > a");       //ByCSS Selector
        sleepFor(3);
    }

    public void amazonAlexa() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(1) > td:nth-child(13) > a");      //ByCSS Selector
        sleepFor(3);
    }

    public void careerOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li.nav_first > a");       //ByCSS Selector
        sleepFor(3);
    }

    public void amazonHelp() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(7) > ul > li.nav_last > a");        //ByCSS Selector
        sleepFor(3);
    }

    public void amazonAssistance() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(7) > ul > li:nth-child(7) > a");        //ByCSS Selector
        sleepFor(3);
    }

    public void amazonInfo() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1) > ul > li:nth-child(3) > a");        //ByCSS Selector
        sleepFor(3);
    }

    public void sellingOnAmazon() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(3) > ul > li.nav_first > a");       //ByCSS Selector
        sleepFor(2);
        clickOnElement("#asus_footer_cta_h > div > div > a");       //ByCSS Selector
        sleepFor(2);
    }

    public void backToTopButton() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("navFooterBackToTopText");       //ByClassName
        sleepFor(1);
    }

    public void storeCardInfoAndApply() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(2) > a");        //ByCSS Selector
        sleepFor(2);
        clickOnElement("#mp-slotted > div > div.container1 > div.sec3 > div.buttonaccept > a");     //ByCSS Selector
        sleepFor(1);
    }

    public void businessCardInfoAndApply() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(3) > a");        //ByCSS Selector
        sleepFor(1);
        clickOnElement("applyBoxLink-announce");        //ById
        sleepFor(1);
    }

    public void shopWithPointsFeature() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(5) > ul > li:nth-child(5) > a");        //ByCSS Selector
        sleepFor(1);
        clickOnElement("#contentGrid_784921 > div > div:nth-child(4) > div:nth-child(3) > div > div > a");        //ByCSS Selector
        sleepFor(1);
    }

    public void itemCategories() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-hamburger-menu");      //CSS Selector
        sleepFor(2);
    }

    public void todaysDealsMenu() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-xshop > a:nth-child(6)");      //CSS Selector
        sleepFor(2);
    }

    public void listsFromAccountsAndListsDropDown()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav-link-accountList");
        List listOfAccounts = getTextFromWebElements("#nav-al-your-account");
        List listOfLists =  getTextFromWebElements("#nav-al-wishlist");
        System.out.println(listOfAccounts);
        System.out.println(listOfLists);
    }

    public void listCategoriesText()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List listCategories = getTextFromWebElements("#searchDropdownBox");
        System.out.println(listCategories);
    }

    public void cartLinkFunctionality()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateToCart();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void helpLinkFunctionality()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpWindowUrl();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void textsOfGetToKnowUs()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List listOfGetToKnowsUs = getTextFromWebElements("#navFooter > div.navFooterVerticalColumn.navAccessibility > div > div:nth-child(1)");
        System.out.println(listOfGetToKnowsUs);
    }

    public void wholeFoodsLinkFunctionality()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonWholeFoods();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void todaysDealsLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        todaysDealsMenu();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void amazonNewReleasesLinkFunctionality()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonNewReleases();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void amazonGiftIdeasLinkFunctionality()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        amazonGiftIdeas();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void amazonBlog()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAmazonBlogWebElement().click();
    }



}
