package com.ShopifyStore.pageObjects;

import com.ShopifyStore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manup on 5/9/2022
 */
public class PaymentPage extends BaseClass {

    @FindBy(id = "main-header")
    WebElement pageTitle;

    @FindBy(id = "continue_button")
    WebElement payBtn;

    @FindBy(xpath = "//input[@id = 'number'][@placeholder= 'Card number']")
    WebElement creditCardNumberInput;

    public PaymentPage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void enterCreditCardNumber(String cardNumber){
        action.type(creditCardNumberInput,cardNumber);
    }

    public void clickPayButton(){
        action.click(getDriver(),payBtn);
    }
}
