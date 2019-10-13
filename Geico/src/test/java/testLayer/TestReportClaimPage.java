package testLayer;

import common.CommonAPI;
import objectLayer.ClaimCenterPage;
import objectLayer.ReportClaimPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestReportClaimPage extends CommonAPI {


    ReportClaimPage report;
    ClaimCenterPage claim;

    @BeforeMethod
    public void init(){
        claim = PageFactory.initElements(driver, ClaimCenterPage.class);
        report  = PageFactory.initElements(driver, ReportClaimPage.class);
    }
    @Test
    public void selectOp1(){
        report.selectClaimOption1();
 }
    @Test
    public void selectOp2(){
        report.selectClaimOption2();
    }
    @Test
    public void selectOp3(){
        report.selectClaimOption3();
    }
    @Test
    public void selectOp4(){
        report.selectClaimOption4();
    }
    @Test
    public void selectOp5(){
        report.selectClaimOption5();
    }
    @Test
    public void getReportClaimListText(){
           report.reportClaimOptionGetText();
    }
    @Test
    public void chekAllClaimOptions(){
        report.checkReportclaimOptionBox();
    }
    @Test
    public void alertBoxisDisplayed(){
        report.alertBoxDisplay();
    }
    @Test
    public void testCheckHeader(){
        report.checkHeader();
    }
    @Test
    public void testGetListOfFooter(){
        TestLogger.log(getClass().getSimpleName() + ": checking list of footer section " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        claim.getListOfFooter();
    }
}
