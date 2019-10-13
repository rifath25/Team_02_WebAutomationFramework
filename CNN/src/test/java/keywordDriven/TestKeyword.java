package keywordDriven;

import common.CommonAPI;
import keyword.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyword extends CommonAPI {
    Features features= PageFactory.initElements(driver,Features.class);
    @Test
    public void TestSelectFeatureBySwitchCase() throws InterruptedException, IOException {
        features.selectFeatures();
    }
}