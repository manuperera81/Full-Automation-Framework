package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/9/2022
 */

public class InformationPage extends BaseClass {

    @FindBy(xpath = "//h2[@class = 'dynamic-checkout__title']")
    WebElement expressTitle;

    @FindBy(xpath = "//h2[@id= 'main-header']")
    WebElement InfoTitile;

    @FindBy(xpath = "//input[@placeholder = 'First name (optional)']")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder = 'Last name']")
    WebElement lastName;

    @FindBy(xpath = "//select[@placeholder = 'Country/region']")
    WebElement countryDropDown;

    @FindBy(id = "continue_button")
    WebElement continueBtn;

    @FindBy(xpath = "//h2[@id ='main-header']")
    WebElement mainTitle;

    public InformationPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void enterFirstName(String firstN){
        action.type(firstName,firstN);
    }

    public void enterLastName(String LastN){
        action.type(lastName,LastN);
    }

    public void selectCountry(String country){
        action.click(getDriver(),countryDropDown);
        action.selectByVisibleText(country,countryDropDown);
    }

    public void clickContinueButton(){
        action.click(getDriver(),continueBtn);
    }

    public String getMainTitle(){
        String mainTitleText = mainTitle.getText();
        System.out.println(mainTitleText);
        return mainTitleText;
    }

}
