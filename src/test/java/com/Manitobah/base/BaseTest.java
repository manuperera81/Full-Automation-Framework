package com.Manitobah.base;

import com.ShopifyStore.base.BaseClass;
import com.ShopifyStore.utility.ExtentManager;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * @author manup on 5/14/2022
 */
public class BaseTest extends BaseClass {

    @BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
    public void loadConfig(){
        ExtentManager.setExtent();
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(
                    System.getProperty("user.dir") + "\\src\\Configuration\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Parameters("browser")
    @BeforeMethod(groups = { "Smoke", "Regression","Sanity" })
    public void setUp(String browser) {
        launchApp(browser);

    }

    @AfterMethod(groups = { "Smoke", "Regression","Sanity" })
    public void tearDown(){
        getDriver().quit();
    }

    @AfterSuite(groups = { "Smoke", "Regression","Sanity" })
    public void afterSuite() {
        ExtentManager.endReport();
    }

}
