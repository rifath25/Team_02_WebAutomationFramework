package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class AmazonJobsPage extends CommonAPI
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @FindBy (how = How.CSS,using = "#home-search > h1")
    public static WebElement hoverOverFindJobsWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.portal-tiles > div > div > div:nth-child(1) > div > div > div.tile-btn.d-flex.justify-content-center > a")
    public static WebElement studentProgramsWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.portal-tiles > div > div > div:nth-child(2) > div > div > div.tile-btn.d-flex.justify-content-center > a")
    public static WebElement fulfillmentCenterHiringWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.portal-tiles > div > div > div:nth-child(3) > div > div > div.tile-btn.d-flex.justify-content-center > a")
    public static WebElement remoteCareerOpportunitiesWebElement;

    @FindBy (how = How.CSS,using = "#university_recruiting > div > p")
    public static WebElement detailsTextOfStudentProgramsWebElement;

    @FindBy (how = How.CSS,using = "#fulfillment_center_hiring > div > p")
    public static WebElement detailsTextOfFulfillmentCenterHiringWebElement;

    @FindBy (how = How.CSS,using = "#virtual_jobs > div > p")
    public static WebElement detailsTextOfRemoteCareerOpportunitiesWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.we-pioneer > div > div > div > div > div:nth-child(3) > div > div > a")
    public static WebElement learnMoreAboutWorkingAtAmazonWebElement;

    @FindBy (how = How.CSS,using = "#teams > div.card-body.d-sm-inline-block > h3")
    public static WebElement teamsExploreOpportunitiesWebElement;

    @FindBy (how = How.CSS,using = "#business_categories > div.card-body.d-sm-inline-block > h3")
    public static WebElement jobCategoriesExploreOpportunitiesWebElement;

    @FindBy (how = How.CSS,using = "#locations > div.card-body.d-sm-inline-block > h3")
    public static WebElement locationsExploreOpportunitiesWebElement;

    @FindBy (how = How.CLASS_NAME,using = "navbar navbar-dark navbar-neutral")
    public static WebElement isNavBarDisplayedWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.we-pioneer > div > div > div > div > div:nth-child(1) > div > h1")
    public static WebElement titleTextWebElement;

    @FindBy (how = How.CSS,using = "#homepage > div.we-pioneer > div > div > div > div > div:nth-child(2) > div > p")
    public static WebElement isDetailsOfTitleDisplayedWebElement;

    @FindBy (how = How.CSS,using = "body > div.day-one > div.footer > div.media-icons > div > div.row > div.icons")
    public static WebElement isSocialMediaIconsDisplayedWebElement;

    @FindBy (how = How.CLASS_NAME,using = "footer-links")
    public static WebElement isFooterDisplayedWebElement;

    @FindBy (how = How.CSS,using = "#home-search > div > form > div.row.nopadding.location-search-bar > div.col-12.col-md-8 > div > span")
    public static String multipleJobSearchesInSearchBarWebElement;

    @FindBy (how = How.CSS,using = "#search-button > span")
    public static String jobSearchButtonWebElement;

//----------------------------------------------------------------------------------------------------------------------------------
    public static WebElement getHoverOverFindJobsWebElement()
    {
        return hoverOverFindJobsWebElement;
    }

    public static WebElement getStudentProgramsWebElement()
    {
        return studentProgramsWebElement;
    }

    public static WebElement getFulfillmentCenterHiringWebElement()
    {
        return fulfillmentCenterHiringWebElement;
    }

    public static WebElement getRemoteCareerOpportunitiesWebElement()
    {
        return remoteCareerOpportunitiesWebElement;
    }

    public static WebElement getDetailsTextOfStudentProgramsWebElement()
    {
        return detailsTextOfStudentProgramsWebElement;
    }

    public static WebElement getDetailsTextOfFulfillmentCenterHiringWebElement()
    {
        return detailsTextOfFulfillmentCenterHiringWebElement;
    }

    public static WebElement getDetailsTextOfRemoteCareerOpportunitiesWebElement()
    {
        return detailsTextOfRemoteCareerOpportunitiesWebElement;
    }

    public static WebElement getLearnMoreAboutWorkingAtAmazonWebElement()
    {
        return learnMoreAboutWorkingAtAmazonWebElement;
    }

    public static WebElement getTeamsExploreOpportunitiesWebElement()
    {
        return teamsExploreOpportunitiesWebElement;
    }

    public static WebElement getJobCategoriesExploreOpportunitiesWebElement()
    {
        return jobCategoriesExploreOpportunitiesWebElement;
    }

    public static WebElement getLocationsExploreOpportunitiesWebElement()
    {
        return locationsExploreOpportunitiesWebElement;
    }

    public static WebElement getIsNavBarDisplayedWebElement()
    {
        return isNavBarDisplayedWebElement;
    }

    public static WebElement getTitleTextWebElement()
    {
        return titleTextWebElement;
    }

    public static WebElement getIsDetailsOfTitleDisplayedWebElement()
    {
        return isDetailsOfTitleDisplayedWebElement;
    }

    public static WebElement getIsSocialMediaIconsDisplayedWebElement()
    {
        return isSocialMediaIconsDisplayedWebElement;
    }

    public static WebElement getIsFooterDisplayedWebElement()
    {
        return isFooterDisplayedWebElement;
    }

    public static String getMultipleJobSearchesInSearchBarWebElement()
    {
        return multipleJobSearchesInSearchBarWebElement;
    }

    public static String  getJobSearchButtonWebElement()
    {
        return jobSearchButtonWebElement;
    }

    //----------------------------------------------------------------------------------------------------------------------------------

    public void hoverOverFindJobs() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        mouseHoverByCSS("#home-search > h1");
    }

    public void studentPrograms() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getStudentProgramsWebElement().click();
    }

    public void fulfillmentCenterHiring() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getFulfillmentCenterHiringWebElement().click();
    }

    public void remoteCareerOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getRemoteCareerOpportunitiesWebElement().click();
    }

    public void detailsTextOfStudentPrograms() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        System.out.println(getDetailsTextOfStudentProgramsWebElement().getText());
    }

    public void detailsTextOfFulfillmentCenterHiring() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        System.out.println(getDetailsTextOfFulfillmentCenterHiringWebElement().getText());
    }

    public void detailsTextOfRemoteCareerOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        System.out.println(getDetailsTextOfRemoteCareerOpportunitiesWebElement().getText());
    }

    public void learnMoreAboutWorkingAtAmazon() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getLearnMoreAboutWorkingAtAmazonWebElement().click();
    }

    public void teamsExploreOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getTeamsExploreOpportunitiesWebElement().click();
    }

    public void jobCategoriesExploreOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getJobCategoriesExploreOpportunitiesWebElement().click();
    }

    public void locationsExploreOpportunities() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getLocationsExploreOpportunitiesWebElement().click();
    }

    public void studentProgramsLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        studentPrograms();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void fulfillmentCenterHiringLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fulfillmentCenterHiring();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void remoteCareerOpportunitiesLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        remoteCareerOpportunities();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void teamsExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        teamsExploreOpportunities();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void jobCategoriesExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        jobCategoriesExploreOpportunities();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void locationsExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationsExploreOpportunities();
        getCurrentPageUrl();
        navigateBack();
        getCurrentPageUrl();
    }

    public void isNavBarDisplayed() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getIsNavBarDisplayedWebElement().isDisplayed();
    }

    public void titleText() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        System.out.println(getTitleTextWebElement().getText());
    }

    public void isDetailsOfTitleDisplayed() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getIsDetailsOfTitleDisplayedWebElement().isDisplayed();
    }

    public void isSocialMediaIconsDisplayed() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getIsSocialMediaIconsDisplayedWebElement().isDisplayed();
    }

    public void isFooterDisplayed() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        getIsFooterDisplayedWebElement().getText();
    }

    public void multipleJobSearchesInSearchBar() throws InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.careerOpportunities();
        typeByCss(getMultipleJobSearchesInSearchBarWebElement(),"Software Tester");
        clickOnElement(getJobSearchButtonWebElement());
        navigateBack();
        typeByCss(getMultipleJobSearchesInSearchBarWebElement(),"Software Developer");
        clickOnElement(getJobSearchButtonWebElement());
        navigateBack();
        typeByCss(getMultipleJobSearchesInSearchBarWebElement(),"Area Manager");
        clickOnElement(getJobSearchButtonWebElement());
        navigateBack();
    }
}
