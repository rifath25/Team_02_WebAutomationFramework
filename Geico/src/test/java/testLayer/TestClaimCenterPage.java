package testLayer;

import common.CommonAPI;
import objectLayer.ClaimCenterPage;
import objectLayer.ReportClaimPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestClaimCenterPage extends CommonAPI {

    ClaimCenterPage claim ;
    ReportClaimPage report;
    @BeforeMethod
    public void init(){
        claim = PageFactory.initElements(driver, ClaimCenterPage.class);
        report  = PageFactory.initElements(driver, ReportClaimPage.class);
    }
    @Test
    public void checkClaimPageUrl() {
        TestLogger.log(getClass().getSimpleName() + ": checking url " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        claim.checkurl();
    }
    @Test
    public void claimPageicon1() {
        claim.clickIcon1getUrl();
    }
    @Test
    public void claimPageicon2() {
        claim.clickIcon2getUrl();
    }
    @Test
    public void claimPageicon3() {
        claim.clickIcon3getUrl();
    }
    @Test
    public void claimPageicon4() {
        claim.clickIcon4getUrl();
    }
    @Test
    public void claimPageicon5() {
        claim.clickIcon5getUrl();
    }
    @Test
    public void checkFooter(){
         claim.checkurl();
        claim.getFooter().isDisplayed();
        TestLogger.log(getClass().getSimpleName() + ": checking for FOOTER display " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
    @Test
    public void checkFooterMidSec(){
        claim.checkurl();
        claim.getFooterMidsection().isDisplayed();
        TestLogger.log(getClass().getSimpleName() + ": checking mid footer section" + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
    @Test
    public void TestgetListOfFooter(){
        TestLogger.log(getClass().getSimpleName() + ": checking list of footer section " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        claim.getListOfFooter();
    }
    @Test
    public void testCheckHeader(){
        report.checkHeader();
    }
}
