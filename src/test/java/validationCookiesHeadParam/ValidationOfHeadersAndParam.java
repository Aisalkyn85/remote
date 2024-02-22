package validationCookiesHeadParam;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ValidationOfHeadersAndParam {
    @Test
    void testParam(){
        given()

                .pathParams("mypath", "users") //pathParameters
                .queryParam("page",2)//query parameter
                .queryParam("id",9)//query paramenter

                .when()
                .get("https://reqres.in/api/{mypath}")

                .then()
                .statusCode(200)
                .log().all();
    }
}
