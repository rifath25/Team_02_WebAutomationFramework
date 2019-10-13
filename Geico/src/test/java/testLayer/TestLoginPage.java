package testLayer;

import common.CommonAPI;
import objectLayer.ClaimCenterPage;
import objectLayer.HomePage;
import objectLayer.LoginPage;
import objectLayer.ReportClaimPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLoginPage extends CommonAPI {

    LoginPage login;
    HomePage home;
    ReportClaimPage report;
    ClaimCenterPage claim ;

    @BeforeMethod
     public void init(){
        claim = PageFactory.initElements(driver, ClaimCenterPage.class);
        login = PageFactory.initElements(driver, LoginPage.class);
        home = PageFactory.initElements(driver, HomePage.class);
        report  = PageFactory.initElements(driver, ReportClaimPage.class);
    }
    @Test
    public void checkLoginPostive() {
        login.loginPostive();
    }
    @Test
    public void checkLoginNegetive() {
        login.loginNegative();
    }

    @Test
    public void loginOnlypass() {

        login.loginOnlyPass();
    }
    @Test
    public void loginOnlyemail() {
        login.loginOnlyEmail();
    }
    @Test
    public void numberOflinkInpage() {
        home.getNumberOfLinks();
    }
    @Test
    public void checklogolink() {
        login.logoLink();
    }
    @Test
    public void checkIfImgDisplayed() {
        login.checkImg();
    }
    @Test
    public void loginWithOnlyCorrectEMAIL (){
        login.loginOnlyWrongPass();
    }
    @Test
    public void loginWithOnlyCorrectPass (){
        login.loginOnlyWrongEmail();
    }
    @Test
    public void testCheckHeader(){
        report.checkHeader();
    }
    @Test
    public void TestgetListOfFooter(){
        TestLogger.log(getClass().getSimpleName() + ": checking list of footer section " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        claim.getListOfFooter();
    }
}
