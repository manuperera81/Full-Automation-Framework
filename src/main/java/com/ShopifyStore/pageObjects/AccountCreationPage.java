package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/3/2022
 */
public class AccountCreationPage extends BaseClass {

    @FindBy(xpath = "//h1[@class='section-header__title']")
    WebElement formTitle;

    public AccountCreationPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void clickCreateAccountButton(){
    }

}
