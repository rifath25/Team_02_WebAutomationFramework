package world;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.WorldPage;

public class TestWorldPage extends CommonAPI {
    HomePage homePage;
    WorldPage worldPage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        worldPage = PageFactory.initElements(driver, WorldPage.class);
        homePage.clickOnWorldIcon();
    }
    @Test
    //test case #1
    public void testHeadlineTextIsDisplayed(){
        worldPage.headlineTextIsDisplayed();
    }
    @Test
    //test case #2
    public void testImgIsDisplayed(){
        worldPage.imgIsDisplayed();
    }
    @Test
    //test case #3
    public void testMediaCaption(){
        worldPage.mediaCaption();
    }
    @Test
    //test case #4
    public void testReadParagraphFromNews(){
        worldPage.readParagraphFromNews();
    }
    @Test
    //test case #5
    public void testPaidContendIsEnabled(){
        worldPage.paidContentIsEnabled();
    }
    @Test
    //test case #6
    public void testClickOnNewsLink(){
        worldPage.clickOnNewsLink();
    }
    @Test
    //test case #7
    public void testNavBarIsDisplayed(){
        worldPage.navBarIsDisplayed();
    }
    @Test
    //test case #8
    public void testMoreLatestStoriesContendIsEnabled(){
        worldPage.moreFromCNNIsEnabled();
    }
    @Test
    //test case #9
    public void testReadNewsListFromMoreFromCNN() {
        worldPage.readNewsListFromMoreFromCNN();
    }
    @Test
    //test case #10
    public void testReadNewsFromPaidContentList() {
        worldPage.readNewsFromPaidContentList();
    }
}
