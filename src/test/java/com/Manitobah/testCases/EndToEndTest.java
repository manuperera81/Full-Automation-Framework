package com.Manitobah.testCases;

import com.Manitobah.base.BaseTest;
import com.ShopifyStore.pageObjects.*;
import com.ShopifyStore.utility.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author manup on 6/24/2022
 */
public class EndToEndTest extends BaseTest {
    IndexPage indexPage;
    SearchResultPage searchResultPage;
    SingleProductPage singleProductPage;

    CartPage cartPage;

    InformationPage informationPage;

    @Test(groups = "Regression")
    public void searchProductTest() {
        Log.startTestCase("End to End Test");
        indexPage = new IndexPage();

        Log.info("User is going search for the new item");
        indexPage.clickOnSearchBtn();

        Log.info("Enter term for the search");
        searchResultPage = indexPage.enterSearchterm("Shoes");

        Log.info("Click on the product");
        singleProductPage = searchResultPage.clickOnProduct();

        Log.info("Select the product Size");
        singleProductPage.selectSize(11);

        Log.info("Add the product to the cart");
        cartPage=  singleProductPage.addToCart();

        Log.info("Increase item quantity by one");
        cartPage.increaseQuantity();

        Log.info("Click on Checkout");
        informationPage  = cartPage.clickCheckOut();

        String resultTitle =  informationPage.getMainTitle();
        Log.info("Get the current Page Titie");

        String actualTitle = "Contact information";

        Assert.assertEquals(resultTitle, actualTitle);

        Log.endTestCase("End End to End  Test");
    }
}
