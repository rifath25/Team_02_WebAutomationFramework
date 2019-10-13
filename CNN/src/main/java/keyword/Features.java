package keyword;

import common.CommonAPI;
import datasource.DataSource;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;
import reporting.TestLogger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Features extends CommonAPI {
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);

    public void liveTV() throws InterruptedException {
        homePage.clickOnLiveTv();
    }
    public void dropDown(){
        homePage.clickOnEditionDropDownMenu();
    }
    public void sports(){
        homePage.clickOnSportsIcon();
    }
    public void world(){
        homePage.clickOnWorldIcon();
    }
    public void selectFeatureBySwitchCase(String featureName) throws InterruptedException {
        switch(featureName){
            case "liveTV":
                liveTV();
                break;
            case "dropDown":
                dropDown();
                break;
            case "sports":
                sports();
                break;
            case "world":
                world();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = Arrays.asList(DataSource.getDataFromExcelFileForFeaturesChoice());
        for (int i = 0; i < list.size(); i++) {
            selectFeatureBySwitchCase(list.get(i));
        }
    }

}

