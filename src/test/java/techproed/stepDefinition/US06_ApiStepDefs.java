package techproed.stepDefinition;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techproed.pojos.ResponsePojo;
import techproed.pojos.ViceDeanPojo;
import techproed.utilities.Driver;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsUrl.spec;

public class US06_ApiStepDefs {
    ViceDeanPojo expectedData;
    Response response;
    ResponsePojo actualData;

    //https://managementonschools.com/app/vicedean/save
    @Given("GET Request gonderilir.")
    public void get_request_gonderilir() {
        //Set the Url
        spec.pathParams("first","vicedean","second", "save");
        //Set the expected data
       expectedData = new ViceDeanPojo("1991-11-11","Deutschland","MALE","Sevde","123456789Aa1.","123-456-7890","123-32-7894","Sevde","Sevde123");

    }
    @Given("GET Request {string} gonderilir.")
    public void get_request_gonderilir(String str) {
        //Set the Url
        spec.pathParams("first","vicedean","second", "save");
        //Set the expected
        expectedData = new ViceDeanPojo("1991-11-11","Deutschland","MALE","Sevde","123456789Aa1.","123-456-7890","123-32-7894","Sevde","Sevde123");

        // Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo.class);

    }
    @Then("Status kodu dogrula.")
    public void status_kodu_dogrula() {
        assertEquals(200, response.statusCode());
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




/*
{ "birthDay": "1991-11-11",
"birthPlace": "Deutschland",
"gender": "MALE",
"name": "Sevde",
"password": "123456789Aa1.",
"phoneNumber": "123-456-7890",
"ssn": "123-32-7894",
"surname": "Sevde",
"username": "Sevde123"
}


{
    "object": {
        "userId": 468,
        "username": "Sevde123",
        "name": "Sevde",
        "surname": "Sevde",
        "birthDay": "1991-11-11",
        "ssn": "123-32-7894",
        "birthPlace": "Deutschland",
        "phoneNumber": "123-456-7890",
        "gender": "MALE"
    },
    "message": "Vice dean Saved",
    "httpStatus": "CREATED"
}
 */

/*
package techproed.stepDefinition.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import techproed.pojos.dean_management.DeanPostPojo;
import techproed.pojos.dean_management.ResponsePojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_urls.BaseUrl.spec;

public class DeanManagement {
    DeanPostPojo expectedData;
    Response response;
    ResponsePojo actualData;


    @Given("Dean eklemek icin Post request hazirligi yapilir")
    public void dean_eklemek_icin_post_request_hazirligi_yapilir() {
        // Set the URL
        spec.pathParams("first", "dean", "second", "save");
    }
    @Given("Gonderilecek dean bilgileri hazirlanir")
    public void gonderilecek_dean_bilgileri_hazirlanir() {
        // Set the expected data
        expectedData = new DeanPostPojo("1975-05-05","Istanbul","MALE","Ali","12345678Aa*","505-555-5555","578-67-9518","Can","alicancancan");
    }
    @When("Dean eklemek icin Post request gonderilir")
    public void dean_eklemek_icin_post_request_gonderilir() {
        // Send the request and get the response
        response = given(spec).body(expectedData).when().post("{first}/{second}");
        actualData = response.as(ResponsePojo.class);

    }
    @Then("Dean bilgileri dogrulanir")
    public void dean_bilgileri_dogrulanir() {
        // Do assertion
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());

    }
}
 */