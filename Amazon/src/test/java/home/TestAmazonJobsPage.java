package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.AmazonJobsPage;

public class TestAmazonJobsPage extends CommonAPI
{
    AmazonJobsPage amazonJobsPage;
    @BeforeMethod
    public void initElements()
    {
        amazonJobsPage = PageFactory.initElements(driver, AmazonJobsPage.class);
    }

    @Test
    //test case #52
    public void testHoverOverFindJobs() throws InterruptedException
    {
        amazonJobsPage.hoverOverFindJobs();
    }

    @Test
    //test case #53
    public void testStudentPrograms() throws InterruptedException
    {
        amazonJobsPage.studentPrograms();
    }

    @Test
    //test case #54
    public void testFulfillmentCenterHiring() throws InterruptedException
    {
        amazonJobsPage.fulfillmentCenterHiring();
    }

    @Test
    //test case #55
    public void testRemoteCareerOpportunities() throws InterruptedException
    {
        amazonJobsPage.remoteCareerOpportunities();
    }

    @Test
    //test case #56
    public void testDetailsTextOfStudentPrograms() throws InterruptedException
    {
        amazonJobsPage.detailsTextOfStudentPrograms();
    }

    @Test
    //test case #57
    public void testDetailsTextOfFulfillmentCenterHiring() throws InterruptedException
    {
        amazonJobsPage.detailsTextOfFulfillmentCenterHiring();
    }

    @Test
    //test case #58
    public void testDetailsTextOfRemoteCareerOpportunities() throws InterruptedException
    {
        amazonJobsPage.detailsTextOfRemoteCareerOpportunities();
    }

    @Test
    //test case #59
    public void testLearnMoreAboutWorkingAtAmazon() throws InterruptedException
    {
        amazonJobsPage.learnMoreAboutWorkingAtAmazon();
    }

    @Test
    //test case #60
    public void testTeamsExploreOpportunities() throws InterruptedException
    {
        amazonJobsPage.teamsExploreOpportunities();
    }

    @Test
    //test case #61
    public void testJobCategoriesExploreOpportunities() throws InterruptedException
    {
        amazonJobsPage.jobCategoriesExploreOpportunities();
    }

    @Test
    //test case #62
    public void testLocationsExploreOpportunities() throws InterruptedException
    {
        amazonJobsPage.locationsExploreOpportunities();
    }

    @Test
    //test case #63
    public void testStudentProgramsLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.studentProgramsLinkFunctionality();
    }

    @Test
    //test case #64
    public void testFulfillmentCenterHiringLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.fulfillmentCenterHiringLinkFunctionality();
    }

    @Test
    //test case #65
    public void testRemoteCareerOpportunitiesLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.remoteCareerOpportunitiesLinkFunctionality();
    }

    @Test
    //test case #66
    public void testTeamsExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.teamsExploreOpportunitiesLinkFunctionality();
    }

    @Test
    //test case #67
    public void testJobCategoriesExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.jobCategoriesExploreOpportunitiesLinkFunctionality();
    }

    @Test
    //test case #68
    public void testLocationsExploreOpportunitiesLinkFunctionality() throws InterruptedException
    {
        amazonJobsPage.locationsExploreOpportunitiesLinkFunctionality();
    }

    @Test
    //test case #69
    public void testIsNavBarDisplayed() throws InterruptedException
    {
        amazonJobsPage.isNavBarDisplayed();
    }

    @Test
    //test case #70
    public void testTitleText() throws InterruptedException
    {
        amazonJobsPage.titleText();
    }

    @Test
    //test case #71
    public void testIsDetailsOfTitleDisplayed() throws InterruptedException
    {
        amazonJobsPage.isDetailsOfTitleDisplayed();
    }

    @Test
    //test case #72
    public void testIsSocialMediaIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #73
    public void testIsFooterDisplayed() throws InterruptedException
    {
        amazonJobsPage.isFooterDisplayed();
    }

    @Test
    //test case #74
    public void testMultipleJobSearchesInSearchBar() throws InterruptedException
    {
        amazonJobsPage.multipleJobSearchesInSearchBar();
    }
    //
    @Test
    //test case #90
    public void testIsSocialMediaButtonDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #91
    public void testIsSocialMediaIconColor() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #92
    public void testIsSocialMediaHeadDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #93
    public void testIsMediaIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #94
    public void testIsMediaDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #95
    public void testIsMediaButtonIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #96
    public void testIsOrangeMediaIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #97
    public void testIsSquaredMediaDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #98
    public void testIsInstagramDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #99
    public void testIsSnapchatIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }

    @Test
    //test case #100
    public void testIsTwitterIconsDisplayed() throws InterruptedException
    {
        amazonJobsPage.isSocialMediaIconsDisplayed();
    }
}
