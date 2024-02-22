package validationCookiesHeadParam;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PoJoReq {
    public static void main(String[] args) {
        PoJoReqBody pojo = new PoJoReqBody();
        pojo.setJob("QA Engineer");
        pojo.setName("Den");
        RestAssured.baseURI="https://reqres.in/api/users";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .and()
                .body(pojo)

                .when()

                .post()
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
    }
}
