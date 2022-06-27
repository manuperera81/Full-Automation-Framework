package com.Manitobah.testCases;

import com.Manitobah.base.BaseTest;
import com.ShopifyStore.pageObjects.IndexPage;
import com.ShopifyStore.pageObjects.SearchResultPage;
import com.ShopifyStore.utility.Log;
import org.testng.annotations.Test;

/**
 * @author manup on 6/24/2022
 */
public class EndToEndTest extends BaseTest {
    IndexPage indexPage;
    SearchResultPage searchResultPage;

    @Test(groups = "Regression")
    public void searchProductTest() {
        Log.startTestCase("Search Product Test");
        indexPage = new IndexPage();

        Log.info("User is going search for the new item");
        indexPage.clickOnSearchBtn();

        Log.info("Enter term for the search");
        searchResultPage = indexPage.enterSearchterm("Shoes");

        Log.info("Click on the product");





        Log.endTestCase("End Search Result  Test");
    }
}
