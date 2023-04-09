package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MetodeBayarStepDefinitions {
    @And("user choose the paying method")
    public void userChooseThePayingMethod() {
        System.out.println("user choose paying method");
    }

    @And("user click pay button")
    public void userClickPayButton() {
        System.out.println("user click pay now button");
    }

    @Then("user successfully pay the product")
    public void userSuccessfullyPayTheProduct() {
        System.out.println("user successfully pay the product");
    }

    @And("user did not choose the paying method")
    public void userDidNotChooseThePayingMethod() {
        System.out.println("user did not choose the paying method");
    }

    @Then("user cannot pay the product")
    public void userCannotPayTheProduct() {
        System.out.println("user cannot pay the product");
    }
}
