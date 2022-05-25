package com.ShopifyStore.actionDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {

        //Added all user actions abstract methods to achieve Abstraction
        void scrollByVisibilityOfElement(WebDriver driver, WebElement ele);
        void click(WebDriver ldriver, WebElement ele);
        boolean isDisplayed(WebDriver ldriver, WebElement ele);
        void type(WebElement ele, String text);

        void enter(WebElement ele);
        boolean findElement(WebDriver ldriver, WebElement ele);
        boolean isSelected(WebDriver ldriver, WebElement ele);
        boolean isEnabled(WebDriver ldriver, WebElement ele);
        boolean selectBySendkeys(String value,WebElement ele);
        boolean selectByIndex(WebElement element, int index);
        boolean selectByValue(WebElement element,String value);
        void selectByVisibleText(String visibletext, WebElement ele);
        boolean mouseHoverByJavaScript(WebElement locator);
        boolean JSClick(WebDriver driver, WebElement ele);
        boolean switchToFrameByIndex(WebDriver driver,int index);
        boolean switchToFrameById(WebDriver driver,String idValue);
        boolean switchToFrameByName(WebDriver driver,String nameValue);
        boolean switchToDefaultFrame(WebDriver driver);
        void mouseOverElement(WebDriver driver,WebElement element);
        boolean moveToElement(WebDriver driver, WebElement ele);
        boolean mouseover(WebDriver driver, WebElement ele);
        boolean draggable(WebDriver driver,WebElement source, int x, int y);
        boolean draganddrop(WebDriver driver,WebElement source, WebElement target);
        boolean slider(WebDriver driver,WebElement ele, int x, int y);
        boolean rightclick(WebDriver driver,WebElement ele);
        boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count);
        boolean switchToNewWindow(WebDriver driver);
        boolean switchToOldWindow(WebDriver driver);
        int getColumncount(WebElement row);
        int getRowCount(WebElement table);
        boolean Alert(WebDriver driver);
        boolean launchUrl(WebDriver driver,String url);
        boolean isAlertPresent(WebDriver driver);
        String getCurrentURL(WebDriver driver);
        String getTitle(WebDriver driver);
        boolean click(WebElement locator, String locatorName);
        void fluentWait(WebDriver driver,WebElement element, int timeOut);
        void implicitWait(WebDriver driver, int timeOut);
        void explicitWait(WebDriver driver, WebElement element, int timeOut);
        void pageLoadTimeOut(WebDriver driver, int timeOut);
        String screenShot(WebDriver driver, String filename);
        String getCurrentTime();


}
