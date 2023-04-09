package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSepulsaStepDefinitions {

    @Given("user is on Sepulsa login page")
    public void userIsOnSepulsaLoginPage() {
        System.out.println("user is at login page sepulsa");
    }

    @And("user input correct username")
    public void userInputCorrectUsername() {
        System.out.println("user input correct username");
    }

    @And("user input correct password")
    public void userInputCorrectPassword() {
        System.out.println("user input correct password");
    }

    @And("user click login")
    public void userClickLogin() {
        System.out.println("user click login");
    }

    @Then("user can login and go to main page of Sepulsa")
    public void userCanLoginAndGoToMainPageOfSepulsa() {
        System.out.println("user go to main page");
    }

    @And("user input incorrect password")
    public void userInputIncorrectPassword() {
        System.out.println("user input inorrect password");
    }

    @Then("user cannot login and still on login page")
    public void userCannotLoginAndStillOnLoginPage() {
        System.out.println("user still on login page");
    }

    @And("user input incorrect username")
    public void userInputIncorrectUsername() {
        System.out.println("user input incorrect username");
    }

    @And("user input blank username")
    public void userInputBlankUsername() {
        System.out.println("user input blank username");
    }

    @And("user input blank password")
    public void userInputBlankPassword() {
        System.out.println("user input blank password");
    }
}