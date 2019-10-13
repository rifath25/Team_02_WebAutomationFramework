package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class AmazonBlogPage extends CommonAPI
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > div.PageHome-pageLead > section > div.LeadTwoColumnHomePage-leftColumnItems > div.LeadTwoColumnHomePage-date")
    public static WebElement currentDateAndDayTextWebElement;

    @FindBy (how = How.CLASS_NAME,using = "PageHome-header-contentWrapper")
    public static WebElement isHeaderDisplayed;

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > div.PageHome-pageLead > section > div.LeadTwoColumnHomePage-leftColumnItems > div:nth-child(2) > div > ol > li:nth-child(1) > a > span")
    public static WebElement sitStayPlayWebElement;

    @FindBy (how = How.CSS,using = "body > header > div.PageHome-hat > div > div.Page-hat-navigation > button")
    public static WebElement dropDownThreeDotButtonIconWebElement;

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > div.PageHome-pageLead > section > div.LeadTwoColumnHomePage-rightColumnItems > div:nth-child(2) > div > div.PromoImageOnTop-large-info > h1 > a")
    public static WebElement textOfFirstHeadingWebElement;

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > div.PageHome-pageLead > section > div.LeadTwoColumnHomePage-rightColumnItems > div:nth-child(2) > div > div.PromoImageOnTop-large-info > span > div > a")
    public static WebElement continueReadingBuildingHomeWithHeartWebElement;

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > div.PageHome-pageLead > section > div.LeadTwoColumnHomePage-rightColumnItems > div:nth-child(3) > div > div.PromoImageOnTop-info > span > div > a")
    public static WebElement continueReadingAlexaHolaWebElement;

    @FindBy (how = How.CSS,using = "body > header > div.PageHome-header-bottom > div > button")
    public static WebElement headerDropDownMenuWebElement;

    @FindBy (how = How.CSS,using = "body > div.PageHome-contentWrapper > main > a > div > div.PromoBannerTextOverlay-info > div.PromoBannerTextOverlay-button.mood-bgcolor")
    public static WebElement outForDeliverySignUpWebElement;

//----------------------------------------------------------------------------------------------------------------------------


    public static WebElement getCurrentDateAndDayTextWebElement()
    {
        return currentDateAndDayTextWebElement;
    }

    public static WebElement getIsHeaderDisplayed()
    {
        return isHeaderDisplayed;
    }

    public static WebElement getSitStayPlayWebElement()
    {
        return sitStayPlayWebElement;
    }

    public static WebElement getDropDownThreeDotButtonIconWebElement()
    {
        return dropDownThreeDotButtonIconWebElement;
    }

    public static WebElement getTextOfFirstHeadingWebElement()
    {
        return textOfFirstHeadingWebElement;
    }

    public static WebElement getContinueReadingBuildingHomeWithHeartWebElement()
    {
        return continueReadingBuildingHomeWithHeartWebElement;
    }

    public static WebElement getContinueReadingAlexaHolaWebElement()
    {
        return continueReadingAlexaHolaWebElement;
    }

    public static WebElement getHeaderDropDownMenuWebElement()
    {
        return headerDropDownMenuWebElement;
    }

    public static WebElement getOutForDeliverySignUpWebElement()
    {
        return outForDeliverySignUpWebElement;
    }

//----------------------------------------------------------------------------------------------------------------------------

    public void currentDateAndDayText()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        System.out.println(getCurrentDateAndDayTextWebElement().getText());
    }

    public void isHeaderDisplayed()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getIsHeaderDisplayed().isDisplayed();
    }

    public void sitStayPlay()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getSitStayPlayWebElement().click();
    }

    public void dropDownThreeDotButtonIcon()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getDropDownThreeDotButtonIconWebElement().click();
    }

    public void textOfFirstHeading()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        System.out.println(getTextOfFirstHeadingWebElement().getText());
    }

    public void continueReadingBuildingHomeWithHeart()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getContinueReadingBuildingHomeWithHeartWebElement().click();
    }

    public void continueReadingAlexaHola()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getContinueReadingAlexaHolaWebElement().click();
    }

    public void headerDropDownMenu()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getHeaderDropDownMenuWebElement().click();
    }

    public void hoverOverAboutAmazonLogo()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        mouseHoverByCSS("body > header > div.PageHome-hat > div > div.PageHome-hat-logo > a > img");
    }

    public void outForDeliverySignUp()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonBlog();
        getOutForDeliverySignUpWebElement().click();
    }
}
