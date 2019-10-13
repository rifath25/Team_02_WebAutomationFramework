package objectLayer;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(css = "//*[@id=\"header-middle-links\"]/a")
    public static WebElement logo;
    @FindBy(css = "#TextInputComponent-1")
    public static WebElement email;
    @FindBy (css = "#TextInputComponent-2")
    public static WebElement pass;
    @FindBy (css = "asd-submit-button")
    public static WebElement submit;
    @FindBy(css = "#wrapper > ng-component > div.cross-sell > div.cross-sell-image > img")
    public static WebElement img;
    public static WebElement getImg() {
        return img;
    }
    public boolean checkImg()
    {
        return getImg().isDisplayed();
    }
    public void loginPageURl()
    {
        driver.get("https://ecams.geico.com/login");
    }
    public void loginPostive (){
        loginPageURl();
        email.sendKeys("tsbristy@gmail.com");
        pass.sendKeys("08568");
        submit.click();
    }
    public void loginNegative (){
        loginPageURl();
        email.sendKeys("tsbristy1@gmail.com");
        pass.sendKeys("hulk");
        submit.click();
    }
    public void loginOnlyEmail (){
        loginPageURl();
        email.sendKeys("tsbristy@gmail.com");
        submit.click();
    }
    public void loginOnlyPass (){
        loginPageURl();
        pass.sendKeys("0983");
        submit.click();
    }
    public void logoLink (){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        loginPageURl();
        home.getLogo().click();
    }
    public void loginOnlyWrongEmail (){
        loginPageURl();
        email.sendKeys("tsbristy1@gmail.com");
        pass.sendKeys("08568");
        submit.click();
    }
    public void loginOnlyWrongPass (){
        loginPageURl();
        email.sendKeys("tsbristy@gmail.com");
        pass.sendKeys("HULK89");
        submit.click();

    }
}
