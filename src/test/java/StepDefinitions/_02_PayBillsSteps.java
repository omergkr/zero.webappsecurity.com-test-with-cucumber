package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class _02_PayBillsSteps {


    DialogContent dialogContent = new DialogContent();



    @And("^Check the Message \"([^\"]*)\"$")
    public void checkTheMessage(String text) {


        dialogContent.findElementAndVerifyContainsText("alertContent", text);


    }


    @Then("^Click on the Elment and send keys$")
    public void clickOnTheElmentAndSendKeys(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            {
                dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));

            }


        }


    }

    @And("^Click on the Elment$")
    public void clickOnTheElment(DataTable elements) {
        List<String> elementstoClick = elements.asList(String.class);
        for (String n : elementstoClick) {
            System.out.println(n);
            dialogContent.findElementAndClickFunction(n);


        }
    }
}