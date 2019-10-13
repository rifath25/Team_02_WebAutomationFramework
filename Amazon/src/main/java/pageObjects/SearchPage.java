package pageObjects;

import common.CommonAPI;
import dataSource.DataSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = "#nav-search > form > div.nav-right > div > input")
    public WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public void clickOnSearchButton() {
        getSearchButton().click();
    }

    public void searchFor(String value) {
        getSearchBox().sendKeys(value);
    }

    public void clearInput() {
        getSearchBox().clear();
    }

    public void searchBox()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSearchButton();
        searchFor("Sneakers");
        clickOnSearchButton();
        navigateBack();

    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.insertDataIntoDB();
        for (int i = 0; i < list.size(); i++) {
            searchFor(list.get(i));
            clickOnSearchButton();
            navigateBack();
            clearInput();
        }

    }

    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchFor(st);
            clickOnSearchButton();
            navigateBack();
            clearInput();
            //validate items
        }
    }

    //-------------------------------------------------------------------------------------------------

    @FindBy(css = "#twotabsearchtextbox")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']")
            WebElement searchInputWebElement;

    @FindBy(css = "#nav-search > form > div.nav-right > div > input")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']
            WebElement searchNewInputWebElement;

    public WebElement getSearchInputWebElement(){return searchInputWebElement;}
    public WebElement getSearchNewInputWebElement(){return searchNewInputWebElement;}


    public void searchItemAndKeysEnter() throws Exception{
        List<String> list = DataSource.getItemValue();
        clickOnSearchButton();
        getSearchInputWebElement().sendKeys(list.get(0), Keys.ENTER);
        for(int i=1; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            getSearchNewInputWebElement().clear();
            //getSearchNewInputWebElement().sendKeys("sports", Keys.ENTER);
        }

    }
    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException
    {
        //Read data from Excel file using Apache POI
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.getItemsListFromExcel();
        clickOnSearchButton();
        getSearchInputWebElement().sendKeys(list.get(1), Keys.ENTER);
        navigateBack();
        clearInput();
        clickOnSearchButton();
        for(int i=2; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            navigateBack();
            clickOnSearchButton();
            clearInput();
        }
    }
}

