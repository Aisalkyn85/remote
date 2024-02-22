package pojoClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PojoFromReqres {
    public static void main(String[] args) {
        PojoFromReqresBody pojo = new PojoFromReqresBody();
        pojo.setName("Den");
        pojo.setJob("Qa engineer");

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
