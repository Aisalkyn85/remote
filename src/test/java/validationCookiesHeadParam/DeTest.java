package validationCookiesHeadParam;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class DeTest {
    @Test
    void Test() {
        RestAssured.baseURI="https://reqres.in/api/users?page=2";

        Deserial deserial =RestAssured.given()
                .when()
                .get().as(Deserial.class);
        System.out.println(deserial.getData());


    }
}
