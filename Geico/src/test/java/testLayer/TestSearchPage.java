package testLayer;

import common.CommonAPI;
import keyword.Features;
import objectLayer.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchPage extends CommonAPI {

    SearchPage searchPage;
    Features features = PageFactory.initElements(driver, Features.class);

    @BeforeMethod
    public void initElements() {
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void testSearchBox1(){
        searchPage.searchBox1();
    }
    @Test
    public void testSearchBox2(){
        searchPage.searchBox2();
    }
    @Test
    public void testSearchBox3(){
        searchPage.searchBox3();
    }
    @Test
    public void testSearchBox4(){
        searchPage.searchBox4();
    }
    @Test
    public void testSearchBox5(){
        searchPage.searchBox5();
    }
    @Test
    public void testSearchBox6(){
        searchPage.searchBox6();
    }
    // Data Read from Database
    @Test
    public void testSearchBoxFromDB() throws Exception{
        searchPage.searchItemsAndSubmitButton();
    }
    // Data Read from DataSource
    @Test
    public void testSearchBoxFromDataSource() throws Exception {
        searchPage.searchItems();
    }
    @Test
    public void testKeyWord() throws IOException, InterruptedException {
        features.selectFeatures(driver);
    }
    @Test
    public void search() throws Exception, IOException, SQLException, ClassNotFoundException {
        searchPage.searchItemsAndSubmitButtonFromExcelFile();

    }
}