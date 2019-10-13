package menu;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.MenuPage;

public class TestMenuPage extends CommonAPI {
    MenuPage menuPage;
    @BeforeMethod
    public void initElements() {
        menuPage = PageFactory.initElements(driver, MenuPage.class);
    }
    @Test
    //test case #1
    public void testClickOnMenuButton() {
        menuPage.clickOnMenuButton();
    }
    @Test
    //test case #2
    public void testListOfMenuFromEntertainment() {
        testClickOnMenuButton();
        menuPage.listOfMenuFromEntertainment();
    }
}
