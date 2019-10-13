package search;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;


public class TestSearchPage extends CommonAPI {
    HomePage homePage;
    SearchPage searchPage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }
    @Test
    //test case #1
    public void testSearchList() throws Exception{
        searchPage.searchListAndSubmitButton();
    }
    @Test
    //test case #2
    public void testSearchListFromDB() throws Exception{
        searchPage.searchListAndSubmitButtonUsingDB();
    }

    @Test
    //test case #3
    public void testSearchItemsAndSubmitButtonFromExcelFile() throws Exception{
        searchPage.searchItemsAndSubmitButtonFromExcelFile();

    }
}
