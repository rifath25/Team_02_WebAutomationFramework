package style;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.MenuPage;
import pageObjects.StylePage;

public class TestStylePage extends CommonAPI {
    HomePage homePage;
    StylePage stylePage;
    MenuPage menuPage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        stylePage = PageFactory.initElements(driver, StylePage.class);
        menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.clickOnMenuButton();
        menuPage.navigateToStylePage();
    }

    @Test
    //test case #1
    public void testImgSliderIsDisplayed() {
        stylePage.imgSliderIsDisplayed();
    }
    @Test
    //test case #2
    public void testReadNewsTitle() {
        stylePage.readNewsTitle();
    }
    @Test
    //test case #3
    public void testHeadlineArticleIsDisplayed() {
        stylePage.headlineArticleIsDisplayed();
    }
    @Test
    //test case #4
    public void testCatagoryText() {
        stylePage.catagoryText();
    }
    @Test
    //test case #5
    public void testPhotographyTitleBarIsEnabled() {
        stylePage.photographyTitleBarIsEnabled();
    }
    @Test
    //test case #6
    public void testStyleOriginContentIsSelected() {
        stylePage.styleOriginContentIsSelected();
    }
    @Test
    //test case #7
    public void testReadStyleCapitalText() {
        stylePage.readStyleCapitalText();
    }
    @Test
    //test case #8
    public void testStyleCapitalTagName() {
        stylePage.styleCapitalTagName();
    }
    @Test
    //test case #9
    public void testClickOnArticle() {
        stylePage.clickOnArticle();
    }
    @Test
    //test case #10
    public void testImgDimension() {
        stylePage.imgDimension();
    }

}
