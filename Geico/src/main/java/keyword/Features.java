package keyword;

import common.CommonAPI;
import dataSource.DataSource;
import objectLayer.LoginPage;
import objectLayer.SearchPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {
    LoginPage logInPage = PageFactory.initElements(driver, LoginPage.class);
    SearchPage searchPage = new SearchPage();
    public void signIn(){
        logInPage.loginPostive();
        }
    public void signIn2()throws InterruptedException{
        logInPage.loginNegative();
    }
    public void logo(){
        logInPage.logoLink();
    }

    public void search() throws InterruptedException,IOException{
        searchPage.getSearchInputWebElement();
    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "signIn2  ":
                signIn2();
                break;
            case "logo":
                logo();
                break;
            case "search":
                search();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        String [] testSteps = DataSource.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
