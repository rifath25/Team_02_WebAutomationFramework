package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

public class MenuPage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.kkGIDQ > nav > ul > li:nth-child(8)")
    public static WebElement stylePageWebElement;

    public static WebElement getStylePageWebElement(){
        return stylePageWebElement;
    }
    public void navigateToStylePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStylePageWebElement().click();
    }
    public void clickOnMenuButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > button > svg");
    }
    public void listOfMenuFromEntertainment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List menuList=getTextFromWebElements("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.headerstyles__ExpandedContentGrid-sc-1vh4dor-5.doizbl > div > div.Box-sc-1fet97o-0.jSTOdN > nav > ul > li:nth-child(7)");
        System.out.println(menuList);
    }

}