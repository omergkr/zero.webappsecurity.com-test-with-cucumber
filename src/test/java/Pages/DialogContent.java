package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _Parent {

    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user_login")
    private WebElement userName;

    @FindBy(id = "user_password")
    private WebElement userPassword;

    @FindBy(name = "submit")
    private WebElement signIn;

    @FindBy(css = "#pay_bills_tab>a")
    private WebElement payBillsTab;

    @FindBy(linkText = "Add New Payee")
    private WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    private WebElement newPayeeName;


    @FindBy(id = "np_new_payee_address")
    private WebElement newPayeeAddress;


    @FindBy(id = "np_new_payee_account")
    private WebElement newPayeeAccount;

    @FindBy(id = "np_new_payee_details")
    private WebElement newPayeeDetails;


    @FindBy(id = "add_new_payee")
    private WebElement addButton;

    @FindBy(id = "alert_content")
    private WebElement alertContent;

    @FindBy(linkText = "Purchase Foreign Currency")
    private WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currency;

    @FindBy(id = "pc_amount")
    public WebElement amount;

    @FindBy(id = "pc_inDollars_true")
    public WebElement inDollarsTrue;

    @FindBy(id = "pc_inDollars_false")
    public WebElement inDollarsFalse;

    @FindBy(id = "purchase_cash")
    public WebElement purchase;




    public void findElementAndClickFunction(String elementname) {


        switch (elementname) {

            case "signIn":
                myElement = signIn;
                break;

            case "payBillsTab":
                myElement = payBillsTab;
                break;

            case "addNewPayee":
                myElement = addNewPayee;
                break;


            case "addButton":
                myElement = addButton;
                break;

            case "purchaseForeignCurrency":
                myElement = purchaseForeignCurrency;
                break;

            case "currency":
                myElement = currency;
                break;

            case "inDollarsTrue":
                myElement = inDollarsTrue;
                break;

            case "inDollarsFalse":
                myElement = inDollarsFalse;
                break;

            case "purchase":
                myElement = purchase;
                break;
        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementname, String value) {


        switch (elementname) {

            case "userName":
                myElement = userName;
                break;
            case "userPassword":
                myElement = userPassword;
                break;

            case "newPayeeName":
                myElement = newPayeeName;
                break;

            case "newPayeeAddress":
                myElement = newPayeeAddress;
                break;

            case "newPayeeAccount":
                myElement = newPayeeAccount;
                break;

            case "newPayeeDetails":
                myElement = newPayeeDetails;
                break;

            case "amount":
                myElement = amount;
                break;

        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String elementname, String mesaj) {


        switch (elementname) {

            case "alertContent":
                myElement = alertContent;
                break;


        }

        if (!mesaj.contains("error"))
            verifyElementContainsText(myElement, mesaj);
        else {

            Assert.assertFalse(myElement.isDisplayed());


        }


    }
}