package com.ShopifyStore.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author manup on 5/27/2022
 */
public class ExtentManager {
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() {

        htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"\\src\\test\\Outputs\\ExtentReport\\"+"MyReport.html");
        System.out.println(System.getProperty("user.dir"));
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"\\extent-config.xml");
        //htmlReporter.config().setDocumentTitle("Automation Test Report");
        //htmlReporter.config().setReportName("OrangeHRM Test Automation Report");
        //htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("HostName", "Shopify");
        extent.setSystemInfo("ProjectName", "Shopify_Project");
        extent.setSystemInfo("Tester", "Manujaya");
        extent.setSystemInfo("OS", "Win11");
        extent.setSystemInfo("Browser", "Chrome");
    }
    public static void endReport() {
        extent.flush();
    }
}
