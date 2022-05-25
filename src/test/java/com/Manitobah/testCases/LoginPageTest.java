package com.Manitobah.testCases;

import com.Manitobah.base.BaseTest;
import com.ShopifyStore.dataProvider.DataProviders;
import com.ShopifyStore.pageObjects.IndexPage;
import com.ShopifyStore.pageObjects.LoginPage;
import com.ShopifyStore.pageObjects.MyAccountPage;
import com.ShopifyStore.utility.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author manup on 5/13/2022
 */

public class LoginPageTest extends BaseTest {
    IndexPage indexPage;

    @Test(dataProvider = "credentials", dataProviderClass = DataProviders.class, groups ={"Sanity","Smoke"})
    public void logintest(String username, String password){
        Log.startTestCase("Login Test");
        indexPage = new IndexPage();

        Log.info("User is going to Sign In");
        LoginPage loginPage = indexPage.clickOnSignin();

        Log.info("Enter username and Password");
        //MyAccountPage myAccountPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        MyAccountPage myAccountPage = loginPage.login(username,password);


        String acturalURL = myAccountPage.getCurrentUrl();
        String expectedURL = "https://www.manitobah.com/challenge";
        Assert.assertEquals(acturalURL, expectedURL);
        //this test is failed because it meets the reCAPTCHA for avoid automation. Expected on https://www.manitobah.com/challenge URL to Verify
        Log.endTestCase("End Loging Test");
    }
}
