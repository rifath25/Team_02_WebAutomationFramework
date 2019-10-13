package travel;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.TravelPage;

import java.io.IOException;

public class TestTravelPage extends CommonAPI {
    HomePage homePage;
    TravelPage travelPage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        travelPage = PageFactory.initElements(driver, TravelPage.class);
        homePage.clickOnTravelIcon();
    }
    @Test
    //test case #1
    public void testHeaderText(){
        travelPage.headerText();
    }
    @Test
    //test case #2
    public void testSearchInput(){
        travelPage.searchInput();
    }
    @Test
    //test case #3
    public void testSlideShowIsDisplayed(){
        travelPage.slideShowIsDisplayed();
    }
    @Test
    //test case #4
    public void testFooterText(){
        travelPage.footerText();
    }
    @Test
    //test case #5
    public void testHeaderLogoIsDisplayed(){
        travelPage.headerLogoIsDisplayed();
    }
    @Test
    //test case #6
    public void testHeaderNavigationIsEnabled(){
        travelPage.headerNavigationIsEnabled();
    }
    @Test
    //test case #7
    public void testImgSize() throws IOException {
        travelPage.imgSize();
    }
    @Test
    //test case #8
    public void testFooterLinkList(){
        travelPage.footerLinkList();
    }
    @Test
    //test case #9
    public void testClickOnVideoHeader() throws IOException{
        travelPage.clickOnVideoHeader();
    }
    @Test
    //test case #10
    public void testSocialBarIsDisplayed(){
        travelPage.socialBarIsDisplayed();
    }
    @Test
    //test case #11
    public void testMouseHoverFoodNDrink(){
        travelPage.mouseHoverFoodNDrink();
    }
    @Test
    //test case #12
    public void testPlayIconText(){
        travelPage.playIconText();
    }
    @Test
    //test case #13
    public void testVideoFilterIsEnabled(){
        travelPage.videoFilterIsEnabled();
    }

}
