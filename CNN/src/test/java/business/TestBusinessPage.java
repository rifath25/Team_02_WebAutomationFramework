package business;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.BusinessPage;
import pageObjects.HomePage;

public class TestBusinessPage extends CommonAPI {
    HomePage homePage;
    BusinessPage businessPage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        businessPage=  PageFactory.initElements(driver, BusinessPage.class);
        businessPage.clickOnBusiness();
    }
    @Test
    //test case #1
    public void testMediaImgIsDisplayed() {
        businessPage.mediaImgIsDisplayed();
    }
    @Test
    //test case #2
    public void testHeadlineText() {
        businessPage.headlineText();
    }
    @Test
    //test case #3
    public void testContendIsDisplayed() {
        businessPage.contendIsDisplayed();
    }
    @Test
    //test case #4
    public void testContendIsEnabled() {
        businessPage.contentListIsEnabled();
    }
    @Test
    //test case #5
    public void testNewsSize() {
        businessPage.newsContententSize();
    }
    @Test
    //test case #6
    public void testClickOnVideo() {
        businessPage.clickOnVideo();
    }
    @Test
    //test case #7
    public void testSuccessContentIsDisplayed(){
        businessPage.successContentIsDisplayed();
    }
    @Test
    //test case #8
    public void testTechContentIsDisplayed(){
        businessPage.techContentIsDisplayed();
    }
    @Test
    //test case #9
    public void testMediaContentIsDisplayed(){
        businessPage.mediaContentIsDisplayed();
    }
    @Test
    //test case #10
    public void testNewsText(){
        businessPage.newsText();
    }
}
