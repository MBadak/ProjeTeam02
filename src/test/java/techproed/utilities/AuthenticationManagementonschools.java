package techproed.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationManagementonschools {

    public static String generateToken(){
        String body = "{ \"password\": \"DeanTeam02.\", \"username\": \"DeanTeam02.\"}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
      //  response.prettyPrint();
        return response.jsonPath().getString("token");
    }

}
