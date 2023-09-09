package techproed.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static techproed.utilities.AuthenticationMedunna.generateToken;


public class ManagementonSchoolsUrl {
    public static RequestSpecification spec;
    //Testi calistrdigimizda spec objesinin null gelmemesi icin setup() methodunun calistirilmasi gerekir.
    //Cucumber' da her testten once calistirmak istedigimiz methodlari Hooks class' i icesine ekleriz
    //Olusturdugumuz Hooks classini Runner clastaki glue kisminda tanimlamamiz gerekir
    public static void setUp(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com")
                .addHeader("Authorization", "Bearer "+generateToken())
                .setContentType(ContentType.JSON)
                .build();
    }
}
