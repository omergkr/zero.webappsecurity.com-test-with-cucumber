package StepDefinitions;

import Pages.DialogContent;
import Pages._Parent;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _01_LoginSteps extends _Parent {


    DialogContent dialogContent = new DialogContent();

    @Given("^Navigate to zero\\.webappsecurity$")
    public void navigateToZeroWebappsecurity() {

        driver = Driver.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);



    }



    @Given("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click Login button$")
    public void enterAndAndClickLoginButton(String username, String password)  {

        dialogContent.findElementAndSendKeysFunction("userName",username);
        dialogContent.findElementAndSendKeysFunction("userPassword",password);
        dialogContent.findElementAndClickFunction("signIn");


    }


    @Then("^Check the Message$")
    public void checkTheMessage() {



    }



}