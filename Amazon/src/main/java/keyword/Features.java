package keyword;

import common.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

import java.io.IOException;

public class Features extends CommonAPI
{
//    LoginPage logInPage = PageFactory.initElements(driver, LoginPage.class);
//    SearchPage searchPage = new SearchPage();
    public void signIn(){


    }
    public void signIn(WebDriver driver1)throws InterruptedException{

    }
    public void registration(){
        typeByCss("testuser1", "email");
        typeByCss("abcd1234", "password");
    }

    public void search(WebDriver driver1) throws InterruptedException,IOException{

    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signIn(driver1);
                break;
            case "registration  ":
                registration();
                break;
            case "search":
                search(driver1);
                break;

            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
