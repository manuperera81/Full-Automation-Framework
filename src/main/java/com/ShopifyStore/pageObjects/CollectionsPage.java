package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 6/2/2022
 */
public class CollectionsPage extends BaseClass {
    @FindBy(xpath="")
    WebElement colourFilter;

    public CollectionsPage(){
        PageFactory.initElements(getDriver(),this);
    }
}
