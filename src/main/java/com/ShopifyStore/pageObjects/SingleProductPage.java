package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author manup on 5/9/2022
 */

public class SingleProductPage extends BaseClass {

    @FindBy(xpath = "//button[@type='submit'][@name='add']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//label[@class='variant__button-label']")
    List<WebElement>  sizeOfproduct;

    @FindBy(xpath = "//h1[@class='h2 product-single__title']")
    WebElement productTitle;

    public SingleProductPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void selectSize(int size){
        String sizeText = sizeOfproduct.get(0).getText();
        String[] sizeType = sizeText.split(" ");
        System.out.println(sizeText);
        String sizeGender = sizeType[0];
        String xpathWithSize  = String.format("//label[contains(text(), '%s %s')][@class='variant__button-label']",sizeGender,size);
        System.out.println(xpathWithSize);
        WebElement sizeLable = getDriver().findElement(By.xpath(xpathWithSize));
        action.click(getDriver(),sizeLable);
    }

    public CartPage addToCart(){
        action.click(getDriver(),addToCartBtn);
        return new CartPage();
    }



}
