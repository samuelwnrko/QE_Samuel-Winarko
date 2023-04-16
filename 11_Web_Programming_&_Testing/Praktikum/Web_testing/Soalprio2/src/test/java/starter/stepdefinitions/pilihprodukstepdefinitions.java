package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class pilihprodukstepdefinitions {
    @Then("user is on Sepulsa main page")
    public void userIsOnSepulsaMainPage() {
        System.out.println("user is on Sepulsa main page");
    }

    @And("user choose the product")
    public void userChooseTheProduct() {
        System.out.println("user choose product");
    }

    @And("user fill the required data")
    public void userFillTheRequiredData() {
        System.out.println("user fill required data");
    }

    @Then("user can continue to pay the bill")
    public void userCanContinueToPayTheBill() {
        System.out.println("user can continue to pay the bill");
    }

    @And("user fill the required data with symbol")
    public void userFillTheRequiredDataWithSymbol() {
        System.out.println("user fill required data with symbol only");
    }

    @Then("user data cannot be saved and still need to fill the required data")
    public void userDataCannotBeSavedAndStillNeedToFillTheRequiredData() {
        System.out.println("user data cannot be saved and still need to fill the data");
    }

    @And("user fill the required data with zero")
    public void userFillTheRequiredDataWithZero() {
        System.out.println("user fill required data with only zero");
    }
}

