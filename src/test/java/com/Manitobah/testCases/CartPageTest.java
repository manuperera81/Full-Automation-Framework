package com.Manitobah.testCases;

import com.Manitobah.base.BaseTest;
import com.ShopifyStore.pageObjects.IndexPage;
import com.ShopifyStore.pageObjects.SearchResultPage;
import com.ShopifyStore.utility.Log;
import org.testng.annotations.Test;

/**
 * @author manup on 6/2/2022
 */
public class CartPageTest extends BaseTest {
    /**
     *
     * Search for new item
     * choose differnet colors
     * Choose  differnt size
     * add to cart
     *
     * choose  unsvailabe size
     * choose unavailabe color cherck on Sold out.
     */

    IndexPage indexPage;
    SearchResultPage searchResultPage;

    @Test(groups ="Smoke")
    public void AdddtoCartTest() {
        Log.startTestCase("Add to Cart Test");
        indexPage = new IndexPage();
        indexPage.clickOnSearchBtn();
        searchResultPage = indexPage.enterSearchterm("Waterproof Snowy Owl");

        Log.info("Enter the Search Item");
        Log.endTestCase("End Add to Cart Test");
    }
}
