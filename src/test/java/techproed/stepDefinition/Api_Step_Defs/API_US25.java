package techproed.stepDefinition.Api_Step_Defs;

import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import techproed.base_url.ManagementonSchoolsUrl;
import techproed.pojos.US25AdminOgrenciEkleme.DeleteStudentResponsePojo;
import techproed.pojos.US25AdminOgrenciEkleme.ObjectPojo;
import techproed.pojos.US25AdminOgrenciEkleme.Postpojo;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class API_US25 extends ManagementonSchoolsUrl {
    Response response;
    Postpojo expectedData;
    ObjectPojo actualData;
    DeleteStudentResponsePojo deleteResponse;

    @Given("Student eklemek icin Post request hazirligi yapilir...")
    public void student_Eklemek_Icin_Post_Request_Hazirligi_Yapilir() {
        setUp("AdminTeam02.","AdminTeam02");
        expectedData = new Postpojo(4,"1992-01-01", "Turkey","daniyar@gmail.com","fathrname","FEMALE","motername","Project10","AdminTeam02.","927 580 7634","614-06-9882", "Team02", "Dickinson");
    }

    @When("Admin eklemek icin student request gonderilir...")
    public void admin_Eklemek_Icin_Student_Request_Gonderilir() throws IOException {

        spec.pathParams("1","students","2","getStudentById").queryParam("id",1626);
        response = given(spec).get("{1}/{2}");
        response.prettyPrint();
        String jsonResponse = response.getBody().asString();
        Gson gson = new Gson();
        actualData = gson.fromJson(jsonResponse, ObjectPojo.class);
    }

    @Then("Student bilgileri dogrulanir")
    public void student_Bilgileri_Dogrulanir() {
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getAdvisorTeacherId(),actualData.getAdvisorTeacherId());
        assertEquals(expectedData.getBirthDay(), actualData.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getBirthPlace());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getFatherName(), actualData.getFatherName());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getMotherName(), actualData.getMotherName());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getSsn());
        assertEquals(expectedData.getSurname(), actualData.getSurname());
        assertEquals(expectedData.getUsername(), actualData.getUsername());

    }

    @And("student verisi silinir...")
    public void student_Verisi_Silinir() {
        spec.pathParams("1","students","2","delete","3",1633);
        response = given(spec).when().delete("{1}/{2}/{3}");
        deleteResponse = response.as(DeleteStudentResponsePojo.class);

    }
    @And("silme dogrulama islemi yapilir...")
    public void silme_Dogrulama_Islemi_Yapilir() {
        assertEquals(200,response.statusCode());
        assertEquals("Student Deleted",DeleteStudentResponsePojo.getMessage());
        assertEquals("OK",DeleteStudentResponsePojo.getHttpStatus());

    }
}
