package com.Manitobah.testCases;

import com.Manitobah.base.BaseTest;
import com.ShopifyStore.pageObjects.IndexPage;
import com.ShopifyStore.pageObjects.SearchResultPage;
import com.ShopifyStore.utility.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author manup on 5/23/2022
 */
public class SearchPageTest extends BaseTest {
    IndexPage indexPage;
    SearchResultPage searchResultPage;

    @Test(groups = "Sanity")
    public void searchProductTest() {
        Log.info("User is going search for the new item");
        indexPage.clickOnSearchBtn();
        searchResultPage = indexPage.enterSearchterm("Shoes");

        Log.info("Enter term for the search");
        int resultShown = searchResultPage.displayResutlCount();

        int pageOneResults = searchResultPage.pageOneCount();

        int actualResultShown = searchResultPage.pageTwoAndBeyondCount() + pageOneResults;

        Assert.assertEquals(resultShown, actualResultShown);

        Log.endTestCase("End Search Result  Test");
    }
}
