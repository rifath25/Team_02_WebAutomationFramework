package home;

import common.CommonAPI;
import keyword.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.SearchPage;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonAPI {
    SearchPage searchPage;

    Features features = PageFactory.initElements(driver, Features.class);

    @BeforeMethod
    public void initElements()
    {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    //test case #75
    public void testSearchBox()
    {
        searchPage.searchBox();
    }

    // Data Read from Database
    @Test
    //test case #76
    public void testSearchBoxFromDB() throws Exception
    {
        searchPage.searchItemsAndSubmitButton();
    }

    // Data Read from DataSource
    @Test
    //test case #77
    public void testSearchBoxFromDataSource() throws Exception
    {
        searchPage.searchItems();
    }

    //keyDriven
    @Test
    //test case #81
    public void testKeyWord() throws IOException, InterruptedException
    {
        features.selectFeatures(driver);
    }

    //ExcelDataDriven
    @Test
    //test case #82
    public void search() throws Exception, IOException, SQLException, ClassNotFoundException
    {
        searchPage.searchItemsAndSubmitButtonFromExcelFile();
    }
}
