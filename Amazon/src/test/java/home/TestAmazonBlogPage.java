package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.AmazonBlogPage;

public class TestAmazonBlogPage extends CommonAPI
{
    AmazonBlogPage amazonBlogPage;
    @BeforeMethod
    public void initElements()
    {
        amazonBlogPage = PageFactory.initElements(driver, AmazonBlogPage.class);
    }

    @Test
    //test case #79
    public void testCurrentDateAndDayText()
    {
        amazonBlogPage.currentDateAndDayText();
    }

    @Test
    //test case #80
    public void testIsHeaderDisplayed()
    {
        amazonBlogPage.isHeaderDisplayed();
    }

    @Test
    //test case #83
    public void testSitStayPlay()
    {
        amazonBlogPage.sitStayPlay();
    }

    @Test
    //test case #84
    public void testDropDownThreeDotButtonIcon()
    {
        amazonBlogPage.dropDownThreeDotButtonIcon();
    }

    @Test
    //test case #85
    public void testTextOfFirstHeading()
    {
        amazonBlogPage.textOfFirstHeading();
    }

    @Test
    //test case #86
    public void testContinueReadingBuildingHomeWithHeart()
    {
        amazonBlogPage.continueReadingBuildingHomeWithHeart();
    }

    @Test
    //test case #87
    public void testContinueReadingAlexaHola()
    {
        amazonBlogPage.continueReadingAlexaHola();
    }

    @Test
    //test case #88
    public void testHeaderDropDownMenu()
    {
        amazonBlogPage.headerDropDownMenu();
    }

    @Test
    //test case #89
    public void testHoverOverAboutAmazonLogo()
    {
        amazonBlogPage.hoverOverAboutAmazonLogo();
    }

    @Test
    //test case #90
    public void testOutForDeliverySignUp()
    {
        amazonBlogPage.outForDeliverySignUp();
    }
}
