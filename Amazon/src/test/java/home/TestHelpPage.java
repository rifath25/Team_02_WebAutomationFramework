package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HelpPage;

public class TestHelpPage extends CommonAPI
{
    HelpPage helpPage;
    @BeforeMethod
    public void initElements()
    {
        helpPage = PageFactory.initElements(driver, HelpPage.class);
    }

    @Test
    //test case #41
    public void testHelpWithYourOrders() throws InterruptedException
    {
        helpPage.helpWithYourOrders();
    }

    @Test
    //test case #42
    public void testHelpWithReturnsAndRefunds() throws InterruptedException
    {
        helpPage.helpWithReturnsAndRefunds();
    }

    @Test
    //test case #43
    public void testHelpWithDigitalServicesAndDeviceSupport() throws InterruptedException
    {
        helpPage.helpWithDigitalServicesAndDeviceSupport();
    }

    @Test
    //test case #44
    public void testHelpWithManagePrime() throws InterruptedException
    {
        helpPage.helpWithManagePrime();
    }

    @Test
    //test case #45
    public void testHelpWithPaymentsAndGiftCards() throws InterruptedException
    {
        helpPage.helpWithPaymentsAndGiftCards();
    }

    @Test
    //test case #46
    public void testHelpWithAccountSettings() throws InterruptedException
    {
        helpPage.helpWithAccountSettings();
    }

    @Test
    //test case #47
    public void testTextOfWelcomeMessage() throws InterruptedException
    {
        helpPage.textOfWelcomeMessage();
    }

    @Test
    //test case #48
    public void testTextOfMessageOneAfterWelcomeMessage() throws InterruptedException
    {
        helpPage.textOfMessageOneAfterWelcomeMessage();
    }

    @Test
    //test case #49
    public void testTextOfSearchBarMessage() throws InterruptedException
    {
        helpPage.textOfSearchBarMessage();
    }

    @Test
    //test case #50
    public void testSearchForHelpInSearchBar() throws InterruptedException
    {
        helpPage.searchForHelpInSearchBar();
    }

    @Test
    //test case #51
    public void testListsOfBrowseHelpTopics() throws InterruptedException
    {
        helpPage.listsOfBrowseHelpTopics();
    }
}
