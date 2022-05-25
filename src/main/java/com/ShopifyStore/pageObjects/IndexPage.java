package com.ShopifyStore.pageObjects;

import com.ShopifyStore.actionDriver.Action;
import com.ShopifyStore.actionDriver.ActionInterface;
import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IndexPage extends BaseClass {

    ActionInterface action = new Action();

    @FindBy(xpath = "//a[contains(@class,'site-nav__link site-nav__link--icon small--hide')] |//svg")
    private WebElement signInBtn;

    @FindBy(xpath = "//img[@class ='small--hide']")
    private WebElement ManitobahLogo;

    @FindBy(xpath = "//a[contains(@class,'site-nav__link site-nav__link--icon js-search-header')] |//svg")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@id='ispbxii_0']")
    WebElement searchfield;

    @FindBy(xpath = "//img[@alt = 'Manitobah Mukluks USA'][@class = 'small--hide']")
    private WebElement storeLogo;

    @FindBy(xpath= "//title")
    WebElement headtitle;


    public IndexPage() {
        PageFactory.initElements(getDriver(),this);
    }

    public LoginPage clickOnSignin(){
        action.click(getDriver(),signInBtn);
        return new LoginPage();
    }



    public boolean validateLogo() {
        return action.isDisplayed(getDriver(),storeLogo);
    }

    public String getPageTitle(){
        String title = headtitle.getText();
        return title;
    }

    public String getCurrentUrl(){
        String homePageUrl = getDriver().getCurrentUrl();
        return homePageUrl;
    }

    public void clickOnSearchBtn(){
        action.click(getDriver(),searchBtn);
    }

    public SearchResultPage enterSearchterm(String searchKeyWord){
        action.type(searchfield,searchKeyWord);
        action.enter(searchfield);
        return new SearchResultPage();
    }

}
