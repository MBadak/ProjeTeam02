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
import static techproed.stepDefinition.US06_ViceDeanOlusturmaStepDefs.viceDeanObjectPojo;


public class API_US06_ViceDeanManaGamagement {
    ViceDeanResponsePojo expectedData;
    ViceDeanResponsePojo actualData;
    ViceDeanPojo viceDeanPojo;
    Response response;
    int userId;
    @Given("Kayitli Vece Deanin userId bilgisi alinir")
    public void kayitli_vece_deanin_user_id_bilgisi_alinir() {

        setUp("DeanTeam02.","DeanTeam02.");

         String  ssn = viceDeanObjectPojo.getSsn();

        spec.pathParams("1","vicedean","2","getAll");
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

        spec.pathParams("1","vicedean","2","getViceDeanById","3",userId);
        response = given(spec).get("{1}/{2}/{3}");

        response.prettyPrint();


    }
    @Then("Vice Dean bilgileri dogrulanir")
    public void vice_dean_bilgileri_dogrulanir() {
       expectedData = new ViceDeanResponsePojo(viceDeanObjectPojo,"OK", "Dean successfully found");

        assertEquals(200,response.statusCode());


    }

}
