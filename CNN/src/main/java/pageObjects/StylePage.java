package pageObjects;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class StylePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#zone0 > div > div > div.EditorsChoice__carousel > div > div.slider-frame > ul > li:nth-child(2) > div > div > div.CardSlide__mediaWrapper")
    public static WebElement imgSliderWebElement;
    @FindBy(how = How.CSS, using = "#zone1 > div > div > div.LayoutGrid__component.LayoutGrid__isSmall > div:nth-child(2) > div > div.CardBasic__details > div:nth-child(1) > div > a")
    public static WebElement readNewsTitleWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"zone1\"]/div/div/div[2]/div/div[2]/div[1]/a")
    public static WebElement headlineArticleWebElement;
    @FindBy(how = How.CSS, using = "#zone1 > div > div > div.LayoutHeroAndSmall__lead > div > div.CardHero__details > a")
    public static WebElement catagoryWebElement;
    @FindBy(how = How.CSS, using = "#zone2 > div > div > div.sticky-outer-wrapper > div > div > span > span")
    public static WebElement photographyTitleBarWebElement;
    @FindBy(how =How.CSS, using = "#zone4 > div > div > div:nth-child(1)")
    public static WebElement styleOriginContentWebElement;
    @FindBy(how = How.CSS, using = "#zone4 > div > div > div:nth-child(2) > div > div.CardHeroDetailed__details > div > a > div.CardHeroDetailed__title")
    public static WebElement styleCapitalWebElement;
    @FindBy(how = How.CSS, using = "#zone4 > div > div > div:nth-child(2) > div > div.CardHeroDetailed__details > div > a > div.CardHeroDetailed__description")
    public static WebElement styleCapitalTagNameWebElement;
    @FindBy(how = How.CSS, using = "#zone4 > div > div > div:nth-child(3) > div > div.CardHeroDetailed__details > div > a")
    public static WebElement clickOnArticleWebElement;
    @FindBy(how = How.CSS, using = "#zone5 > div > div > div.LayoutProfilesWithHero__lead > div > div.CardHero__component.CardHero__heroProfileCard > div.CardHero__thumb > a > div > img")
    public static WebElement imgDimensionWebElement;

    public static WebElement getImgSliderWebElement(){
        return imgSliderWebElement;
    }
    public static WebElement getReadNewsTitleWebElement(){
        return readNewsTitleWebElement;
    }
    public static WebElement getHeadlineArticleWebElement(){
        return headlineArticleWebElement;
    }
    public static WebElement getCatagoryWebElement(){
        return catagoryWebElement;
    }
    public static WebElement getPhotographyTitleBarWebElement(){
        return photographyTitleBarWebElement;
    }
    public static WebElement getStyleOriginContentWebElement(){
        return styleOriginContentWebElement;
    }
    public static WebElement getStyleCapitalWebElement(){
        return styleCapitalWebElement;
    }
    public static WebElement getStyleCapitalTagNameWebElement(){
        return styleCapitalTagNameWebElement;
    }
    public static WebElement getClickOnArticleWebElement(){
        return clickOnArticleWebElement;
    }
    public static WebElement getImgDimensionWebElement(){
        return imgDimensionWebElement;
    }
    public void imgSliderIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImgSliderWebElement().isDisplayed();
    }
    public void readNewsTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String newsTitle=getReadNewsTitleWebElement().getText();
        System.out.println(newsTitle);
    }
    public void headlineArticleIsDisplayed(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getHeadlineArticleWebElement().isDisplayed();
    }
    public void catagoryText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text= getCatagoryWebElement().getText();
        System.out.println(text);
    }
    public void photographyTitleBarIsEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPhotographyTitleBarWebElement().isEnabled();
    }
    public void styleOriginContentIsSelected(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getStyleOriginContentWebElement().isSelected();
    }
    public void readStyleCapitalText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String text=getStyleCapitalWebElement().getText();
        System.out.println(text);
    }
    public void styleCapitalTagName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String tagName= getStyleCapitalTagNameWebElement().getTagName();
        System.out.println(tagName);
    }
    public void clickOnArticle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnArticleWebElement().click();
    }
    public void imgDimension(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Dimension dimension=getImgDimensionWebElement().getSize();
        System.out.println(dimension);
    }

}
