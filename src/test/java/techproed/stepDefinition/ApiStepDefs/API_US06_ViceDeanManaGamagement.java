package techproed.stepDefinition.ApiStepDefs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.vice_dean_management.ViceDeanPojo;
import techproed.pojos.vice_dean_management.ViceDeanResponsePojo;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.ManagementonSchoolsUrl.setUp;
import static techproed.base_url.ManagementonSchoolsUrl.spec;
import static techproed.stepDefinition.ui_stepDefs.US06_ViceDeanOlusturmaStepDefs.*;


public class API_US06_ViceDeanManaGamagement {
    ViceDeanPojo expectedData;
    Response response;
    int userId;

    @Given("Kayitli Vece Deanin userId bilgisi alinir")
    public void kayitli_vece_deanin_user_id_bilgisi_alinir() {

        setUp("DeanTeam02.", "DeanTeam02.");

        String ssn = viceDeanObjectPojo.getSsn();

        spec.pathParams("1", "vicedean", "2", "getAll");
        response = given(spec).get("{1}/{2}");


        JsonPath jsonPath = response.jsonPath();
        List<Integer> userIdList = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.userId");

        System.out.println(userIdList.toString());

        userId = userIdList.get(0);

        viceDeanObjectPojo.setUserId(userId);
        userId = viceDeanObjectPojo.getUserId();


    }

    @Given("Kayitli Vice Dean userId ile cagrilir")
    public void kayitli_vice_dean_user_id_ile_cagrilir() {

        spec.pathParams("1", "vicedean", "2", "getViceDeanById", "3", userId);
        response = given(spec).get("{1}/{2}/{3}");

        response.prettyPrint();


    }

    @Then("Vice Dean bilgileri dogrulanir")
    public void vice_dean_bilgileri_dogrulanir() {
        expectedData = new ViceDeanPojo("1991-01-01", "Deutschland", "MALE", "ViceDeanTeam02", "123456789Aa1.", fakePhoneNumber, fakeSsn, "Team02", fakeUsername);

        ViceDeanResponsePojo actualData = response.as(ViceDeanResponsePojo.class);

        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());


    }

    @And("Kayitli dean silinir")
    public void kayitliDeanSilinir() {
        spec.pathParams("1", "vicedean", "2", "delete", "3", userId);
        response = given(spec).delete("{1}/{2}/{3}");
        response.prettyPrint();
        assertEquals(200, response.statusCode());

    }
}
