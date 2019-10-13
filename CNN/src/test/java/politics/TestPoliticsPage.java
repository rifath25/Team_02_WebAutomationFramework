package politics;

import common.CommonAPI;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import pageObjects.PoliticsPage;

public class TestPoliticsPage extends CommonAPI {
    HomePage homePage;
    MenuPage menuPage;
    PoliticsPage politicsPage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        menuPage = PageFactory.initElements(driver, MenuPage.class);
        politicsPage = PageFactory.initElements(driver, PoliticsPage.class);
    }
    @Test
    //test case #1
    public void testClickOnVideo() throws ElementNotInteractableException {
        politicsPage.clickOnVideo();
    }
    @Test
    //test case #2
    public void testHeadLineText() {
        homePage.clickOnPoliticsIcon();
        politicsPage.headLineText();
    }
    @Test
    //test case #3
    public void TestreadArticleList() {
        homePage.clickOnPoliticsIcon();
        politicsPage.readArticleList();
    }
    @Test
    //test case #4
    public void TestArticleSize() {
        homePage.clickOnPoliticsIcon();
        politicsPage.articleSize();
    }
    @Test
    //test case #5
    public void TestPoliticalContentIsDisplayed() {
        homePage.clickOnPoliticsIcon();
        politicsPage.politicalContentIsDisplayed();
    }
    @Test
    //test case #6
    public void TestMouseHoverArticle() {
        homePage.clickOnPoliticsIcon();
        politicsPage.mouseHoverArticle();
    }
    @Test
    //test case #7
    public void TestClickOnArticle() {
        homePage.clickOnPoliticsIcon();
        politicsPage.clickOnArticle();
    }
    @Test
    //test case #8
    public void TestNewsIsSelected() {
        homePage.clickOnPoliticsIcon();
        politicsPage.newsIsSelected();
    }
    @Test
    //test case #9
    public void TestListOfContent() {
        homePage.clickOnPoliticsIcon();
        politicsPage.listOfContent();
    }
    @Test
    //test case #10
    public void TestHeaderTagName() {
        homePage.clickOnPoliticsIcon();
        politicsPage.HeaderTagName();
    }
}
