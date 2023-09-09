package techproed.stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.utilities.Driver;

import java.util.List;

import static techproed.base_url.ManagementonSchoolsUrl.spec;

public class US06_ApiStepDefs {
    // https://managementonschools.com/app/vicedean/getViceDeanById/64
    @Given("GET Request gonderilir.")
    public void get_request_gonderilir() {
        //Set the Url
        spec.pathParams("first","vicedean","second", "getViceDeanById", "thirt",64);
        //Set the expected

    }
    @Then("Status kodu dogrula.")
    public void status_kodu_dogrula() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} UserId dogrula.")
    public void response_den_gelen_user_id_dogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Name dogrula.")
    public void response_den_gelen_name_dogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Surname dogrula.")
    public void response_den_gelen_surname_dogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Birth Place dogrula.")
    public void response_den_gelen_birth_place_dogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Gender dogrula.")
    public void response_den_gelen_genderdogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Date Of Birthdogrula.")
    public void response_den_gelen_date_of_birthdogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} Phone dogrula.")
    public void response_den_gelen_phone_dogrula(String string) {

    }
    @Then("Response'den gelen {string} Ssndogrula.")
    public void response_den_gelen_ssndogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Response'den gelen {string} User Name dogrula.")
    public void response_den_gelen_user_name_dogrula(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
