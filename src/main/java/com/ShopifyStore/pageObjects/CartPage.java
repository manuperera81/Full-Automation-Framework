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

    @FindBy(xpath = "//button[@aria-label = 'Increase item quantity by one']")
    WebElement increaseItemQuantityBtn;

    public CartPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void increaseQuantity(){
        action.click(getDriver(),increaseItemQuantityBtn);
    }
    public InformationPage clickCheckOut(){
        action.click(getDriver(),checkOutBtn);
        return new InformationPage();
    }


}
