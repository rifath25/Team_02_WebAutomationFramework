package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class HelpPage extends CommonAPI
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @FindBy (how = How.CSS, using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(1) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last")
    public static WebElement helpWithYourOrdersWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(1) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h3")
    public static WebElement helpWithReturnsAndRefundsWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(1) > div.a-column.a-span4.ss-rich-card-column.a-span-last > a > div > div > div > div.a-column.a-span9.a-span-last > h3")
    public static WebElement helpWithDigitalServicesAndDeviceSupportWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last")
    public static WebElement helpWithManagePrimeWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last")
    public static WebElement helpWithPaymentsAndGiftCardsWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-large.ss-landing-container-wide > div:nth-child(2) > div.a-column.a-span4.ss-rich-card-column.a-span-last > a > div > div > div > div.a-column.a-span9.a-span-last")
    public static WebElement helpWithAccountSettingsWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-section.a-spacing-extra-large.a-spacing-top-extra-large.ss-landing-container")
    public static WebElement textOfWelcomeMessageWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-section.a-spacing-base.ss-landing-container-wide")
    public static WebElement textOfMessageOneAfterWelcomeMessageWebElement;

    @FindBy (how = How.CSS,using = "body > div:nth-child(27) > div.a-row > div > div.a-section.a-spacing-extra-large.a-spacing-top-extra-large.ss-landing-container-wide > label > p")
    public static WebElement textOfSearchBarMessageWebElement;

    @FindBy (how = How.CSS,using = "#helpsearch")
    public static WebElement searchForHelpInSearchBarWebElement;

    @FindBy (how = How.CSS,using = "#helpSearchSubmit > span > input")
    public static WebElement goButtonWebElement;

    @FindBy (how = How.CLASS_NAME,using = "csg-hover-box-categories")
    public static WebElement listsOfBrowseHelpTopicsWebElement;

//---------------------------------------------------------------------------------------------------------------------------------------

    public static WebElement getHelpWithYourOrdersWebElement()
    {
        return helpWithYourOrdersWebElement;
    }

    public static WebElement getHelpWithReturnsAndRefundsWebElement()
    {
        return helpWithReturnsAndRefundsWebElement;
    }

    public static WebElement getHelpWithDigitalServicesAndDeviceSupportWebElement()
    {
        return helpWithDigitalServicesAndDeviceSupportWebElement;
    }

    public static WebElement getHelpWithManagePrimeWebElement()
    {
        return helpWithManagePrimeWebElement;
    }

    public static WebElement getHelpWithPaymentsAndGiftCardsWebElement()
    {
        return helpWithPaymentsAndGiftCardsWebElement;
    }

    public static WebElement getHelpWithAccountSettingsWebElement()
    {
        return helpWithAccountSettingsWebElement;
    }

    public static WebElement getTextOfWelcomeMessageWebElement()
    {
        return textOfWelcomeMessageWebElement;
    }

    public static WebElement getTextOfMessageOneAfterWelcomeMessageWebElement()
    {
        return textOfMessageOneAfterWelcomeMessageWebElement;
    }

    public static WebElement getTextOfSearchBarMessageWebElement()
    {
        return textOfSearchBarMessageWebElement;
    }

    public static WebElement getSearchForHelpInSearchBarWebElement()
    {
        return searchForHelpInSearchBarWebElement;
    }

    public static WebElement getGoButtonWebElement()
    {
        return goButtonWebElement;
    }

    public static WebElement getListsOfBrowseHelpTopicsWebElement()
    {
        return listsOfBrowseHelpTopicsWebElement;
    }

//---------------------------------------------------------------------------------------------------------------------------------------

    public void helpWithYourOrders() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithYourOrdersWebElement().click();
    }

    public void helpWithReturnsAndRefunds() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithReturnsAndRefundsWebElement().click();
    }

    public void helpWithDigitalServicesAndDeviceSupport() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithDigitalServicesAndDeviceSupportWebElement().click();
    }

    public void helpWithManagePrime() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithManagePrimeWebElement().click();
    }

    public void helpWithPaymentsAndGiftCards() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithPaymentsAndGiftCardsWebElement().click();
    }

    public void helpWithAccountSettings() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getHelpWithAccountSettingsWebElement().click();
    }

    public void textOfWelcomeMessage() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        String text = getTextOfWelcomeMessageWebElement().getText();
        System.out.println(text);
    }

    public void textOfMessageOneAfterWelcomeMessage() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        String text = getTextOfMessageOneAfterWelcomeMessageWebElement().getText();
        System.out.println(text);
    }

    public void textOfSearchBarMessage() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        String text = getTextOfSearchBarMessageWebElement().getText();
        System.out.println(text);
    }

    public void searchForHelpInSearchBar() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        getSearchForHelpInSearchBarWebElement().sendKeys("order was not received");
        getGoButtonWebElement().click();
    }

    public void listsOfBrowseHelpTopics() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.amazonHelp();
        String text = getListsOfBrowseHelpTopicsWebElement().getText();
        System.out.println(text);
    }
}
