package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class _03_CurrencySteps {

    DialogContent dialogContent = new DialogContent();

    @Given("^Click to Pay Bills and Purchase Froeign Currency$")
    public void clickToPayBillsAndPurchaseFroeignCurrency() {

        dialogContent.findElementAndClickFunction("payBillsTab");
        dialogContent.findElementAndClickFunction("purchaseForeignCurrency");

    }

    @Then("^Select Currency$")
    public void selectCurrency() {

        Random randomnummer=new Random();

        dialogContent.findElementAndClickFunction("currency");
        Select selectcurrency=new Select(dialogContent.currency);
        int nmr=randomnummer.nextInt(14)+1;
        System.out.println(nmr);
        selectcurrency.selectByIndex(nmr);

        dialogContent.findElementAndClickFunction("currency");


    }



    @And("^Click on the Selelcted Elment$")
    public void clickOnTheSelelctedElment(DataTable elements) {

        List<String> elementstoClick=elements.asList(String.class);   //gonderilenleri listeye string olarak attik
        for (String n:elementstoClick) {
            System.out.println(n);
            if(n.contains("dolarTrue"))
                dialogContent.findElementAndClickFunction("inDollarsTrue");
            else
                dialogContent.findElementAndClickFunction("inDollarsFalse");

            dialogContent.findElementAndClickFunction("purchase");


        }

    }
}
