package pojoClass;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

public class PojoDemo {
    public static void main(String[] args) {
        PojoDemoBody pojo = new PojoDemoBody();
        pojo.setId(1);
        pojo.setName("Den");

        RestAssured.baseURI="http://webservice.toscacloud.com/rest/api/Profiles_V2";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","db90cbec-8211-42f8-97ca-dd33eb82edfc")
                .and()
                .body(pojo)

                .when()
                .post()

                .then()
                .extract().response();
        System.out.println(response.asPrettyString());


    }

}
