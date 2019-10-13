package objectLayer;

import common.CommonAPI;
import dataSource.DataSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-right-links\"]/ul[1]/li[3]/a/span")
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"primary-navigation\"]/div[6]/form/input")
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = "//*[@id=\"primary-navigation\"]/div[6]/form/button")
    public WebElement submitButton;
    @FindBy( xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/input")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']")
            WebElement searchInputWebElement;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/button")             //(how = How.XPATH, using ="//input[@class='cnn-search__input']
            WebElement searchNewInputWebElement;

    public WebElement getSearchInputWebElement(){return searchInputWebElement;}
    public WebElement getSearchNewInputWebElement(){return searchNewInputWebElement;}
    public WebElement getSearchButton() {
        return searchButton;
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public void clickOnSearchButton() {
        getSearchButton().click();
    }
    public void searchFor(String value) {
        getSearchBox().sendKeys(value);
    }
    public void submitSearchButton() {
        getSubmitButton().click();
    }
    public void clearInput() {
        getSearchBox().clear();
    }
    public void searchBox1() {
        clickOnSearchButton();
        searchFor("Home INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchBox2() {
        clickOnSearchButton();
        searchFor("Home INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchBox3() {
        clickOnSearchButton();
        searchFor("life INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchBox4() {
        clickOnSearchButton();
        searchFor("car INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchBox5() {
        clickOnSearchButton();
        searchFor("motorcycle INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchBox6() {
        clickOnSearchButton();
        searchFor("individual INSURANCE");
        submitSearchButton();
        navigateBack();
    }
    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataSource.insertDataIntoDB();
        for (int i = 0; i < list.size(); i++) {
            clickOnSearchButton();
            searchFor(list.get(i));
            submitSearchButton();
            navigateBack();
            clickOnSearchButton();
            clearInput();
        }
    }
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            clickOnSearchButton();
            searchFor(st);
            submitSearchButton();
            navigateBack();
            clickOnSearchButton();
            clearInput();
        }
    }
//---------------------------------------------------------------------------
    public void searchItemAndKeysEnter() throws Exception{
        List<String> list = DataSource.getItemValue();
        clickOnSearchButton();
        getSearchInputWebElement().sendKeys(list.get(0), Keys.ENTER);
        for(int i=1; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            getSearchNewInputWebElement().clear();
        }
    }
    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException  {
        //Read data from Excel file using Apache POI
        List<String> list = DataSource.getItemsListFromExcel();
        clickOnSearchButton();
        getSearchInputWebElement().sendKeys(list.get(1), Keys.ENTER);
        navigateBack();
        clickOnSearchButton();
        for(int i=2; i<list.size(); i++) {
            getSearchNewInputWebElement().sendKeys(list.get(i), Keys.ENTER);
            navigateBack();
            clickOnSearchButton();
            clearInput();
        }
    }

}
