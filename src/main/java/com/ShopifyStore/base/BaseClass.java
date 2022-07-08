package com.ShopifyStore.base;

import com.ShopifyStore.actionDriver.Action;
import com.ShopifyStore.actionDriver.ActionInterface;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    public static Properties prop;

    // Declare ThreadLocal Driver for parallel execution
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static ActionInterface action = new Action();



    public static WebDriver getDriver() {
        // Get Driver from threadLocalmap
        return driver.get();
    }

    public void launchApp(String browserName){
        WebDriverManager.chromedriver().setup();
        //String browserName = prop.getProperty("browser");

        if(browserName.contains("Chrome")) {
           WebDriverManager.chromedriver().setup();
           driver.set(new ChromeDriver());
        } else if (browserName.contains("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        }else if (browserName.contains("IE")) {
            WebDriverManager.edgedriver().setup();
            driver.set(new EdgeDriver());
        }
        else if (browserName.equalsIgnoreCase("remote-chrome")) {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setBrowserName(Browser.CHROME.browserName());
                caps.setVersion("101");
                driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.getMessage();
            }
        } else if (browserName.equalsIgnoreCase("remote-firefox")) {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setBrowserName(Browser.FIREFOX.browserName());
                caps.setVersion("99");
                driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.getMessage();
            }
        } else if (browserName.equalsIgnoreCase("remote-edge")) {
            try {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setBrowserName(Browser.EDGE.browserName());
                caps.setVersion("100");
                driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps));
            } catch (MalformedURLException e) {
               e.getMessage();
            }
        } else {
        System.out.println("Browser value is not defined correctly! It should be either chrome, firefox, edge or opera!");
    }


        getDriver().manage().window().maximize();
        //Delete all the cookies
        getDriver().manage().deleteAllCookies();
        //Implicit TimeOuts
        getDriver().manage().timeouts().implicitlyWait
                (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
        //PageLoad TimeOuts
        getDriver().manage().timeouts().pageLoadTimeout
                (Integer.parseInt(prop.getProperty("pageLoadTimeOut")), TimeUnit.SECONDS);
        //Launching the URL

        getDriver().get(prop.getProperty("url"));
    }





}
