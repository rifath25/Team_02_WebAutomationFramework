package perspective;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.BusinessPage;
import pageObjects.HomePage;
import pageObjects.PerspectivePage;

public class TestPerspectivePage extends CommonAPI {
    HomePage homePage;
    PerspectivePage perspectivePage;
    BusinessPage businessPage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        perspectivePage=  PageFactory.initElements(driver, PerspectivePage.class);
        businessPage=  PageFactory.initElements(driver, BusinessPage.class);
        businessPage.clickOnBusiness();
        perspectivePage.clickOnPerspective();
    }
    @Test
    //test case #1
    public void testMediaImgIsDisplayed() {
        perspectivePage.imgIsDisplayed();
    }
    @Test
    //test case #2
    public void testClickOnSlideButton() {
        perspectivePage.clickOnSlideButton();
    }
    @Test
    //test case #3
    public void testClickOnDropDownButton() {
        perspectivePage.clickOnDropDownButton();
    }
    @Test
    //test case #4
    public void testGetHeadlineText() {
        perspectivePage.getHeadlineText();
    }
    @Test
    //test case #5
    public void testNavBarIsDisplayed() {
        perspectivePage.navBarIsDisplayed();
    }
    @Test
    //test case #6
    public void testClickOnHeadlineText() {
        perspectivePage.clickOnHeadlineText();
    }
    @Test
    //test case #6
    public void testGetNewsList() {
        perspectivePage.getNewsList();
    }
    @Test
    //test case #7
    public void testGetHeadlineNewsText() {
        perspectivePage.getHeadlineNewsText();
    }
}
