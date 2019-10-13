package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class TestHomePage extends CommonAPI
{
    HomePage homePage;
    @BeforeMethod
    public void initElements()
    {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    //test case #1
    public void testNavigateToCart()
    {
        homePage.navigateToCart();
    }

    @Test
    //test case #2
    public void testSignInButton()
    {
        homePage.clickableSignInButton();
    }

    @Test
    //test case #3
    public void testPositiveSignIn() throws InterruptedException
    {
        homePage.positiveSignIn();
    }

    @Test
    //test case #4
    public void testNegativeSignIn() throws InterruptedException
    {
        homePage.negativeSignIn();
    }

    @Test
    //test case #5
    public void testSearchItem() throws InterruptedException {
        homePage.searchItem();
    }

    @Test
    //test case #6
    public void testAmazonPrime() throws InterruptedException {
        homePage.amazonPrime();
    }

    @Test
    //test case #7
    public void testAmazonMusic() throws InterruptedException
    {
        homePage.amazonMusic();
    }

    @Test
    //test case #8
    public void testAmazonBusiness() throws InterruptedException
    {
        homePage.amazonBusiness();
    }

    @Test
    //test case #9
    public void testAmazonAlexa() throws InterruptedException
    {
        homePage.amazonAlexa();
    }

    @Test
    //test case #10
    public void testCarrierOpportunities() throws InterruptedException
    {
        homePage.careerOpportunities();
    }

    @Test
    //test case #11
    public void testAmazonHelp() throws InterruptedException
    {
        homePage.amazonHelp();
    }

    @Test
    //test case #12
    public void testAmazonAssistance() throws InterruptedException
    {
        homePage.amazonAssistance();
    }

    @Test
    //test case #13
    public void testAmazonInfo() throws InterruptedException
    {
        homePage.amazonInfo();
    }

    @Test
    //test case #14
    public void testSellingOnAmazon() throws InterruptedException
    {
        homePage.sellingOnAmazon();
    }

    @Test
    //test case #15
    public void testBackToTopButton() throws InterruptedException
    {
        homePage.backToTopButton();
    }

    @Test
    //test case #16
    public void testStoreCardInfoAndApply() throws InterruptedException
    {
        homePage.storeCardInfoAndApply();
    }

    @Test
    //test case #17
    public void testBusinessCardInfoAndApply() throws InterruptedException
    {
        homePage.businessCardInfoAndApply();
    }

    @Test
    //test case #18
    public void testShopWithPointsFeature() throws InterruptedException
    {
        homePage.shopWithPointsFeature();
    }

    @Test
    //test case #19
    public void testItemCategories() throws InterruptedException
    {
        homePage.itemCategories();
    }

    @Test
    //test case #20
    public void testTodaysDealsMenu() throws InterruptedException
    {
        homePage.todaysDealsMenu();
    }

    @Test
    //test case #21
    public void testCategoriesDropDownMenu()
    {
        homePage.categoriesDropDownMenu();
    }

    @Test
    //test case #22
    public void testIsNavBarDisplayed()
    {
        homePage.isNavBarDisplayed();
    }

    @Test
    //test case #23
    public void testIsHeaderDisplayed()
    {
        homePage.isHeaderDisplayed();
    }

    @Test
    //test case #24
    public void testTextOfDeliverTo()
    {
        homePage.textOfDeliverTo();
    }

    @Test
    //test case #25
    public void testAmazonCopyrightText()
    {
        homePage.amazonCopyrightText();
    }

    @Test
    //test case #26
    public void testAmazonBestSellers()
    {
        homePage.amazonBestSellers();
    }

    @Test
    //test case #27
    public void testAmazonGiftIdeas()
    {
        homePage.amazonGiftIdeas();
    }

    @Test
    //test case #28
    public void testAmazonNewReleases()
    {
        homePage.amazonNewReleases();
    }

    @Test
    //test case #29
    public void testAmazonWholeFoods()
    {
        homePage.amazonWholeFoods();
    }

    @Test
    //test case #30
    public void testListsFromAccountsAndListsDropDown()
    {
        homePage.listsFromAccountsAndListsDropDown();
    }

    @Test
    //test case #31
    public void testListCategoriesText()
    {
        homePage.listCategoriesText();
    }

    @Test
    //test case #32
    public void testSelectedNavBarWebElement()
    {
        homePage.selectedNavBar();
    }

    @Test
    //test case #33
    public void testIsPageContentsDisplayed()
    {
        homePage.isPageContentsDisplayed();
    }

    @Test
    //test case #34
    public void testCartLinkFunctionality()
    {
        homePage.cartLinkFunctionality();
    }

    @Test
    //test case #35
    public void testHelpLinkFunctionality()
    {
        homePage.helpLinkFunctionality();
    }

    @Test
    //test case #36
    public void testTextsOfGetToKnowUs()
    {
        homePage.textsOfGetToKnowUs();
    }

    @Test
    //test case #37
    public void testWholeFoodsLinkFunctionality()
    {
        homePage.wholeFoodsLinkFunctionality();
    }

    @Test
    //test case #38
    public void testTodaysDealsLinkFunctionality() throws InterruptedException
    {
        homePage.todaysDealsLinkFunctionality();
    }

    @Test
    //test case #39
    public void testAmazonNewReleasesLinkFunctionality()
    {
        homePage.amazonNewReleasesLinkFunctionality();
    }

    @Test
    //test case #40
    public void testAmazonGiftIdeasLinkFunctionality()
    {
        homePage.amazonGiftIdeasLinkFunctionality();
    }

    @Test
    //test case #78
    public void testAmazonBlog()
    {
        homePage.amazonBlog();
    }
}
