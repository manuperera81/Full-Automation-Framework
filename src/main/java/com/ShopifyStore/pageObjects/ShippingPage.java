package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/9/2022
 */

public class ShippingPage extends BaseClass {

    @FindBy(id = "main-header")
    WebElement pageTitle;

    @FindBy(id = "continue_button")
    WebElement continueBtn;

    public ShippingPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void clickContinuePayment(){
        action.click(getDriver(),continueBtn);
    }
}
