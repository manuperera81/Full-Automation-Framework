package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author manup on 5/9/2022
 */
public class CartPage extends BaseClass {

    @FindBy(xpath = " //div[@class='cart__item-title']")
    List <WebElement> cartItemTitle;

    @FindBy(name = "checkout")
    WebElement checkOutBtn;

    public CartPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void clickCheckOut(){
        action.click(getDriver(),checkOutBtn);
    }


}
