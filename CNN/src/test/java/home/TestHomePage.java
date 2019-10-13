package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    //test case #1
    public void testClickOnLiveTv() throws InterruptedException {
        homePage.clickOnLiveTv();
    }
    @Test
    //test case #2
    public void testClickOnEditionDropDownMenu() {
        homePage.clickOnEditionDropDownMenu();
    }
    @Test
    //test case #3
    public void testClickOnHeadlineNews() {
        homePage.clickOnHeadlineNews();
    }
    @Test
    //test case #4
    public void testClickOnSportsIcon() {
        homePage.clickOnSportsIcon();
    }
    @Test
    //test case #5
    public void testClickOnOptionIcon() {
        homePage.clickOnOptionIcon();
    }
    @Test
    //test case #6
    public void testClickOnWorldIcon() {
        homePage.clickOnWorldIcon();
    }
    @Test
    //test case #7
    public void testClickOnUSIcon() {
        homePage.clickOnUSIcon();
    }
    @Test
    //test case #8
    public void testClickOnStyleIcon() {
        homePage.clickOnStyleIcon();
    }
    @Test
    //test case #9
    public void testClickOnEntertainmentIcon() {
        homePage.clickOnEntertainmentIcon();
    }
    @Test
    //test case #10
    public void testClickOnTechIcon() {
        homePage.clickOnTechIcon();
    }
    @Test
    //test case #11
    public void testClickOnPoliticsIcon() {
        homePage.clickOnPoliticsIcon();
    }
    @Test
    //test case #12
    public void testClickOnScienceNHealthIcon() {
        homePage.clickOnScienceNHealthIcon();
    }
    @Test
    //test case #13
    public void testClickOnTravelIcon() {
        homePage.clickOnTravelIcon();
    }
    @Test
    //test case #14
    public void testClickOnWelcomeToTheFallIcon() {
        homePage.clickOnWelcomeToTheFallIcon();
    }
    @Test
    //test case #15
    public void testTopNewsList() {
        homePage.readTopNewsList();
    }
    @Test
    //test case #16
    public void testNewsAndBuzzList() {
        homePage.readNewsAndBuzzList();
    }
    @Test
    //test case #17
    public void testNavBarDisplayAbility() {
        homePage.displayAbleNavBar();
    }
    @Test
    //test case #18
    public void testTrendingNewsList() {
        homePage.readTrendingNews();
    }
    @Test
    //test case #19
    public void testCategoriesFromHeader() {
        homePage.readCategoriesFromHeader();
    }
    @Test
    //test case #20
    public void testSearchButton() {
        homePage.clickOnSearchButton();
    }
    @Test
    //test case #21
    public void testLogoIsDisplayed() {
        homePage.logoIsDisplayed();
    }
    @Test
    //test case #22
    public void testImgIsDisplayed() {
        homePage.imgIsDisplayed();
    }
    @Test
    //test case #23
    public void testClickOniFrame() {
        homePage.clickOniFrame();
    }
    @Test
    //test case #24
    public void testFooterLocation() {
        homePage.footerLocation();
    }
    @Test
    //test case #25
    public void testCopyRightText() {
        homePage.copyRightText();
    }
    @Test
    //test case #26
    public void testMouseHoverCnnVideo() {
        homePage.mouseHoverCnnVideo();
    }
    @Test
    //test case #27
    public void testCnnFlimsTagName() {
        homePage.cnnFlimsTagName();
    }
    @Test
    //test case #28
    public void testBannerIsDisplayed() {
        homePage.bannerIsDisplayed();
    }
    @Test
    //test case #29
    public void testImgSize() {
        homePage.imgSize();
    }
    @Test
    //test case #30
    public void testPaidPartnerContentList() {
        homePage.paidPartnerContentList();
    }
    @Test
    //test case #31
    public void testClickOnLendingTreePage() {
        homePage.clickOnLendingTreePage();
    }
    @Test
    //test case #32
    public void testClickOnMediaPlayerIcon() {
        homePage.clickOnMediaPlayerIcon();
    }
    @Test
    //test case #33
    public void testShoppingContentIsDisplayed() {
        homePage.shoppingContentIsDisplayed();
    }
    @Test
    //test case #34
    public void testFinanceHacksWebElement() {
        homePage.financeHacksText();
    }
    @Test
    //test case #35
    public void testLendingTreeWebpageIsDisplayed() {
        homePage.lendingTreeWebpageIsDisplayed();
    }

}
