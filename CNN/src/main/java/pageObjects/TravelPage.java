package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.security.Key;
import java.util.List;

public class TravelPage extends CommonAPI {
    @FindBy(how = How.CLASS_NAME, using = "Header__section")
    public static WebElement headerWebElement;
    @FindBy(how = How.CSS, using = "#mount > div > div.Chrome__content > div > div.Zone__component.Homepage__editorsChoice.Homepage__zone.Homepage__bleed > div > div > div > div > div.slider-frame > ul > li:nth-child(1) > div > a > div")
    public static WebElement imgSlideShowIsDisplayed;
    @FindBy(how = How.CSS, using = "#mount > div > div.Footer__component > div.Footer__wrapper.Footer__info > div.Footer__legal")
    public static WebElement footerWebElement;
    @FindBy(how = How.CSS,using = "#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__logo")
    public static WebElement headerLogoWebElement;
    @FindBy(how = How.CSS, using = "#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__navigation")
    public static WebElement headerNavigation;
    @FindBy(how = How.CSS,using = "#mount > div > div.Chrome__content > div > div.Zone__component.Homepage__editorsChoice.Homepage__zone.Homepage__bleed > div > div > div > div.slider.Carousel__overflowDecorators > div.slider-frame > ul > li:nth-child(4) > div > a > div > img")
    public static WebElement imgSizeWebElement;
    @FindBy(how = How.CSS,using = "#mount > div > div.Footer__component > div.Footer__primary > div > div.Footer__aside > div")
    public static WebElement socialBarWebElement;
    @FindBy(how = How.CSS,using = "#mount > div > div.Chrome__content > div > div.Zone__component.VideoHub__videoFilters > div > div.VideosFilters__filtersWrapper > div > div > div > div.VideosFilters__filters")
    public static WebElement videoFilterWebElement;
    public static WebElement getHeaderWebElement(){
        return headerWebElement;
    }
    public static WebElement getImgSlideShowIsDisplayed(){
        return imgSlideShowIsDisplayed;
    }
    public static WebElement getFooterWebElement(){
        return footerWebElement;
    }
    public static WebElement getHeaderLogoWebElement(){
        return headerLogoWebElement;
    }
    public static WebElement getHeaderNavigation(){
        return headerNavigation;
    }
    public static WebElement getImgSizeWebElement(){
        return imgSizeWebElement;
    }
    public static WebElement getSocialBarWebElement(){
        return socialBarWebElement;
    }
    public static WebElement getVideoFilterWebElement(){
        return videoFilterWebElement;
    }
    public void headerText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text=getHeaderWebElement().getText();
        System.out.println(text);
    }
    public void clickOnSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__navigation > div.Header__search");
    }
    public void searchInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSearchButton();
        typeOnInputBox("#mount > div > div.StickyTop__isStickyAd.StickyTop__isMenuShown > div.Header__container.Header__isShown.Header__isOverlayVisible > div.Search__component > div > div.Search__headerWrapper > div.Search__inputWrapper > input","places");
    }
    public void slideShowIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImgSlideShowIsDisplayed().isDisplayed();
    }
    public void footerText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text=getFooterWebElement().getText();
        System.out.println(text);
    }
    public void headerLogoIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHeaderLogoWebElement().isDisplayed();
    }
    public void headerNavigationIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHeaderNavigation().isEnabled();
    }
    public void imgSize() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Dimension size= getImgSizeWebElement().getSize();
        System.out.println(size);
        takeScreenShot();
    }
    public void footerLinkList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List list=getTextFromWebElements("#mount > div > div.Footer__component > div.Footer__wrapper.Footer__info > div.Footer__links");
        System.out.println(list);
    }
    public void clickOnVideoHeader() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("Header__section Header__video Header__active");
        takeScreenShot();
    }
    public void socialBarIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSocialBarWebElement().isDisplayed();
    }
    public void mouseHoverFoodNDrink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByCSS("#mount > div > div:nth-child(2) > div > div > div > div.Header__navigation > a:nth-child(2)");
    }
    public void playIconText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text =getTextByCss("#mount > div > div:nth-child(2) > div > div > div > div.Header__navigation > a:nth-child(3)");
        System.out.println(text);
    }
    public void videoFilterIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getVideoFilterWebElement().isEnabled();
    }
}

