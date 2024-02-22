package validationCookiesHeadParam;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PojoExample {
    public static void main(String[] args) {
        CommentsItem com = new CommentsItem();
        com.setContent("Cooking");
        com.setId(2);


        RestAssured.baseURI="http://webservice.toscacloud.com/rest/api/Profiles_V2";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","db90cbec-8211-42f8-97ca-dd33eb82edfc")
                .and()
                .body(com)

                .when()
                .post()

                .then()
                .extract().response();
        System.out.println(response.asPrettyString());

    }
}
