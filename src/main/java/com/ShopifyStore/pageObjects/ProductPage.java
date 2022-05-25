package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author manup on 5/9/2022
 */

public class ProductPage extends BaseClass {

    @FindBy(xpath = "//button[@type='submit'][@name='add']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//input[@type='radio'][@data-index='option2']")
    List<WebElement>  size;

    @FindBy(xpath = "//h1[@class='h2 product-single__title']")
    WebElement productTitle;

    public ProductPage(){
        PageFactory.initElements(getDriver(),this);
    }
    public void selectSize(){
        action.click(getDriver(),size.get(0));
    }

    public void addToCart(){
        action.click(getDriver(),addToCartBtn);
    }



}
