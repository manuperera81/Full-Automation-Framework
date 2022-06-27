package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * @author manup on 5/3/2022
 */

public class SearchResultPage extends BaseClass {

    @FindBy(xpath="//div[@class='grid-product__meta']")
    List<WebElement> resultProducts;

    @FindBy(xpath="//h2[@class='section-header__title']")
    WebElement resultNumber;

    @FindBy(xpath = "//a[@title='Next']")
    WebElement nextPageLink;

    public SearchResultPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public ProductPage clickOnProduct(){
        action.click(getDriver(),resultProducts.get(1));
        return new ProductPage();
    }

    public int pageOneCount() {
        int PageOnecount = resultProducts.size();
        return PageOnecount;
    }
    public int pageTwoAndBeyondCount()   {
        int NextPageItemCount = 0;

        if (nextPageLink.isDisplayed()) {
            nextPageLink.click();
            NextPageItemCount = +resultProducts.size();
        }
        return  NextPageItemCount;
    }

    public int displayResutlCount(){
        String displayNumber = resultNumber.getText();
        return Integer.parseInt(displayNumber.replaceAll("[^0-9]", ""));
    }

}
