package objectLayer;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ReportClaimPage extends CommonAPI {


    @FindBy(css = "#account-summary")
    public static WebElement header;
    @FindBy(css = "#repotClaimFieldset > div > div:nth-child(1) > label > span:nth-child(1)")
    public static WebElement op1;
    @FindBy(css = "#repotClaimFieldset > div > div:nth-child(2) > label > span:nth-child(1)")
    public static WebElement op2;
    @FindBy(css = "#repotClaimFieldset > div > div:nth-child(3) > label")
    public static WebElement op3;
    @FindBy(css = "#repotClaimFieldset > div > div:nth-child(4) > label")
    public static WebElement op4;
    @FindBy(css = "#repotClaimFieldset > div > div:nth-child(5) > label > span:nth-child(1)")
    public static WebElement op5;
    @FindBy(css = "#alert-undefined > div > ul > li > h4")
    public static WebElement alertBox;
    public static WebElement getHeader(){
        return header;
    }
    public static WebElement getAlertBox (){
        return alertBox;
    }
    public static WebElement option1 (){
        return op1;
    }
    public static WebElement option2 (){
        return op2;
    }
    public static WebElement option3 (){
        return op3;
    }
    public static WebElement option4 (){
        return op4;
    }
    public static WebElement option5 (){
        return op5;
    }

    public static void pageUrl (){
            driver.get("https://claims.geico.com/ReportClaim/Index#/");
    }
    public boolean selectClaimOption1(){
        pageUrl();
        getCurrentPageUrl();
        option1().click();
        boolean expected = option1().isDisplayed();
        Assert.assertTrue(expected);
            return expected;
    }

    public boolean selectClaimOption2(){
        pageUrl();
        getCurrentPageUrl();
        option2().click();
        boolean expected = option2().isDisplayed();
        Assert.assertTrue(expected);
        return expected;
    }
    public boolean selectClaimOption3(){
        pageUrl();
        getCurrentPageUrl();
        option3().click();
        boolean expected = option3().isDisplayed();
        Assert.assertTrue(expected);
        return expected;
    }
    public boolean selectClaimOption4(){
        pageUrl();
        getCurrentPageUrl();
        option4().click();
        boolean expected = option4().isDisplayed();
        Assert.assertTrue(expected);
        return expected;
    }
    public boolean selectClaimOption5(){
        pageUrl();
        getCurrentPageUrl();
        option5().click();
        boolean expected = option5().isDisplayed();
        Assert.assertTrue(expected);
        return expected;
    }
    public void checkReportclaimOptionBox(){
        pageUrl();
        getCurrentPageUrl();
        option1().click();
        option2().click();
        option3().click();
        option4().click();
        option5().click();
    }
    public void checkHeader(){
        getHeader().isDisplayed();
    }
    public void reportClaimOptionGetText(){
        pageUrl();
        getCurrentPageUrl();
        List list=getTextFromWebElements("#repotClaimFieldset > div");
        System.out.println(list);
    }
    public boolean alertBoxDisplay (){
        pageUrl();
        getCurrentPageUrl();
        boolean al = getAlertBox().isDisplayed();
        getTextByCss("\"#wrapper > section:nth-child(3) > div > div > div > form > div.alert\"");
        Assert.assertTrue(al);
        return al;
    }





















}
