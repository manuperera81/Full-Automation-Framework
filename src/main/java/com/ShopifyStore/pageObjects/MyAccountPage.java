package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/14/2022
 */
public class MyAccountPage extends BaseClass {

    @FindBy(xpath = "//h1")
    WebElement pagetitle;

    public MyAccountPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public String getTitle(){
        String myacount = pagetitle.getText();
        return myacount;
    }

    public String getCurrentUrl(){
        String homePageUrl = getDriver().getCurrentUrl();
        return homePageUrl;
    }
}
