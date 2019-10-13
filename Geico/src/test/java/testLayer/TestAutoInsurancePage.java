package testLayer;

import common.CommonAPI;
import objectLayer.AutoInsurancePage;
import objectLayer.ClaimCenterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAutoInsurancePage extends CommonAPI {
    AutoInsurancePage auto;
    ClaimCenterPage claim ;
    @BeforeMethod
    public void init(){
        auto = PageFactory.initElements(driver, AutoInsurancePage.class);
        claim = PageFactory.initElements(driver, ClaimCenterPage.class);
    }

    @Test
    public void getTextpageHeading(){
        auto.autoPageURL();
        auto.getPageHeading().isDisplayed();
        auto.getPageHeading().getText();
    }
    @Test
    public void getTextPageTageline(){
        auto.autoPageURL();
        auto.getPageTageline().isDisplayed();
        auto.getPageTageline().getText();
    }
    @Test
    public void testEnterZip1(){
        auto.enterZip1();
    }
    @Test
    public void testEnterWrongZip1(){
        auto.enterWrongZip1();
    }
    @Test
    public void getTextgetWhyYouNeedCarInsurance(){
        auto.autoPageURL();
        auto.getWhyYouNeedCarInsurance().isDisplayed();
        auto.getWhyYouNeedCarInsurance().getText();
    }
    @Test
    public void getParagraphWhyYouNeedCarInsurance(){
        auto.autoPageURL();
        String p = auto.getWhyYouNeedCarInsuranceParagraph().getText();
        System.out.println(p);
    }
    @Test
    public void getblueIcon(){
    auto.getGeicoBlueIcon().isDisplayed();
    }
    @Test
    public void getPersonalizeCalculatorParagraph(){
        auto.getPersonalizedCoverageCalculator().getText();
    }
    @Test
    public void getCarInsuranceCompare(){
        auto.getCarInsuranceComparison().getText();
   }
    @Test
    public void getTextYourCarInsuranceDiscountsare(){
        auto.autoPageURL();
        auto.getYourCarInsuranceDiscountsareWaiting().isDisplayed();
        auto.getYourCarInsuranceDiscountsareWaiting().getText();
    }
    @Test
    public void getParagraphYourCarInsuranceDiscountsare(){
        auto.autoPageURL();
        auto.getYourCarInsuranceDiscountsareWaiting().isDisplayed();
        auto.getYourCarInsuranceDiscountsareWaiting().getText();
    }
    @Test
    public void testEnterZip2(){
        auto.enterZip1();
    }
    @Test
    public void testEnterWrongZip2(){
        auto.enterWrongZip1();
    }
    @Test
    public void testDiscountBox1(){
        auto.discountBox1();
    }
    @Test
    public void testDiscountBox2(){
        auto.discountBox2();
    }
    @Test
    public void testDiscountBox3(){
        auto.discountBox3();
    }
    @Test
    public void testDiscountBox4(){
        auto.discountBox4();
    }
    @Test
    public void testDiscountBox5(){
        auto.discountBox5();
    }
    @Test
    public void testDiscountBox6(){

        auto.discountBox6();
    }
    @Test
    public void getTextYourCarInsuranceDiscountsWaiting(){
        auto.autoPageURL();
        String s = auto.getServiceforWhenYouNeedUs().getText();
        System.out.println(s);
    }
    @Test
    public void getTextServiceforWhenYouNeedUsParagraph(){
        auto.autoPageURL();
        String s = auto.getServiceforWhenYouNeedUsParagraph().getText();
        System.out.println(s);
    }
    @Test
    public void checkSatisfactionIconA(){
     auto.testSatisfactionIconA();
    }
    @Test
    public void checkInsuranceYourWayIconB(){
       auto.testInsuranceYourWayIconB();
    }
    @Test
    public void checkLocalInsuranceAgentsIconC(){
        auto.testLocalInsuranceAgentsIconC();
    }
    @Test
    public void testsatisfactionSection(){
        auto.checkSatisfactionSection();
    }
    @Test
    public void testCarInsuranceYourWay(){
        auto.checkCarInsuranceYourWay();
    }
    @Test
    public void testlocalInsuranceAgents(){
        auto.checklocalInsuranceAgents();
    }
    @Test
    public void reviewTitleDisplay(){
        auto.autoPageURL();
        auto.getInsuranceReviews().isDisplayed();
    }
    @Test
    public void getTextreviewSecTitle(){
        auto.autoPageURL();
        auto.getInsuranceReviews().getText();
    }
    @Test
    public void reviewSectionDisplay(){
        auto.autoPageURL();
        auto.getReviewSection().isDisplayed();
    }
    @Test
    public void testReviewA(){
        auto.autoPageURL();
        auto.checkReviewA();

    }
    @Test
    public void testReviewB(){
        auto.autoPageURL();
        auto.checkReviewB();
    }
    @Test
    public void testReviewC(){
        auto.autoPageURL();
        auto.checkReviewC();
    }
    @Test
    public void testReviewD(){
        auto.autoPageURL();
        auto.checkReviewD();
    }
    @Test
    public void testReviewE(){
        auto.autoPageURL();
        auto.checkReviewE();
    }
    @Test
    public void testReviewF(){
        auto.autoPageURL();
        auto.checkReviewF();
    }
    @Test
    public void testReviewG(){
        auto.autoPageURL();
        auto.checkReviewF();
    }
    @Test
    public void testReviewH(){
        auto.autoPageURL();
        auto.checkReviewF();
    }
    @Test
    public void testReviewI(){
        auto.autoPageURL();
        auto.checkReviewF();
    }
    @Test
    public void testReviewJ(){
        auto.autoPageURL();
        auto.checkReviewF();
    }

}
