package testLayer;

import common.CommonAPI;
import objectLayer.HomePage;
import objectLayer.ReportClaimPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage home;
    ReportClaimPage report;

    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(driver, HomePage.class);
        report  = PageFactory.initElements(driver, ReportClaimPage.class);
    }
    @Test
    public void checkHomepageUrl() {
        home.checkURL();
        System.out.println(getCurrentPageUrl());
    }
    @Test
    public void checkQuotebutton() {
        home.clickQuoteButton();
        getCurrentPageUrl();
    }
    @Test
    public void checkHeaderDisplay() {
        home.checkHeader();
    }
    @Test
    public void printdropdownlist() {
        home.getDropdownMenuList();
    }
    @Test
    public void checkNumberOflinks() {
        home.getNumberOfLinks();
    }
    @Test
    public void checkInfolink() {
        home.getInfoLinkText();
    }
    @Test
    public void checkLogoDisplay() {
        home.checkLogo();
    }
    @Test
    public void hoverInsuraceDropdown() throws InterruptedException {
        sleepFor(10);
        home.CheckInsuranceDroplistHover();
    }
    @Test
    public void handleIframe() throws InterruptedException {
        home.iframehandle();
    }
    @Test
    public void inputZipcode() {
        home.enterZipcode();
    }
    @Test
    public void checkWrongzip() {
        home.enterInvalidZipcode();
    }
    @Test
    public void checkTagline() {
        home.getTagline();
    }
    @Test
    public void checkHeaderIcons() {
        home.clickOnHeaderIcons();
    }
    @Test
    public void checkReportButton() {
        home.clickonOrangeButton();
    }
    @Test
    public void getTextGiecoMoblie() {
        home.getTextfromGiecoMobile();
    }
    @Test
    public void textLoginRequired(){
        home.getTextLoginRequired();
    }
    @Test
    public void footerDisplay(){
        home.isFooterDisplayed();
    }
    @Test public void getInfoDropdownText () {
        home.getInfoDropdownList();
    }
    @Test public void locationAlertHandle () {
        home.locationAlert();
    }
    @Test
    public void testCheckHeader(){
        report.checkHeader();
    }
}