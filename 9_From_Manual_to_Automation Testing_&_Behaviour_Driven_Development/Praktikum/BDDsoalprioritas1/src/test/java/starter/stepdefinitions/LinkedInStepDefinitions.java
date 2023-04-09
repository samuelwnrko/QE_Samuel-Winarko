package starter.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedInStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;
    @Given("User is on LinkedIn login page")
    public void user_is_on_linkedin_login_page() {
        driver.navigate().to("https://linkedin.com");
        String title = driver.getTitle();
        Assert.assertEquals("LinkedIn: Log In or Sign Up", title);
    }

    @And("user input correct username")
    public void user_input_correct_username() {
        System.out.println("User input correct username");
    }

    @And("user input correct password")
    public void user_input_correct_password() {
        System.out.println("User input correct password");
    }

    @When("user click login")
    public void user_click_login() {
        WebElement buttonLogin = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        buttonLogin.click();
    }

    @Then("user is on homepage")
    public void user_is_on_homepage() {
        System.out.println("User is in LinkedIn homepage");
    }

    @And("user input text post")
    public void user_input_text_post() {
        System.out.println("User is in LinkedIn homepage");
    }

    @And("user click post")
    public void user_click_post() {
        // code to click post button
    }

    @Then("user see their post in their feeds")
    public void user_see_their_post_in_their_feeds() {
        // code to check if user's post is in their feeds
    }

    @And("user input photo file")
    public void user_input_photo_file() {
        // code to input photo file
    }

    @And("user input photo file with a non-photo file")
    public void user_input_photo_file_with_a_non_photo_file() {
        // code to input photo file with a non-photo file
    }

    @Then("user failed to upload the photo")
    public void user_failed_to_upload_the_photo() {
        // code to check if photo failed to upload
    }

    @And("user input video file")
    public void user_input_video_file() {
        // code to input video file
    }

    @And("user input photo file with a non-video file")
    public void user_input_photo_file_with_a_non_video_file() {
        // code to input photo file with a non-video file
    }

    @Then("user failed to upload the video")
    public void user_failed_to_upload_the_video() {
        // code to check if video failed to upload
    }

    @And("user input post")
    public void user_input_post() {
        // code to input post
    }

    @And("user click send post")
    public void user_click_send_post() {
        // code to click send post button
    }

    @And("user click comment button")
    public void user_click_comment_button() {
        // code to click comment button
    }

    @And("user input comment")
    public void user_input_comment() {
        // code to input comment
    }

    @And("user click send comment")
    public void user_click_send_comment() {
        // code to click send comment button
    }

    @And("user choose start a post")
    public void user_choose_start_a_post() {
        // code to click start a post button
    }

    @And("user choose Photo in post")
    public void user_choose_photo_in_post() {
        // code to choose Photo in post
    }

    @And("user choose Video in post")
    public void user_choose_video_in_post() {
        // code to choose Video in post
    }

    @And("user input incorrect username")
    public void user_input_incorrect_username() {
        WebElement usernameField = driver.findElement(By.id("session_key"));
        usernameField.sendKeys("test");
    }

    @And("user input incorrect password")
    public void user_input_incorrect_password() {
        WebElement passwordField = driver.findElement(By.id("session_password"));
        passwordField.sendKeys("test");
    }

    @Then("user cannot login and still on login page")
    public void user_cannot_login_and_still_on_login_page() {
        WebElement textCredentialIncorrect = driver.findElement(By.id("error-for-username"));
        String incorrectUsernameAndPassword = textCredentialIncorrect.getText();
        Assert.assertEquals("Please enter a valid email address", incorrectUsernameAndPassword);
    }
}