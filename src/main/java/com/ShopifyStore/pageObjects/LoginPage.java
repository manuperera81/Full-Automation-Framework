package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/3/2022
 */

public class LoginPage extends BaseClass {
    @FindBy(xpath = "//input[@id='CustomerEmail']")
    WebElement loginEmailInput;

    @FindBy(xpath = "//input[@id='CustomerPassword']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[@class ='btn btn--full']")
    WebElement signInBtn;
    @FindBy(xpath = "//a[@id=\"customer_register_link\"]")
    WebElement createNewAccountBtn;

    public LoginPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public MyAccountPage login(String username, String password){
        action.type(loginEmailInput,username);
        action.type(passwordInput,password);
        action.click(getDriver(),signInBtn);
        return  new MyAccountPage();
    }
    public AccountCreationPage createNewAccount(){
        action.click(getDriver(),createNewAccountBtn);
        return new AccountCreationPage();
    }
}
