package validationCookiesHeadParam;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class POJO {
    public static void main(String[] args) {
        PoJOResp pojo = new PoJOResp();
        pojo.setDescription("Apple");
        pojo.setName("Den");
        pojo.setId(1);
        RestAssured.baseURI="http://webservice.toscacloud.com/rest/api/Coffees_V2";
        Response response  = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer db90cbec-8211-42f8-97ca-dd33eb82edfc")
                .and()
                .body(pojo)
                .when()
                .post()

                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
       String name = response.jsonPath().getString("Name");
        System.out.println(name);

        System.out.println(response.asPrettyString());
        Assert.assertEquals(pojo.getDescription(),"Apple");
        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(name,"Den");


// https://plugins.jetbrains.com/plugin/8634-robopojogenerator

    }
}
