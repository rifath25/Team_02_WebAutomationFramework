package objectLayer;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(css = "#geolocation")
    public static WebElement locationIcon;
    @FindBy(css = "#header-left-links > ul.desktop-links > li:nth-child(1) > a")
    public static WebElement InsuranceLink;
    @FindBy(css = "//*[@id=\"primary-footer\"]")
    public static WebElement footer;
    @FindBy(css = "#submitButton")
    public static WebElement startQuoteButton;
    @FindBy(css = "#header-left-links")
    public static  WebElement header;
    @FindBy(css = "#zip")
    public static WebElement zipCodeInputBox;
    @FindBy(xpath = "//*[@id=\"more\"]/span")
    public static  WebElement more;
    @FindBy(xpath = "/html/head/iframe")
    public static WebElement iframe;
    @FindBy(css = "#header-middle-links > a")
    public static WebElement logo;
    @FindBy(css = "#primary-panel > div.main-area.container > picture > img")
    public static WebElement img;
    @FindBy(css = "#section1heading")
    public static  WebElement geicoTagline;
    @FindBy (xpath = "//*[@id=\"header-left-links\"]/ul[1]/li[2]/a")
    public static WebElement informationLink;

    public static WebElement infoLink(){ return informationLink; }
    public static WebElement geoLocation(){ return locationIcon; }
    public static WebElement getFooter(){
        return footer;
    }
    public static WebElement getLine (){
        return geicoTagline;
    }
    public static WebElement getImg() {
        return img;
    }
    public static WebElement getHeader() {
        return header;
    }
    public static WebElement getLogo() { return logo; }
    public static WebElement inputZip() { return zipCodeInputBox; }
    public static WebElement getMore() {
        return more;
    }
    public void locationAlert(){
        geoLocation().click();
    }
    public static boolean checkLogo() {
        return getLogo().isDisplayed();
    }
    public void isFooterDisplayed (){
        getHeader().isDisplayed();
    }
    public void getTagline (){
        String actual = getLine().getText();
        Assert.assertEquals(actual, "More than just car insurance");
    }
    public void clickQuoteButton() {
        clickOnElement("#submitButton");
    }
    public boolean checkHeader() {
        boolean actual = getHeader().isDisplayed();
        Assert.assertEquals(actual,actual);
        return actual;
    }
    public void getDropdownMenuList() {
        System.out.println(getTextFromWebElements("#homepage_manage_select"));
    }
    public void checkURL() {
        driver.get("https://www.Geico.com/");
    }
    public void getNumberOfLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }
    public boolean CheckImg() {
        return getImg().isDisplayed();
    }
    public void getInfoLinkText() {
        System.out.println(getTextFromWebElements("#header-left-links > ul.desktop-links > li:nth-child(2) > a"));
    }
    public static WebElement getInsuranceLINK() {
        return InsuranceLink;
    }
    public void CheckInsuranceDroplistHover() {
        getInsuranceLINK().click();
        mouseHoverByXpath("//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]");
        mouseHoverByXpath("//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/a/span[2]");
        mouseHoverByXpath("//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/a");
        mouseHoverByXpath("//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/a/span[2]");
    }
    public void iframehandle() {
        getMore().click();
        iframeHandle(iframe);
    }
    public void enterZipcode() {
        inputZip().sendKeys("11432");
        clearField("\"#zip\"");
    }
    public void enterInvalidZipcode() {
        inputZip().sendKeys("adajdbb");
    }
    public void clickOnHeaderIcons() {
        clickOnElement("#  ");
        clickOnElement("#header-right-links > ul:nth-child(1) > li:nth-child(2) > a");
        clickOnElement("#header-right-links > ul:nth-child(1) > li:nth-child(3) > a > span");
    }
    public void clickonOrangeButton() {
        clickOnElement("reportExperimentBtn");
        getCurrentPageUrl();
    }
    public void getTextLoginRequired(){
        List listOfnoLoginReq = getTextFromWebElements("#accessibility-main-content > div.wrap.promotions > div > div:nth-child(1) > div > div")  ;
        System.out.println(listOfnoLoginReq);
    }
    public void getTextfromGiecoMobile(){
        List textofgeicoMobile = getTextFromWebElements("#accessibility-main-content > div.wrap.promotions > div > div:nth-child(3) > div > div > p");
        System.out.print(textofgeicoMobile);
    }
    public void getInfoDropdownList(){
            infoLink().click();
            infoLink().getText();
            List listOfInfolist = getTextFromWebElements("#primary-navigation > div.panel-wrapper.open");
      System.out.println(listOfInfolist);
    }

}