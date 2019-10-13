package objectLayer;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AutoInsurancePage extends CommonAPI {

    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement pageHeading;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > p:nth-child(2)")
    public static WebElement pageTageline;
    @FindBy(css = "#sales-form > p > span")
    public static WebElement zip1;
    @FindBy(css = "#submit")
    public static WebElement startQuote1;
    @FindBy(css = "#section2heading")
    public static WebElement WhyYouNeedCarInsurance;
    @FindBy(css = "#content > section:nth-child(2) > div > div.content-section > p")
    public static WebElement whyYouNeedCarInsuranceParagraph;
    @FindBy(css = "#content > section:nth-child(2) > div > div.content-section > div > div.col-lg-7 > div.col-md-4 > span")
    public static WebElement geicoBlueIcon;
    @FindBy(css = "#content > section:nth-child(2) > div > div.content-section > div > div.col-lg-7 > div.col-md-8")
    public static WebElement personalizedCoverageCalculator;
    @FindBy(css = "#content > section:nth-child(2) > div > div.content-section > div > div.col-lg-5")
    public static WebElement carInsuranceComparison;
    @FindBy(css = "#content > section:nth-child(2) > div > div.btn-center > form > input.input_zip")
    public static WebElement zip2;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement startQuote2;
    @FindBy(css = "#section3heading")
    public static WebElement yourCarInsuranceDiscountsareWaiting;
    @FindBy(css = "#content > section:nth-child(3) > div:nth-child(1)")
    public static WebElement yourCarInsuranceDiscountsareWaitingParagraph;
     @FindBy(css = "#navigational-box-vehicles > span.geico-icon.geico-icon--actionable.icon-vehicle-multi")
    public static WebElement carInsuranceDiscountsIcon1;
    @FindBy(css = "#navigational-box-vehicles > span.geico-icon.icon-chevron-link")
    public static WebElement carInsuranceDiscountsLink1;
     @FindBy(css = "#navigational-box-drivers > span.geico-icon.geico-icon--actionable.icon-profile")
    public static WebElement seniorDriverDiscountsIcon2;
    @FindBy(css = "#navigational-box-drivers > span.geico-icon.icon-chevron-link")
    public static WebElement seniorDriverDiscountsLink2;
     @FindBy(css = "#navigational-box-military > span.geico-icon.geico-icon--actionable.icon-military-personnel")
    public static WebElement militaryDiscountsIcon3;
    @FindBy(css = "#navigational-box-military > span.geico-icon.icon-chevron-link")
    public static WebElement militaryDiscountsLink3;
    @FindBy(css = "#navigational-box-federal > span.geico-icon.geico-icon--actionable.icon-federal-employee")
    public static WebElement federalEmployeesDiscountIcon4;
    @FindBy(css = "#navigational-box-federal > span.geico-icon.icon-chevron-link")
    public static WebElement federalEmployeesDiscountLink4;
    @FindBy(css = "#navigational-box-students > span.geico-icon.geico-icon--actionable.icon-resource-center")
    public static WebElement studentDriverDiscountsIcon5;
    @FindBy(css = "#navigational-box-students > span.geico-icon.icon-chevron-link")
    public static WebElement studentDriverDiscountsLink5;
    @FindBy(css = "#navigational-box-members > span.geico-icon.geico-icon--actionable.icon-geico-affiliate")
    public static WebElement MemberEmployeeDiscountsIcon6;
    @FindBy(css = "#navigational-box-members > span.geico-icon.icon-chevron-link")
    public static WebElement MemberEmployeeDiscountsLink6;
    @FindBy(css = "#section4heading")
    public static WebElement serviceforWhenYouNeedUs;
    @FindBy(css = "#content > section:nth-child(4) > div > div.content-section > p")
    public static WebElement serviceforWhenYouNeedUsParagraph;
    @FindBy(css = "#content > section:nth-child(4) > div > div.content-section > div > div:nth-child(1) > div > span")
    public static WebElement satisfactionIconA;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement InsuranceYourWayIconB;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement localInsuranceAgentsIconC;
    @FindBy(css = "#review_swiper")
    public static WebElement reviewSection;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement insuranceReviews;
    @FindBy(css = "#headline > div > div.hero-form > div.hero-panel.hero-panel--quote > div > h1")
    public static WebElement carInsuranceYourWay;
    @FindBy(css = "97% Customer Satisfaction*)")
    public static WebElement satisfactionSection;

    public static WebElement getInsuranceReviews() {
        return insuranceReviews;
    }
    public static WebElement getCarInsuranceYourWay() {
        return carInsuranceYourWay;
    }
    public static WebElement getSatisfactionSection() {
        return satisfactionSection;
    }
    public static WebElement getReviewSection() {
        return reviewSection;
    }
    public static WebElement getServiceforWhenYouNeedUs() {
        return serviceforWhenYouNeedUs;
    }

    public static WebElement getServiceforWhenYouNeedUsParagraph() {
        return serviceforWhenYouNeedUsParagraph;
    }

    public static WebElement getSatisfactionIconA() {
        return satisfactionIconA;
    }

    public static WebElement getInsuranceYourWayIconB() {
        return InsuranceYourWayIconB;
    }

    public static WebElement getLocalInsuranceAgentsIconC() {
        return localInsuranceAgentsIconC;
    }

    public static WebElement getPageHeading() {
        return pageHeading;
    }

    public static WebElement getPageTageline() {
        return pageTageline;
    }

    public static WebElement getZip1() {
        return zip1;
    }

    public static WebElement getWhyYouNeedCarInsurance() {
        return WhyYouNeedCarInsurance;
    }

    public static WebElement getWhyYouNeedCarInsuranceParagraph() {
        return whyYouNeedCarInsuranceParagraph;
    }

    public static WebElement getGeicoBlueIcon() {
        return geicoBlueIcon;
    }

    public static WebElement getPersonalizedCoverageCalculator() {
        return personalizedCoverageCalculator;
    }

    public static WebElement getCarInsuranceComparison() {
        return carInsuranceComparison;
    }

    public static WebElement getZip2() {
        return zip2;
    }

    public static WebElement getStartQuote1() {
        return startQuote1;
    }

    public static WebElement getStartQuote2() {
        return startQuote2;
    }

    public static WebElement getYourCarInsuranceDiscountsareWaiting() {
        return yourCarInsuranceDiscountsareWaiting;
    }

    public static WebElement getYourCarInsuranceDiscountsareWaitingParagraph() {
        return yourCarInsuranceDiscountsareWaitingParagraph;
    }

    public static WebElement getCarInsuranceDiscountsIcon1() {
        return carInsuranceDiscountsIcon1;
    }

    public static WebElement getCarInsuranceDiscountsLink1() {
        return carInsuranceDiscountsLink1;
    }

    public static WebElement getSeniorDriverDiscountsIcon2() {
        return seniorDriverDiscountsIcon2;
    }

    public static WebElement getSeniorDriverDiscountsLink2() {
        return seniorDriverDiscountsLink2;
    }

    public static WebElement getMilitaryDiscountsIcon3() {
        return militaryDiscountsIcon3;
    }

    public static WebElement getMilitaryDiscountsLink3() {
        return militaryDiscountsLink3;
    }

    public static WebElement getFederalEmployeesDiscountIcon4() {
        return federalEmployeesDiscountIcon4;
    }

    public static WebElement getFederalEmployeesDiscountLink4() {
        return federalEmployeesDiscountLink4;
    }

    public static WebElement getStudentDriverDiscountsIcon5() {
        return studentDriverDiscountsIcon5;
    }

    public static WebElement getStudentDriverDiscountsLink5() {
        return studentDriverDiscountsLink5;
    }

    public static WebElement getMemberEmployeeDiscountsIcon6() {
        return MemberEmployeeDiscountsIcon6;
    }

    public static WebElement getMemberEmployeeDiscountsLink6() {
        return MemberEmployeeDiscountsLink6;
    }

    public void autoPageURL(){
        driver.get("https://www.geico.com/auto-insurance/");
    }
//    ---------------------------------------------------------------
    public void enterZip1(){
        autoPageURL();
        getZip1().sendKeys("11432");
        getStartQuote1().click();
        getCurrentPageUrl();
        navigateBack();
    }
    public void enterWrongZip1(){
        autoPageURL();
        getZip1().sendKeys("abc11");
        getStartQuote1().click();
        getCurrentPageUrl();
        navigateBack();
    }
    public void enterZip2(){
        autoPageURL();
        getZip2().sendKeys("11432");
        getStartQuote2().click();
        getCurrentPageUrl();
        navigateBack();
    }
    public void enterWrongZip2(){
        autoPageURL();
        getZip2().sendKeys("abc11");
        getStartQuote2().click();
        getCurrentPageUrl();
        navigateBack();
    }
    public void discountBox1(){
        autoPageURL();
        getCarInsuranceDiscountsIcon1().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-vehicles > a");
        System.out.println(x);
        getCarInsuranceDiscountsLink1().click();
        String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public void discountBox2(){
        autoPageURL();
        getSeniorDriverDiscountsIcon2().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-drivers > a > div > div");
        System.out.println(x);
        getSeniorDriverDiscountsLink2().click();
        String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public void discountBox3(){
        autoPageURL();
        getMilitaryDiscountsIcon3().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-military > a");
        System.out.println(x);
        getMilitaryDiscountsLink3().click();
       String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public void discountBox4(){
        autoPageURL();
        getFederalEmployeesDiscountIcon4().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-federal > a > div > div");
        System.out.println(x);
        getMilitaryDiscountsLink3().click();
        String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public void discountBox5(){
        autoPageURL();
        getStudentDriverDiscountsIcon5().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-students > a > div > div");
        System.out.println(x);
        getStudentDriverDiscountsLink5().click();
        String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public void discountBox6(){
        autoPageURL();
        getMemberEmployeeDiscountsIcon6().isDisplayed();
        List x  = getTextFromWebElements("#navigational-box-members > a > div > div");
        System.out.println(x);
        getMemberEmployeeDiscountsLink6().click();
        String l = getCurrentPageUrl();
        System.out.println(l);
    }
    public Boolean testSatisfactionIconA(){
        autoPageURL();
       Boolean a = getSatisfactionIconA().isDisplayed();
        Assert.assertTrue(a);
        return a;
    }
    public Boolean testInsuranceYourWayIconB(){
        autoPageURL();
        Boolean a = getInsuranceYourWayIconB().isDisplayed();
        Assert.assertTrue(a);
        return a;
    }
    public Boolean testLocalInsuranceAgentsIconC(){
        autoPageURL();
        Boolean a = getLocalInsuranceAgentsIconC().isDisplayed();
        Assert.assertTrue(a);
        return a;
    }
    public void checkSatisfactionSection(){
        autoPageURL();
        testSatisfactionIconA();
        List l = getTextFromWebElements("#content > section:nth-child(4) > div > div.content-section > div > div:nth-child(1)");
        System.out.println(l);
    }
    public void checkCarInsuranceYourWay(){
        autoPageURL();
        testInsuranceYourWayIconB();
        List l = getTextFromWebElements("#content > section:nth-child(4) > div > div.content-section > div > div:nth-child(2)");
        System.out.println(l);
    }
    public void checklocalInsuranceAgents(){
        autoPageURL();
        testLocalInsuranceAgentsIconC();
        List l = getTextFromWebElements("#content > section:nth-child(4) > div > div.content-section > div > div:nth-child(3)");
        System.out.println(l);
    }
    public void checkReviewA(){
        List l = getTextFromWebElements("#review_data > div:nth-child(1) > div:nth-child(1)");
        System.out.println(l);
    }
    public void checkReviewB(){
        List l = getTextFromWebElements("#review_data > div:nth-child(1) > div.split.quote.review-mobile-hide");
        System.out.println(l);
    }
    public void checkReviewC(){
        List l = getTextFromWebElements("#review_data > div:nth-child(2) > div:nth-child(1)");
        System.out.println(l);
    }
    public void checkReviewD(){
        List l = getTextFromWebElements("#review_data > div:nth-child(2) > div.split.quote.review-mobile-hide");
        System.out.println(l);
    }
    public void checkReviewE(){
        List l = getTextFromWebElements("#review_data > div:nth-child(3) > div:nth-child(1)");
        System.out.println(l);
    }
    public void checkReviewF(){
        List l = getTextFromWebElements("#review_data > div:nth-child(3) > div.split.quote.review-mobile-hide");
        System.out.println(l);
    }
}
