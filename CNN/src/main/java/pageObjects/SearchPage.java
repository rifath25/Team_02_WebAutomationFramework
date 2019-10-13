package pageObjects;

import common.CommonAPI;
import datasource.DataSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import java.util.List;

public class SearchPage extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @FindBy(how = How.ID, using = "header-search-bar")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using = "#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.headerstyles__ExpandedContentGrid-sc-1vh4dor-5.doizbl > div > div.Box-sc-1fet97o-0.iKQPmQ > form > button")
    public static WebElement submitSearchButton;
    @FindBy(how = How.CLASS_NAME, using = "cnn-search__clear")
    public static WebElement clearInputWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public static WebElement getSubmitSearchButton() {
        return submitSearchButton;
    }
    public static WebElement getClearInputWebElement(){
        return clearInputWebElement;
    }
    public void searchFor(String value) {
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton() {
        getSubmitSearchButton().click();
    }
    public void clearInput(){
        getClearInputWebElement().click();
    }
    public void searchListAndSubmitButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            homePage.clickOnSearchButton();
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
            navigateBack();
        }
    }
    public void searchListAndSubmitButtonUsingDB() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.insertDataIntoDB();
        for (int i = 0; i < list.size(); i++) {
            homePage.clickOnSearchButton();
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
            navigateBack();
        }
    }
    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //Read data from Excel file using Apache POI
        List<String> list = DataSource.getItemsListFromExcel();
        for (int i = 0; i < list.size(); i++) {
            homePage.clickOnSearchButton();
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
            navigateBack();
        }
    }
}

